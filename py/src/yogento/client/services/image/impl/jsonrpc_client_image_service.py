import __builtin__
import thryft.core.protocol.json_protocol
import thryft.web.client.service._jsonrpc_client_service
import yogento.api.models.image.image_resolution
import yogento.api.services.image.image_service


class JsonrpcClientImageService(thryft.web.client.service._jsonrpc_client_service._JsonrpcClientService, yogento.api.services.image.image_service.ImageService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/image'):
            api_url += '/jsonrpc/image'
        thryft.web.client.service._jsonrpc_client_service._JsonrpcClientService.__init__(self, api_url=api_url, headers=headers)

    def _delete_image_thumbnail(self, **kwds):
        return self._request('delete_image_thumbnail', **kwds)

    def _get_image_thumbnail_url(self, **kwds):
        return self._request('get_image_thumbnail_url', **kwds)

    def _put_image(self, **kwds):
        return self._request('put_image', **kwds)

