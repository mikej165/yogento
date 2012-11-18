<?php
class Yogento_Agent_Model_Observer {
    public function sendRequests() {
        $requests = Mage::getModel('agent/request')->getCollection();

        $requestUrlBase = Mage::getStoreConfig('agent/request/url');
        if (strlen(trim($requestUrlBase)) == 0) {
            $requestUrlBase = 'http://yogento.com/api';
        }
        $requestUrlBase = rtrim($requestUrlBase, '/') . '/rest/';

        foreach ($requests as $request) {
            if (!$request->getBody() || !$request->getContentType() || !$request->getPath()) {
                continue;
            }

            $httpClient = new Zend_Http_Client();
            $httpClient->setRawData($request->getBody(), $request->getContentType());
            $requestUrl = $requestUrlBase . ltrim($request->getPath(), '/');
            $httpClient->setUri($requestUrl);
            try {
                $response = $httpClient->request(Zend_Http_Client::PUT);
            } catch (Exception $e) {
                Mage::logException($e);
                break;
            }

            $request->delete();
        }
    }

	public function exportOrder($observer) {
        if (!$this->isActive()) {
        	return;
        }

        $order = $observer->getEvent()->getOrder();
        $orderData = $order->getData();
        foreach ($order->getItemsCollection() as $item){
            $orderData['items'][] = $item->getData();
        }

        $request = Mage::getModel('agent/request');
        $request->setBody(Zend_Json::encode($orderData));
        $request->setContentType('application/json');
        $request->setMethod('PUT');
        $request->setPath('orders/' . $order->getIncrementId());
        $request->save();
    }

    protected function isActive() {
    	return true;
    }
}
?>