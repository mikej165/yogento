<?php
class Yogento_Yoagent_Model_Observer {
    public function sendRequests() {
        if (!$this->isActive()) {
            return;
        }

        Mage::helper('yoagent')->sendRequests();
    }

    protected function isActive() {
        return true;
    }
}
?>