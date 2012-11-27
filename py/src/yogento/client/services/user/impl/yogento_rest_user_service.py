import __builtin__
import thryft.protocol.json_protocol
import thryft.protocol.string_map_protocol
import urllib
import urllib2
import yogento.api.models.user.user
import yogento.api.models.user.user_settings
import yogento.api.services.user.user_service
import yogento.client.services._yogento_rest_service


class YogentoRestUserService(yogento.client.services._yogento_rest_service._YogentoRestService, yogento.api.services.user.user_service.UserService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        yogento.client.services._yogento_rest_service._YogentoRestService.__init__(self, api_url=api_url, headers=headers)

    def _delete_user_by_username(self, username):
        try:
            self._request('DELETE', '/user/' + urllib.quote(username, safe=''), data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _get_current_user(self):
        __return_value = self._request('GET', '/user/current/user', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.user.user.User.read(iprot)

    def _get_current_user_settings(self):
        __return_value = self._request('GET', '/user/current/user/settings', data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.user.user_settings.UserSettings.read(iprot)

    def _get_user_settings_by_username(self, username):
        __return_value = self._request('GET', '/user/settings/' + urllib.quote(username, safe=''), data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.user.user_settings.UserSettings.read(iprot)

    def _get_user_by_username(self, username):
        __return_value = self._request('GET', '/user/' + urllib.quote(username, safe=''), data=None, query=None)
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return yogento.api.models.user.user.User.read(iprot)

    def _head_user_by_username(self, username):
        try:
            self._request('HEAD', '/user/' + urllib.quote(username, safe=''), data=None, query=None)
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _put_current_user_settings(self, **kwds):
        self._request('PUT', '/user/current/user/settings', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

    def _put_user(self, **kwds):
        self._request('PUT', '/user', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

    def _put_user_settings(self, **kwds):
        self._request('PUT', '/user/settings', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)

