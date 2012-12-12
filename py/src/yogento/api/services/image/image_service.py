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

    def put_image(self, image, image_mime_subtype):
        if image is None:
            raise ValueError('image is required')
        if not isinstance(image, basestring):
            raise TypeError(getattr(__builtin__, 'type')(image))
        if image_mime_subtype is None:
            raise ValueError('image_mime_subtype is required')
        if not isinstance(image_mime_subtype, basestring):
            raise TypeError(getattr(__builtin__, 'type')(image_mime_subtype))

        put_image_return_value = self._put_image(image=image, image_mime_subtype=image_mime_subtype)

        if not isinstance(put_image_return_value, basestring):
            raise TypeError(getattr(__builtin__, 'type')(put_image_return_value))

        return put_image_return_value

    def _put_image(self, image, image_mime_subtype):
        raise NotImplementedError(self.__class__.__module__ + '.' + self.__class__.__name__ + '._put_image')
