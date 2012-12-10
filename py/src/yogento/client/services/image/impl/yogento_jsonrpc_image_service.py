import __builtin__
import thryft.protocol.json_protocol
import yogento.api.models.image.image_resolution
import yogento.api.services.image.image_service
import yogento.client.services._yogento_jsonrpc_service


class YogentoJsonrpcImageService(yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService, yogento.api.services.image.image_service.ImageService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/image'):
            api_url += '/jsonrpc/image'
        yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService.__init__(self, api_url=api_url, headers=headers)

    def _delete_image_thumbnail(self, **kwds):
        return self._request('delete_image_thumbnail', **kwds)

    def _get_image_thumbnail_url(self, **kwds):
        return self._request('get_image_thumbnail_url', **kwds)

