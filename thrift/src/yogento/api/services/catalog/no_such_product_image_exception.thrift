namespace java com.yogento.api.services.catalog
namespace py yogento.api.services.catalog

exception NoSuchProductImageException {
    required string cause_message;
    required string sku;
}
