import __builtin__
import yogento.api.models.image.image_resolution


class ImageService(object):
    def delete_image_thumbnail(self, image_url, thumbnail_resolution):
        if image_url is None:
            raise ValueError('image_url is required')
        if not isinstance(image_url, basestring):
            raise TypeError(getattr(__builtin__, 'type')(image_url))
        if thumbnail_resolution is None:
            raise ValueError('thumbnail_resolution is required')
        if not isinstance(thumbnail_resolution, yogento.api.models.image.image_resolution.ImageResolution):
            raise TypeError(getattr(__builtin__, 'type')(thumbnail_resolution))

        delete_image_thumbnail_return_value = self._delete_image_thumbnail(image_url=image_url, thumbnail_resolution=thumbnail_resolution)

        if not isinstance(delete_image_thumbnail_return_value, bool):
            raise TypeError(getattr(__builtin__, 'type')(delete_image_thumbnail_return_value))

        return delete_image_thumbnail_return_value

    def _delete_image_thumbnail(self, image_url, thumbnail_resolution):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._delete_image_thumbnail')

    def get_image_thumbnail_url(self, image_url, thumbnail_resolution):
        if image_url is None:
            raise ValueError('image_url is required')
        if not isinstance(image_url, basestring):
            raise TypeError(getattr(__builtin__, 'type')(image_url))
        if thumbnail_resolution is None:
            raise ValueError('thumbnail_resolution is required')
        if not isinstance(thumbnail_resolution, yogento.api.models.image.image_resolution.ImageResolution):
            raise TypeError(getattr(__builtin__, 'type')(thumbnail_resolution))

        get_image_thumbnail_url_return_value = self._get_image_thumbnail_url(image_url=image_url, thumbnail_resolution=thumbnail_resolution)

        if not isinstance(get_image_thumbnail_url_return_value, basestring):
            raise TypeError(getattr(__builtin__, 'type')(get_image_thumbnail_url_return_value))

        return get_image_thumbnail_url_return_value

    def _get_image_thumbnail_url(self, image_url, thumbnail_resolution):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._get_image_thumbnail_url')
