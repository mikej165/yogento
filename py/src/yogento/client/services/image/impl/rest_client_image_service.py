import __builtin__
import thryft.core.protocol.json_protocol
import thryft.core.protocol.string_map_protocol
import thryft.web.client.service._rest_client_service
import urllib
import urllib2
import yogento.api.models.image.image_resolution
import yogento.api.services.image.image_service


class RestClientImageService(thryft.web.client.service._rest_client_service._RestClientService, yogento.api.services.image.image_service.ImageService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        thryft.web.client.service._rest_client_service._RestClientService.__init__(self, api_url=api_url, headers=headers)

    def _delete_image_thumbnail(self, image_url, **kwds):
        try:
            self._request('DELETE', '/image/thumbnail' + urllib.quote(image_url, safe=''), data=None, query=thryft.core.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _get_image_thumbnail_url(self, image_url, **kwds):
        __return_value = self._request('GET', '/image/thumbnail_url' + urllib.quote(image_url, safe=''), data=None, query=thryft.core.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(__return_value)
        iprot.readListBegin()
        __return_value = iprot.readString()
        iprot.readListEnd()
        return __return_value

    def _put_image(self, **kwds):
        __return_value = self._request('PUT', '/image', data=str(thryft.core.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)
        iprot = thryft.core.protocol.json_protocol.JsonProtocol(__return_value)
        iprot.readListBegin()
        __return_value = iprot.readString()
        iprot.readListEnd()
        return __return_value

