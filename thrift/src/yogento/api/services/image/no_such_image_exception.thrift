namespace java com.yogento.api.services.image
namespace py yogento.api.services.image

exception NoSuchImageException {
    required string cause_message;
    required string image_url;
}
