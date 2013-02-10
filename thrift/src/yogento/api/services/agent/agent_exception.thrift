namespace java com.yogento.api.services.agent
namespace * yogento.api.services.agent

exception AgentException {
    required string cause_message;
	optional string url;
}
