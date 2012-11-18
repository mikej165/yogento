<?php
class Yogento_Agent_Model_Mysql4_Request extends Mage_Core_Model_Mysql4_Abstract {
    protected function _construct() {
        $this->_init('agent/request', 'request_id');
    }

    protected function _prepareDataForSave(Mage_Core_Model_Abstract $request) {
        return array(
                   'body' => $request->getBody(),
                   'content_type' => $request->getContentType(),
                   'method' => $request->getMethod(),
                   'path' => $request->getPath()
               );
    }
}
?>