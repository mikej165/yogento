<?php
class Yogento_Yoagent_Helper_Data extends Mage_Core_Helper_Abstract {
    public function sendRequests() {
        $requests = Mage::getModel('yoagent/request')->getCollection();
        Mage::log('sending ' . count($requests) . ' queued yoagent requests');

        $requestUrlBase = Mage::getStoreConfig('yoagent/request/url');
        if (strlen(trim($requestUrlBase)) == 0) {
            $requestUrlBase = 'http://yogento.com';
        }
        $requestUrlBase = rtrim($requestUrlBase, '/');

        foreach ($requests as $request) {
            if (!$request->getBody() || !$request->getContentType() || !$request->getPath()) {
                continue;
            }

            $httpClient = new Zend_Http_Client();

            $requestBody = $request->getBody();
            $compressedRequestBody = gzencode($requestBody);
            if (!is_null($compressedRequestBody)) {
                $requestBody = $compressedRequestBody;
                $httpClient->setHeaders(array('Content-encoding' => 'gzip'));
            }
            $httpClient->setRawData($requestBody, $request->getContentType());
            if (strcmp($request->getMethod(), 'GET') == 0) {
                $requestMethod = Zend_Http_Client::GET;
            } elseif (strcmp($request->getMethod(), 'POST') == 0) {
                $requestMethod = Zend_Http_Client::POST;
            } else {
                Mage::log('unknown yoagent request method: ' . $request->getMethod());
            }
            $requestUrl = $requestUrlBase . '/' . ltrim($request->getPath(), '/');
            # Mage::log('sending a yoagent ' . $request->getMethod() . ' request with a ' . strlen($requestBody) . ' byte body to Yogento at ' . $requestUrl);
            $httpClient->setUri($requestUrl);
            try {
                $response = $httpClient->request($requestMethod);
                # Mage::log('Yogento response status: ' . $response->getStatus() . " " . $response->getMessage());
            } catch (Exception $e) {
                Mage::logException($e);
                $request->delete();
                continue;
            }

            $request->delete();
        }
    }

    public function syncProducts($ticket, $username) {
        $products_collection = Mage::getModel('catalog/product')->getCollection();
        if (count($products_collection) === 0) {
            return;
        }
        $products = array();
        foreach ($products_collection as $product) {
            $product = Mage::getModel('catalog/product')->load($product->getId());
            if (intval($product->getStatus()) !== Mage_Catalog_Model_Product_Status::STATUS_ENABLED) {
                continue;
            }
            $products []= $product->getData();
        }

        $request = Mage::getModel('yoagent/request');
        $request->setBody(Zend_Json::encode(array(
            'id' => time(),
            'jsonrpc' => '2.0',
            'method' => 'put_agent_magento_products',
            'params' => array('magento_products_json' => Zend_Json::encode($products), 'ticket' => $ticket, 'username' => $username)
        )));
        $request->setContentType('application/json');
        $request->setMethod('POST');
        $request->setPath('/api/jsonrpc/agent');
        $request->save();

        $this->sendRequests();
    }
}
?>
