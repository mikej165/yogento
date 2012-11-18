import __builtin__
import thryft.protocol.json_protocol
import yogento.api.models.user.user
import yogento.api.models.user.user_settings
import yogento.api.services.user.user_service
import yogento.client.services._yogento_jsonrpc_service


class YogentoJsonrpcUserService(yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService, yogento.api.services.user.user_service.UserService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/user'):
            api_url += '/jsonrpc/user'
        yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService.__init__(self, api_url=api_url, headers=headers)

    def _delete_user_by_username(self, **kwds):
        return self._request('delete_user_by_username', **kwds)

    def _get_current_user(self, **kwds):
        return_value = self._request('get_current_user', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.user.user.User.read(iprot)

    def _get_current_user_settings(self, **kwds):
        return_value = self._request('get_current_user_settings', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.user.user_settings.UserSettings.read(iprot)

    def _get_user_settings_by_username(self, **kwds):
        return_value = self._request('get_user_settings_by_username', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.user.user_settings.UserSettings.read(iprot)

    def _get_user_by_username(self, **kwds):
        return_value = self._request('get_user_by_username', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.user.user.User.read(iprot)

    def _head_user_by_username(self, **kwds):
        return self._request('head_user_by_username', **kwds)

    def _put_current_user_settings(self, **kwds):
        self._request('put_current_user_settings', **kwds)

    def _put_user(self, **kwds):
        self._request('put_user', **kwds)

    def _put_user_settings(self, **kwds):
        self._request('put_user_settings', **kwds)

