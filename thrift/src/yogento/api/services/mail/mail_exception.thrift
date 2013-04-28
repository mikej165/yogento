namespace java com.yogento.api.services.mail
namespace gwt_client_java com.yogento.gui.client.services.mail
namespace gwt_server_java com.yogento.gui.server.services.mail
namespace * yogento.api.services.mail

exception MailException {
    required i32 code;
    required string error;
}
