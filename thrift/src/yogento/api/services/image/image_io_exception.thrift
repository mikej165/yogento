namespace java com.yogento.api.services.image
namespace py yogento.api.services.image

exception ImageIoException {
    required string cause_message;
    optional string image_url;
}