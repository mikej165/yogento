import __builtin__
import thryft.protocol.json_protocol
import yogento.api.models.user_settings.user_settings
import yogento.api.services.user_settings.user_settings_service
import yogento.client.services._yogento_jsonrpc_service


class YogentoJsonrpcUserSettingsService(yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService, yogento.api.services.user_settings.user_settings_service.UserSettingsService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/user_settings'):
            api_url += '/jsonrpc/user_settings'
        yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService.__init__(self, api_url=api_url, headers=headers)

    def _get_current_user_settings(self, **kwds):
        return_value = self._request('get_current_user_settings', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.user_settings.user_settings.UserSettings.read(iprot)

    def _put_current_user_settings(self, **kwds):
        self._request('put_current_user_settings', **kwds)
