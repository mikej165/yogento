import __builtin__
import thryft.protocol.json_protocol
import thryft.protocol.string_map_protocol
import urllib
import urllib2
import yogento.api.models.image.image_resolution
import yogento.api.services.image.image_service
import yogento.client.services._yogento_rest_service


class YogentoRestImageService(yogento.client.services._yogento_rest_service._YogentoRestService, yogento.api.services.image.image_service.ImageService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        yogento.client.services._yogento_rest_service._YogentoRestService.__init__(self, api_url=api_url, headers=headers)

    def _delete_image_thumbnail(self, image_url, **kwds):
        try:
            self._request('DELETE', '/image/thumbnail' + urllib.quote(image_url, safe=''), data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
            return True
        except urllib2.HTTPError, e:
            if e.code == 404:
                return False
            else:
                raise

    def _get_image_thumbnail_url(self, image_url, **kwds):
        __return_value = self._request('GET', '/image/thumbnail_url' + urllib.quote(image_url, safe=''), data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        iprot.readListBegin()
        __return_value = iprot.readString()
        iprot.readListEnd()
        return __return_value

