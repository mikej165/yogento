<?php
class Yogento_Yoagent_IndexController extends Mage_Core_Controller_Front_Action {
    public function productsAction() {
        $ticket = $this->getRequest()->getParam('ticket');
        $username = $this->getRequest()->getParam('username');
        if (!is_null($ticket) && !is_null($username)) {
            Mage::helper('yoagent')->syncProducts($ticket, $username);
        } else {
            header($_SERVER['SERVER_PROTOCOL'] . ' Bad Request', true, 400);
        }
    }
}
?>
