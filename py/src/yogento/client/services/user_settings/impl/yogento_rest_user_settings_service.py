import __builtin__
import thryft.protocol.json_protocol
import thryft.protocol.string_map_protocol
import yogento.api.models.user_settings.user_settings
import yogento.api.services.user_settings.user_settings_service
import yogento.client.services._yogento_rest_service


class YogentoRestUserSettingsService(yogento.client.services._yogento_rest_service._YogentoRestService, yogento.api.services.user_settings.user_settings_service.UserSettingsService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        yogento.client.services._yogento_rest_service._YogentoRestService.__init__(self, api_url=api_url, headers=headers)

    def _get_current_user_settings(self):
        __return_value = self._request('GET', '/user_settings/current_user_settings', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.user_settings.user_settings.UserSettings.read(iprot)

    def _put_current_user_settings(self, **kwds):
        self._request('PUT', '/user_settings/current_user_settings', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

