namespace java com.yogento.api.services.agent
namespace gwt_client_java com.yogento.gui.client.services.agent
namespace gwt_server_java com.yogento.gui.server.services.agent
namespace * yogento.api.services.agent

exception AgentException {
    required string cause_message;
	optional string url;
}
