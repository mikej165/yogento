namespace java com.yogento.api.services.catalog
namespace gwt_client_java com.yogento.gui.client.services.catalog
namespace gwt_server_java com.yogento.gui.server.services.catalog
namespace * yogento.api.services.catalog

include "thryft/native/url.thrift"
include "yogento/api/models/catalog/product/product.thrift"
include "yogento/api/services/catalog/no_such_product_exception.thrift"
include "yogento/api/services/catalog/no_such_product_image_exception.thrift"
include "yogento/api/services/catalog/product_io_exception.thrift"

service CatalogService {
    bool delete_product_by_sku(string sku) throws (product_io_exception.ProductIoException e);
    void delete_products() throws (product_io_exception.ProductIoException e);

    i32 get_product_count() throws (product_io_exception.ProductIoException e);

    product.Product
    get_product_by_sku(
        string sku
    ) throws (
        no_such_product_exception.NoSuchProductException e1,
        product_io_exception.ProductIoException e2
    );

    set<product.Product>
    get_products(
        optional bool include_disabled,
        optional string query
    ) throws (
        product_io_exception.ProductIoException e
    );

    set<string> get_product_skus() throws (product_io_exception.ProductIoException e);

    set<product.Product>
    get_products_by_skus(
        set<string> skus
    ) throws (
        no_such_product_exception.NoSuchProductException e1,
        product_io_exception.ProductIoException e2
    );

    url.Url
    get_product_thumbnail_url(
        string sku,
        i32 thumbnail_height_px,
        i32 thumbnail_width_px
    ) throws (
        no_such_product_exception.NoSuchProductException e1,
        no_such_product_image_exception.NoSuchProductImageException e2,
        product_io_exception.ProductIoException e3
    );

    url.Url
    get_sample_product_thumbnail_url(
        string sku,
        i32 thumbnail_height_px,
        i32 thumbnail_width_px
    ) throws (
        no_such_product_exception.NoSuchProductException e1,
        no_such_product_image_exception.NoSuchProductImageException e2,
        product_io_exception.ProductIoException e3
    );

    product.Product
    get_sample_product_by_sku(
        string sku
    ) throws (
        no_such_product_exception.NoSuchProductException e1,
        product_io_exception.ProductIoException e2
    );

    set<product.Product> get_sample_products() throws (product_io_exception.ProductIoException e);

    bool head_product_by_sku(string sku) throws (product_io_exception.ProductIoException e);

    void put_product(product.Product product) throws (product_io_exception.ProductIoException e);
    void put_products(set<product.Product> products) throws (product_io_exception.ProductIoException e);
}
