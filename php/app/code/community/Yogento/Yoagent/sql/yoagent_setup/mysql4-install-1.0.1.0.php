<?php
# File should be named install-<version>.php for Magento 1.6+ and mysql4-install-<version>.php for previous versions.
$installer = $this;
$installer->startSetup();
$installer->run("
DROP TABLE IF EXISTS {$installer->getTable('yoagent/request')};
CREATE TABLE `{$installer->getTable('yoagent/request')}` (
         `request_id` int(10) NOT NULL AUTO_INCREMENT,
         `body` longtext NOT NULL,
         `content_type` tinytext NOT NULL,
         `method` tinytext NOT NULL,
         `path` text NOT NULL,
         `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
         PRIMARY KEY (`request_id`)
 );
");
 $installer->endSetup();
?>
