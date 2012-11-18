package com.yogento.api.models.sales.order.magento;

@SuppressWarnings({"serial"})
public class MagentoOrderItem implements org.apache.thrift.TBase<MagentoOrderItem, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoOrderItem other) {
            this.additionalData = other.getAdditionalData();
            this.amountRefunded = other.getAmountRefunded();
            this.baseAmountRefunded = other.getBaseAmountRefunded();
            this.baseCost = other.getBaseCost();
            this.baseDiscountAmount = other.getBaseDiscountAmount();
            this.baseDiscountInvoiced = other.getBaseDiscountInvoiced();
            this.baseDiscountRefunded = other.getBaseDiscountRefunded();
            this.baseHiddenTaxAmount = other.getBaseHiddenTaxAmount();
            this.baseHiddenTaxInvoiced = other.getBaseHiddenTaxInvoiced();
            this.baseHiddenTaxRefunded = other.getBaseHiddenTaxRefunded();
            this.baseOriginalPrice = other.getBaseOriginalPrice();
            this.basePrice = other.getBasePrice();
            this.basePriceInclTax = other.getBasePriceInclTax();
            this.baseRowInvoiced = other.getBaseRowInvoiced();
            this.baseRowTotal = other.getBaseRowTotal();
            this.baseRowTotalInclTax = other.getBaseRowTotalInclTax();
            this.baseTaxAmount = other.getBaseTaxAmount();
            this.baseTaxBeforeDiscount = other.getBaseTaxBeforeDiscount();
            this.baseTaxInvoiced = other.getBaseTaxInvoiced();
            this.baseTaxRefunded = other.getBaseTaxRefunded();
            this.baseWeeeTaxAppliedAmount = other.getBaseWeeeTaxAppliedAmount();
            this.baseWeeeTaxAppliedRowAmnt = other.getBaseWeeeTaxAppliedRowAmnt();
            this.baseWeeeTaxAppliedRowAmount = other.getBaseWeeeTaxAppliedRowAmount();
            this.baseWeeeTaxDisposition = other.getBaseWeeeTaxDisposition();
            this.baseWeeeTaxRowDisposition = other.getBaseWeeeTaxRowDisposition();
            this.createdAt = other.getCreatedAt();
            this.description = other.getDescription();
            this.discountAmount = other.getDiscountAmount();
            this.discountInvoiced = other.getDiscountInvoiced();
            this.discountPercent = other.getDiscountPercent();
            this.discountRefunded = other.getDiscountRefunded();
            this.freeShipping = other.isFreeShipping();
            this.giftMessageAvailable = other.getGiftMessageAvailable();
            this.giftMessageId = other.getGiftMessageId();
            this.hasChildren = other.isHasChildren();
            this.hiddenTaxAmount = other.getHiddenTaxAmount();
            this.hiddenTaxCanceled = other.getHiddenTaxCanceled();
            this.hiddenTaxInvoiced = other.getHiddenTaxInvoiced();
            this.hiddenTaxRefunded = other.getHiddenTaxRefunded();
            this.isNominal = other.isNominal();
            this.isQtyDecimal = other.isQtyDecimal();
            this.isVirtual = other.isVirtual();
            this.itemId = other.getItemId();
            this.lockedDoInvoice = other.isLockedDoInvoice();
            this.lockedDoShip = other.isLockedDoShip();
            this.name = other.getName();
            this.noDiscount = other.isNoDiscount();
            this.orderId = other.getOrderId();
            this.originalPrice = other.getOriginalPrice();
            this.parentItemId = other.getParentItemId();
            this.price = other.getPrice();
            this.priceInclTax = other.getPriceInclTax();
            this.productId = other.getProductId();
            this.productType = other.getProductType();
            this.qtyBackordered = other.getQtyBackordered();
            this.qtyCanceled = other.getQtyCanceled();
            this.qtyInvoiced = other.getQtyInvoiced();
            this.qtyOrdered = other.getQtyOrdered();
            this.qtyRefunded = other.getQtyRefunded();
            this.qtyShipped = other.getQtyShipped();
            this.quoteItemId = other.getQuoteItemId();
            this.rowInvoiced = other.getRowInvoiced();
            this.rowTotal = other.getRowTotal();
            this.rowTotalInclTax = other.getRowTotalInclTax();
            this.rowWeight = other.getRowWeight();
            this.sku = other.getSku();
            this.storeId = other.getStoreId();
            this.taxAmount = other.getTaxAmount();
            this.taxBeforeDiscount = other.getTaxBeforeDiscount();
            this.taxCanceled = other.getTaxCanceled();
            this.taxInvoiced = other.getTaxInvoiced();
            this.taxPercent = other.getTaxPercent();
            this.taxRefunded = other.getTaxRefunded();
            this.updatedAt = other.getUpdatedAt();
            this.weeeTaxAppliedAmount = other.getWeeeTaxAppliedAmount();
            this.weeeTaxAppliedRowAmount = other.getWeeeTaxAppliedRowAmount();
            this.weeeTaxDisposition = other.getWeeeTaxDisposition();
            this.weeeTaxRowDisposition = other.getWeeeTaxRowDisposition();
            this.weight = other.getWeight();
        }

        protected MagentoOrderItem _build(final String additionalData, final java.math.BigDecimal amountRefunded, final java.math.BigDecimal baseAmountRefunded, final java.math.BigDecimal baseCost, final java.math.BigDecimal baseDiscountAmount, final java.math.BigDecimal baseDiscountInvoiced, final java.math.BigDecimal baseDiscountRefunded, final java.math.BigDecimal baseHiddenTaxAmount, final java.math.BigDecimal baseHiddenTaxInvoiced, final java.math.BigDecimal baseHiddenTaxRefunded, final java.math.BigDecimal baseOriginalPrice, final java.math.BigDecimal basePrice, final java.math.BigDecimal basePriceInclTax, final java.math.BigDecimal baseRowInvoiced, final java.math.BigDecimal baseRowTotal, final java.math.BigDecimal baseRowTotalInclTax, final java.math.BigDecimal baseTaxAmount, final java.math.BigDecimal baseTaxBeforeDiscount, final java.math.BigDecimal baseTaxInvoiced, final java.math.BigDecimal baseTaxRefunded, final java.math.BigDecimal baseWeeeTaxAppliedAmount, final java.math.BigDecimal baseWeeeTaxAppliedRowAmnt, final java.math.BigDecimal baseWeeeTaxAppliedRowAmount, final java.math.BigDecimal baseWeeeTaxDisposition, final java.math.BigDecimal baseWeeeTaxRowDisposition, final org.joda.time.DateTime createdAt, final String description, final java.math.BigDecimal discountAmount, final java.math.BigDecimal discountInvoiced, final java.math.BigDecimal discountPercent, final java.math.BigDecimal discountRefunded, final Boolean freeShipping, final String giftMessageAvailable, final Integer giftMessageId, final Boolean hasChildren, final java.math.BigDecimal hiddenTaxAmount, final java.math.BigDecimal hiddenTaxCanceled, final java.math.BigDecimal hiddenTaxInvoiced, final java.math.BigDecimal hiddenTaxRefunded, final Boolean isNominal, final Boolean isQtyDecimal, final Boolean isVirtual, final Integer itemId, final Boolean lockedDoInvoice, final Boolean lockedDoShip, final String name, final Boolean noDiscount, final Integer orderId, final java.math.BigDecimal originalPrice, final Integer parentItemId, final java.math.BigDecimal price, final java.math.BigDecimal priceInclTax, final Integer productId, final com.yogento.api.models.catalog.product.magento.MagentoProductType productType, final java.math.BigDecimal qtyBackordered, final java.math.BigDecimal qtyCanceled, final java.math.BigDecimal qtyInvoiced, final java.math.BigDecimal qtyOrdered, final java.math.BigDecimal qtyRefunded, final java.math.BigDecimal qtyShipped, final Integer quoteItemId, final java.math.BigDecimal rowInvoiced, final java.math.BigDecimal rowTotal, final java.math.BigDecimal rowTotalInclTax, final java.math.BigDecimal rowWeight, final String sku, final Integer storeId, final java.math.BigDecimal taxAmount, final java.math.BigDecimal taxBeforeDiscount, final java.math.BigDecimal taxCanceled, final java.math.BigDecimal taxInvoiced, final java.math.BigDecimal taxPercent, final java.math.BigDecimal taxRefunded, final org.joda.time.DateTime updatedAt, final java.math.BigDecimal weeeTaxAppliedAmount, final java.math.BigDecimal weeeTaxAppliedRowAmount, final java.math.BigDecimal weeeTaxDisposition, final java.math.BigDecimal weeeTaxRowDisposition, final java.math.BigDecimal weight) {
            return new MagentoOrderItem(additionalData, amountRefunded, baseAmountRefunded, baseCost, baseDiscountAmount, baseDiscountInvoiced, baseDiscountRefunded, baseHiddenTaxAmount, baseHiddenTaxInvoiced, baseHiddenTaxRefunded, baseOriginalPrice, basePrice, basePriceInclTax, baseRowInvoiced, baseRowTotal, baseRowTotalInclTax, baseTaxAmount, baseTaxBeforeDiscount, baseTaxInvoiced, baseTaxRefunded, baseWeeeTaxAppliedAmount, baseWeeeTaxAppliedRowAmnt, baseWeeeTaxAppliedRowAmount, baseWeeeTaxDisposition, baseWeeeTaxRowDisposition, createdAt, description, discountAmount, discountInvoiced, discountPercent, discountRefunded, freeShipping, giftMessageAvailable, giftMessageId, hasChildren, hiddenTaxAmount, hiddenTaxCanceled, hiddenTaxInvoiced, hiddenTaxRefunded, isNominal, isQtyDecimal, isVirtual, itemId, lockedDoInvoice, lockedDoShip, name, noDiscount, orderId, originalPrice, parentItemId, price, priceInclTax, productId, productType, qtyBackordered, qtyCanceled, qtyInvoiced, qtyOrdered, qtyRefunded, qtyShipped, quoteItemId, rowInvoiced, rowTotal, rowTotalInclTax, rowWeight, sku, storeId, taxAmount, taxBeforeDiscount, taxCanceled, taxInvoiced, taxPercent, taxRefunded, updatedAt, weeeTaxAppliedAmount, weeeTaxAppliedRowAmount, weeeTaxDisposition, weeeTaxRowDisposition, weight);
        }

        public MagentoOrderItem build() {
            return _build(additionalData, amountRefunded, baseAmountRefunded, baseCost, baseDiscountAmount, baseDiscountInvoiced, baseDiscountRefunded, baseHiddenTaxAmount, baseHiddenTaxInvoiced, baseHiddenTaxRefunded, baseOriginalPrice, basePrice, basePriceInclTax, baseRowInvoiced, baseRowTotal, baseRowTotalInclTax, baseTaxAmount, baseTaxBeforeDiscount, baseTaxInvoiced, baseTaxRefunded, baseWeeeTaxAppliedAmount, baseWeeeTaxAppliedRowAmnt, baseWeeeTaxAppliedRowAmount, baseWeeeTaxDisposition, baseWeeeTaxRowDisposition, createdAt, description, discountAmount, discountInvoiced, discountPercent, discountRefunded, freeShipping, giftMessageAvailable, giftMessageId, hasChildren, hiddenTaxAmount, hiddenTaxCanceled, hiddenTaxInvoiced, hiddenTaxRefunded, isNominal, isQtyDecimal, isVirtual, itemId, lockedDoInvoice, lockedDoShip, name, noDiscount, orderId, originalPrice, parentItemId, price, priceInclTax, productId, productType, qtyBackordered, qtyCanceled, qtyInvoiced, qtyOrdered, qtyRefunded, qtyShipped, quoteItemId, rowInvoiced, rowTotal, rowTotalInclTax, rowWeight, sku, storeId, taxAmount, taxBeforeDiscount, taxCanceled, taxInvoiced, taxPercent, taxRefunded, updatedAt, weeeTaxAppliedAmount, weeeTaxAppliedRowAmount, weeeTaxDisposition, weeeTaxRowDisposition, weight);
        }

        public Builder setAdditionalData(final String additionalData) {
            this.additionalData = additionalData;
            return this;
        }

        public Builder setAmountRefunded(final java.math.BigDecimal amountRefunded) {
            this.amountRefunded = amountRefunded;
            return this;
        }

        public Builder setBaseAmountRefunded(final java.math.BigDecimal baseAmountRefunded) {
            this.baseAmountRefunded = baseAmountRefunded;
            return this;
        }

        public Builder setBaseCost(final java.math.BigDecimal baseCost) {
            this.baseCost = baseCost;
            return this;
        }

        public Builder setBaseDiscountAmount(final java.math.BigDecimal baseDiscountAmount) {
            this.baseDiscountAmount = baseDiscountAmount;
            return this;
        }

        public Builder setBaseDiscountInvoiced(final java.math.BigDecimal baseDiscountInvoiced) {
            this.baseDiscountInvoiced = baseDiscountInvoiced;
            return this;
        }

        public Builder setBaseDiscountRefunded(final java.math.BigDecimal baseDiscountRefunded) {
            this.baseDiscountRefunded = baseDiscountRefunded;
            return this;
        }

        public Builder setBaseHiddenTaxAmount(final java.math.BigDecimal baseHiddenTaxAmount) {
            this.baseHiddenTaxAmount = baseHiddenTaxAmount;
            return this;
        }

        public Builder setBaseHiddenTaxInvoiced(final java.math.BigDecimal baseHiddenTaxInvoiced) {
            this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
            return this;
        }

        public Builder setBaseHiddenTaxRefunded(final java.math.BigDecimal baseHiddenTaxRefunded) {
            this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
            return this;
        }

        public Builder setBaseOriginalPrice(final java.math.BigDecimal baseOriginalPrice) {
            this.baseOriginalPrice = baseOriginalPrice;
            return this;
        }

        public Builder setBasePrice(final java.math.BigDecimal basePrice) {
            this.basePrice = basePrice;
            return this;
        }

        public Builder setBasePriceInclTax(final java.math.BigDecimal basePriceInclTax) {
            this.basePriceInclTax = basePriceInclTax;
            return this;
        }

        public Builder setBaseRowInvoiced(final java.math.BigDecimal baseRowInvoiced) {
            this.baseRowInvoiced = baseRowInvoiced;
            return this;
        }

        public Builder setBaseRowTotal(final java.math.BigDecimal baseRowTotal) {
            this.baseRowTotal = baseRowTotal;
            return this;
        }

        public Builder setBaseRowTotalInclTax(final java.math.BigDecimal baseRowTotalInclTax) {
            this.baseRowTotalInclTax = baseRowTotalInclTax;
            return this;
        }

        public Builder setBaseTaxAmount(final java.math.BigDecimal baseTaxAmount) {
            this.baseTaxAmount = baseTaxAmount;
            return this;
        }

        public Builder setBaseTaxBeforeDiscount(final java.math.BigDecimal baseTaxBeforeDiscount) {
            this.baseTaxBeforeDiscount = baseTaxBeforeDiscount;
            return this;
        }

        public Builder setBaseTaxInvoiced(final java.math.BigDecimal baseTaxInvoiced) {
            this.baseTaxInvoiced = baseTaxInvoiced;
            return this;
        }

        public Builder setBaseTaxRefunded(final java.math.BigDecimal baseTaxRefunded) {
            this.baseTaxRefunded = baseTaxRefunded;
            return this;
        }

        public Builder setBaseWeeeTaxAppliedAmount(final java.math.BigDecimal baseWeeeTaxAppliedAmount) {
            this.baseWeeeTaxAppliedAmount = baseWeeeTaxAppliedAmount;
            return this;
        }

        public Builder setBaseWeeeTaxAppliedRowAmnt(final java.math.BigDecimal baseWeeeTaxAppliedRowAmnt) {
            this.baseWeeeTaxAppliedRowAmnt = baseWeeeTaxAppliedRowAmnt;
            return this;
        }

        public Builder setBaseWeeeTaxAppliedRowAmount(final java.math.BigDecimal baseWeeeTaxAppliedRowAmount) {
            this.baseWeeeTaxAppliedRowAmount = baseWeeeTaxAppliedRowAmount;
            return this;
        }

        public Builder setBaseWeeeTaxDisposition(final java.math.BigDecimal baseWeeeTaxDisposition) {
            this.baseWeeeTaxDisposition = baseWeeeTaxDisposition;
            return this;
        }

        public Builder setBaseWeeeTaxRowDisposition(final java.math.BigDecimal baseWeeeTaxRowDisposition) {
            this.baseWeeeTaxRowDisposition = baseWeeeTaxRowDisposition;
            return this;
        }

        public Builder setCreatedAt(final org.joda.time.DateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setDescription(final String description) {
            this.description = description;
            return this;
        }

        public Builder setDiscountAmount(final java.math.BigDecimal discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        public Builder setDiscountInvoiced(final java.math.BigDecimal discountInvoiced) {
            this.discountInvoiced = discountInvoiced;
            return this;
        }

        public Builder setDiscountPercent(final java.math.BigDecimal discountPercent) {
            this.discountPercent = discountPercent;
            return this;
        }

        public Builder setDiscountRefunded(final java.math.BigDecimal discountRefunded) {
            this.discountRefunded = discountRefunded;
            return this;
        }

        public Builder setFreeShipping(final Boolean freeShipping) {
            this.freeShipping = freeShipping;
            return this;
        }

        public Builder setGiftMessageAvailable(final String giftMessageAvailable) {
            this.giftMessageAvailable = giftMessageAvailable;
            return this;
        }

        public Builder setGiftMessageId(final Integer giftMessageId) {
            this.giftMessageId = giftMessageId;
            return this;
        }

        public Builder setHasChildren(final Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }

        public Builder setHiddenTaxAmount(final java.math.BigDecimal hiddenTaxAmount) {
            this.hiddenTaxAmount = hiddenTaxAmount;
            return this;
        }

        public Builder setHiddenTaxCanceled(final java.math.BigDecimal hiddenTaxCanceled) {
            this.hiddenTaxCanceled = hiddenTaxCanceled;
            return this;
        }

        public Builder setHiddenTaxInvoiced(final java.math.BigDecimal hiddenTaxInvoiced) {
            this.hiddenTaxInvoiced = hiddenTaxInvoiced;
            return this;
        }

        public Builder setHiddenTaxRefunded(final java.math.BigDecimal hiddenTaxRefunded) {
            this.hiddenTaxRefunded = hiddenTaxRefunded;
            return this;
        }

        public Builder setIsNominal(final Boolean isNominal) {
            this.isNominal = isNominal;
            return this;
        }

        public Builder setIsQtyDecimal(final Boolean isQtyDecimal) {
            this.isQtyDecimal = isQtyDecimal;
            return this;
        }

        public Builder setIsVirtual(final Boolean isVirtual) {
            this.isVirtual = isVirtual;
            return this;
        }

        public Builder setItemId(final Integer itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder setLockedDoInvoice(final Boolean lockedDoInvoice) {
            this.lockedDoInvoice = lockedDoInvoice;
            return this;
        }

        public Builder setLockedDoShip(final Boolean lockedDoShip) {
            this.lockedDoShip = lockedDoShip;
            return this;
        }

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setNoDiscount(final Boolean noDiscount) {
            this.noDiscount = noDiscount;
            return this;
        }

        public Builder setOrderId(final Integer orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setOriginalPrice(final java.math.BigDecimal originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }

        public Builder setParentItemId(final Integer parentItemId) {
            this.parentItemId = parentItemId;
            return this;
        }

        public Builder setPrice(final java.math.BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder setPriceInclTax(final java.math.BigDecimal priceInclTax) {
            this.priceInclTax = priceInclTax;
            return this;
        }

        public Builder setProductId(final Integer productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductType(final com.yogento.api.models.catalog.product.magento.MagentoProductType productType) {
            this.productType = productType;
            return this;
        }

        public Builder setQtyBackordered(final java.math.BigDecimal qtyBackordered) {
            this.qtyBackordered = qtyBackordered;
            return this;
        }

        public Builder setQtyCanceled(final java.math.BigDecimal qtyCanceled) {
            this.qtyCanceled = qtyCanceled;
            return this;
        }

        public Builder setQtyInvoiced(final java.math.BigDecimal qtyInvoiced) {
            this.qtyInvoiced = qtyInvoiced;
            return this;
        }

        public Builder setQtyOrdered(final java.math.BigDecimal qtyOrdered) {
            this.qtyOrdered = qtyOrdered;
            return this;
        }

        public Builder setQtyRefunded(final java.math.BigDecimal qtyRefunded) {
            this.qtyRefunded = qtyRefunded;
            return this;
        }

        public Builder setQtyShipped(final java.math.BigDecimal qtyShipped) {
            this.qtyShipped = qtyShipped;
            return this;
        }

        public Builder setQuoteItemId(final Integer quoteItemId) {
            this.quoteItemId = quoteItemId;
            return this;
        }

        public Builder setRowInvoiced(final java.math.BigDecimal rowInvoiced) {
            this.rowInvoiced = rowInvoiced;
            return this;
        }

        public Builder setRowTotal(final java.math.BigDecimal rowTotal) {
            this.rowTotal = rowTotal;
            return this;
        }

        public Builder setRowTotalInclTax(final java.math.BigDecimal rowTotalInclTax) {
            this.rowTotalInclTax = rowTotalInclTax;
            return this;
        }

        public Builder setRowWeight(final java.math.BigDecimal rowWeight) {
            this.rowWeight = rowWeight;
            return this;
        }

        public Builder setSku(final String sku) {
            this.sku = sku;
            return this;
        }

        public Builder setStoreId(final Integer storeId) {
            this.storeId = storeId;
            return this;
        }

        public Builder setTaxAmount(final java.math.BigDecimal taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }

        public Builder setTaxBeforeDiscount(final java.math.BigDecimal taxBeforeDiscount) {
            this.taxBeforeDiscount = taxBeforeDiscount;
            return this;
        }

        public Builder setTaxCanceled(final java.math.BigDecimal taxCanceled) {
            this.taxCanceled = taxCanceled;
            return this;
        }

        public Builder setTaxInvoiced(final java.math.BigDecimal taxInvoiced) {
            this.taxInvoiced = taxInvoiced;
            return this;
        }

        public Builder setTaxPercent(final java.math.BigDecimal taxPercent) {
            this.taxPercent = taxPercent;
            return this;
        }

        public Builder setTaxRefunded(final java.math.BigDecimal taxRefunded) {
            this.taxRefunded = taxRefunded;
            return this;
        }

        public Builder setUpdatedAt(final org.joda.time.DateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setWeeeTaxAppliedAmount(final java.math.BigDecimal weeeTaxAppliedAmount) {
            this.weeeTaxAppliedAmount = weeeTaxAppliedAmount;
            return this;
        }

        public Builder setWeeeTaxAppliedRowAmount(final java.math.BigDecimal weeeTaxAppliedRowAmount) {
            this.weeeTaxAppliedRowAmount = weeeTaxAppliedRowAmount;
            return this;
        }

        public Builder setWeeeTaxDisposition(final java.math.BigDecimal weeeTaxDisposition) {
            this.weeeTaxDisposition = weeeTaxDisposition;
            return this;
        }

        public Builder setWeeeTaxRowDisposition(final java.math.BigDecimal weeeTaxRowDisposition) {
            this.weeeTaxRowDisposition = weeeTaxRowDisposition;
            return this;
        }

        public Builder setWeight(final java.math.BigDecimal weight) {
            this.weight = weight;
            return this;
        }

        private String additionalData;
        private java.math.BigDecimal amountRefunded;
        private java.math.BigDecimal baseAmountRefunded;
        private java.math.BigDecimal baseCost;
        private java.math.BigDecimal baseDiscountAmount;
        private java.math.BigDecimal baseDiscountInvoiced;
        private java.math.BigDecimal baseDiscountRefunded;
        private java.math.BigDecimal baseHiddenTaxAmount;
        private java.math.BigDecimal baseHiddenTaxInvoiced;
        private java.math.BigDecimal baseHiddenTaxRefunded;
        private java.math.BigDecimal baseOriginalPrice;
        private java.math.BigDecimal basePrice;
        private java.math.BigDecimal basePriceInclTax;
        private java.math.BigDecimal baseRowInvoiced;
        private java.math.BigDecimal baseRowTotal;
        private java.math.BigDecimal baseRowTotalInclTax;
        private java.math.BigDecimal baseTaxAmount;
        private java.math.BigDecimal baseTaxBeforeDiscount;
        private java.math.BigDecimal baseTaxInvoiced;
        private java.math.BigDecimal baseTaxRefunded;
        private java.math.BigDecimal baseWeeeTaxAppliedAmount;
        private java.math.BigDecimal baseWeeeTaxAppliedRowAmnt;
        private java.math.BigDecimal baseWeeeTaxAppliedRowAmount;
        private java.math.BigDecimal baseWeeeTaxDisposition;
        private java.math.BigDecimal baseWeeeTaxRowDisposition;
        private org.joda.time.DateTime createdAt;
        private String description;
        private java.math.BigDecimal discountAmount;
        private java.math.BigDecimal discountInvoiced;
        private java.math.BigDecimal discountPercent;
        private java.math.BigDecimal discountRefunded;
        private Boolean freeShipping;
        private String giftMessageAvailable;
        private Integer giftMessageId;
        private Boolean hasChildren;
        private java.math.BigDecimal hiddenTaxAmount;
        private java.math.BigDecimal hiddenTaxCanceled;
        private java.math.BigDecimal hiddenTaxInvoiced;
        private java.math.BigDecimal hiddenTaxRefunded;
        private Boolean isNominal;
        private Boolean isQtyDecimal;
        private Boolean isVirtual;
        private Integer itemId;
        private Boolean lockedDoInvoice;
        private Boolean lockedDoShip;
        private String name;
        private Boolean noDiscount;
        private Integer orderId;
        private java.math.BigDecimal originalPrice;
        private Integer parentItemId;
        private java.math.BigDecimal price;
        private java.math.BigDecimal priceInclTax;
        private Integer productId;
        private com.yogento.api.models.catalog.product.magento.MagentoProductType productType;
        private java.math.BigDecimal qtyBackordered;
        private java.math.BigDecimal qtyCanceled;
        private java.math.BigDecimal qtyInvoiced;
        private java.math.BigDecimal qtyOrdered;
        private java.math.BigDecimal qtyRefunded;
        private java.math.BigDecimal qtyShipped;
        private Integer quoteItemId;
        private java.math.BigDecimal rowInvoiced;
        private java.math.BigDecimal rowTotal;
        private java.math.BigDecimal rowTotalInclTax;
        private java.math.BigDecimal rowWeight;
        private String sku;
        private Integer storeId;
        private java.math.BigDecimal taxAmount;
        private java.math.BigDecimal taxBeforeDiscount;
        private java.math.BigDecimal taxCanceled;
        private java.math.BigDecimal taxInvoiced;
        private java.math.BigDecimal taxPercent;
        private java.math.BigDecimal taxRefunded;
        private org.joda.time.DateTime updatedAt;
        private java.math.BigDecimal weeeTaxAppliedAmount;
        private java.math.BigDecimal weeeTaxAppliedRowAmount;
        private java.math.BigDecimal weeeTaxDisposition;
        private java.math.BigDecimal weeeTaxRowDisposition;
        private java.math.BigDecimal weight;
    }

    public MagentoOrderItem(final MagentoOrderItem other) {
        this(other.getAdditionalData(), other.getAmountRefunded(), other.getBaseAmountRefunded(), other.getBaseCost(), other.getBaseDiscountAmount(), other.getBaseDiscountInvoiced(), other.getBaseDiscountRefunded(), other.getBaseHiddenTaxAmount(), other.getBaseHiddenTaxInvoiced(), other.getBaseHiddenTaxRefunded(), other.getBaseOriginalPrice(), other.getBasePrice(), other.getBasePriceInclTax(), other.getBaseRowInvoiced(), other.getBaseRowTotal(), other.getBaseRowTotalInclTax(), other.getBaseTaxAmount(), other.getBaseTaxBeforeDiscount(), other.getBaseTaxInvoiced(), other.getBaseTaxRefunded(), other.getBaseWeeeTaxAppliedAmount(), other.getBaseWeeeTaxAppliedRowAmnt(), other.getBaseWeeeTaxAppliedRowAmount(), other.getBaseWeeeTaxDisposition(), other.getBaseWeeeTaxRowDisposition(), other.getCreatedAt(), other.getDescription(), other.getDiscountAmount(), other.getDiscountInvoiced(), other.getDiscountPercent(), other.getDiscountRefunded(), other.isFreeShipping(), other.getGiftMessageAvailable(), other.getGiftMessageId(), other.isHasChildren(), other.getHiddenTaxAmount(), other.getHiddenTaxCanceled(), other.getHiddenTaxInvoiced(), other.getHiddenTaxRefunded(), other.isNominal(), other.isQtyDecimal(), other.isVirtual(), other.getItemId(), other.isLockedDoInvoice(), other.isLockedDoShip(), other.getName(), other.isNoDiscount(), other.getOrderId(), other.getOriginalPrice(), other.getParentItemId(), other.getPrice(), other.getPriceInclTax(), other.getProductId(), other.getProductType(), other.getQtyBackordered(), other.getQtyCanceled(), other.getQtyInvoiced(), other.getQtyOrdered(), other.getQtyRefunded(), other.getQtyShipped(), other.getQuoteItemId(), other.getRowInvoiced(), other.getRowTotal(), other.getRowTotalInclTax(), other.getRowWeight(), other.getSku(), other.getStoreId(), other.getTaxAmount(), other.getTaxBeforeDiscount(), other.getTaxCanceled(), other.getTaxInvoiced(), other.getTaxPercent(), other.getTaxRefunded(), other.getUpdatedAt(), other.getWeeeTaxAppliedAmount(), other.getWeeeTaxAppliedRowAmount(), other.getWeeeTaxDisposition(), other.getWeeeTaxRowDisposition(), other.getWeight());
    }

    public MagentoOrderItem(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MagentoOrderItem(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        String additionalData = null;
        java.math.BigDecimal amountRefunded = null;
        java.math.BigDecimal baseAmountRefunded = null;
        java.math.BigDecimal baseCost = null;
        java.math.BigDecimal baseDiscountAmount = null;
        java.math.BigDecimal baseDiscountInvoiced = null;
        java.math.BigDecimal baseDiscountRefunded = null;
        java.math.BigDecimal baseHiddenTaxAmount = null;
        java.math.BigDecimal baseHiddenTaxInvoiced = null;
        java.math.BigDecimal baseHiddenTaxRefunded = null;
        java.math.BigDecimal baseOriginalPrice = null;
        java.math.BigDecimal basePrice = null;
        java.math.BigDecimal basePriceInclTax = null;
        java.math.BigDecimal baseRowInvoiced = null;
        java.math.BigDecimal baseRowTotal = null;
        java.math.BigDecimal baseRowTotalInclTax = null;
        java.math.BigDecimal baseTaxAmount = null;
        java.math.BigDecimal baseTaxBeforeDiscount = null;
        java.math.BigDecimal baseTaxInvoiced = null;
        java.math.BigDecimal baseTaxRefunded = null;
        java.math.BigDecimal baseWeeeTaxAppliedAmount = null;
        java.math.BigDecimal baseWeeeTaxAppliedRowAmnt = null;
        java.math.BigDecimal baseWeeeTaxAppliedRowAmount = null;
        java.math.BigDecimal baseWeeeTaxDisposition = null;
        java.math.BigDecimal baseWeeeTaxRowDisposition = null;
        org.joda.time.DateTime createdAt = null;
        String description = null;
        java.math.BigDecimal discountAmount = null;
        java.math.BigDecimal discountInvoiced = null;
        java.math.BigDecimal discountPercent = null;
        java.math.BigDecimal discountRefunded = null;
        Boolean freeShipping = null;
        String giftMessageAvailable = null;
        Integer giftMessageId = null;
        Boolean hasChildren = null;
        java.math.BigDecimal hiddenTaxAmount = null;
        java.math.BigDecimal hiddenTaxCanceled = null;
        java.math.BigDecimal hiddenTaxInvoiced = null;
        java.math.BigDecimal hiddenTaxRefunded = null;
        Boolean isNominal = null;
        Boolean isQtyDecimal = null;
        Boolean isVirtual = null;
        Integer itemId = null;
        Boolean lockedDoInvoice = null;
        Boolean lockedDoShip = null;
        String name = null;
        Boolean noDiscount = null;
        Integer orderId = null;
        java.math.BigDecimal originalPrice = null;
        Integer parentItemId = null;
        java.math.BigDecimal price = null;
        java.math.BigDecimal priceInclTax = null;
        Integer productId = null;
        com.yogento.api.models.catalog.product.magento.MagentoProductType productType = null;
        java.math.BigDecimal qtyBackordered = null;
        java.math.BigDecimal qtyCanceled = null;
        java.math.BigDecimal qtyInvoiced = null;
        java.math.BigDecimal qtyOrdered = null;
        java.math.BigDecimal qtyRefunded = null;
        java.math.BigDecimal qtyShipped = null;
        Integer quoteItemId = null;
        java.math.BigDecimal rowInvoiced = null;
        java.math.BigDecimal rowTotal = null;
        java.math.BigDecimal rowTotalInclTax = null;
        java.math.BigDecimal rowWeight = null;
        String sku = null;
        Integer storeId = null;
        java.math.BigDecimal taxAmount = null;
        java.math.BigDecimal taxBeforeDiscount = null;
        java.math.BigDecimal taxCanceled = null;
        java.math.BigDecimal taxInvoiced = null;
        java.math.BigDecimal taxPercent = null;
        java.math.BigDecimal taxRefunded = null;
        org.joda.time.DateTime updatedAt = null;
        java.math.BigDecimal weeeTaxAppliedAmount = null;
        java.math.BigDecimal weeeTaxAppliedRowAmount = null;
        java.math.BigDecimal weeeTaxDisposition = null;
        java.math.BigDecimal weeeTaxRowDisposition = null;
        java.math.BigDecimal weight = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                additionalData = iprot.readString();
                try {
                    amountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseAmountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseCost = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseDiscountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseDiscountInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseDiscountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseHiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseHiddenTaxInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseHiddenTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseOriginalPrice = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    basePrice = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    basePriceInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseRowInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseRowTotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseRowTotalInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTaxBeforeDiscount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTaxInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseWeeeTaxAppliedAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseWeeeTaxAppliedRowAmnt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseWeeeTaxAppliedRowAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseWeeeTaxDisposition = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseWeeeTaxRowDisposition = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                description = iprot.readString();
                try {
                    discountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    discountInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    discountPercent = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    discountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                freeShipping = iprot.readBool();
                giftMessageAvailable = iprot.readString();
                try {
                    giftMessageId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                hasChildren = iprot.readBool();
                try {
                    hiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    hiddenTaxCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    hiddenTaxInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    hiddenTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                isNominal = iprot.readBool();
                isQtyDecimal = iprot.readBool();
                isVirtual = iprot.readBool();
                try {
                    itemId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                lockedDoInvoice = iprot.readBool();
                lockedDoShip = iprot.readBool();
                name = iprot.readString();
                noDiscount = iprot.readBool();
                try {
                    orderId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    originalPrice = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    parentItemId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    price = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    priceInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    productId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                productType = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductType.class) : com.yogento.api.models.catalog.product.magento.MagentoProductType.valueOf(iprot.readString().trim().toUpperCase());
                try {
                    qtyBackordered = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    qtyCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    qtyInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    qtyOrdered = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    qtyRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    qtyShipped = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    quoteItemId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    rowInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    rowTotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    rowTotalInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    rowWeight = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                sku = iprot.readString();
                try {
                    storeId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    taxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    taxBeforeDiscount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    taxCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    taxInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    taxPercent = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    taxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                try {
                    weeeTaxAppliedAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    weeeTaxAppliedRowAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    weeeTaxDisposition = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    weeeTaxRowDisposition = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    weight = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("additional_data")) {
                        additionalData = iprot.readString();
                    } else if (ifield.name.equals("amount_refunded")) {
                        try {
                            amountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_amount_refunded")) {
                        try {
                            baseAmountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_cost")) {
                        try {
                            baseCost = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_discount_amount")) {
                        try {
                            baseDiscountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_discount_invoiced")) {
                        try {
                            baseDiscountInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_discount_refunded")) {
                        try {
                            baseDiscountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_hidden_tax_amount")) {
                        try {
                            baseHiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_hidden_tax_invoiced")) {
                        try {
                            baseHiddenTaxInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_hidden_tax_refunded")) {
                        try {
                            baseHiddenTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_original_price")) {
                        try {
                            baseOriginalPrice = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_price")) {
                        try {
                            basePrice = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_price_incl_tax")) {
                        try {
                            basePriceInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_row_invoiced")) {
                        try {
                            baseRowInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_row_total")) {
                        try {
                            baseRowTotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_row_total_incl_tax")) {
                        try {
                            baseRowTotalInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_tax_amount")) {
                        try {
                            baseTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_tax_before_discount")) {
                        try {
                            baseTaxBeforeDiscount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_tax_invoiced")) {
                        try {
                            baseTaxInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_tax_refunded")) {
                        try {
                            baseTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_weee_tax_applied_amount")) {
                        try {
                            baseWeeeTaxAppliedAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_weee_tax_applied_row_amnt")) {
                        try {
                            baseWeeeTaxAppliedRowAmnt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_weee_tax_applied_row_amount")) {
                        try {
                            baseWeeeTaxAppliedRowAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_weee_tax_disposition")) {
                        try {
                            baseWeeeTaxDisposition = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_weee_tax_row_disposition")) {
                        try {
                            baseWeeeTaxRowDisposition = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("created_at")) {
                        createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("description")) {
                        description = iprot.readString();
                    } else if (ifield.name.equals("discount_amount")) {
                        try {
                            discountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("discount_invoiced")) {
                        try {
                            discountInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("discount_percent")) {
                        try {
                            discountPercent = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("discount_refunded")) {
                        try {
                            discountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("free_shipping")) {
                        freeShipping = iprot.readBool();
                    } else if (ifield.name.equals("gift_message_available")) {
                        giftMessageAvailable = iprot.readString();
                    } else if (ifield.name.equals("gift_message_id")) {
                        try {
                            giftMessageId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("has_children")) {
                        hasChildren = iprot.readBool();
                    } else if (ifield.name.equals("hidden_tax_amount")) {
                        try {
                            hiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("hidden_tax_canceled")) {
                        try {
                            hiddenTaxCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("hidden_tax_invoiced")) {
                        try {
                            hiddenTaxInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("hidden_tax_refunded")) {
                        try {
                            hiddenTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("is_nominal")) {
                        isNominal = iprot.readBool();
                    } else if (ifield.name.equals("is_qty_decimal")) {
                        isQtyDecimal = iprot.readBool();
                    } else if (ifield.name.equals("is_virtual")) {
                        isVirtual = iprot.readBool();
                    } else if (ifield.name.equals("item_id")) {
                        try {
                            itemId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("locked_do_invoice")) {
                        lockedDoInvoice = iprot.readBool();
                    } else if (ifield.name.equals("locked_do_ship")) {
                        lockedDoShip = iprot.readBool();
                    } else if (ifield.name.equals("name")) {
                        name = iprot.readString();
                    } else if (ifield.name.equals("no_discount")) {
                        noDiscount = iprot.readBool();
                    } else if (ifield.name.equals("order_id")) {
                        try {
                            orderId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("original_price")) {
                        try {
                            originalPrice = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("parent_item_id")) {
                        try {
                            parentItemId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("price")) {
                        try {
                            price = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("price_incl_tax")) {
                        try {
                            priceInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("product_id")) {
                        try {
                            productId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("product_type")) {
                        productType = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.catalog.product.magento.MagentoProductType.class) : com.yogento.api.models.catalog.product.magento.MagentoProductType.valueOf(iprot.readString().trim().toUpperCase());
                    } else if (ifield.name.equals("qty_backordered")) {
                        try {
                            qtyBackordered = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("qty_canceled")) {
                        try {
                            qtyCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("qty_invoiced")) {
                        try {
                            qtyInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("qty_ordered")) {
                        try {
                            qtyOrdered = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("qty_refunded")) {
                        try {
                            qtyRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("qty_shipped")) {
                        try {
                            qtyShipped = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("quote_item_id")) {
                        try {
                            quoteItemId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("row_invoiced")) {
                        try {
                            rowInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("row_total")) {
                        try {
                            rowTotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("row_total_incl_tax")) {
                        try {
                            rowTotalInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("row_weight")) {
                        try {
                            rowWeight = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("sku")) {
                        sku = iprot.readString();
                    } else if (ifield.name.equals("store_id")) {
                        try {
                            storeId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("tax_amount")) {
                        try {
                            taxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("tax_before_discount")) {
                        try {
                            taxBeforeDiscount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("tax_canceled")) {
                        try {
                            taxCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("tax_invoiced")) {
                        try {
                            taxInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("tax_percent")) {
                        try {
                            taxPercent = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("tax_refunded")) {
                        try {
                            taxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("updated_at")) {
                        updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("weee_tax_applied_amount")) {
                        try {
                            weeeTaxAppliedAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("weee_tax_applied_row_amount")) {
                        try {
                            weeeTaxAppliedRowAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("weee_tax_disposition")) {
                        try {
                            weeeTaxDisposition = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("weee_tax_row_disposition")) {
                        try {
                            weeeTaxRowDisposition = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("weight")) {
                        try {
                            weight = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.additionalData = additionalData;
        this.amountRefunded = amountRefunded;
        this.baseAmountRefunded = baseAmountRefunded;
        this.baseCost = baseCost;
        this.baseDiscountAmount = baseDiscountAmount;
        this.baseDiscountInvoiced = baseDiscountInvoiced;
        this.baseDiscountRefunded = baseDiscountRefunded;
        this.baseHiddenTaxAmount = baseHiddenTaxAmount;
        this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
        this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
        this.baseOriginalPrice = baseOriginalPrice;
        this.basePrice = basePrice;
        this.basePriceInclTax = basePriceInclTax;
        this.baseRowInvoiced = baseRowInvoiced;
        this.baseRowTotal = baseRowTotal;
        this.baseRowTotalInclTax = baseRowTotalInclTax;
        this.baseTaxAmount = baseTaxAmount;
        this.baseTaxBeforeDiscount = baseTaxBeforeDiscount;
        this.baseTaxInvoiced = baseTaxInvoiced;
        this.baseTaxRefunded = baseTaxRefunded;
        this.baseWeeeTaxAppliedAmount = baseWeeeTaxAppliedAmount;
        this.baseWeeeTaxAppliedRowAmnt = baseWeeeTaxAppliedRowAmnt;
        this.baseWeeeTaxAppliedRowAmount = baseWeeeTaxAppliedRowAmount;
        this.baseWeeeTaxDisposition = baseWeeeTaxDisposition;
        this.baseWeeeTaxRowDisposition = baseWeeeTaxRowDisposition;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.description = description;
        this.discountAmount = discountAmount;
        this.discountInvoiced = discountInvoiced;
        this.discountPercent = discountPercent;
        this.discountRefunded = discountRefunded;
        this.freeShipping = freeShipping;
        this.giftMessageAvailable = giftMessageAvailable;
        this.giftMessageId = giftMessageId;
        this.hasChildren = hasChildren;
        this.hiddenTaxAmount = hiddenTaxAmount;
        this.hiddenTaxCanceled = hiddenTaxCanceled;
        this.hiddenTaxInvoiced = hiddenTaxInvoiced;
        this.hiddenTaxRefunded = hiddenTaxRefunded;
        this.isNominal = isNominal;
        this.isQtyDecimal = isQtyDecimal;
        this.isVirtual = isVirtual;
        this.itemId = itemId;
        this.lockedDoInvoice = lockedDoInvoice;
        this.lockedDoShip = lockedDoShip;
        this.name = com.google.common.base.Preconditions.checkNotNull(name);
        this.noDiscount = noDiscount;
        this.orderId = orderId;
        this.originalPrice = originalPrice;
        this.parentItemId = parentItemId;
        this.price = price;
        this.priceInclTax = priceInclTax;
        this.productId = productId;
        this.productType = com.google.common.base.Preconditions.checkNotNull(productType);
        this.qtyBackordered = qtyBackordered;
        this.qtyCanceled = qtyCanceled;
        this.qtyInvoiced = qtyInvoiced;
        this.qtyOrdered = qtyOrdered;
        this.qtyRefunded = qtyRefunded;
        this.qtyShipped = qtyShipped;
        this.quoteItemId = quoteItemId;
        this.rowInvoiced = rowInvoiced;
        this.rowTotal = rowTotal;
        this.rowTotalInclTax = rowTotalInclTax;
        this.rowWeight = rowWeight;
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku);
        this.storeId = storeId;
        this.taxAmount = taxAmount;
        this.taxBeforeDiscount = taxBeforeDiscount;
        this.taxCanceled = taxCanceled;
        this.taxInvoiced = taxInvoiced;
        this.taxPercent = taxPercent;
        this.taxRefunded = taxRefunded;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.weeeTaxAppliedAmount = weeeTaxAppliedAmount;
        this.weeeTaxAppliedRowAmount = weeeTaxAppliedRowAmount;
        this.weeeTaxDisposition = weeeTaxDisposition;
        this.weeeTaxRowDisposition = weeeTaxRowDisposition;
        this.weight = weight;
    }

    public MagentoOrderItem(final org.joda.time.DateTime createdAt, final String name, final com.yogento.api.models.catalog.product.magento.MagentoProductType productType, final String sku, final org.joda.time.DateTime updatedAt) {
        this.additionalData = null;
        this.amountRefunded = null;
        this.baseAmountRefunded = null;
        this.baseCost = null;
        this.baseDiscountAmount = null;
        this.baseDiscountInvoiced = null;
        this.baseDiscountRefunded = null;
        this.baseHiddenTaxAmount = null;
        this.baseHiddenTaxInvoiced = null;
        this.baseHiddenTaxRefunded = null;
        this.baseOriginalPrice = null;
        this.basePrice = null;
        this.basePriceInclTax = null;
        this.baseRowInvoiced = null;
        this.baseRowTotal = null;
        this.baseRowTotalInclTax = null;
        this.baseTaxAmount = null;
        this.baseTaxBeforeDiscount = null;
        this.baseTaxInvoiced = null;
        this.baseTaxRefunded = null;
        this.baseWeeeTaxAppliedAmount = null;
        this.baseWeeeTaxAppliedRowAmnt = null;
        this.baseWeeeTaxAppliedRowAmount = null;
        this.baseWeeeTaxDisposition = null;
        this.baseWeeeTaxRowDisposition = null;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.description = null;
        this.discountAmount = null;
        this.discountInvoiced = null;
        this.discountPercent = null;
        this.discountRefunded = null;
        this.freeShipping = null;
        this.giftMessageAvailable = null;
        this.giftMessageId = null;
        this.hasChildren = null;
        this.hiddenTaxAmount = null;
        this.hiddenTaxCanceled = null;
        this.hiddenTaxInvoiced = null;
        this.hiddenTaxRefunded = null;
        this.isNominal = null;
        this.isQtyDecimal = null;
        this.isVirtual = null;
        this.itemId = null;
        this.lockedDoInvoice = null;
        this.lockedDoShip = null;
        this.name = com.google.common.base.Preconditions.checkNotNull(name);
        this.noDiscount = null;
        this.orderId = null;
        this.originalPrice = null;
        this.parentItemId = null;
        this.price = null;
        this.priceInclTax = null;
        this.productId = null;
        this.productType = com.google.common.base.Preconditions.checkNotNull(productType);
        this.qtyBackordered = null;
        this.qtyCanceled = null;
        this.qtyInvoiced = null;
        this.qtyOrdered = null;
        this.qtyRefunded = null;
        this.qtyShipped = null;
        this.quoteItemId = null;
        this.rowInvoiced = null;
        this.rowTotal = null;
        this.rowTotalInclTax = null;
        this.rowWeight = null;
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku);
        this.storeId = null;
        this.taxAmount = null;
        this.taxBeforeDiscount = null;
        this.taxCanceled = null;
        this.taxInvoiced = null;
        this.taxPercent = null;
        this.taxRefunded = null;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.weeeTaxAppliedAmount = null;
        this.weeeTaxAppliedRowAmount = null;
        this.weeeTaxDisposition = null;
        this.weeeTaxRowDisposition = null;
        this.weight = null;
    }

    public MagentoOrderItem(final String additionalData, final java.math.BigDecimal amountRefunded, final java.math.BigDecimal baseAmountRefunded, final java.math.BigDecimal baseCost, final java.math.BigDecimal baseDiscountAmount, final java.math.BigDecimal baseDiscountInvoiced, final java.math.BigDecimal baseDiscountRefunded, final java.math.BigDecimal baseHiddenTaxAmount, final java.math.BigDecimal baseHiddenTaxInvoiced, final java.math.BigDecimal baseHiddenTaxRefunded, final java.math.BigDecimal baseOriginalPrice, final java.math.BigDecimal basePrice, final java.math.BigDecimal basePriceInclTax, final java.math.BigDecimal baseRowInvoiced, final java.math.BigDecimal baseRowTotal, final java.math.BigDecimal baseRowTotalInclTax, final java.math.BigDecimal baseTaxAmount, final java.math.BigDecimal baseTaxBeforeDiscount, final java.math.BigDecimal baseTaxInvoiced, final java.math.BigDecimal baseTaxRefunded, final java.math.BigDecimal baseWeeeTaxAppliedAmount, final java.math.BigDecimal baseWeeeTaxAppliedRowAmnt, final java.math.BigDecimal baseWeeeTaxAppliedRowAmount, final java.math.BigDecimal baseWeeeTaxDisposition, final java.math.BigDecimal baseWeeeTaxRowDisposition, final org.joda.time.DateTime createdAt, final String description, final java.math.BigDecimal discountAmount, final java.math.BigDecimal discountInvoiced, final java.math.BigDecimal discountPercent, final java.math.BigDecimal discountRefunded, final Boolean freeShipping, final String giftMessageAvailable, final Integer giftMessageId, final Boolean hasChildren, final java.math.BigDecimal hiddenTaxAmount, final java.math.BigDecimal hiddenTaxCanceled, final java.math.BigDecimal hiddenTaxInvoiced, final java.math.BigDecimal hiddenTaxRefunded, final Boolean isNominal, final Boolean isQtyDecimal, final Boolean isVirtual, final Integer itemId, final Boolean lockedDoInvoice, final Boolean lockedDoShip, final String name, final Boolean noDiscount, final Integer orderId, final java.math.BigDecimal originalPrice, final Integer parentItemId, final java.math.BigDecimal price, final java.math.BigDecimal priceInclTax, final Integer productId, final com.yogento.api.models.catalog.product.magento.MagentoProductType productType, final java.math.BigDecimal qtyBackordered, final java.math.BigDecimal qtyCanceled, final java.math.BigDecimal qtyInvoiced, final java.math.BigDecimal qtyOrdered, final java.math.BigDecimal qtyRefunded, final java.math.BigDecimal qtyShipped, final Integer quoteItemId, final java.math.BigDecimal rowInvoiced, final java.math.BigDecimal rowTotal, final java.math.BigDecimal rowTotalInclTax, final java.math.BigDecimal rowWeight, final String sku, final Integer storeId, final java.math.BigDecimal taxAmount, final java.math.BigDecimal taxBeforeDiscount, final java.math.BigDecimal taxCanceled, final java.math.BigDecimal taxInvoiced, final java.math.BigDecimal taxPercent, final java.math.BigDecimal taxRefunded, final org.joda.time.DateTime updatedAt, final java.math.BigDecimal weeeTaxAppliedAmount, final java.math.BigDecimal weeeTaxAppliedRowAmount, final java.math.BigDecimal weeeTaxDisposition, final java.math.BigDecimal weeeTaxRowDisposition, final java.math.BigDecimal weight) {
        this.additionalData = additionalData;
        this.amountRefunded = amountRefunded;
        this.baseAmountRefunded = baseAmountRefunded;
        this.baseCost = baseCost;
        this.baseDiscountAmount = baseDiscountAmount;
        this.baseDiscountInvoiced = baseDiscountInvoiced;
        this.baseDiscountRefunded = baseDiscountRefunded;
        this.baseHiddenTaxAmount = baseHiddenTaxAmount;
        this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
        this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
        this.baseOriginalPrice = baseOriginalPrice;
        this.basePrice = basePrice;
        this.basePriceInclTax = basePriceInclTax;
        this.baseRowInvoiced = baseRowInvoiced;
        this.baseRowTotal = baseRowTotal;
        this.baseRowTotalInclTax = baseRowTotalInclTax;
        this.baseTaxAmount = baseTaxAmount;
        this.baseTaxBeforeDiscount = baseTaxBeforeDiscount;
        this.baseTaxInvoiced = baseTaxInvoiced;
        this.baseTaxRefunded = baseTaxRefunded;
        this.baseWeeeTaxAppliedAmount = baseWeeeTaxAppliedAmount;
        this.baseWeeeTaxAppliedRowAmnt = baseWeeeTaxAppliedRowAmnt;
        this.baseWeeeTaxAppliedRowAmount = baseWeeeTaxAppliedRowAmount;
        this.baseWeeeTaxDisposition = baseWeeeTaxDisposition;
        this.baseWeeeTaxRowDisposition = baseWeeeTaxRowDisposition;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.description = description;
        this.discountAmount = discountAmount;
        this.discountInvoiced = discountInvoiced;
        this.discountPercent = discountPercent;
        this.discountRefunded = discountRefunded;
        this.freeShipping = freeShipping;
        this.giftMessageAvailable = giftMessageAvailable;
        this.giftMessageId = giftMessageId;
        this.hasChildren = hasChildren;
        this.hiddenTaxAmount = hiddenTaxAmount;
        this.hiddenTaxCanceled = hiddenTaxCanceled;
        this.hiddenTaxInvoiced = hiddenTaxInvoiced;
        this.hiddenTaxRefunded = hiddenTaxRefunded;
        this.isNominal = isNominal;
        this.isQtyDecimal = isQtyDecimal;
        this.isVirtual = isVirtual;
        this.itemId = itemId;
        this.lockedDoInvoice = lockedDoInvoice;
        this.lockedDoShip = lockedDoShip;
        this.name = com.google.common.base.Preconditions.checkNotNull(name);
        this.noDiscount = noDiscount;
        this.orderId = orderId;
        this.originalPrice = originalPrice;
        this.parentItemId = parentItemId;
        this.price = price;
        this.priceInclTax = priceInclTax;
        this.productId = productId;
        this.productType = com.google.common.base.Preconditions.checkNotNull(productType);
        this.qtyBackordered = qtyBackordered;
        this.qtyCanceled = qtyCanceled;
        this.qtyInvoiced = qtyInvoiced;
        this.qtyOrdered = qtyOrdered;
        this.qtyRefunded = qtyRefunded;
        this.qtyShipped = qtyShipped;
        this.quoteItemId = quoteItemId;
        this.rowInvoiced = rowInvoiced;
        this.rowTotal = rowTotal;
        this.rowTotalInclTax = rowTotalInclTax;
        this.rowWeight = rowWeight;
        this.sku = com.google.common.base.Preconditions.checkNotNull(sku);
        this.storeId = storeId;
        this.taxAmount = taxAmount;
        this.taxBeforeDiscount = taxBeforeDiscount;
        this.taxCanceled = taxCanceled;
        this.taxInvoiced = taxInvoiced;
        this.taxPercent = taxPercent;
        this.taxRefunded = taxRefunded;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.weeeTaxAppliedAmount = weeeTaxAppliedAmount;
        this.weeeTaxAppliedRowAmount = weeeTaxAppliedRowAmount;
        this.weeeTaxDisposition = weeeTaxDisposition;
        this.weeeTaxRowDisposition = weeeTaxRowDisposition;
        this.weight = weight;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MagentoOrderItem other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MagentoOrderItem, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoOrderItem)) {
            return false;
        }

        final MagentoOrderItem other = (MagentoOrderItem)otherObject;
        return
            ((getAdditionalData() == null && other.getAdditionalData() == null) ||
            (getAdditionalData() != null && other.getAdditionalData() != null &&
            getAdditionalData().equals(other.getAdditionalData()))) &&
            ((getAmountRefunded() == null && other.getAmountRefunded() == null) ||
            (getAmountRefunded() != null && other.getAmountRefunded() != null &&
            getAmountRefunded().equals(other.getAmountRefunded()))) &&
            ((getBaseAmountRefunded() == null && other.getBaseAmountRefunded() == null) ||
            (getBaseAmountRefunded() != null && other.getBaseAmountRefunded() != null &&
            getBaseAmountRefunded().equals(other.getBaseAmountRefunded()))) &&
            ((getBaseCost() == null && other.getBaseCost() == null) ||
            (getBaseCost() != null && other.getBaseCost() != null &&
            getBaseCost().equals(other.getBaseCost()))) &&
            ((getBaseDiscountAmount() == null && other.getBaseDiscountAmount() == null) ||
            (getBaseDiscountAmount() != null && other.getBaseDiscountAmount() != null &&
            getBaseDiscountAmount().equals(other.getBaseDiscountAmount()))) &&
            ((getBaseDiscountInvoiced() == null && other.getBaseDiscountInvoiced() == null) ||
            (getBaseDiscountInvoiced() != null && other.getBaseDiscountInvoiced() != null &&
            getBaseDiscountInvoiced().equals(other.getBaseDiscountInvoiced()))) &&
            ((getBaseDiscountRefunded() == null && other.getBaseDiscountRefunded() == null) ||
            (getBaseDiscountRefunded() != null && other.getBaseDiscountRefunded() != null &&
            getBaseDiscountRefunded().equals(other.getBaseDiscountRefunded()))) &&
            ((getBaseHiddenTaxAmount() == null && other.getBaseHiddenTaxAmount() == null) ||
            (getBaseHiddenTaxAmount() != null && other.getBaseHiddenTaxAmount() != null &&
            getBaseHiddenTaxAmount().equals(other.getBaseHiddenTaxAmount()))) &&
            ((getBaseHiddenTaxInvoiced() == null && other.getBaseHiddenTaxInvoiced() == null) ||
            (getBaseHiddenTaxInvoiced() != null && other.getBaseHiddenTaxInvoiced() != null &&
            getBaseHiddenTaxInvoiced().equals(other.getBaseHiddenTaxInvoiced()))) &&
            ((getBaseHiddenTaxRefunded() == null && other.getBaseHiddenTaxRefunded() == null) ||
            (getBaseHiddenTaxRefunded() != null && other.getBaseHiddenTaxRefunded() != null &&
            getBaseHiddenTaxRefunded().equals(other.getBaseHiddenTaxRefunded()))) &&
            ((getBaseOriginalPrice() == null && other.getBaseOriginalPrice() == null) ||
            (getBaseOriginalPrice() != null && other.getBaseOriginalPrice() != null &&
            getBaseOriginalPrice().equals(other.getBaseOriginalPrice()))) &&
            ((getBasePrice() == null && other.getBasePrice() == null) ||
            (getBasePrice() != null && other.getBasePrice() != null &&
            getBasePrice().equals(other.getBasePrice()))) &&
            ((getBasePriceInclTax() == null && other.getBasePriceInclTax() == null) ||
            (getBasePriceInclTax() != null && other.getBasePriceInclTax() != null &&
            getBasePriceInclTax().equals(other.getBasePriceInclTax()))) &&
            ((getBaseRowInvoiced() == null && other.getBaseRowInvoiced() == null) ||
            (getBaseRowInvoiced() != null && other.getBaseRowInvoiced() != null &&
            getBaseRowInvoiced().equals(other.getBaseRowInvoiced()))) &&
            ((getBaseRowTotal() == null && other.getBaseRowTotal() == null) ||
            (getBaseRowTotal() != null && other.getBaseRowTotal() != null &&
            getBaseRowTotal().equals(other.getBaseRowTotal()))) &&
            ((getBaseRowTotalInclTax() == null && other.getBaseRowTotalInclTax() == null) ||
            (getBaseRowTotalInclTax() != null && other.getBaseRowTotalInclTax() != null &&
            getBaseRowTotalInclTax().equals(other.getBaseRowTotalInclTax()))) &&
            ((getBaseTaxAmount() == null && other.getBaseTaxAmount() == null) ||
            (getBaseTaxAmount() != null && other.getBaseTaxAmount() != null &&
            getBaseTaxAmount().equals(other.getBaseTaxAmount()))) &&
            ((getBaseTaxBeforeDiscount() == null && other.getBaseTaxBeforeDiscount() == null) ||
            (getBaseTaxBeforeDiscount() != null && other.getBaseTaxBeforeDiscount() != null &&
            getBaseTaxBeforeDiscount().equals(other.getBaseTaxBeforeDiscount()))) &&
            ((getBaseTaxInvoiced() == null && other.getBaseTaxInvoiced() == null) ||
            (getBaseTaxInvoiced() != null && other.getBaseTaxInvoiced() != null &&
            getBaseTaxInvoiced().equals(other.getBaseTaxInvoiced()))) &&
            ((getBaseTaxRefunded() == null && other.getBaseTaxRefunded() == null) ||
            (getBaseTaxRefunded() != null && other.getBaseTaxRefunded() != null &&
            getBaseTaxRefunded().equals(other.getBaseTaxRefunded()))) &&
            ((getBaseWeeeTaxAppliedAmount() == null && other.getBaseWeeeTaxAppliedAmount() == null) ||
            (getBaseWeeeTaxAppliedAmount() != null && other.getBaseWeeeTaxAppliedAmount() != null &&
            getBaseWeeeTaxAppliedAmount().equals(other.getBaseWeeeTaxAppliedAmount()))) &&
            ((getBaseWeeeTaxAppliedRowAmnt() == null && other.getBaseWeeeTaxAppliedRowAmnt() == null) ||
            (getBaseWeeeTaxAppliedRowAmnt() != null && other.getBaseWeeeTaxAppliedRowAmnt() != null &&
            getBaseWeeeTaxAppliedRowAmnt().equals(other.getBaseWeeeTaxAppliedRowAmnt()))) &&
            ((getBaseWeeeTaxAppliedRowAmount() == null && other.getBaseWeeeTaxAppliedRowAmount() == null) ||
            (getBaseWeeeTaxAppliedRowAmount() != null && other.getBaseWeeeTaxAppliedRowAmount() != null &&
            getBaseWeeeTaxAppliedRowAmount().equals(other.getBaseWeeeTaxAppliedRowAmount()))) &&
            ((getBaseWeeeTaxDisposition() == null && other.getBaseWeeeTaxDisposition() == null) ||
            (getBaseWeeeTaxDisposition() != null && other.getBaseWeeeTaxDisposition() != null &&
            getBaseWeeeTaxDisposition().equals(other.getBaseWeeeTaxDisposition()))) &&
            ((getBaseWeeeTaxRowDisposition() == null && other.getBaseWeeeTaxRowDisposition() == null) ||
            (getBaseWeeeTaxRowDisposition() != null && other.getBaseWeeeTaxRowDisposition() != null &&
            getBaseWeeeTaxRowDisposition().equals(other.getBaseWeeeTaxRowDisposition()))) &&
            getCreatedAt().equals(other.getCreatedAt()) &&
            ((getDescription() == null && other.getDescription() == null) ||
            (getDescription() != null && other.getDescription() != null &&
            getDescription().equals(other.getDescription()))) &&
            ((getDiscountAmount() == null && other.getDiscountAmount() == null) ||
            (getDiscountAmount() != null && other.getDiscountAmount() != null &&
            getDiscountAmount().equals(other.getDiscountAmount()))) &&
            ((getDiscountInvoiced() == null && other.getDiscountInvoiced() == null) ||
            (getDiscountInvoiced() != null && other.getDiscountInvoiced() != null &&
            getDiscountInvoiced().equals(other.getDiscountInvoiced()))) &&
            ((getDiscountPercent() == null && other.getDiscountPercent() == null) ||
            (getDiscountPercent() != null && other.getDiscountPercent() != null &&
            getDiscountPercent().equals(other.getDiscountPercent()))) &&
            ((getDiscountRefunded() == null && other.getDiscountRefunded() == null) ||
            (getDiscountRefunded() != null && other.getDiscountRefunded() != null &&
            getDiscountRefunded().equals(other.getDiscountRefunded()))) &&
            ((isFreeShipping() == null && other.isFreeShipping() == null) ||
            (isFreeShipping() != null && other.isFreeShipping() != null &&
            isFreeShipping().equals(other.isFreeShipping()))) &&
            ((getGiftMessageAvailable() == null && other.getGiftMessageAvailable() == null) ||
            (getGiftMessageAvailable() != null && other.getGiftMessageAvailable() != null &&
            getGiftMessageAvailable().equals(other.getGiftMessageAvailable()))) &&
            ((getGiftMessageId() == null && other.getGiftMessageId() == null) ||
            (getGiftMessageId() != null && other.getGiftMessageId() != null &&
            getGiftMessageId().equals(other.getGiftMessageId()))) &&
            ((isHasChildren() == null && other.isHasChildren() == null) ||
            (isHasChildren() != null && other.isHasChildren() != null &&
            isHasChildren().equals(other.isHasChildren()))) &&
            ((getHiddenTaxAmount() == null && other.getHiddenTaxAmount() == null) ||
            (getHiddenTaxAmount() != null && other.getHiddenTaxAmount() != null &&
            getHiddenTaxAmount().equals(other.getHiddenTaxAmount()))) &&
            ((getHiddenTaxCanceled() == null && other.getHiddenTaxCanceled() == null) ||
            (getHiddenTaxCanceled() != null && other.getHiddenTaxCanceled() != null &&
            getHiddenTaxCanceled().equals(other.getHiddenTaxCanceled()))) &&
            ((getHiddenTaxInvoiced() == null && other.getHiddenTaxInvoiced() == null) ||
            (getHiddenTaxInvoiced() != null && other.getHiddenTaxInvoiced() != null &&
            getHiddenTaxInvoiced().equals(other.getHiddenTaxInvoiced()))) &&
            ((getHiddenTaxRefunded() == null && other.getHiddenTaxRefunded() == null) ||
            (getHiddenTaxRefunded() != null && other.getHiddenTaxRefunded() != null &&
            getHiddenTaxRefunded().equals(other.getHiddenTaxRefunded()))) &&
            ((isNominal() == null && other.isNominal() == null) ||
            (isNominal() != null && other.isNominal() != null &&
            isNominal().equals(other.isNominal()))) &&
            ((isQtyDecimal() == null && other.isQtyDecimal() == null) ||
            (isQtyDecimal() != null && other.isQtyDecimal() != null &&
            isQtyDecimal().equals(other.isQtyDecimal()))) &&
            ((isVirtual() == null && other.isVirtual() == null) ||
            (isVirtual() != null && other.isVirtual() != null &&
            isVirtual().equals(other.isVirtual()))) &&
            ((getItemId() == null && other.getItemId() == null) ||
            (getItemId() != null && other.getItemId() != null &&
            getItemId().equals(other.getItemId()))) &&
            ((isLockedDoInvoice() == null && other.isLockedDoInvoice() == null) ||
            (isLockedDoInvoice() != null && other.isLockedDoInvoice() != null &&
            isLockedDoInvoice().equals(other.isLockedDoInvoice()))) &&
            ((isLockedDoShip() == null && other.isLockedDoShip() == null) ||
            (isLockedDoShip() != null && other.isLockedDoShip() != null &&
            isLockedDoShip().equals(other.isLockedDoShip()))) &&
            getName().equals(other.getName()) &&
            ((isNoDiscount() == null && other.isNoDiscount() == null) ||
            (isNoDiscount() != null && other.isNoDiscount() != null &&
            isNoDiscount().equals(other.isNoDiscount()))) &&
            ((getOrderId() == null && other.getOrderId() == null) ||
            (getOrderId() != null && other.getOrderId() != null &&
            getOrderId().equals(other.getOrderId()))) &&
            ((getOriginalPrice() == null && other.getOriginalPrice() == null) ||
            (getOriginalPrice() != null && other.getOriginalPrice() != null &&
            getOriginalPrice().equals(other.getOriginalPrice()))) &&
            ((getParentItemId() == null && other.getParentItemId() == null) ||
            (getParentItemId() != null && other.getParentItemId() != null &&
            getParentItemId().equals(other.getParentItemId()))) &&
            ((getPrice() == null && other.getPrice() == null) ||
            (getPrice() != null && other.getPrice() != null &&
            getPrice().equals(other.getPrice()))) &&
            ((getPriceInclTax() == null && other.getPriceInclTax() == null) ||
            (getPriceInclTax() != null && other.getPriceInclTax() != null &&
            getPriceInclTax().equals(other.getPriceInclTax()))) &&
            ((getProductId() == null && other.getProductId() == null) ||
            (getProductId() != null && other.getProductId() != null &&
            getProductId().equals(other.getProductId()))) &&
            getProductType().equals(other.getProductType()) &&
            ((getQtyBackordered() == null && other.getQtyBackordered() == null) ||
            (getQtyBackordered() != null && other.getQtyBackordered() != null &&
            getQtyBackordered().equals(other.getQtyBackordered()))) &&
            ((getQtyCanceled() == null && other.getQtyCanceled() == null) ||
            (getQtyCanceled() != null && other.getQtyCanceled() != null &&
            getQtyCanceled().equals(other.getQtyCanceled()))) &&
            ((getQtyInvoiced() == null && other.getQtyInvoiced() == null) ||
            (getQtyInvoiced() != null && other.getQtyInvoiced() != null &&
            getQtyInvoiced().equals(other.getQtyInvoiced()))) &&
            ((getQtyOrdered() == null && other.getQtyOrdered() == null) ||
            (getQtyOrdered() != null && other.getQtyOrdered() != null &&
            getQtyOrdered().equals(other.getQtyOrdered()))) &&
            ((getQtyRefunded() == null && other.getQtyRefunded() == null) ||
            (getQtyRefunded() != null && other.getQtyRefunded() != null &&
            getQtyRefunded().equals(other.getQtyRefunded()))) &&
            ((getQtyShipped() == null && other.getQtyShipped() == null) ||
            (getQtyShipped() != null && other.getQtyShipped() != null &&
            getQtyShipped().equals(other.getQtyShipped()))) &&
            ((getQuoteItemId() == null && other.getQuoteItemId() == null) ||
            (getQuoteItemId() != null && other.getQuoteItemId() != null &&
            getQuoteItemId().equals(other.getQuoteItemId()))) &&
            ((getRowInvoiced() == null && other.getRowInvoiced() == null) ||
            (getRowInvoiced() != null && other.getRowInvoiced() != null &&
            getRowInvoiced().equals(other.getRowInvoiced()))) &&
            ((getRowTotal() == null && other.getRowTotal() == null) ||
            (getRowTotal() != null && other.getRowTotal() != null &&
            getRowTotal().equals(other.getRowTotal()))) &&
            ((getRowTotalInclTax() == null && other.getRowTotalInclTax() == null) ||
            (getRowTotalInclTax() != null && other.getRowTotalInclTax() != null &&
            getRowTotalInclTax().equals(other.getRowTotalInclTax()))) &&
            ((getRowWeight() == null && other.getRowWeight() == null) ||
            (getRowWeight() != null && other.getRowWeight() != null &&
            getRowWeight().equals(other.getRowWeight()))) &&
            getSku().equals(other.getSku()) &&
            ((getStoreId() == null && other.getStoreId() == null) ||
            (getStoreId() != null && other.getStoreId() != null &&
            getStoreId().equals(other.getStoreId()))) &&
            ((getTaxAmount() == null && other.getTaxAmount() == null) ||
            (getTaxAmount() != null && other.getTaxAmount() != null &&
            getTaxAmount().equals(other.getTaxAmount()))) &&
            ((getTaxBeforeDiscount() == null && other.getTaxBeforeDiscount() == null) ||
            (getTaxBeforeDiscount() != null && other.getTaxBeforeDiscount() != null &&
            getTaxBeforeDiscount().equals(other.getTaxBeforeDiscount()))) &&
            ((getTaxCanceled() == null && other.getTaxCanceled() == null) ||
            (getTaxCanceled() != null && other.getTaxCanceled() != null &&
            getTaxCanceled().equals(other.getTaxCanceled()))) &&
            ((getTaxInvoiced() == null && other.getTaxInvoiced() == null) ||
            (getTaxInvoiced() != null && other.getTaxInvoiced() != null &&
            getTaxInvoiced().equals(other.getTaxInvoiced()))) &&
            ((getTaxPercent() == null && other.getTaxPercent() == null) ||
            (getTaxPercent() != null && other.getTaxPercent() != null &&
            getTaxPercent().equals(other.getTaxPercent()))) &&
            ((getTaxRefunded() == null && other.getTaxRefunded() == null) ||
            (getTaxRefunded() != null && other.getTaxRefunded() != null &&
            getTaxRefunded().equals(other.getTaxRefunded()))) &&
            getUpdatedAt().equals(other.getUpdatedAt()) &&
            ((getWeeeTaxAppliedAmount() == null && other.getWeeeTaxAppliedAmount() == null) ||
            (getWeeeTaxAppliedAmount() != null && other.getWeeeTaxAppliedAmount() != null &&
            getWeeeTaxAppliedAmount().equals(other.getWeeeTaxAppliedAmount()))) &&
            ((getWeeeTaxAppliedRowAmount() == null && other.getWeeeTaxAppliedRowAmount() == null) ||
            (getWeeeTaxAppliedRowAmount() != null && other.getWeeeTaxAppliedRowAmount() != null &&
            getWeeeTaxAppliedRowAmount().equals(other.getWeeeTaxAppliedRowAmount()))) &&
            ((getWeeeTaxDisposition() == null && other.getWeeeTaxDisposition() == null) ||
            (getWeeeTaxDisposition() != null && other.getWeeeTaxDisposition() != null &&
            getWeeeTaxDisposition().equals(other.getWeeeTaxDisposition()))) &&
            ((getWeeeTaxRowDisposition() == null && other.getWeeeTaxRowDisposition() == null) ||
            (getWeeeTaxRowDisposition() != null && other.getWeeeTaxRowDisposition() != null &&
            getWeeeTaxRowDisposition().equals(other.getWeeeTaxRowDisposition()))) &&
            ((getWeight() == null && other.getWeight() == null) ||
            (getWeight() != null && other.getWeight() != null &&
            getWeight().equals(other.getWeight())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("additional_data")) {
            return getAdditionalData();
        } else if (fieldName.equals("amount_refunded")) {
            return getAmountRefunded();
        } else if (fieldName.equals("base_amount_refunded")) {
            return getBaseAmountRefunded();
        } else if (fieldName.equals("base_cost")) {
            return getBaseCost();
        } else if (fieldName.equals("base_discount_amount")) {
            return getBaseDiscountAmount();
        } else if (fieldName.equals("base_discount_invoiced")) {
            return getBaseDiscountInvoiced();
        } else if (fieldName.equals("base_discount_refunded")) {
            return getBaseDiscountRefunded();
        } else if (fieldName.equals("base_hidden_tax_amount")) {
            return getBaseHiddenTaxAmount();
        } else if (fieldName.equals("base_hidden_tax_invoiced")) {
            return getBaseHiddenTaxInvoiced();
        } else if (fieldName.equals("base_hidden_tax_refunded")) {
            return getBaseHiddenTaxRefunded();
        } else if (fieldName.equals("base_original_price")) {
            return getBaseOriginalPrice();
        } else if (fieldName.equals("base_price")) {
            return getBasePrice();
        } else if (fieldName.equals("base_price_incl_tax")) {
            return getBasePriceInclTax();
        } else if (fieldName.equals("base_row_invoiced")) {
            return getBaseRowInvoiced();
        } else if (fieldName.equals("base_row_total")) {
            return getBaseRowTotal();
        } else if (fieldName.equals("base_row_total_incl_tax")) {
            return getBaseRowTotalInclTax();
        } else if (fieldName.equals("base_tax_amount")) {
            return getBaseTaxAmount();
        } else if (fieldName.equals("base_tax_before_discount")) {
            return getBaseTaxBeforeDiscount();
        } else if (fieldName.equals("base_tax_invoiced")) {
            return getBaseTaxInvoiced();
        } else if (fieldName.equals("base_tax_refunded")) {
            return getBaseTaxRefunded();
        } else if (fieldName.equals("base_weee_tax_applied_amount")) {
            return getBaseWeeeTaxAppliedAmount();
        } else if (fieldName.equals("base_weee_tax_applied_row_amnt")) {
            return getBaseWeeeTaxAppliedRowAmnt();
        } else if (fieldName.equals("base_weee_tax_applied_row_amount")) {
            return getBaseWeeeTaxAppliedRowAmount();
        } else if (fieldName.equals("base_weee_tax_disposition")) {
            return getBaseWeeeTaxDisposition();
        } else if (fieldName.equals("base_weee_tax_row_disposition")) {
            return getBaseWeeeTaxRowDisposition();
        } else if (fieldName.equals("created_at")) {
            return getCreatedAt();
        } else if (fieldName.equals("description")) {
            return getDescription();
        } else if (fieldName.equals("discount_amount")) {
            return getDiscountAmount();
        } else if (fieldName.equals("discount_invoiced")) {
            return getDiscountInvoiced();
        } else if (fieldName.equals("discount_percent")) {
            return getDiscountPercent();
        } else if (fieldName.equals("discount_refunded")) {
            return getDiscountRefunded();
        } else if (fieldName.equals("free_shipping")) {
            return isFreeShipping();
        } else if (fieldName.equals("gift_message_available")) {
            return getGiftMessageAvailable();
        } else if (fieldName.equals("gift_message_id")) {
            return getGiftMessageId();
        } else if (fieldName.equals("has_children")) {
            return isHasChildren();
        } else if (fieldName.equals("hidden_tax_amount")) {
            return getHiddenTaxAmount();
        } else if (fieldName.equals("hidden_tax_canceled")) {
            return getHiddenTaxCanceled();
        } else if (fieldName.equals("hidden_tax_invoiced")) {
            return getHiddenTaxInvoiced();
        } else if (fieldName.equals("hidden_tax_refunded")) {
            return getHiddenTaxRefunded();
        } else if (fieldName.equals("is_nominal")) {
            return isNominal();
        } else if (fieldName.equals("is_qty_decimal")) {
            return isQtyDecimal();
        } else if (fieldName.equals("is_virtual")) {
            return isVirtual();
        } else if (fieldName.equals("item_id")) {
            return getItemId();
        } else if (fieldName.equals("locked_do_invoice")) {
            return isLockedDoInvoice();
        } else if (fieldName.equals("locked_do_ship")) {
            return isLockedDoShip();
        } else if (fieldName.equals("name")) {
            return getName();
        } else if (fieldName.equals("no_discount")) {
            return isNoDiscount();
        } else if (fieldName.equals("order_id")) {
            return getOrderId();
        } else if (fieldName.equals("original_price")) {
            return getOriginalPrice();
        } else if (fieldName.equals("parent_item_id")) {
            return getParentItemId();
        } else if (fieldName.equals("price")) {
            return getPrice();
        } else if (fieldName.equals("price_incl_tax")) {
            return getPriceInclTax();
        } else if (fieldName.equals("product_id")) {
            return getProductId();
        } else if (fieldName.equals("product_type")) {
            return getProductType();
        } else if (fieldName.equals("qty_backordered")) {
            return getQtyBackordered();
        } else if (fieldName.equals("qty_canceled")) {
            return getQtyCanceled();
        } else if (fieldName.equals("qty_invoiced")) {
            return getQtyInvoiced();
        } else if (fieldName.equals("qty_ordered")) {
            return getQtyOrdered();
        } else if (fieldName.equals("qty_refunded")) {
            return getQtyRefunded();
        } else if (fieldName.equals("qty_shipped")) {
            return getQtyShipped();
        } else if (fieldName.equals("quote_item_id")) {
            return getQuoteItemId();
        } else if (fieldName.equals("row_invoiced")) {
            return getRowInvoiced();
        } else if (fieldName.equals("row_total")) {
            return getRowTotal();
        } else if (fieldName.equals("row_total_incl_tax")) {
            return getRowTotalInclTax();
        } else if (fieldName.equals("row_weight")) {
            return getRowWeight();
        } else if (fieldName.equals("sku")) {
            return getSku();
        } else if (fieldName.equals("store_id")) {
            return getStoreId();
        } else if (fieldName.equals("tax_amount")) {
            return getTaxAmount();
        } else if (fieldName.equals("tax_before_discount")) {
            return getTaxBeforeDiscount();
        } else if (fieldName.equals("tax_canceled")) {
            return getTaxCanceled();
        } else if (fieldName.equals("tax_invoiced")) {
            return getTaxInvoiced();
        } else if (fieldName.equals("tax_percent")) {
            return getTaxPercent();
        } else if (fieldName.equals("tax_refunded")) {
            return getTaxRefunded();
        } else if (fieldName.equals("updated_at")) {
            return getUpdatedAt();
        } else if (fieldName.equals("weee_tax_applied_amount")) {
            return getWeeeTaxAppliedAmount();
        } else if (fieldName.equals("weee_tax_applied_row_amount")) {
            return getWeeeTaxAppliedRowAmount();
        } else if (fieldName.equals("weee_tax_disposition")) {
            return getWeeeTaxDisposition();
        } else if (fieldName.equals("weee_tax_row_disposition")) {
            return getWeeeTaxRowDisposition();
        } else if (fieldName.equals("weight")) {
            return getWeight();
        }
        return null;
    }

    public final String getAdditionalData() {
        return additionalData;
    }

    public final java.math.BigDecimal getAmountRefunded() {
        return amountRefunded;
    }

    public final java.math.BigDecimal getBaseAmountRefunded() {
        return baseAmountRefunded;
    }

    public final java.math.BigDecimal getBaseCost() {
        return baseCost;
    }

    public final java.math.BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public final java.math.BigDecimal getBaseDiscountInvoiced() {
        return baseDiscountInvoiced;
    }

    public final java.math.BigDecimal getBaseDiscountRefunded() {
        return baseDiscountRefunded;
    }

    public final java.math.BigDecimal getBaseHiddenTaxAmount() {
        return baseHiddenTaxAmount;
    }

    public final java.math.BigDecimal getBaseHiddenTaxInvoiced() {
        return baseHiddenTaxInvoiced;
    }

    public final java.math.BigDecimal getBaseHiddenTaxRefunded() {
        return baseHiddenTaxRefunded;
    }

    public final java.math.BigDecimal getBaseOriginalPrice() {
        return baseOriginalPrice;
    }

    public final java.math.BigDecimal getBasePrice() {
        return basePrice;
    }

    public final java.math.BigDecimal getBasePriceInclTax() {
        return basePriceInclTax;
    }

    public final java.math.BigDecimal getBaseRowInvoiced() {
        return baseRowInvoiced;
    }

    public final java.math.BigDecimal getBaseRowTotal() {
        return baseRowTotal;
    }

    public final java.math.BigDecimal getBaseRowTotalInclTax() {
        return baseRowTotalInclTax;
    }

    public final java.math.BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public final java.math.BigDecimal getBaseTaxBeforeDiscount() {
        return baseTaxBeforeDiscount;
    }

    public final java.math.BigDecimal getBaseTaxInvoiced() {
        return baseTaxInvoiced;
    }

    public final java.math.BigDecimal getBaseTaxRefunded() {
        return baseTaxRefunded;
    }

    public final java.math.BigDecimal getBaseWeeeTaxAppliedAmount() {
        return baseWeeeTaxAppliedAmount;
    }

    public final java.math.BigDecimal getBaseWeeeTaxAppliedRowAmnt() {
        return baseWeeeTaxAppliedRowAmnt;
    }

    public final java.math.BigDecimal getBaseWeeeTaxAppliedRowAmount() {
        return baseWeeeTaxAppliedRowAmount;
    }

    public final java.math.BigDecimal getBaseWeeeTaxDisposition() {
        return baseWeeeTaxDisposition;
    }

    public final java.math.BigDecimal getBaseWeeeTaxRowDisposition() {
        return baseWeeeTaxRowDisposition;
    }

    public final org.joda.time.DateTime getCreatedAt() {
        return createdAt;
    }

    public final String getDescription() {
        return description;
    }

    public final java.math.BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public final java.math.BigDecimal getDiscountInvoiced() {
        return discountInvoiced;
    }

    public final java.math.BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public final java.math.BigDecimal getDiscountRefunded() {
        return discountRefunded;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final String getGiftMessageAvailable() {
        return giftMessageAvailable;
    }

    public final Integer getGiftMessageId() {
        return giftMessageId;
    }

    public final java.math.BigDecimal getHiddenTaxAmount() {
        return hiddenTaxAmount;
    }

    public final java.math.BigDecimal getHiddenTaxCanceled() {
        return hiddenTaxCanceled;
    }

    public final java.math.BigDecimal getHiddenTaxInvoiced() {
        return hiddenTaxInvoiced;
    }

    public final java.math.BigDecimal getHiddenTaxRefunded() {
        return hiddenTaxRefunded;
    }

    public final Integer getItemId() {
        return itemId;
    }

    public final String getName() {
        return name;
    }

    public final Integer getOrderId() {
        return orderId;
    }

    public final java.math.BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public final Integer getParentItemId() {
        return parentItemId;
    }

    public final java.math.BigDecimal getPrice() {
        return price;
    }

    public final java.math.BigDecimal getPriceInclTax() {
        return priceInclTax;
    }

    public final Integer getProductId() {
        return productId;
    }

    public final com.yogento.api.models.catalog.product.magento.MagentoProductType getProductType() {
        return productType;
    }

    public final java.math.BigDecimal getQtyBackordered() {
        return qtyBackordered;
    }

    public final java.math.BigDecimal getQtyCanceled() {
        return qtyCanceled;
    }

    public final java.math.BigDecimal getQtyInvoiced() {
        return qtyInvoiced;
    }

    public final java.math.BigDecimal getQtyOrdered() {
        return qtyOrdered;
    }

    public final java.math.BigDecimal getQtyRefunded() {
        return qtyRefunded;
    }

    public final java.math.BigDecimal getQtyShipped() {
        return qtyShipped;
    }

    public final Integer getQuoteItemId() {
        return quoteItemId;
    }

    public final java.math.BigDecimal getRowInvoiced() {
        return rowInvoiced;
    }

    public final java.math.BigDecimal getRowTotal() {
        return rowTotal;
    }

    public final java.math.BigDecimal getRowTotalInclTax() {
        return rowTotalInclTax;
    }

    public final java.math.BigDecimal getRowWeight() {
        return rowWeight;
    }

    public final String getSku() {
        return sku;
    }

    public final Integer getStoreId() {
        return storeId;
    }

    public final java.math.BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public final java.math.BigDecimal getTaxBeforeDiscount() {
        return taxBeforeDiscount;
    }

    public final java.math.BigDecimal getTaxCanceled() {
        return taxCanceled;
    }

    public final java.math.BigDecimal getTaxInvoiced() {
        return taxInvoiced;
    }

    public final java.math.BigDecimal getTaxPercent() {
        return taxPercent;
    }

    public final java.math.BigDecimal getTaxRefunded() {
        return taxRefunded;
    }

    public final org.joda.time.DateTime getUpdatedAt() {
        return updatedAt;
    }

    public final java.math.BigDecimal getWeeeTaxAppliedAmount() {
        return weeeTaxAppliedAmount;
    }

    public final java.math.BigDecimal getWeeeTaxAppliedRowAmount() {
        return weeeTaxAppliedRowAmount;
    }

    public final java.math.BigDecimal getWeeeTaxDisposition() {
        return weeeTaxDisposition;
    }

    public final java.math.BigDecimal getWeeeTaxRowDisposition() {
        return weeeTaxRowDisposition;
    }

    public final java.math.BigDecimal getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAdditionalData() != null) {
            hashCode = 31 * hashCode + getAdditionalData().hashCode();
        }
        if (getAmountRefunded() != null) {
            hashCode = 31 * hashCode + getAmountRefunded().hashCode();
        }
        if (getBaseAmountRefunded() != null) {
            hashCode = 31 * hashCode + getBaseAmountRefunded().hashCode();
        }
        if (getBaseCost() != null) {
            hashCode = 31 * hashCode + getBaseCost().hashCode();
        }
        if (getBaseDiscountAmount() != null) {
            hashCode = 31 * hashCode + getBaseDiscountAmount().hashCode();
        }
        if (getBaseDiscountInvoiced() != null) {
            hashCode = 31 * hashCode + getBaseDiscountInvoiced().hashCode();
        }
        if (getBaseDiscountRefunded() != null) {
            hashCode = 31 * hashCode + getBaseDiscountRefunded().hashCode();
        }
        if (getBaseHiddenTaxAmount() != null) {
            hashCode = 31 * hashCode + getBaseHiddenTaxAmount().hashCode();
        }
        if (getBaseHiddenTaxInvoiced() != null) {
            hashCode = 31 * hashCode + getBaseHiddenTaxInvoiced().hashCode();
        }
        if (getBaseHiddenTaxRefunded() != null) {
            hashCode = 31 * hashCode + getBaseHiddenTaxRefunded().hashCode();
        }
        if (getBaseOriginalPrice() != null) {
            hashCode = 31 * hashCode + getBaseOriginalPrice().hashCode();
        }
        if (getBasePrice() != null) {
            hashCode = 31 * hashCode + getBasePrice().hashCode();
        }
        if (getBasePriceInclTax() != null) {
            hashCode = 31 * hashCode + getBasePriceInclTax().hashCode();
        }
        if (getBaseRowInvoiced() != null) {
            hashCode = 31 * hashCode + getBaseRowInvoiced().hashCode();
        }
        if (getBaseRowTotal() != null) {
            hashCode = 31 * hashCode + getBaseRowTotal().hashCode();
        }
        if (getBaseRowTotalInclTax() != null) {
            hashCode = 31 * hashCode + getBaseRowTotalInclTax().hashCode();
        }
        if (getBaseTaxAmount() != null) {
            hashCode = 31 * hashCode + getBaseTaxAmount().hashCode();
        }
        if (getBaseTaxBeforeDiscount() != null) {
            hashCode = 31 * hashCode + getBaseTaxBeforeDiscount().hashCode();
        }
        if (getBaseTaxInvoiced() != null) {
            hashCode = 31 * hashCode + getBaseTaxInvoiced().hashCode();
        }
        if (getBaseTaxRefunded() != null) {
            hashCode = 31 * hashCode + getBaseTaxRefunded().hashCode();
        }
        if (getBaseWeeeTaxAppliedAmount() != null) {
            hashCode = 31 * hashCode + getBaseWeeeTaxAppliedAmount().hashCode();
        }
        if (getBaseWeeeTaxAppliedRowAmnt() != null) {
            hashCode = 31 * hashCode + getBaseWeeeTaxAppliedRowAmnt().hashCode();
        }
        if (getBaseWeeeTaxAppliedRowAmount() != null) {
            hashCode = 31 * hashCode + getBaseWeeeTaxAppliedRowAmount().hashCode();
        }
        if (getBaseWeeeTaxDisposition() != null) {
            hashCode = 31 * hashCode + getBaseWeeeTaxDisposition().hashCode();
        }
        if (getBaseWeeeTaxRowDisposition() != null) {
            hashCode = 31 * hashCode + getBaseWeeeTaxRowDisposition().hashCode();
        }
        hashCode = 31 * hashCode + getCreatedAt().hashCode();
        if (getDescription() != null) {
            hashCode = 31 * hashCode + getDescription().hashCode();
        }
        if (getDiscountAmount() != null) {
            hashCode = 31 * hashCode + getDiscountAmount().hashCode();
        }
        if (getDiscountInvoiced() != null) {
            hashCode = 31 * hashCode + getDiscountInvoiced().hashCode();
        }
        if (getDiscountPercent() != null) {
            hashCode = 31 * hashCode + getDiscountPercent().hashCode();
        }
        if (getDiscountRefunded() != null) {
            hashCode = 31 * hashCode + getDiscountRefunded().hashCode();
        }
        if (isFreeShipping() != null) {
            hashCode = 31 * hashCode + (isFreeShipping() ? 1 : 0);
        }
        if (getGiftMessageAvailable() != null) {
            hashCode = 31 * hashCode + getGiftMessageAvailable().hashCode();
        }
        if (getGiftMessageId() != null) {
            hashCode = 31 * hashCode + ((int)getGiftMessageId());
        }
        if (isHasChildren() != null) {
            hashCode = 31 * hashCode + (isHasChildren() ? 1 : 0);
        }
        if (getHiddenTaxAmount() != null) {
            hashCode = 31 * hashCode + getHiddenTaxAmount().hashCode();
        }
        if (getHiddenTaxCanceled() != null) {
            hashCode = 31 * hashCode + getHiddenTaxCanceled().hashCode();
        }
        if (getHiddenTaxInvoiced() != null) {
            hashCode = 31 * hashCode + getHiddenTaxInvoiced().hashCode();
        }
        if (getHiddenTaxRefunded() != null) {
            hashCode = 31 * hashCode + getHiddenTaxRefunded().hashCode();
        }
        if (isNominal() != null) {
            hashCode = 31 * hashCode + (isNominal() ? 1 : 0);
        }
        if (isQtyDecimal() != null) {
            hashCode = 31 * hashCode + (isQtyDecimal() ? 1 : 0);
        }
        if (isVirtual() != null) {
            hashCode = 31 * hashCode + (isVirtual() ? 1 : 0);
        }
        if (getItemId() != null) {
            hashCode = 31 * hashCode + ((int)getItemId());
        }
        if (isLockedDoInvoice() != null) {
            hashCode = 31 * hashCode + (isLockedDoInvoice() ? 1 : 0);
        }
        if (isLockedDoShip() != null) {
            hashCode = 31 * hashCode + (isLockedDoShip() ? 1 : 0);
        }
        hashCode = 31 * hashCode + getName().hashCode();
        if (isNoDiscount() != null) {
            hashCode = 31 * hashCode + (isNoDiscount() ? 1 : 0);
        }
        if (getOrderId() != null) {
            hashCode = 31 * hashCode + ((int)getOrderId());
        }
        if (getOriginalPrice() != null) {
            hashCode = 31 * hashCode + getOriginalPrice().hashCode();
        }
        if (getParentItemId() != null) {
            hashCode = 31 * hashCode + ((int)getParentItemId());
        }
        if (getPrice() != null) {
            hashCode = 31 * hashCode + getPrice().hashCode();
        }
        if (getPriceInclTax() != null) {
            hashCode = 31 * hashCode + getPriceInclTax().hashCode();
        }
        if (getProductId() != null) {
            hashCode = 31 * hashCode + ((int)getProductId());
        }
        hashCode = 31 * hashCode + getProductType().ordinal();
        if (getQtyBackordered() != null) {
            hashCode = 31 * hashCode + getQtyBackordered().hashCode();
        }
        if (getQtyCanceled() != null) {
            hashCode = 31 * hashCode + getQtyCanceled().hashCode();
        }
        if (getQtyInvoiced() != null) {
            hashCode = 31 * hashCode + getQtyInvoiced().hashCode();
        }
        if (getQtyOrdered() != null) {
            hashCode = 31 * hashCode + getQtyOrdered().hashCode();
        }
        if (getQtyRefunded() != null) {
            hashCode = 31 * hashCode + getQtyRefunded().hashCode();
        }
        if (getQtyShipped() != null) {
            hashCode = 31 * hashCode + getQtyShipped().hashCode();
        }
        if (getQuoteItemId() != null) {
            hashCode = 31 * hashCode + ((int)getQuoteItemId());
        }
        if (getRowInvoiced() != null) {
            hashCode = 31 * hashCode + getRowInvoiced().hashCode();
        }
        if (getRowTotal() != null) {
            hashCode = 31 * hashCode + getRowTotal().hashCode();
        }
        if (getRowTotalInclTax() != null) {
            hashCode = 31 * hashCode + getRowTotalInclTax().hashCode();
        }
        if (getRowWeight() != null) {
            hashCode = 31 * hashCode + getRowWeight().hashCode();
        }
        hashCode = 31 * hashCode + getSku().hashCode();
        if (getStoreId() != null) {
            hashCode = 31 * hashCode + ((int)getStoreId());
        }
        if (getTaxAmount() != null) {
            hashCode = 31 * hashCode + getTaxAmount().hashCode();
        }
        if (getTaxBeforeDiscount() != null) {
            hashCode = 31 * hashCode + getTaxBeforeDiscount().hashCode();
        }
        if (getTaxCanceled() != null) {
            hashCode = 31 * hashCode + getTaxCanceled().hashCode();
        }
        if (getTaxInvoiced() != null) {
            hashCode = 31 * hashCode + getTaxInvoiced().hashCode();
        }
        if (getTaxPercent() != null) {
            hashCode = 31 * hashCode + getTaxPercent().hashCode();
        }
        if (getTaxRefunded() != null) {
            hashCode = 31 * hashCode + getTaxRefunded().hashCode();
        }
        hashCode = 31 * hashCode + getUpdatedAt().hashCode();
        if (getWeeeTaxAppliedAmount() != null) {
            hashCode = 31 * hashCode + getWeeeTaxAppliedAmount().hashCode();
        }
        if (getWeeeTaxAppliedRowAmount() != null) {
            hashCode = 31 * hashCode + getWeeeTaxAppliedRowAmount().hashCode();
        }
        if (getWeeeTaxDisposition() != null) {
            hashCode = 31 * hashCode + getWeeeTaxDisposition().hashCode();
        }
        if (getWeeeTaxRowDisposition() != null) {
            hashCode = 31 * hashCode + getWeeeTaxRowDisposition().hashCode();
        }
        if (getWeight() != null) {
            hashCode = 31 * hashCode + getWeight().hashCode();
        }
        return hashCode;
    }

    public final Boolean isFreeShipping() {
        return freeShipping;
    }

    public final Boolean isHasChildren() {
        return hasChildren;
    }

    public final Boolean isLockedDoInvoice() {
        return lockedDoInvoice;
    }

    public final Boolean isLockedDoShip() {
        return lockedDoShip;
    }

    public final Boolean isNoDiscount() {
        return noDiscount;
    }

    public final Boolean isNominal() {
        return isNominal;
    }

    public final Boolean isQtyDecimal() {
        return isQtyDecimal;
    }

    @Override
    public boolean isSet(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final Boolean isVirtual() {
        return isVirtual;
    }

    @Override
    public void read(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFieldValue(final org.apache.thrift.TFieldIdEnum field, Object value) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final com.google.common.base.Objects.ToStringHelper helper = com.google.common.base.Objects.toStringHelper(this);
        if (getAdditionalData() != null) {
            helper.add("additional_data", getAdditionalData());
        }
        if (getAmountRefunded() != null) {
            helper.add("amount_refunded", getAmountRefunded());
        }
        if (getBaseAmountRefunded() != null) {
            helper.add("base_amount_refunded", getBaseAmountRefunded());
        }
        if (getBaseCost() != null) {
            helper.add("base_cost", getBaseCost());
        }
        if (getBaseDiscountAmount() != null) {
            helper.add("base_discount_amount", getBaseDiscountAmount());
        }
        if (getBaseDiscountInvoiced() != null) {
            helper.add("base_discount_invoiced", getBaseDiscountInvoiced());
        }
        if (getBaseDiscountRefunded() != null) {
            helper.add("base_discount_refunded", getBaseDiscountRefunded());
        }
        if (getBaseHiddenTaxAmount() != null) {
            helper.add("base_hidden_tax_amount", getBaseHiddenTaxAmount());
        }
        if (getBaseHiddenTaxInvoiced() != null) {
            helper.add("base_hidden_tax_invoiced", getBaseHiddenTaxInvoiced());
        }
        if (getBaseHiddenTaxRefunded() != null) {
            helper.add("base_hidden_tax_refunded", getBaseHiddenTaxRefunded());
        }
        if (getBaseOriginalPrice() != null) {
            helper.add("base_original_price", getBaseOriginalPrice());
        }
        if (getBasePrice() != null) {
            helper.add("base_price", getBasePrice());
        }
        if (getBasePriceInclTax() != null) {
            helper.add("base_price_incl_tax", getBasePriceInclTax());
        }
        if (getBaseRowInvoiced() != null) {
            helper.add("base_row_invoiced", getBaseRowInvoiced());
        }
        if (getBaseRowTotal() != null) {
            helper.add("base_row_total", getBaseRowTotal());
        }
        if (getBaseRowTotalInclTax() != null) {
            helper.add("base_row_total_incl_tax", getBaseRowTotalInclTax());
        }
        if (getBaseTaxAmount() != null) {
            helper.add("base_tax_amount", getBaseTaxAmount());
        }
        if (getBaseTaxBeforeDiscount() != null) {
            helper.add("base_tax_before_discount", getBaseTaxBeforeDiscount());
        }
        if (getBaseTaxInvoiced() != null) {
            helper.add("base_tax_invoiced", getBaseTaxInvoiced());
        }
        if (getBaseTaxRefunded() != null) {
            helper.add("base_tax_refunded", getBaseTaxRefunded());
        }
        if (getBaseWeeeTaxAppliedAmount() != null) {
            helper.add("base_weee_tax_applied_amount", getBaseWeeeTaxAppliedAmount());
        }
        if (getBaseWeeeTaxAppliedRowAmnt() != null) {
            helper.add("base_weee_tax_applied_row_amnt", getBaseWeeeTaxAppliedRowAmnt());
        }
        if (getBaseWeeeTaxAppliedRowAmount() != null) {
            helper.add("base_weee_tax_applied_row_amount", getBaseWeeeTaxAppliedRowAmount());
        }
        if (getBaseWeeeTaxDisposition() != null) {
            helper.add("base_weee_tax_disposition", getBaseWeeeTaxDisposition());
        }
        if (getBaseWeeeTaxRowDisposition() != null) {
            helper.add("base_weee_tax_row_disposition", getBaseWeeeTaxRowDisposition());
        }
        helper.add("created_at", getCreatedAt());
        if (getDescription() != null) {
            helper.add("description", getDescription());
        }
        if (getDiscountAmount() != null) {
            helper.add("discount_amount", getDiscountAmount());
        }
        if (getDiscountInvoiced() != null) {
            helper.add("discount_invoiced", getDiscountInvoiced());
        }
        if (getDiscountPercent() != null) {
            helper.add("discount_percent", getDiscountPercent());
        }
        if (getDiscountRefunded() != null) {
            helper.add("discount_refunded", getDiscountRefunded());
        }
        if (isFreeShipping() != null) {
            helper.add("free_shipping", isFreeShipping());
        }
        if (getGiftMessageAvailable() != null) {
            helper.add("gift_message_available", getGiftMessageAvailable());
        }
        if (getGiftMessageId() != null) {
            helper.add("gift_message_id", getGiftMessageId());
        }
        if (isHasChildren() != null) {
            helper.add("has_children", isHasChildren());
        }
        if (getHiddenTaxAmount() != null) {
            helper.add("hidden_tax_amount", getHiddenTaxAmount());
        }
        if (getHiddenTaxCanceled() != null) {
            helper.add("hidden_tax_canceled", getHiddenTaxCanceled());
        }
        if (getHiddenTaxInvoiced() != null) {
            helper.add("hidden_tax_invoiced", getHiddenTaxInvoiced());
        }
        if (getHiddenTaxRefunded() != null) {
            helper.add("hidden_tax_refunded", getHiddenTaxRefunded());
        }
        if (isNominal() != null) {
            helper.add("is_nominal", isNominal());
        }
        if (isQtyDecimal() != null) {
            helper.add("is_qty_decimal", isQtyDecimal());
        }
        if (isVirtual() != null) {
            helper.add("is_virtual", isVirtual());
        }
        if (getItemId() != null) {
            helper.add("item_id", getItemId());
        }
        if (isLockedDoInvoice() != null) {
            helper.add("locked_do_invoice", isLockedDoInvoice());
        }
        if (isLockedDoShip() != null) {
            helper.add("locked_do_ship", isLockedDoShip());
        }
        helper.add("name", getName());
        if (isNoDiscount() != null) {
            helper.add("no_discount", isNoDiscount());
        }
        if (getOrderId() != null) {
            helper.add("order_id", getOrderId());
        }
        if (getOriginalPrice() != null) {
            helper.add("original_price", getOriginalPrice());
        }
        if (getParentItemId() != null) {
            helper.add("parent_item_id", getParentItemId());
        }
        if (getPrice() != null) {
            helper.add("price", getPrice());
        }
        if (getPriceInclTax() != null) {
            helper.add("price_incl_tax", getPriceInclTax());
        }
        if (getProductId() != null) {
            helper.add("product_id", getProductId());
        }
        helper.add("product_type", getProductType());
        if (getQtyBackordered() != null) {
            helper.add("qty_backordered", getQtyBackordered());
        }
        if (getQtyCanceled() != null) {
            helper.add("qty_canceled", getQtyCanceled());
        }
        if (getQtyInvoiced() != null) {
            helper.add("qty_invoiced", getQtyInvoiced());
        }
        if (getQtyOrdered() != null) {
            helper.add("qty_ordered", getQtyOrdered());
        }
        if (getQtyRefunded() != null) {
            helper.add("qty_refunded", getQtyRefunded());
        }
        if (getQtyShipped() != null) {
            helper.add("qty_shipped", getQtyShipped());
        }
        if (getQuoteItemId() != null) {
            helper.add("quote_item_id", getQuoteItemId());
        }
        if (getRowInvoiced() != null) {
            helper.add("row_invoiced", getRowInvoiced());
        }
        if (getRowTotal() != null) {
            helper.add("row_total", getRowTotal());
        }
        if (getRowTotalInclTax() != null) {
            helper.add("row_total_incl_tax", getRowTotalInclTax());
        }
        if (getRowWeight() != null) {
            helper.add("row_weight", getRowWeight());
        }
        helper.add("sku", getSku());
        if (getStoreId() != null) {
            helper.add("store_id", getStoreId());
        }
        if (getTaxAmount() != null) {
            helper.add("tax_amount", getTaxAmount());
        }
        if (getTaxBeforeDiscount() != null) {
            helper.add("tax_before_discount", getTaxBeforeDiscount());
        }
        if (getTaxCanceled() != null) {
            helper.add("tax_canceled", getTaxCanceled());
        }
        if (getTaxInvoiced() != null) {
            helper.add("tax_invoiced", getTaxInvoiced());
        }
        if (getTaxPercent() != null) {
            helper.add("tax_percent", getTaxPercent());
        }
        if (getTaxRefunded() != null) {
            helper.add("tax_refunded", getTaxRefunded());
        }
        helper.add("updated_at", getUpdatedAt());
        if (getWeeeTaxAppliedAmount() != null) {
            helper.add("weee_tax_applied_amount", getWeeeTaxAppliedAmount());
        }
        if (getWeeeTaxAppliedRowAmount() != null) {
            helper.add("weee_tax_applied_row_amount", getWeeeTaxAppliedRowAmount());
        }
        if (getWeeeTaxDisposition() != null) {
            helper.add("weee_tax_disposition", getWeeeTaxDisposition());
        }
        if (getWeeeTaxRowDisposition() != null) {
            helper.add("weee_tax_row_disposition", getWeeeTaxRowDisposition());
        }
        if (getWeight() != null) {
            helper.add("weight", getWeight());
        }
        return helper.toString();
    }

    @Override
    public void write(final org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
        write(oprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public void write(final org.apache.thrift.protocol.TProtocol oprot, final byte writeAsTType) throws org.apache.thrift.TException {
        switch (writeAsTType) {
            case org.apache.thrift.protocol.TType.VOID:
            case org.apache.thrift.protocol.TType.LIST:
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 79));

                if (getAdditionalData() != null) {
                    oprot.writeString(getAdditionalData());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getAmountRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getAmountRefunded()); } else { oprot.writeString(getAmountRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseAmountRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseAmountRefunded()); } else { oprot.writeString(getBaseAmountRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseCost() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseCost()); } else { oprot.writeString(getBaseCost().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseDiscountAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountAmount()); } else { oprot.writeString(getBaseDiscountAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseDiscountInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountInvoiced()); } else { oprot.writeString(getBaseDiscountInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseDiscountRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountRefunded()); } else { oprot.writeString(getBaseDiscountRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseHiddenTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseHiddenTaxAmount()); } else { oprot.writeString(getBaseHiddenTaxAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseHiddenTaxInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseHiddenTaxInvoiced()); } else { oprot.writeString(getBaseHiddenTaxInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseHiddenTaxRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseHiddenTaxRefunded()); } else { oprot.writeString(getBaseHiddenTaxRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseOriginalPrice() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseOriginalPrice()); } else { oprot.writeString(getBaseOriginalPrice().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBasePrice() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBasePrice()); } else { oprot.writeString(getBasePrice().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBasePriceInclTax() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBasePriceInclTax()); } else { oprot.writeString(getBasePriceInclTax().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseRowInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseRowInvoiced()); } else { oprot.writeString(getBaseRowInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseRowTotal() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseRowTotal()); } else { oprot.writeString(getBaseRowTotal().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseRowTotalInclTax() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseRowTotalInclTax()); } else { oprot.writeString(getBaseRowTotalInclTax().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxAmount()); } else { oprot.writeString(getBaseTaxAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTaxBeforeDiscount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxBeforeDiscount()); } else { oprot.writeString(getBaseTaxBeforeDiscount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTaxInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxInvoiced()); } else { oprot.writeString(getBaseTaxInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTaxRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxRefunded()); } else { oprot.writeString(getBaseTaxRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseWeeeTaxAppliedAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxAppliedAmount()); } else { oprot.writeString(getBaseWeeeTaxAppliedAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseWeeeTaxAppliedRowAmnt() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxAppliedRowAmnt()); } else { oprot.writeString(getBaseWeeeTaxAppliedRowAmnt().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseWeeeTaxAppliedRowAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxAppliedRowAmount()); } else { oprot.writeString(getBaseWeeeTaxAppliedRowAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseWeeeTaxDisposition() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxDisposition()); } else { oprot.writeString(getBaseWeeeTaxDisposition().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseWeeeTaxRowDisposition() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxRowDisposition()); } else { oprot.writeString(getBaseWeeeTaxRowDisposition().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }

                if (getDescription() != null) {
                    oprot.writeString(getDescription());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDiscountAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountAmount()); } else { oprot.writeString(getDiscountAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDiscountInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountInvoiced()); } else { oprot.writeString(getDiscountInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDiscountPercent() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountPercent()); } else { oprot.writeString(getDiscountPercent().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDiscountRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountRefunded()); } else { oprot.writeString(getDiscountRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isFreeShipping() != null) {
                    oprot.writeBool(isFreeShipping());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getGiftMessageAvailable() != null) {
                    oprot.writeString(getGiftMessageAvailable());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getGiftMessageId() != null) {
                    oprot.writeI32(getGiftMessageId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isHasChildren() != null) {
                    oprot.writeBool(isHasChildren());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getHiddenTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxAmount()); } else { oprot.writeString(getHiddenTaxAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getHiddenTaxCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxCanceled()); } else { oprot.writeString(getHiddenTaxCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getHiddenTaxInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxInvoiced()); } else { oprot.writeString(getHiddenTaxInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getHiddenTaxRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxRefunded()); } else { oprot.writeString(getHiddenTaxRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isNominal() != null) {
                    oprot.writeBool(isNominal());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isQtyDecimal() != null) {
                    oprot.writeBool(isQtyDecimal());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isVirtual() != null) {
                    oprot.writeBool(isVirtual());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getItemId() != null) {
                    oprot.writeI32(getItemId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isLockedDoInvoice() != null) {
                    oprot.writeBool(isLockedDoInvoice());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isLockedDoShip() != null) {
                    oprot.writeBool(isLockedDoShip());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeString(getName());

                if (isNoDiscount() != null) {
                    oprot.writeBool(isNoDiscount());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getOrderId() != null) {
                    oprot.writeI32(getOrderId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getOriginalPrice() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getOriginalPrice()); } else { oprot.writeString(getOriginalPrice().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getParentItemId() != null) {
                    oprot.writeI32(getParentItemId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getPrice() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getPrice()); } else { oprot.writeString(getPrice().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getPriceInclTax() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getPriceInclTax()); } else { oprot.writeString(getPriceInclTax().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getProductId() != null) {
                    oprot.writeI32(getProductId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getProductType()); } else { oprot.writeString(getProductType().toString()); }

                if (getQtyBackordered() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyBackordered()); } else { oprot.writeString(getQtyBackordered().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getQtyCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyCanceled()); } else { oprot.writeString(getQtyCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getQtyInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyInvoiced()); } else { oprot.writeString(getQtyInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getQtyOrdered() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyOrdered()); } else { oprot.writeString(getQtyOrdered().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getQtyRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyRefunded()); } else { oprot.writeString(getQtyRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getQtyShipped() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyShipped()); } else { oprot.writeString(getQtyShipped().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getQuoteItemId() != null) {
                    oprot.writeI32(getQuoteItemId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRowInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getRowInvoiced()); } else { oprot.writeString(getRowInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRowTotal() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getRowTotal()); } else { oprot.writeString(getRowTotal().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRowTotalInclTax() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getRowTotalInclTax()); } else { oprot.writeString(getRowTotalInclTax().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRowWeight() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getRowWeight()); } else { oprot.writeString(getRowWeight().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeString(getSku());

                if (getStoreId() != null) {
                    oprot.writeI32(getStoreId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxAmount()); } else { oprot.writeString(getTaxAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTaxBeforeDiscount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxBeforeDiscount()); } else { oprot.writeString(getTaxBeforeDiscount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTaxCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxCanceled()); } else { oprot.writeString(getTaxCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTaxInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxInvoiced()); } else { oprot.writeString(getTaxInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTaxPercent() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxPercent()); } else { oprot.writeString(getTaxPercent().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTaxRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxRefunded()); } else { oprot.writeString(getTaxRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }

                if (getWeeeTaxAppliedAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeeeTaxAppliedAmount()); } else { oprot.writeString(getWeeeTaxAppliedAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getWeeeTaxAppliedRowAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeeeTaxAppliedRowAmount()); } else { oprot.writeString(getWeeeTaxAppliedRowAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getWeeeTaxDisposition() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeeeTaxDisposition()); } else { oprot.writeString(getWeeeTaxDisposition().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getWeeeTaxRowDisposition() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeeeTaxRowDisposition()); } else { oprot.writeString(getWeeeTaxRowDisposition().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getWeight() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeight()); } else { oprot.writeString(getWeight().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MagentoOrderItem"));

                if (getAdditionalData() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("additional_data", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getAdditionalData());
                    oprot.writeFieldEnd();
                }

                if (getAmountRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("amount_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getAmountRefunded()); } else { oprot.writeString(getAmountRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseAmountRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_amount_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseAmountRefunded()); } else { oprot.writeString(getBaseAmountRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseCost() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_cost", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseCost()); } else { oprot.writeString(getBaseCost().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseDiscountAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_discount_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountAmount()); } else { oprot.writeString(getBaseDiscountAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseDiscountInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_discount_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountInvoiced()); } else { oprot.writeString(getBaseDiscountInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseDiscountRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_discount_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountRefunded()); } else { oprot.writeString(getBaseDiscountRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseHiddenTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_hidden_tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseHiddenTaxAmount()); } else { oprot.writeString(getBaseHiddenTaxAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseHiddenTaxInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_hidden_tax_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseHiddenTaxInvoiced()); } else { oprot.writeString(getBaseHiddenTaxInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseHiddenTaxRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_hidden_tax_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseHiddenTaxRefunded()); } else { oprot.writeString(getBaseHiddenTaxRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseOriginalPrice() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_original_price", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseOriginalPrice()); } else { oprot.writeString(getBaseOriginalPrice().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBasePrice() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_price", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBasePrice()); } else { oprot.writeString(getBasePrice().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBasePriceInclTax() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_price_incl_tax", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBasePriceInclTax()); } else { oprot.writeString(getBasePriceInclTax().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseRowInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_row_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseRowInvoiced()); } else { oprot.writeString(getBaseRowInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseRowTotal() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_row_total", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseRowTotal()); } else { oprot.writeString(getBaseRowTotal().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseRowTotalInclTax() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_row_total_incl_tax", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseRowTotalInclTax()); } else { oprot.writeString(getBaseRowTotalInclTax().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxAmount()); } else { oprot.writeString(getBaseTaxAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTaxBeforeDiscount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_tax_before_discount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxBeforeDiscount()); } else { oprot.writeString(getBaseTaxBeforeDiscount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTaxInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_tax_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxInvoiced()); } else { oprot.writeString(getBaseTaxInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTaxRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_tax_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxRefunded()); } else { oprot.writeString(getBaseTaxRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseWeeeTaxAppliedAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_weee_tax_applied_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxAppliedAmount()); } else { oprot.writeString(getBaseWeeeTaxAppliedAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseWeeeTaxAppliedRowAmnt() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_weee_tax_applied_row_amnt", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxAppliedRowAmnt()); } else { oprot.writeString(getBaseWeeeTaxAppliedRowAmnt().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseWeeeTaxAppliedRowAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_weee_tax_applied_row_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxAppliedRowAmount()); } else { oprot.writeString(getBaseWeeeTaxAppliedRowAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseWeeeTaxDisposition() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_weee_tax_disposition", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxDisposition()); } else { oprot.writeString(getBaseWeeeTaxDisposition().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseWeeeTaxRowDisposition() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_weee_tax_row_disposition", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseWeeeTaxRowDisposition()); } else { oprot.writeString(getBaseWeeeTaxRowDisposition().toString()); }
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("created_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (getDescription() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getDescription());
                    oprot.writeFieldEnd();
                }

                if (getDiscountAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("discount_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountAmount()); } else { oprot.writeString(getDiscountAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getDiscountInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("discount_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountInvoiced()); } else { oprot.writeString(getDiscountInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getDiscountPercent() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("discount_percent", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountPercent()); } else { oprot.writeString(getDiscountPercent().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getDiscountRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("discount_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountRefunded()); } else { oprot.writeString(getDiscountRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (isFreeShipping() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("free_shipping", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isFreeShipping());
                    oprot.writeFieldEnd();
                }

                if (getGiftMessageAvailable() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("gift_message_available", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getGiftMessageAvailable());
                    oprot.writeFieldEnd();
                }

                if (getGiftMessageId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("gift_message_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getGiftMessageId());
                    oprot.writeFieldEnd();
                }

                if (isHasChildren() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("has_children", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isHasChildren());
                    oprot.writeFieldEnd();
                }

                if (getHiddenTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("hidden_tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxAmount()); } else { oprot.writeString(getHiddenTaxAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getHiddenTaxCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("hidden_tax_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxCanceled()); } else { oprot.writeString(getHiddenTaxCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getHiddenTaxInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("hidden_tax_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxInvoiced()); } else { oprot.writeString(getHiddenTaxInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getHiddenTaxRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("hidden_tax_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxRefunded()); } else { oprot.writeString(getHiddenTaxRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (isNominal() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_nominal", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isNominal());
                    oprot.writeFieldEnd();
                }

                if (isQtyDecimal() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_qty_decimal", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isQtyDecimal());
                    oprot.writeFieldEnd();
                }

                if (isVirtual() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_virtual", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isVirtual());
                    oprot.writeFieldEnd();
                }

                if (getItemId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("item_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getItemId());
                    oprot.writeFieldEnd();
                }

                if (isLockedDoInvoice() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("locked_do_invoice", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isLockedDoInvoice());
                    oprot.writeFieldEnd();
                }

                if (isLockedDoShip() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("locked_do_ship", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isLockedDoShip());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getName());
                oprot.writeFieldEnd();

                if (isNoDiscount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("no_discount", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isNoDiscount());
                    oprot.writeFieldEnd();
                }

                if (getOrderId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("order_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getOrderId());
                    oprot.writeFieldEnd();
                }

                if (getOriginalPrice() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("original_price", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getOriginalPrice()); } else { oprot.writeString(getOriginalPrice().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getParentItemId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("parent_item_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getParentItemId());
                    oprot.writeFieldEnd();
                }

                if (getPrice() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getPrice()); } else { oprot.writeString(getPrice().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getPriceInclTax() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("price_incl_tax", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getPriceInclTax()); } else { oprot.writeString(getPriceInclTax().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getProductId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("product_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getProductId());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("product_type", org.apache.thrift.protocol.TType.STRING, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getProductType()); } else { oprot.writeString(getProductType().toString()); }
                oprot.writeFieldEnd();

                if (getQtyBackordered() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("qty_backordered", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyBackordered()); } else { oprot.writeString(getQtyBackordered().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getQtyCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("qty_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyCanceled()); } else { oprot.writeString(getQtyCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getQtyInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("qty_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyInvoiced()); } else { oprot.writeString(getQtyInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getQtyOrdered() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("qty_ordered", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyOrdered()); } else { oprot.writeString(getQtyOrdered().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getQtyRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("qty_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyRefunded()); } else { oprot.writeString(getQtyRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getQtyShipped() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("qty_shipped", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getQtyShipped()); } else { oprot.writeString(getQtyShipped().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getQuoteItemId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("quote_item_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getQuoteItemId());
                    oprot.writeFieldEnd();
                }

                if (getRowInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("row_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getRowInvoiced()); } else { oprot.writeString(getRowInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getRowTotal() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("row_total", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getRowTotal()); } else { oprot.writeString(getRowTotal().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getRowTotalInclTax() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("row_total_incl_tax", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getRowTotalInclTax()); } else { oprot.writeString(getRowTotalInclTax().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getRowWeight() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("row_weight", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getRowWeight()); } else { oprot.writeString(getRowWeight().toString()); }
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("sku", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getSku());
                oprot.writeFieldEnd();

                if (getStoreId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("store_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getStoreId());
                    oprot.writeFieldEnd();
                }

                if (getTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxAmount()); } else { oprot.writeString(getTaxAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTaxBeforeDiscount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("tax_before_discount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxBeforeDiscount()); } else { oprot.writeString(getTaxBeforeDiscount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTaxCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("tax_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxCanceled()); } else { oprot.writeString(getTaxCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTaxInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("tax_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxInvoiced()); } else { oprot.writeString(getTaxInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTaxPercent() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("tax_percent", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxPercent()); } else { oprot.writeString(getTaxPercent().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTaxRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("tax_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxRefunded()); } else { oprot.writeString(getTaxRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("updated_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (getWeeeTaxAppliedAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("weee_tax_applied_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeeeTaxAppliedAmount()); } else { oprot.writeString(getWeeeTaxAppliedAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getWeeeTaxAppliedRowAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("weee_tax_applied_row_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeeeTaxAppliedRowAmount()); } else { oprot.writeString(getWeeeTaxAppliedRowAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getWeeeTaxDisposition() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("weee_tax_disposition", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeeeTaxDisposition()); } else { oprot.writeString(getWeeeTaxDisposition().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getWeeeTaxRowDisposition() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("weee_tax_row_disposition", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeeeTaxRowDisposition()); } else { oprot.writeString(getWeeeTaxRowDisposition().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getWeight() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeight()); } else { oprot.writeString(getWeight().toString()); }
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final String additionalData;
    private final java.math.BigDecimal amountRefunded;
    private final java.math.BigDecimal baseAmountRefunded;
    private final java.math.BigDecimal baseCost;
    private final java.math.BigDecimal baseDiscountAmount;
    private final java.math.BigDecimal baseDiscountInvoiced;
    private final java.math.BigDecimal baseDiscountRefunded;
    private final java.math.BigDecimal baseHiddenTaxAmount;
    private final java.math.BigDecimal baseHiddenTaxInvoiced;
    private final java.math.BigDecimal baseHiddenTaxRefunded;
    private final java.math.BigDecimal baseOriginalPrice;
    private final java.math.BigDecimal basePrice;
    private final java.math.BigDecimal basePriceInclTax;
    private final java.math.BigDecimal baseRowInvoiced;
    private final java.math.BigDecimal baseRowTotal;
    private final java.math.BigDecimal baseRowTotalInclTax;
    private final java.math.BigDecimal baseTaxAmount;
    private final java.math.BigDecimal baseTaxBeforeDiscount;
    private final java.math.BigDecimal baseTaxInvoiced;
    private final java.math.BigDecimal baseTaxRefunded;
    private final java.math.BigDecimal baseWeeeTaxAppliedAmount;
    private final java.math.BigDecimal baseWeeeTaxAppliedRowAmnt;
    private final java.math.BigDecimal baseWeeeTaxAppliedRowAmount;
    private final java.math.BigDecimal baseWeeeTaxDisposition;
    private final java.math.BigDecimal baseWeeeTaxRowDisposition;
    private final org.joda.time.DateTime createdAt;
    private final String description;
    private final java.math.BigDecimal discountAmount;
    private final java.math.BigDecimal discountInvoiced;
    private final java.math.BigDecimal discountPercent;
    private final java.math.BigDecimal discountRefunded;
    private final Boolean freeShipping;
    private final String giftMessageAvailable;
    private final Integer giftMessageId;
    private final Boolean hasChildren;
    private final java.math.BigDecimal hiddenTaxAmount;
    private final java.math.BigDecimal hiddenTaxCanceled;
    private final java.math.BigDecimal hiddenTaxInvoiced;
    private final java.math.BigDecimal hiddenTaxRefunded;
    private final Boolean isNominal;
    private final Boolean isQtyDecimal;
    private final Boolean isVirtual;
    private final Integer itemId;
    private final Boolean lockedDoInvoice;
    private final Boolean lockedDoShip;
    private final String name;
    private final Boolean noDiscount;
    private final Integer orderId;
    private final java.math.BigDecimal originalPrice;
    private final Integer parentItemId;
    private final java.math.BigDecimal price;
    private final java.math.BigDecimal priceInclTax;
    private final Integer productId;
    private final com.yogento.api.models.catalog.product.magento.MagentoProductType productType;
    private final java.math.BigDecimal qtyBackordered;
    private final java.math.BigDecimal qtyCanceled;
    private final java.math.BigDecimal qtyInvoiced;
    private final java.math.BigDecimal qtyOrdered;
    private final java.math.BigDecimal qtyRefunded;
    private final java.math.BigDecimal qtyShipped;
    private final Integer quoteItemId;
    private final java.math.BigDecimal rowInvoiced;
    private final java.math.BigDecimal rowTotal;
    private final java.math.BigDecimal rowTotalInclTax;
    private final java.math.BigDecimal rowWeight;
    private final String sku;
    private final Integer storeId;
    private final java.math.BigDecimal taxAmount;
    private final java.math.BigDecimal taxBeforeDiscount;
    private final java.math.BigDecimal taxCanceled;
    private final java.math.BigDecimal taxInvoiced;
    private final java.math.BigDecimal taxPercent;
    private final java.math.BigDecimal taxRefunded;
    private final org.joda.time.DateTime updatedAt;
    private final java.math.BigDecimal weeeTaxAppliedAmount;
    private final java.math.BigDecimal weeeTaxAppliedRowAmount;
    private final java.math.BigDecimal weeeTaxDisposition;
    private final java.math.BigDecimal weeeTaxRowDisposition;
    private final java.math.BigDecimal weight;
}
