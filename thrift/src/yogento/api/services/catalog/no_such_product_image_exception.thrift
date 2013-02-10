namespace java com.yogento.api.services.catalog
namespace * yogento.api.services.catalog

exception NoSuchProductImageException {
    required string cause_message;
    required string sku;
}
