import __builtin__
import thryft.core.protocol.json_protocol
import thryft.core.protocol.string_map_protocol
import thryft.web.client.service._rest_client_service
import yogento.api.models.user_settings.user_settings
import yogento.api.services.user_settings.user_settings_service


class RestClientUserSettingsService(thryft.web.client.service._rest_client_service._RestClientService, yogento.api.services.user_settings.user_settings_service.UserSettingsService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        thryft.web.client.service._rest_client_service._RestClientService.__init__(self, api_url=api_url, headers=headers)

    def _get_current_user_settings(self):
        __return_value = self._request('GET', '/user_settings/current_user_settings', data=None, query=None)
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.user_settings.user_settings.UserSettings.read(iprot)

    def _put_current_user_settings(self, **kwds):
        self._request('PUT', '/user_settings/current_user_settings', data=str(thryft.core.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

