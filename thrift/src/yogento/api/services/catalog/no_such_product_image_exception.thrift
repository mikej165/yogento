namespace java com.yogento.api.services.catalog
namespace gwt_client_java com.yogento.gui.client.services.catalog
namespace gwt_server_java com.yogento.gui.server.services.catalog
namespace * yogento.api.services.catalog

exception NoSuchProductImageException {
    required string cause_message;
    required string sku;
}
