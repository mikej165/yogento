namespace java com.yogento.api.services.image
namespace gwt_client_java com.yogento.gui.client.services.image
namespace gwt_server_java com.yogento.gui.server.services.image
namespace * yogento.api.services.image

exception ImageIoException {
    required string cause_message;
    optional string image_url;
}
