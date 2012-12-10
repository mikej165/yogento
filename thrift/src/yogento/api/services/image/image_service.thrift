namespace java com.yogento.api.services.image
namespace py yogento.api.services.image

include "yogento/api/models/image/image_resolution.thrift"
include "yogento/api/services/image/no_such_image_exception.thrift"

service ImageService {
    bool delete_image_thumbnail(string image_url, image_resolution.ImageResolution thumbnail_resolution);
    string get_image_thumbnail_url(string image_url, image_resolution.ImageResolution thumbnail_resolution) throws (no_such_image_exception.NoSuchImageException e);
}
