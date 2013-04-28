namespace java com.yogento.api.services.image
namespace gwt_client_java com.yogento.gui.client.services.image
namespace gwt_server_java com.yogento.gui.server.services.image
namespace * yogento.api.services.image

include "yogento/api/models/image/image_resolution.thrift"
include "yogento/api/services/image/image_io_exception.thrift"

service ImageService {
    bool delete_image_thumbnail(string image_url, image_resolution.ImageResolution thumbnail_resolution);
    string get_image_thumbnail_url(string image_url, image_resolution.ImageResolution thumbnail_resolution) throws (image_io_exception.ImageIoException e);
    string put_image(binary image, string image_mime_subtype) throws (image_io_exception.ImageIoException e);
}
