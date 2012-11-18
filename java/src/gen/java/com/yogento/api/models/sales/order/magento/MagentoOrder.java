package com.yogento.api.models.sales.order.magento;

@SuppressWarnings({"serial"})
public class MagentoOrder implements org.apache.thrift.TBase<MagentoOrder, org.apache.thrift.TFieldIdEnum> {
    public static class Builder {
        public Builder() {
        }

        public Builder(final MagentoOrder other) {
            this.adjustmentNegative = other.getAdjustmentNegative();
            this.adjustmentPositive = other.getAdjustmentPositive();
            this.baseAdjustmentNegative = other.getBaseAdjustmentNegative();
            this.baseAdjustmentPositive = other.getBaseAdjustmentPositive();
            this.baseCurrencyCode = other.getBaseCurrencyCode();
            this.baseCustbalanceAmount = other.getBaseCustbalanceAmount();
            this.baseDiscountAmount = other.getBaseDiscountAmount();
            this.baseDiscountCanceled = other.getBaseDiscountCanceled();
            this.baseDiscountInvoiced = other.getBaseDiscountInvoiced();
            this.baseDiscountRefunded = other.getBaseDiscountRefunded();
            this.baseGrandTotal = other.getBaseGrandTotal();
            this.baseHiddenTaxAmount = other.getBaseHiddenTaxAmount();
            this.baseHiddenTaxInvoiced = other.getBaseHiddenTaxInvoiced();
            this.baseHiddenTaxRefunded = other.getBaseHiddenTaxRefunded();
            this.baseShippingAmount = other.getBaseShippingAmount();
            this.baseShippingCanceled = other.getBaseShippingCanceled();
            this.baseShippingDiscountAmount = other.getBaseShippingDiscountAmount();
            this.baseShippingHiddenTaxAmnt = other.getBaseShippingHiddenTaxAmnt();
            this.baseShippingHiddenTaxAmount = other.getBaseShippingHiddenTaxAmount();
            this.baseShippingInclTax = other.getBaseShippingInclTax();
            this.baseShippingInvoiced = other.getBaseShippingInvoiced();
            this.baseShippingRefunded = other.getBaseShippingRefunded();
            this.baseShippingTaxAmount = other.getBaseShippingTaxAmount();
            this.baseShippingTaxRefunded = other.getBaseShippingTaxRefunded();
            this.baseSubtotal = other.getBaseSubtotal();
            this.baseSubtotalCanceled = other.getBaseSubtotalCanceled();
            this.baseSubtotalInclTax = other.getBaseSubtotalInclTax();
            this.baseSubtotalInvoiced = other.getBaseSubtotalInvoiced();
            this.baseSubtotalRefunded = other.getBaseSubtotalRefunded();
            this.baseTaxAmount = other.getBaseTaxAmount();
            this.baseTaxCanceled = other.getBaseTaxCanceled();
            this.baseTaxInvoiced = other.getBaseTaxInvoiced();
            this.baseTaxRefunded = other.getBaseTaxRefunded();
            this.baseToGlobalRate = other.getBaseToGlobalRate();
            this.baseToOrderRate = other.getBaseToOrderRate();
            this.baseTotalCanceled = other.getBaseTotalCanceled();
            this.baseTotalDue = other.getBaseTotalDue();
            this.baseTotalInvoiced = other.getBaseTotalInvoiced();
            this.baseTotalInvoicedCost = other.getBaseTotalInvoicedCost();
            this.baseTotalOfflineRefunded = other.getBaseTotalOfflineRefunded();
            this.baseTotalOnlineRefunded = other.getBaseTotalOnlineRefunded();
            this.baseTotalPaid = other.getBaseTotalPaid();
            this.baseTotalQtyOrdered = other.getBaseTotalQtyOrdered();
            this.baseTotalRefunded = other.getBaseTotalRefunded();
            this.billingAddress = other.getBillingAddress();
            this.billingAddressId = other.getBillingAddressId();
            this.canShipPartially = other.isCanShipPartially();
            this.canShipPartiallyItem = other.isCanShipPartiallyItem();
            this.couponCode = other.getCouponCode();
            this.couponRuleName = other.getCouponRuleName();
            this.createdAt = other.getCreatedAt();
            this.currencyCode = other.getCurrencyCode();
            this.currencyRate = other.getCurrencyRate();
            this.custbalanceAmount = other.getCustbalanceAmount();
            this.customerDob = other.getCustomerDob();
            this.customerEmail = other.getCustomerEmail();
            this.customerFirstname = other.getCustomerFirstname();
            this.customerGender = other.getCustomerGender();
            this.customerGroupId = other.getCustomerGroupId();
            this.customerId = other.getCustomerId();
            this.customerIsGuest = other.isCustomerIsGuest();
            this.customerLastname = other.getCustomerLastname();
            this.customerMiddlename = other.getCustomerMiddlename();
            this.customerNote = other.getCustomerNote();
            this.customerNoteNotify = other.isCustomerNoteNotify();
            this.customerPrefix = other.getCustomerPrefix();
            this.customerSuffix = other.getCustomerSuffix();
            this.customerTaxvat = other.getCustomerTaxvat();
            this.discountAmount = other.getDiscountAmount();
            this.discountCanceled = other.getDiscountCanceled();
            this.discountDescription = other.getDiscountDescription();
            this.discountInvoiced = other.getDiscountInvoiced();
            this.discountRefunded = other.getDiscountRefunded();
            this.editIncrement = other.getEditIncrement();
            this.emailSent = other.isEmailSent();
            this.forcedDoShipmentWithInvoice = other.isForcedDoShipmentWithInvoice();
            this.forcedShipmentWithInvoice = other.isForcedShipmentWithInvoice();
            this.giftMessageId = other.getGiftMessageId();
            this.globalCurrencyCode = other.getGlobalCurrencyCode();
            this.grandTotal = other.getGrandTotal();
            this.hiddenTaxAmount = other.getHiddenTaxAmount();
            this.hiddenTaxInvoiced = other.getHiddenTaxInvoiced();
            this.hiddenTaxRefunded = other.getHiddenTaxRefunded();
            this.incrementId = other.getIncrementId();
            this.isHold = other.isHold();
            this.isMultiPayment = other.isMultiPayment();
            this.isVirtual = other.isVirtual();
            this.items = other.getItems();
            this.orderCurrencyCode = other.getOrderCurrencyCode();
            this.orderId = other.getOrderId();
            this.originalIncrementId = other.getOriginalIncrementId();
            this.quoteId = other.getQuoteId();
            this.relationChildId = other.getRelationChildId();
            this.relationChildRealId = other.getRelationChildRealId();
            this.relationParentId = other.getRelationParentId();
            this.relationParentRealId = other.getRelationParentRealId();
            this.remoteIp = other.getRemoteIp();
            this.shippingAddress = other.getShippingAddress();
            this.shippingAddressId = other.getShippingAddressId();
            this.shippingAmount = other.getShippingAmount();
            this.shippingCanceled = other.getShippingCanceled();
            this.shippingDescription = other.getShippingDescription();
            this.shippingDiscountAmount = other.getShippingDiscountAmount();
            this.shippingHiddenTaxAmount = other.getShippingHiddenTaxAmount();
            this.shippingInclTax = other.getShippingInclTax();
            this.shippingInvoiced = other.getShippingInvoiced();
            this.shippingMethod = other.getShippingMethod();
            this.shippingRefunded = other.getShippingRefunded();
            this.shippingTaxAmount = other.getShippingTaxAmount();
            this.shippingTaxRefunded = other.getShippingTaxRefunded();
            this.state = other.getState();
            this.status = other.getStatus();
            this.statusHistory = other.getStatusHistory();
            this.storeCurrencyCode = other.getStoreCurrencyCode();
            this.storeId = other.getStoreId();
            this.storeName = other.getStoreName();
            this.storeToBaseRate = other.getStoreToBaseRate();
            this.storeToOrderRate = other.getStoreToOrderRate();
            this.subtotal = other.getSubtotal();
            this.subtotalCanceled = other.getSubtotalCanceled();
            this.subtotalInclTax = other.getSubtotalInclTax();
            this.subtotalInvoiced = other.getSubtotalInvoiced();
            this.subtotalRefunded = other.getSubtotalRefunded();
            this.taxAmount = other.getTaxAmount();
            this.taxCanceled = other.getTaxCanceled();
            this.taxInvoiced = other.getTaxInvoiced();
            this.taxPercent = other.getTaxPercent();
            this.taxRefunded = other.getTaxRefunded();
            this.totalCanceled = other.getTotalCanceled();
            this.totalDue = other.getTotalDue();
            this.totalInvoiced = other.getTotalInvoiced();
            this.totalItemCount = other.getTotalItemCount();
            this.totalOfflineRefunded = other.getTotalOfflineRefunded();
            this.totalOnlineRefunded = other.getTotalOnlineRefunded();
            this.totalPaid = other.getTotalPaid();
            this.totalQtyOrdered = other.getTotalQtyOrdered();
            this.totalRefunded = other.getTotalRefunded();
            this.trackingNumbers = other.getTrackingNumbers();
            this.updatedAt = other.getUpdatedAt();
            this.weight = other.getWeight();
            this.xForwardedFor = other.getXForwardedFor();
        }

        protected MagentoOrder _build(final java.math.BigDecimal adjustmentNegative, final java.math.BigDecimal adjustmentPositive, final java.math.BigDecimal baseAdjustmentNegative, final java.math.BigDecimal baseAdjustmentPositive, final String baseCurrencyCode, final java.math.BigDecimal baseCustbalanceAmount, final java.math.BigDecimal baseDiscountAmount, final java.math.BigDecimal baseDiscountCanceled, final java.math.BigDecimal baseDiscountInvoiced, final java.math.BigDecimal baseDiscountRefunded, final java.math.BigDecimal baseGrandTotal, final java.math.BigDecimal baseHiddenTaxAmount, final java.math.BigDecimal baseHiddenTaxInvoiced, final java.math.BigDecimal baseHiddenTaxRefunded, final java.math.BigDecimal baseShippingAmount, final java.math.BigDecimal baseShippingCanceled, final java.math.BigDecimal baseShippingDiscountAmount, final java.math.BigDecimal baseShippingHiddenTaxAmnt, final java.math.BigDecimal baseShippingHiddenTaxAmount, final java.math.BigDecimal baseShippingInclTax, final java.math.BigDecimal baseShippingInvoiced, final java.math.BigDecimal baseShippingRefunded, final java.math.BigDecimal baseShippingTaxAmount, final java.math.BigDecimal baseShippingTaxRefunded, final java.math.BigDecimal baseSubtotal, final java.math.BigDecimal baseSubtotalCanceled, final java.math.BigDecimal baseSubtotalInclTax, final java.math.BigDecimal baseSubtotalInvoiced, final java.math.BigDecimal baseSubtotalRefunded, final java.math.BigDecimal baseTaxAmount, final java.math.BigDecimal baseTaxCanceled, final java.math.BigDecimal baseTaxInvoiced, final java.math.BigDecimal baseTaxRefunded, final java.math.BigDecimal baseToGlobalRate, final java.math.BigDecimal baseToOrderRate, final java.math.BigDecimal baseTotalCanceled, final java.math.BigDecimal baseTotalDue, final java.math.BigDecimal baseTotalInvoiced, final java.math.BigDecimal baseTotalInvoicedCost, final java.math.BigDecimal baseTotalOfflineRefunded, final java.math.BigDecimal baseTotalOnlineRefunded, final java.math.BigDecimal baseTotalPaid, final java.math.BigDecimal baseTotalQtyOrdered, final java.math.BigDecimal baseTotalRefunded, final com.yogento.api.models.sales.order.magento.MagentoOrderAddress billingAddress, final Integer billingAddressId, final Boolean canShipPartially, final Boolean canShipPartiallyItem, final String couponCode, final String couponRuleName, final org.joda.time.DateTime createdAt, final String currencyCode, final String currencyRate, final String custbalanceAmount, final String customerDob, final String customerEmail, final String customerFirstname, final String customerGender, final Integer customerGroupId, final Integer customerId, final Boolean customerIsGuest, final String customerLastname, final String customerMiddlename, final String customerNote, final Boolean customerNoteNotify, final String customerPrefix, final String customerSuffix, final String customerTaxvat, final java.math.BigDecimal discountAmount, final java.math.BigDecimal discountCanceled, final java.math.BigDecimal discountDescription, final java.math.BigDecimal discountInvoiced, final java.math.BigDecimal discountRefunded, final String editIncrement, final Boolean emailSent, final Boolean forcedDoShipmentWithInvoice, final Boolean forcedShipmentWithInvoice, final Integer giftMessageId, final String globalCurrencyCode, final java.math.BigDecimal grandTotal, final java.math.BigDecimal hiddenTaxAmount, final java.math.BigDecimal hiddenTaxInvoiced, final java.math.BigDecimal hiddenTaxRefunded, final String incrementId, final Boolean isHold, final Boolean isMultiPayment, final boolean isVirtual, final com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> items, final String orderCurrencyCode, final Integer orderId, final String originalIncrementId, final Integer quoteId, final Integer relationChildId, final Integer relationChildRealId, final Integer relationParentId, final Integer relationParentRealId, final String remoteIp, final com.yogento.api.models.sales.order.magento.MagentoOrderAddress shippingAddress, final Integer shippingAddressId, final java.math.BigDecimal shippingAmount, final java.math.BigDecimal shippingCanceled, final String shippingDescription, final java.math.BigDecimal shippingDiscountAmount, final java.math.BigDecimal shippingHiddenTaxAmount, final java.math.BigDecimal shippingInclTax, final java.math.BigDecimal shippingInvoiced, final String shippingMethod, final java.math.BigDecimal shippingRefunded, final java.math.BigDecimal shippingTaxAmount, final java.math.BigDecimal shippingTaxRefunded, final String state, final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status, final com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> statusHistory, final String storeCurrencyCode, final Integer storeId, final String storeName, final java.math.BigDecimal storeToBaseRate, final java.math.BigDecimal storeToOrderRate, final java.math.BigDecimal subtotal, final java.math.BigDecimal subtotalCanceled, final java.math.BigDecimal subtotalInclTax, final java.math.BigDecimal subtotalInvoiced, final java.math.BigDecimal subtotalRefunded, final java.math.BigDecimal taxAmount, final java.math.BigDecimal taxCanceled, final java.math.BigDecimal taxInvoiced, final java.math.BigDecimal taxPercent, final java.math.BigDecimal taxRefunded, final java.math.BigDecimal totalCanceled, final java.math.BigDecimal totalDue, final java.math.BigDecimal totalInvoiced, final java.math.BigDecimal totalItemCount, final java.math.BigDecimal totalOfflineRefunded, final java.math.BigDecimal totalOnlineRefunded, final java.math.BigDecimal totalPaid, final java.math.BigDecimal totalQtyOrdered, final java.math.BigDecimal totalRefunded, final com.google.common.collect.ImmutableList<String> trackingNumbers, final org.joda.time.DateTime updatedAt, final java.math.BigDecimal weight, final String xForwardedFor) {
            return new MagentoOrder(adjustmentNegative, adjustmentPositive, baseAdjustmentNegative, baseAdjustmentPositive, baseCurrencyCode, baseCustbalanceAmount, baseDiscountAmount, baseDiscountCanceled, baseDiscountInvoiced, baseDiscountRefunded, baseGrandTotal, baseHiddenTaxAmount, baseHiddenTaxInvoiced, baseHiddenTaxRefunded, baseShippingAmount, baseShippingCanceled, baseShippingDiscountAmount, baseShippingHiddenTaxAmnt, baseShippingHiddenTaxAmount, baseShippingInclTax, baseShippingInvoiced, baseShippingRefunded, baseShippingTaxAmount, baseShippingTaxRefunded, baseSubtotal, baseSubtotalCanceled, baseSubtotalInclTax, baseSubtotalInvoiced, baseSubtotalRefunded, baseTaxAmount, baseTaxCanceled, baseTaxInvoiced, baseTaxRefunded, baseToGlobalRate, baseToOrderRate, baseTotalCanceled, baseTotalDue, baseTotalInvoiced, baseTotalInvoicedCost, baseTotalOfflineRefunded, baseTotalOnlineRefunded, baseTotalPaid, baseTotalQtyOrdered, baseTotalRefunded, billingAddress, billingAddressId, canShipPartially, canShipPartiallyItem, couponCode, couponRuleName, createdAt, currencyCode, currencyRate, custbalanceAmount, customerDob, customerEmail, customerFirstname, customerGender, customerGroupId, customerId, customerIsGuest, customerLastname, customerMiddlename, customerNote, customerNoteNotify, customerPrefix, customerSuffix, customerTaxvat, discountAmount, discountCanceled, discountDescription, discountInvoiced, discountRefunded, editIncrement, emailSent, forcedDoShipmentWithInvoice, forcedShipmentWithInvoice, giftMessageId, globalCurrencyCode, grandTotal, hiddenTaxAmount, hiddenTaxInvoiced, hiddenTaxRefunded, incrementId, isHold, isMultiPayment, isVirtual, items, orderCurrencyCode, orderId, originalIncrementId, quoteId, relationChildId, relationChildRealId, relationParentId, relationParentRealId, remoteIp, shippingAddress, shippingAddressId, shippingAmount, shippingCanceled, shippingDescription, shippingDiscountAmount, shippingHiddenTaxAmount, shippingInclTax, shippingInvoiced, shippingMethod, shippingRefunded, shippingTaxAmount, shippingTaxRefunded, state, status, statusHistory, storeCurrencyCode, storeId, storeName, storeToBaseRate, storeToOrderRate, subtotal, subtotalCanceled, subtotalInclTax, subtotalInvoiced, subtotalRefunded, taxAmount, taxCanceled, taxInvoiced, taxPercent, taxRefunded, totalCanceled, totalDue, totalInvoiced, totalItemCount, totalOfflineRefunded, totalOnlineRefunded, totalPaid, totalQtyOrdered, totalRefunded, trackingNumbers, updatedAt, weight, xForwardedFor);
        }

        public MagentoOrder build() {
            return _build(adjustmentNegative, adjustmentPositive, baseAdjustmentNegative, baseAdjustmentPositive, baseCurrencyCode, baseCustbalanceAmount, baseDiscountAmount, baseDiscountCanceled, baseDiscountInvoiced, baseDiscountRefunded, baseGrandTotal, baseHiddenTaxAmount, baseHiddenTaxInvoiced, baseHiddenTaxRefunded, baseShippingAmount, baseShippingCanceled, baseShippingDiscountAmount, baseShippingHiddenTaxAmnt, baseShippingHiddenTaxAmount, baseShippingInclTax, baseShippingInvoiced, baseShippingRefunded, baseShippingTaxAmount, baseShippingTaxRefunded, baseSubtotal, baseSubtotalCanceled, baseSubtotalInclTax, baseSubtotalInvoiced, baseSubtotalRefunded, baseTaxAmount, baseTaxCanceled, baseTaxInvoiced, baseTaxRefunded, baseToGlobalRate, baseToOrderRate, baseTotalCanceled, baseTotalDue, baseTotalInvoiced, baseTotalInvoicedCost, baseTotalOfflineRefunded, baseTotalOnlineRefunded, baseTotalPaid, baseTotalQtyOrdered, baseTotalRefunded, billingAddress, billingAddressId, canShipPartially, canShipPartiallyItem, couponCode, couponRuleName, createdAt, currencyCode, currencyRate, custbalanceAmount, customerDob, customerEmail, customerFirstname, customerGender, customerGroupId, customerId, customerIsGuest, customerLastname, customerMiddlename, customerNote, customerNoteNotify, customerPrefix, customerSuffix, customerTaxvat, discountAmount, discountCanceled, discountDescription, discountInvoiced, discountRefunded, editIncrement, emailSent, forcedDoShipmentWithInvoice, forcedShipmentWithInvoice, giftMessageId, globalCurrencyCode, grandTotal, hiddenTaxAmount, hiddenTaxInvoiced, hiddenTaxRefunded, incrementId, isHold, isMultiPayment, isVirtual, items, orderCurrencyCode, orderId, originalIncrementId, quoteId, relationChildId, relationChildRealId, relationParentId, relationParentRealId, remoteIp, shippingAddress, shippingAddressId, shippingAmount, shippingCanceled, shippingDescription, shippingDiscountAmount, shippingHiddenTaxAmount, shippingInclTax, shippingInvoiced, shippingMethod, shippingRefunded, shippingTaxAmount, shippingTaxRefunded, state, status, statusHistory, storeCurrencyCode, storeId, storeName, storeToBaseRate, storeToOrderRate, subtotal, subtotalCanceled, subtotalInclTax, subtotalInvoiced, subtotalRefunded, taxAmount, taxCanceled, taxInvoiced, taxPercent, taxRefunded, totalCanceled, totalDue, totalInvoiced, totalItemCount, totalOfflineRefunded, totalOnlineRefunded, totalPaid, totalQtyOrdered, totalRefunded, trackingNumbers, updatedAt, weight, xForwardedFor);
        }

        public Builder setAdjustmentNegative(final java.math.BigDecimal adjustmentNegative) {
            this.adjustmentNegative = adjustmentNegative;
            return this;
        }

        public Builder setAdjustmentPositive(final java.math.BigDecimal adjustmentPositive) {
            this.adjustmentPositive = adjustmentPositive;
            return this;
        }

        public Builder setBaseAdjustmentNegative(final java.math.BigDecimal baseAdjustmentNegative) {
            this.baseAdjustmentNegative = baseAdjustmentNegative;
            return this;
        }

        public Builder setBaseAdjustmentPositive(final java.math.BigDecimal baseAdjustmentPositive) {
            this.baseAdjustmentPositive = baseAdjustmentPositive;
            return this;
        }

        public Builder setBaseCurrencyCode(final String baseCurrencyCode) {
            this.baseCurrencyCode = baseCurrencyCode;
            return this;
        }

        public Builder setBaseCustbalanceAmount(final java.math.BigDecimal baseCustbalanceAmount) {
            this.baseCustbalanceAmount = baseCustbalanceAmount;
            return this;
        }

        public Builder setBaseDiscountAmount(final java.math.BigDecimal baseDiscountAmount) {
            this.baseDiscountAmount = baseDiscountAmount;
            return this;
        }

        public Builder setBaseDiscountCanceled(final java.math.BigDecimal baseDiscountCanceled) {
            this.baseDiscountCanceled = baseDiscountCanceled;
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

        public Builder setBaseGrandTotal(final java.math.BigDecimal baseGrandTotal) {
            this.baseGrandTotal = baseGrandTotal;
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

        public Builder setBaseShippingAmount(final java.math.BigDecimal baseShippingAmount) {
            this.baseShippingAmount = baseShippingAmount;
            return this;
        }

        public Builder setBaseShippingCanceled(final java.math.BigDecimal baseShippingCanceled) {
            this.baseShippingCanceled = baseShippingCanceled;
            return this;
        }

        public Builder setBaseShippingDiscountAmount(final java.math.BigDecimal baseShippingDiscountAmount) {
            this.baseShippingDiscountAmount = baseShippingDiscountAmount;
            return this;
        }

        public Builder setBaseShippingHiddenTaxAmnt(final java.math.BigDecimal baseShippingHiddenTaxAmnt) {
            this.baseShippingHiddenTaxAmnt = baseShippingHiddenTaxAmnt;
            return this;
        }

        public Builder setBaseShippingHiddenTaxAmount(final java.math.BigDecimal baseShippingHiddenTaxAmount) {
            this.baseShippingHiddenTaxAmount = baseShippingHiddenTaxAmount;
            return this;
        }

        public Builder setBaseShippingInclTax(final java.math.BigDecimal baseShippingInclTax) {
            this.baseShippingInclTax = baseShippingInclTax;
            return this;
        }

        public Builder setBaseShippingInvoiced(final java.math.BigDecimal baseShippingInvoiced) {
            this.baseShippingInvoiced = baseShippingInvoiced;
            return this;
        }

        public Builder setBaseShippingRefunded(final java.math.BigDecimal baseShippingRefunded) {
            this.baseShippingRefunded = baseShippingRefunded;
            return this;
        }

        public Builder setBaseShippingTaxAmount(final java.math.BigDecimal baseShippingTaxAmount) {
            this.baseShippingTaxAmount = baseShippingTaxAmount;
            return this;
        }

        public Builder setBaseShippingTaxRefunded(final java.math.BigDecimal baseShippingTaxRefunded) {
            this.baseShippingTaxRefunded = baseShippingTaxRefunded;
            return this;
        }

        public Builder setBaseSubtotal(final java.math.BigDecimal baseSubtotal) {
            this.baseSubtotal = baseSubtotal;
            return this;
        }

        public Builder setBaseSubtotalCanceled(final java.math.BigDecimal baseSubtotalCanceled) {
            this.baseSubtotalCanceled = baseSubtotalCanceled;
            return this;
        }

        public Builder setBaseSubtotalInclTax(final java.math.BigDecimal baseSubtotalInclTax) {
            this.baseSubtotalInclTax = baseSubtotalInclTax;
            return this;
        }

        public Builder setBaseSubtotalInvoiced(final java.math.BigDecimal baseSubtotalInvoiced) {
            this.baseSubtotalInvoiced = baseSubtotalInvoiced;
            return this;
        }

        public Builder setBaseSubtotalRefunded(final java.math.BigDecimal baseSubtotalRefunded) {
            this.baseSubtotalRefunded = baseSubtotalRefunded;
            return this;
        }

        public Builder setBaseTaxAmount(final java.math.BigDecimal baseTaxAmount) {
            this.baseTaxAmount = baseTaxAmount;
            return this;
        }

        public Builder setBaseTaxCanceled(final java.math.BigDecimal baseTaxCanceled) {
            this.baseTaxCanceled = baseTaxCanceled;
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

        public Builder setBaseToGlobalRate(final java.math.BigDecimal baseToGlobalRate) {
            this.baseToGlobalRate = baseToGlobalRate;
            return this;
        }

        public Builder setBaseToOrderRate(final java.math.BigDecimal baseToOrderRate) {
            this.baseToOrderRate = baseToOrderRate;
            return this;
        }

        public Builder setBaseTotalCanceled(final java.math.BigDecimal baseTotalCanceled) {
            this.baseTotalCanceled = baseTotalCanceled;
            return this;
        }

        public Builder setBaseTotalDue(final java.math.BigDecimal baseTotalDue) {
            this.baseTotalDue = baseTotalDue;
            return this;
        }

        public Builder setBaseTotalInvoiced(final java.math.BigDecimal baseTotalInvoiced) {
            this.baseTotalInvoiced = baseTotalInvoiced;
            return this;
        }

        public Builder setBaseTotalInvoicedCost(final java.math.BigDecimal baseTotalInvoicedCost) {
            this.baseTotalInvoicedCost = baseTotalInvoicedCost;
            return this;
        }

        public Builder setBaseTotalOfflineRefunded(final java.math.BigDecimal baseTotalOfflineRefunded) {
            this.baseTotalOfflineRefunded = baseTotalOfflineRefunded;
            return this;
        }

        public Builder setBaseTotalOnlineRefunded(final java.math.BigDecimal baseTotalOnlineRefunded) {
            this.baseTotalOnlineRefunded = baseTotalOnlineRefunded;
            return this;
        }

        public Builder setBaseTotalPaid(final java.math.BigDecimal baseTotalPaid) {
            this.baseTotalPaid = baseTotalPaid;
            return this;
        }

        public Builder setBaseTotalQtyOrdered(final java.math.BigDecimal baseTotalQtyOrdered) {
            this.baseTotalQtyOrdered = baseTotalQtyOrdered;
            return this;
        }

        public Builder setBaseTotalRefunded(final java.math.BigDecimal baseTotalRefunded) {
            this.baseTotalRefunded = baseTotalRefunded;
            return this;
        }

        public Builder setBillingAddress(final com.yogento.api.models.sales.order.magento.MagentoOrderAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        public Builder setBillingAddressId(final Integer billingAddressId) {
            this.billingAddressId = billingAddressId;
            return this;
        }

        public Builder setCanShipPartially(final Boolean canShipPartially) {
            this.canShipPartially = canShipPartially;
            return this;
        }

        public Builder setCanShipPartiallyItem(final Boolean canShipPartiallyItem) {
            this.canShipPartiallyItem = canShipPartiallyItem;
            return this;
        }

        public Builder setCouponCode(final String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        public Builder setCouponRuleName(final String couponRuleName) {
            this.couponRuleName = couponRuleName;
            return this;
        }

        public Builder setCreatedAt(final org.joda.time.DateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCurrencyCode(final String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder setCurrencyRate(final String currencyRate) {
            this.currencyRate = currencyRate;
            return this;
        }

        public Builder setCustbalanceAmount(final String custbalanceAmount) {
            this.custbalanceAmount = custbalanceAmount;
            return this;
        }

        public Builder setCustomerDob(final String customerDob) {
            this.customerDob = customerDob;
            return this;
        }

        public Builder setCustomerEmail(final String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public Builder setCustomerFirstname(final String customerFirstname) {
            this.customerFirstname = customerFirstname;
            return this;
        }

        public Builder setCustomerGender(final String customerGender) {
            this.customerGender = customerGender;
            return this;
        }

        public Builder setCustomerGroupId(final Integer customerGroupId) {
            this.customerGroupId = customerGroupId;
            return this;
        }

        public Builder setCustomerId(final Integer customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setCustomerIsGuest(final Boolean customerIsGuest) {
            this.customerIsGuest = customerIsGuest;
            return this;
        }

        public Builder setCustomerLastname(final String customerLastname) {
            this.customerLastname = customerLastname;
            return this;
        }

        public Builder setCustomerMiddlename(final String customerMiddlename) {
            this.customerMiddlename = customerMiddlename;
            return this;
        }

        public Builder setCustomerNote(final String customerNote) {
            this.customerNote = customerNote;
            return this;
        }

        public Builder setCustomerNoteNotify(final Boolean customerNoteNotify) {
            this.customerNoteNotify = customerNoteNotify;
            return this;
        }

        public Builder setCustomerPrefix(final String customerPrefix) {
            this.customerPrefix = customerPrefix;
            return this;
        }

        public Builder setCustomerSuffix(final String customerSuffix) {
            this.customerSuffix = customerSuffix;
            return this;
        }

        public Builder setCustomerTaxvat(final String customerTaxvat) {
            this.customerTaxvat = customerTaxvat;
            return this;
        }

        public Builder setDiscountAmount(final java.math.BigDecimal discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        public Builder setDiscountCanceled(final java.math.BigDecimal discountCanceled) {
            this.discountCanceled = discountCanceled;
            return this;
        }

        public Builder setDiscountDescription(final java.math.BigDecimal discountDescription) {
            this.discountDescription = discountDescription;
            return this;
        }

        public Builder setDiscountInvoiced(final java.math.BigDecimal discountInvoiced) {
            this.discountInvoiced = discountInvoiced;
            return this;
        }

        public Builder setDiscountRefunded(final java.math.BigDecimal discountRefunded) {
            this.discountRefunded = discountRefunded;
            return this;
        }

        public Builder setEditIncrement(final String editIncrement) {
            this.editIncrement = editIncrement;
            return this;
        }

        public Builder setEmailSent(final Boolean emailSent) {
            this.emailSent = emailSent;
            return this;
        }

        public Builder setForcedDoShipmentWithInvoice(final Boolean forcedDoShipmentWithInvoice) {
            this.forcedDoShipmentWithInvoice = forcedDoShipmentWithInvoice;
            return this;
        }

        public Builder setForcedShipmentWithInvoice(final Boolean forcedShipmentWithInvoice) {
            this.forcedShipmentWithInvoice = forcedShipmentWithInvoice;
            return this;
        }

        public Builder setGiftMessageId(final Integer giftMessageId) {
            this.giftMessageId = giftMessageId;
            return this;
        }

        public Builder setGlobalCurrencyCode(final String globalCurrencyCode) {
            this.globalCurrencyCode = globalCurrencyCode;
            return this;
        }

        public Builder setGrandTotal(final java.math.BigDecimal grandTotal) {
            this.grandTotal = grandTotal;
            return this;
        }

        public Builder setHiddenTaxAmount(final java.math.BigDecimal hiddenTaxAmount) {
            this.hiddenTaxAmount = hiddenTaxAmount;
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

        public Builder setIncrementId(final String incrementId) {
            this.incrementId = incrementId;
            return this;
        }

        public Builder setIsHold(final Boolean isHold) {
            this.isHold = isHold;
            return this;
        }

        public Builder setIsMultiPayment(final Boolean isMultiPayment) {
            this.isMultiPayment = isMultiPayment;
            return this;
        }

        public Builder setIsVirtual(final boolean isVirtual) {
            this.isVirtual = isVirtual;
            return this;
        }

        public Builder setItems(final com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> items) {
            this.items = items;
            return this;
        }

        public Builder setOrderCurrencyCode(final String orderCurrencyCode) {
            this.orderCurrencyCode = orderCurrencyCode;
            return this;
        }

        public Builder setOrderId(final Integer orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setOriginalIncrementId(final String originalIncrementId) {
            this.originalIncrementId = originalIncrementId;
            return this;
        }

        public Builder setQuoteId(final Integer quoteId) {
            this.quoteId = quoteId;
            return this;
        }

        public Builder setRelationChildId(final Integer relationChildId) {
            this.relationChildId = relationChildId;
            return this;
        }

        public Builder setRelationChildRealId(final Integer relationChildRealId) {
            this.relationChildRealId = relationChildRealId;
            return this;
        }

        public Builder setRelationParentId(final Integer relationParentId) {
            this.relationParentId = relationParentId;
            return this;
        }

        public Builder setRelationParentRealId(final Integer relationParentRealId) {
            this.relationParentRealId = relationParentRealId;
            return this;
        }

        public Builder setRemoteIp(final String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }

        public Builder setShippingAddress(final com.yogento.api.models.sales.order.magento.MagentoOrderAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setShippingAddressId(final Integer shippingAddressId) {
            this.shippingAddressId = shippingAddressId;
            return this;
        }

        public Builder setShippingAmount(final java.math.BigDecimal shippingAmount) {
            this.shippingAmount = shippingAmount;
            return this;
        }

        public Builder setShippingCanceled(final java.math.BigDecimal shippingCanceled) {
            this.shippingCanceled = shippingCanceled;
            return this;
        }

        public Builder setShippingDescription(final String shippingDescription) {
            this.shippingDescription = shippingDescription;
            return this;
        }

        public Builder setShippingDiscountAmount(final java.math.BigDecimal shippingDiscountAmount) {
            this.shippingDiscountAmount = shippingDiscountAmount;
            return this;
        }

        public Builder setShippingHiddenTaxAmount(final java.math.BigDecimal shippingHiddenTaxAmount) {
            this.shippingHiddenTaxAmount = shippingHiddenTaxAmount;
            return this;
        }

        public Builder setShippingInclTax(final java.math.BigDecimal shippingInclTax) {
            this.shippingInclTax = shippingInclTax;
            return this;
        }

        public Builder setShippingInvoiced(final java.math.BigDecimal shippingInvoiced) {
            this.shippingInvoiced = shippingInvoiced;
            return this;
        }

        public Builder setShippingMethod(final String shippingMethod) {
            this.shippingMethod = shippingMethod;
            return this;
        }

        public Builder setShippingRefunded(final java.math.BigDecimal shippingRefunded) {
            this.shippingRefunded = shippingRefunded;
            return this;
        }

        public Builder setShippingTaxAmount(final java.math.BigDecimal shippingTaxAmount) {
            this.shippingTaxAmount = shippingTaxAmount;
            return this;
        }

        public Builder setShippingTaxRefunded(final java.math.BigDecimal shippingTaxRefunded) {
            this.shippingTaxRefunded = shippingTaxRefunded;
            return this;
        }

        public Builder setState(final String state) {
            this.state = state;
            return this;
        }

        public Builder setStatus(final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status) {
            this.status = status;
            return this;
        }

        public Builder setStatusHistory(final com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> statusHistory) {
            this.statusHistory = statusHistory;
            return this;
        }

        public Builder setStoreCurrencyCode(final String storeCurrencyCode) {
            this.storeCurrencyCode = storeCurrencyCode;
            return this;
        }

        public Builder setStoreId(final Integer storeId) {
            this.storeId = storeId;
            return this;
        }

        public Builder setStoreName(final String storeName) {
            this.storeName = storeName;
            return this;
        }

        public Builder setStoreToBaseRate(final java.math.BigDecimal storeToBaseRate) {
            this.storeToBaseRate = storeToBaseRate;
            return this;
        }

        public Builder setStoreToOrderRate(final java.math.BigDecimal storeToOrderRate) {
            this.storeToOrderRate = storeToOrderRate;
            return this;
        }

        public Builder setSubtotal(final java.math.BigDecimal subtotal) {
            this.subtotal = subtotal;
            return this;
        }

        public Builder setSubtotalCanceled(final java.math.BigDecimal subtotalCanceled) {
            this.subtotalCanceled = subtotalCanceled;
            return this;
        }

        public Builder setSubtotalInclTax(final java.math.BigDecimal subtotalInclTax) {
            this.subtotalInclTax = subtotalInclTax;
            return this;
        }

        public Builder setSubtotalInvoiced(final java.math.BigDecimal subtotalInvoiced) {
            this.subtotalInvoiced = subtotalInvoiced;
            return this;
        }

        public Builder setSubtotalRefunded(final java.math.BigDecimal subtotalRefunded) {
            this.subtotalRefunded = subtotalRefunded;
            return this;
        }

        public Builder setTaxAmount(final java.math.BigDecimal taxAmount) {
            this.taxAmount = taxAmount;
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

        public Builder setTotalCanceled(final java.math.BigDecimal totalCanceled) {
            this.totalCanceled = totalCanceled;
            return this;
        }

        public Builder setTotalDue(final java.math.BigDecimal totalDue) {
            this.totalDue = totalDue;
            return this;
        }

        public Builder setTotalInvoiced(final java.math.BigDecimal totalInvoiced) {
            this.totalInvoiced = totalInvoiced;
            return this;
        }

        public Builder setTotalItemCount(final java.math.BigDecimal totalItemCount) {
            this.totalItemCount = totalItemCount;
            return this;
        }

        public Builder setTotalOfflineRefunded(final java.math.BigDecimal totalOfflineRefunded) {
            this.totalOfflineRefunded = totalOfflineRefunded;
            return this;
        }

        public Builder setTotalOnlineRefunded(final java.math.BigDecimal totalOnlineRefunded) {
            this.totalOnlineRefunded = totalOnlineRefunded;
            return this;
        }

        public Builder setTotalPaid(final java.math.BigDecimal totalPaid) {
            this.totalPaid = totalPaid;
            return this;
        }

        public Builder setTotalQtyOrdered(final java.math.BigDecimal totalQtyOrdered) {
            this.totalQtyOrdered = totalQtyOrdered;
            return this;
        }

        public Builder setTotalRefunded(final java.math.BigDecimal totalRefunded) {
            this.totalRefunded = totalRefunded;
            return this;
        }

        public Builder setTrackingNumbers(final com.google.common.collect.ImmutableList<String> trackingNumbers) {
            this.trackingNumbers = trackingNumbers;
            return this;
        }

        public Builder setUpdatedAt(final org.joda.time.DateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setWeight(final java.math.BigDecimal weight) {
            this.weight = weight;
            return this;
        }

        public Builder setXForwardedFor(final String xForwardedFor) {
            this.xForwardedFor = xForwardedFor;
            return this;
        }

        private java.math.BigDecimal adjustmentNegative;
        private java.math.BigDecimal adjustmentPositive;
        private java.math.BigDecimal baseAdjustmentNegative;
        private java.math.BigDecimal baseAdjustmentPositive;
        private String baseCurrencyCode;
        private java.math.BigDecimal baseCustbalanceAmount;
        private java.math.BigDecimal baseDiscountAmount;
        private java.math.BigDecimal baseDiscountCanceled;
        private java.math.BigDecimal baseDiscountInvoiced;
        private java.math.BigDecimal baseDiscountRefunded;
        private java.math.BigDecimal baseGrandTotal;
        private java.math.BigDecimal baseHiddenTaxAmount;
        private java.math.BigDecimal baseHiddenTaxInvoiced;
        private java.math.BigDecimal baseHiddenTaxRefunded;
        private java.math.BigDecimal baseShippingAmount;
        private java.math.BigDecimal baseShippingCanceled;
        private java.math.BigDecimal baseShippingDiscountAmount;
        private java.math.BigDecimal baseShippingHiddenTaxAmnt;
        private java.math.BigDecimal baseShippingHiddenTaxAmount;
        private java.math.BigDecimal baseShippingInclTax;
        private java.math.BigDecimal baseShippingInvoiced;
        private java.math.BigDecimal baseShippingRefunded;
        private java.math.BigDecimal baseShippingTaxAmount;
        private java.math.BigDecimal baseShippingTaxRefunded;
        private java.math.BigDecimal baseSubtotal;
        private java.math.BigDecimal baseSubtotalCanceled;
        private java.math.BigDecimal baseSubtotalInclTax;
        private java.math.BigDecimal baseSubtotalInvoiced;
        private java.math.BigDecimal baseSubtotalRefunded;
        private java.math.BigDecimal baseTaxAmount;
        private java.math.BigDecimal baseTaxCanceled;
        private java.math.BigDecimal baseTaxInvoiced;
        private java.math.BigDecimal baseTaxRefunded;
        private java.math.BigDecimal baseToGlobalRate;
        private java.math.BigDecimal baseToOrderRate;
        private java.math.BigDecimal baseTotalCanceled;
        private java.math.BigDecimal baseTotalDue;
        private java.math.BigDecimal baseTotalInvoiced;
        private java.math.BigDecimal baseTotalInvoicedCost;
        private java.math.BigDecimal baseTotalOfflineRefunded;
        private java.math.BigDecimal baseTotalOnlineRefunded;
        private java.math.BigDecimal baseTotalPaid;
        private java.math.BigDecimal baseTotalQtyOrdered;
        private java.math.BigDecimal baseTotalRefunded;
        private com.yogento.api.models.sales.order.magento.MagentoOrderAddress billingAddress;
        private Integer billingAddressId;
        private Boolean canShipPartially;
        private Boolean canShipPartiallyItem;
        private String couponCode;
        private String couponRuleName;
        private org.joda.time.DateTime createdAt;
        private String currencyCode;
        private String currencyRate;
        private String custbalanceAmount;
        private String customerDob;
        private String customerEmail;
        private String customerFirstname;
        private String customerGender;
        private Integer customerGroupId;
        private Integer customerId;
        private Boolean customerIsGuest;
        private String customerLastname;
        private String customerMiddlename;
        private String customerNote;
        private Boolean customerNoteNotify;
        private String customerPrefix;
        private String customerSuffix;
        private String customerTaxvat;
        private java.math.BigDecimal discountAmount;
        private java.math.BigDecimal discountCanceled;
        private java.math.BigDecimal discountDescription;
        private java.math.BigDecimal discountInvoiced;
        private java.math.BigDecimal discountRefunded;
        private String editIncrement;
        private Boolean emailSent;
        private Boolean forcedDoShipmentWithInvoice;
        private Boolean forcedShipmentWithInvoice;
        private Integer giftMessageId;
        private String globalCurrencyCode;
        private java.math.BigDecimal grandTotal;
        private java.math.BigDecimal hiddenTaxAmount;
        private java.math.BigDecimal hiddenTaxInvoiced;
        private java.math.BigDecimal hiddenTaxRefunded;
        private String incrementId;
        private Boolean isHold;
        private Boolean isMultiPayment;
        private Boolean isVirtual;
        private com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> items;
        private String orderCurrencyCode;
        private Integer orderId;
        private String originalIncrementId;
        private Integer quoteId;
        private Integer relationChildId;
        private Integer relationChildRealId;
        private Integer relationParentId;
        private Integer relationParentRealId;
        private String remoteIp;
        private com.yogento.api.models.sales.order.magento.MagentoOrderAddress shippingAddress;
        private Integer shippingAddressId;
        private java.math.BigDecimal shippingAmount;
        private java.math.BigDecimal shippingCanceled;
        private String shippingDescription;
        private java.math.BigDecimal shippingDiscountAmount;
        private java.math.BigDecimal shippingHiddenTaxAmount;
        private java.math.BigDecimal shippingInclTax;
        private java.math.BigDecimal shippingInvoiced;
        private String shippingMethod;
        private java.math.BigDecimal shippingRefunded;
        private java.math.BigDecimal shippingTaxAmount;
        private java.math.BigDecimal shippingTaxRefunded;
        private String state;
        private com.yogento.api.models.sales.order.magento.MagentoOrderStatus status;
        private com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> statusHistory;
        private String storeCurrencyCode;
        private Integer storeId;
        private String storeName;
        private java.math.BigDecimal storeToBaseRate;
        private java.math.BigDecimal storeToOrderRate;
        private java.math.BigDecimal subtotal;
        private java.math.BigDecimal subtotalCanceled;
        private java.math.BigDecimal subtotalInclTax;
        private java.math.BigDecimal subtotalInvoiced;
        private java.math.BigDecimal subtotalRefunded;
        private java.math.BigDecimal taxAmount;
        private java.math.BigDecimal taxCanceled;
        private java.math.BigDecimal taxInvoiced;
        private java.math.BigDecimal taxPercent;
        private java.math.BigDecimal taxRefunded;
        private java.math.BigDecimal totalCanceled;
        private java.math.BigDecimal totalDue;
        private java.math.BigDecimal totalInvoiced;
        private java.math.BigDecimal totalItemCount;
        private java.math.BigDecimal totalOfflineRefunded;
        private java.math.BigDecimal totalOnlineRefunded;
        private java.math.BigDecimal totalPaid;
        private java.math.BigDecimal totalQtyOrdered;
        private java.math.BigDecimal totalRefunded;
        private com.google.common.collect.ImmutableList<String> trackingNumbers;
        private org.joda.time.DateTime updatedAt;
        private java.math.BigDecimal weight;
        private String xForwardedFor;
    }

    public MagentoOrder(final MagentoOrder other) {
        this(other.getAdjustmentNegative(), other.getAdjustmentPositive(), other.getBaseAdjustmentNegative(), other.getBaseAdjustmentPositive(), other.getBaseCurrencyCode(), other.getBaseCustbalanceAmount(), other.getBaseDiscountAmount(), other.getBaseDiscountCanceled(), other.getBaseDiscountInvoiced(), other.getBaseDiscountRefunded(), other.getBaseGrandTotal(), other.getBaseHiddenTaxAmount(), other.getBaseHiddenTaxInvoiced(), other.getBaseHiddenTaxRefunded(), other.getBaseShippingAmount(), other.getBaseShippingCanceled(), other.getBaseShippingDiscountAmount(), other.getBaseShippingHiddenTaxAmnt(), other.getBaseShippingHiddenTaxAmount(), other.getBaseShippingInclTax(), other.getBaseShippingInvoiced(), other.getBaseShippingRefunded(), other.getBaseShippingTaxAmount(), other.getBaseShippingTaxRefunded(), other.getBaseSubtotal(), other.getBaseSubtotalCanceled(), other.getBaseSubtotalInclTax(), other.getBaseSubtotalInvoiced(), other.getBaseSubtotalRefunded(), other.getBaseTaxAmount(), other.getBaseTaxCanceled(), other.getBaseTaxInvoiced(), other.getBaseTaxRefunded(), other.getBaseToGlobalRate(), other.getBaseToOrderRate(), other.getBaseTotalCanceled(), other.getBaseTotalDue(), other.getBaseTotalInvoiced(), other.getBaseTotalInvoicedCost(), other.getBaseTotalOfflineRefunded(), other.getBaseTotalOnlineRefunded(), other.getBaseTotalPaid(), other.getBaseTotalQtyOrdered(), other.getBaseTotalRefunded(), other.getBillingAddress(), other.getBillingAddressId(), other.isCanShipPartially(), other.isCanShipPartiallyItem(), other.getCouponCode(), other.getCouponRuleName(), other.getCreatedAt(), other.getCurrencyCode(), other.getCurrencyRate(), other.getCustbalanceAmount(), other.getCustomerDob(), other.getCustomerEmail(), other.getCustomerFirstname(), other.getCustomerGender(), other.getCustomerGroupId(), other.getCustomerId(), other.isCustomerIsGuest(), other.getCustomerLastname(), other.getCustomerMiddlename(), other.getCustomerNote(), other.isCustomerNoteNotify(), other.getCustomerPrefix(), other.getCustomerSuffix(), other.getCustomerTaxvat(), other.getDiscountAmount(), other.getDiscountCanceled(), other.getDiscountDescription(), other.getDiscountInvoiced(), other.getDiscountRefunded(), other.getEditIncrement(), other.isEmailSent(), other.isForcedDoShipmentWithInvoice(), other.isForcedShipmentWithInvoice(), other.getGiftMessageId(), other.getGlobalCurrencyCode(), other.getGrandTotal(), other.getHiddenTaxAmount(), other.getHiddenTaxInvoiced(), other.getHiddenTaxRefunded(), other.getIncrementId(), other.isHold(), other.isMultiPayment(), other.isVirtual(), other.getItems(), other.getOrderCurrencyCode(), other.getOrderId(), other.getOriginalIncrementId(), other.getQuoteId(), other.getRelationChildId(), other.getRelationChildRealId(), other.getRelationParentId(), other.getRelationParentRealId(), other.getRemoteIp(), other.getShippingAddress(), other.getShippingAddressId(), other.getShippingAmount(), other.getShippingCanceled(), other.getShippingDescription(), other.getShippingDiscountAmount(), other.getShippingHiddenTaxAmount(), other.getShippingInclTax(), other.getShippingInvoiced(), other.getShippingMethod(), other.getShippingRefunded(), other.getShippingTaxAmount(), other.getShippingTaxRefunded(), other.getState(), other.getStatus(), other.getStatusHistory(), other.getStoreCurrencyCode(), other.getStoreId(), other.getStoreName(), other.getStoreToBaseRate(), other.getStoreToOrderRate(), other.getSubtotal(), other.getSubtotalCanceled(), other.getSubtotalInclTax(), other.getSubtotalInvoiced(), other.getSubtotalRefunded(), other.getTaxAmount(), other.getTaxCanceled(), other.getTaxInvoiced(), other.getTaxPercent(), other.getTaxRefunded(), other.getTotalCanceled(), other.getTotalDue(), other.getTotalInvoiced(), other.getTotalItemCount(), other.getTotalOfflineRefunded(), other.getTotalOnlineRefunded(), other.getTotalPaid(), other.getTotalQtyOrdered(), other.getTotalRefunded(), other.getTrackingNumbers(), other.getUpdatedAt(), other.getWeight(), other.getXForwardedFor());
    }

    public MagentoOrder(final org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
        this(iprot, org.apache.thrift.protocol.TType.STRUCT);
    }

    public MagentoOrder(final org.apache.thrift.protocol.TProtocol iprot, final byte readAsTType) throws org.apache.thrift.TException {
        java.math.BigDecimal adjustmentNegative = null;
        java.math.BigDecimal adjustmentPositive = null;
        java.math.BigDecimal baseAdjustmentNegative = null;
        java.math.BigDecimal baseAdjustmentPositive = null;
        String baseCurrencyCode = null;
        java.math.BigDecimal baseCustbalanceAmount = null;
        java.math.BigDecimal baseDiscountAmount = null;
        java.math.BigDecimal baseDiscountCanceled = null;
        java.math.BigDecimal baseDiscountInvoiced = null;
        java.math.BigDecimal baseDiscountRefunded = null;
        java.math.BigDecimal baseGrandTotal = null;
        java.math.BigDecimal baseHiddenTaxAmount = null;
        java.math.BigDecimal baseHiddenTaxInvoiced = null;
        java.math.BigDecimal baseHiddenTaxRefunded = null;
        java.math.BigDecimal baseShippingAmount = null;
        java.math.BigDecimal baseShippingCanceled = null;
        java.math.BigDecimal baseShippingDiscountAmount = null;
        java.math.BigDecimal baseShippingHiddenTaxAmnt = null;
        java.math.BigDecimal baseShippingHiddenTaxAmount = null;
        java.math.BigDecimal baseShippingInclTax = null;
        java.math.BigDecimal baseShippingInvoiced = null;
        java.math.BigDecimal baseShippingRefunded = null;
        java.math.BigDecimal baseShippingTaxAmount = null;
        java.math.BigDecimal baseShippingTaxRefunded = null;
        java.math.BigDecimal baseSubtotal = null;
        java.math.BigDecimal baseSubtotalCanceled = null;
        java.math.BigDecimal baseSubtotalInclTax = null;
        java.math.BigDecimal baseSubtotalInvoiced = null;
        java.math.BigDecimal baseSubtotalRefunded = null;
        java.math.BigDecimal baseTaxAmount = null;
        java.math.BigDecimal baseTaxCanceled = null;
        java.math.BigDecimal baseTaxInvoiced = null;
        java.math.BigDecimal baseTaxRefunded = null;
        java.math.BigDecimal baseToGlobalRate = null;
        java.math.BigDecimal baseToOrderRate = null;
        java.math.BigDecimal baseTotalCanceled = null;
        java.math.BigDecimal baseTotalDue = null;
        java.math.BigDecimal baseTotalInvoiced = null;
        java.math.BigDecimal baseTotalInvoicedCost = null;
        java.math.BigDecimal baseTotalOfflineRefunded = null;
        java.math.BigDecimal baseTotalOnlineRefunded = null;
        java.math.BigDecimal baseTotalPaid = null;
        java.math.BigDecimal baseTotalQtyOrdered = null;
        java.math.BigDecimal baseTotalRefunded = null;
        com.yogento.api.models.sales.order.magento.MagentoOrderAddress billingAddress = null;
        Integer billingAddressId = null;
        Boolean canShipPartially = null;
        Boolean canShipPartiallyItem = null;
        String couponCode = null;
        String couponRuleName = null;
        org.joda.time.DateTime createdAt = null;
        String currencyCode = null;
        String currencyRate = null;
        String custbalanceAmount = null;
        String customerDob = null;
        String customerEmail = null;
        String customerFirstname = null;
        String customerGender = null;
        Integer customerGroupId = null;
        Integer customerId = null;
        Boolean customerIsGuest = null;
        String customerLastname = null;
        String customerMiddlename = null;
        String customerNote = null;
        Boolean customerNoteNotify = null;
        String customerPrefix = null;
        String customerSuffix = null;
        String customerTaxvat = null;
        java.math.BigDecimal discountAmount = null;
        java.math.BigDecimal discountCanceled = null;
        java.math.BigDecimal discountDescription = null;
        java.math.BigDecimal discountInvoiced = null;
        java.math.BigDecimal discountRefunded = null;
        String editIncrement = null;
        Boolean emailSent = null;
        Boolean forcedDoShipmentWithInvoice = null;
        Boolean forcedShipmentWithInvoice = null;
        Integer giftMessageId = null;
        String globalCurrencyCode = null;
        java.math.BigDecimal grandTotal = null;
        java.math.BigDecimal hiddenTaxAmount = null;
        java.math.BigDecimal hiddenTaxInvoiced = null;
        java.math.BigDecimal hiddenTaxRefunded = null;
        String incrementId = null;
        Boolean isHold = null;
        Boolean isMultiPayment = null;
        boolean isVirtual = false;
        com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> items = null;
        String orderCurrencyCode = null;
        Integer orderId = null;
        String originalIncrementId = null;
        Integer quoteId = null;
        Integer relationChildId = null;
        Integer relationChildRealId = null;
        Integer relationParentId = null;
        Integer relationParentRealId = null;
        String remoteIp = null;
        com.yogento.api.models.sales.order.magento.MagentoOrderAddress shippingAddress = null;
        Integer shippingAddressId = null;
        java.math.BigDecimal shippingAmount = null;
        java.math.BigDecimal shippingCanceled = null;
        String shippingDescription = null;
        java.math.BigDecimal shippingDiscountAmount = null;
        java.math.BigDecimal shippingHiddenTaxAmount = null;
        java.math.BigDecimal shippingInclTax = null;
        java.math.BigDecimal shippingInvoiced = null;
        String shippingMethod = null;
        java.math.BigDecimal shippingRefunded = null;
        java.math.BigDecimal shippingTaxAmount = null;
        java.math.BigDecimal shippingTaxRefunded = null;
        String state = null;
        com.yogento.api.models.sales.order.magento.MagentoOrderStatus status = null;
        com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> statusHistory = null;
        String storeCurrencyCode = null;
        Integer storeId = null;
        String storeName = null;
        java.math.BigDecimal storeToBaseRate = null;
        java.math.BigDecimal storeToOrderRate = null;
        java.math.BigDecimal subtotal = null;
        java.math.BigDecimal subtotalCanceled = null;
        java.math.BigDecimal subtotalInclTax = null;
        java.math.BigDecimal subtotalInvoiced = null;
        java.math.BigDecimal subtotalRefunded = null;
        java.math.BigDecimal taxAmount = null;
        java.math.BigDecimal taxCanceled = null;
        java.math.BigDecimal taxInvoiced = null;
        java.math.BigDecimal taxPercent = null;
        java.math.BigDecimal taxRefunded = null;
        java.math.BigDecimal totalCanceled = null;
        java.math.BigDecimal totalDue = null;
        java.math.BigDecimal totalInvoiced = null;
        java.math.BigDecimal totalItemCount = null;
        java.math.BigDecimal totalOfflineRefunded = null;
        java.math.BigDecimal totalOnlineRefunded = null;
        java.math.BigDecimal totalPaid = null;
        java.math.BigDecimal totalQtyOrdered = null;
        java.math.BigDecimal totalRefunded = null;
        com.google.common.collect.ImmutableList<String> trackingNumbers = null;
        org.joda.time.DateTime updatedAt = null;
        java.math.BigDecimal weight = null;
        String xForwardedFor = null;

        switch (readAsTType) {
            case org.apache.thrift.protocol.TType.LIST:
                iprot.readListBegin();
                try {
                    adjustmentNegative = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    adjustmentPositive = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseAdjustmentNegative = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseAdjustmentPositive = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                baseCurrencyCode = iprot.readString();
                try {
                    baseCustbalanceAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseDiscountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseDiscountCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                    baseGrandTotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                    baseShippingAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseShippingCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseShippingDiscountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseShippingHiddenTaxAmnt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseShippingHiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseShippingInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseShippingInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseShippingRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseShippingTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseShippingTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseSubtotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseSubtotalCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseSubtotalInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseSubtotalInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseSubtotalRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTaxCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                    baseToGlobalRate = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseToOrderRate = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTotalCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTotalDue = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTotalInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTotalInvoicedCost = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTotalOfflineRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTotalOnlineRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTotalPaid = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTotalQtyOrdered = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    baseTotalRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                billingAddress = new com.yogento.api.models.sales.order.magento.MagentoOrderAddress(iprot);
                try {
                    billingAddressId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                canShipPartially = iprot.readBool();
                canShipPartiallyItem = iprot.readBool();
                couponCode = iprot.readString();
                couponRuleName = iprot.readString();
                createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                currencyCode = iprot.readString();
                currencyRate = iprot.readString();
                custbalanceAmount = iprot.readString();
                customerDob = iprot.readString();
                customerEmail = iprot.readString();
                customerFirstname = iprot.readString();
                customerGender = iprot.readString();
                try {
                    customerGroupId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    customerId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                customerIsGuest = iprot.readBool();
                customerLastname = iprot.readString();
                customerMiddlename = iprot.readString();
                customerNote = iprot.readString();
                customerNoteNotify = iprot.readBool();
                customerPrefix = iprot.readString();
                customerSuffix = iprot.readString();
                customerTaxvat = iprot.readString();
                try {
                    discountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    discountCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    discountDescription = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    discountInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    discountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                editIncrement = iprot.readString();
                emailSent = iprot.readBool();
                forcedDoShipmentWithInvoice = iprot.readBool();
                forcedShipmentWithInvoice = iprot.readBool();
                try {
                    giftMessageId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                globalCurrencyCode = iprot.readString();
                grandTotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                try {
                    hiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                incrementId = iprot.readString();
                isHold = iprot.readBool();
                isMultiPayment = iprot.readBool();
                isVirtual = iprot.readBool();
                items = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem>>() {
                    @Override
                    public com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> apply(org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                            java.util.Set<com.yogento.api.models.sales.order.magento.MagentoOrderItem> sequence = new java.util.LinkedHashSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.sales.order.magento.MagentoOrderItem(iprot));
                            }
                            iprot.readSetEnd();
                            return com.google.common.collect.ImmutableSet.copyOf(sequence);
                        } catch (org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableSet.of();
                        }
                    }
                }).apply(iprot);
                orderCurrencyCode = iprot.readString();
                try {
                    orderId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                originalIncrementId = iprot.readString();
                try {
                    quoteId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    relationChildId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    relationChildRealId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    relationParentId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    relationParentRealId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                remoteIp = iprot.readString();
                shippingAddress = new com.yogento.api.models.sales.order.magento.MagentoOrderAddress(iprot);
                try {
                    shippingAddressId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                try {
                    shippingAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    shippingCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                shippingDescription = iprot.readString();
                try {
                    shippingDiscountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    shippingHiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    shippingInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    shippingInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                shippingMethod = iprot.readString();
                try {
                    shippingRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    shippingTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    shippingTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                state = iprot.readString();
                try {
                    status = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.sales.order.magento.MagentoOrderStatus.class) : com.yogento.api.models.sales.order.magento.MagentoOrderStatus.valueOf(iprot.readString().trim().toUpperCase());
                } catch (IllegalArgumentException e) {
                }
                statusHistory = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> apply(org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                            java.util.List<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> sequence = new java.util.ArrayList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(new com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory(iprot));
                            }
                            iprot.readListEnd();
                            return com.google.common.collect.ImmutableList.copyOf(sequence);
                        } catch (org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableList.of();
                        }
                    }
                }).apply(iprot);
                storeCurrencyCode = iprot.readString();
                try {
                    storeId = iprot.readI32();
                } catch (NumberFormatException e) {
                }
                storeName = iprot.readString();
                try {
                    storeToBaseRate = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    storeToOrderRate = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    subtotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    subtotalCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    subtotalInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    subtotalInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    subtotalRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    taxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                try {
                    totalCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    totalDue = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    totalInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    totalItemCount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    totalOfflineRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    totalOnlineRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    totalPaid = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    totalQtyOrdered = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                try {
                    totalRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                trackingNumbers = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                    @Override
                    public com.google.common.collect.ImmutableList<String> apply(org.apache.thrift.protocol.TProtocol iprot) {
                        try {
                            org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                            java.util.List<String> sequence = new java.util.ArrayList<String>();
                            for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                sequence.add(iprot.readString());
                            }
                            iprot.readListEnd();
                            return com.google.common.collect.ImmutableList.copyOf(sequence);
                        } catch (org.apache.thrift.TException e) {
                            return com.google.common.collect.ImmutableList.of();
                        }
                    }
                }).apply(iprot);
                updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                try {
                    weight = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                } catch (NumberFormatException e) {
                }
                xForwardedFor = iprot.readString();
                iprot.readListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                iprot.readStructBegin();
                while (true) {
                    org.apache.thrift.protocol.TField ifield = iprot.readFieldBegin();
                    if (ifield.type == org.apache.thrift.protocol.TType.STOP) {
                        break;
                    } else                 if (ifield.name.equals("adjustment_negative")) {
                        try {
                            adjustmentNegative = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("adjustment_positive")) {
                        try {
                            adjustmentPositive = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_adjustment_negative")) {
                        try {
                            baseAdjustmentNegative = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_adjustment_positive")) {
                        try {
                            baseAdjustmentPositive = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_currency_code")) {
                        baseCurrencyCode = iprot.readString();
                    } else if (ifield.name.equals("base_custbalance_amount")) {
                        try {
                            baseCustbalanceAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_discount_amount")) {
                        try {
                            baseDiscountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_discount_canceled")) {
                        try {
                            baseDiscountCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                    } else if (ifield.name.equals("base_grand_total")) {
                        try {
                            baseGrandTotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                    } else if (ifield.name.equals("base_shipping_amount")) {
                        try {
                            baseShippingAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_shipping_canceled")) {
                        try {
                            baseShippingCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_shipping_discount_amount")) {
                        try {
                            baseShippingDiscountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_shipping_hidden_tax_amnt")) {
                        try {
                            baseShippingHiddenTaxAmnt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_shipping_hidden_tax_amount")) {
                        try {
                            baseShippingHiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_shipping_incl_tax")) {
                        try {
                            baseShippingInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_shipping_invoiced")) {
                        try {
                            baseShippingInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_shipping_refunded")) {
                        try {
                            baseShippingRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_shipping_tax_amount")) {
                        try {
                            baseShippingTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_shipping_tax_refunded")) {
                        try {
                            baseShippingTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_subtotal")) {
                        try {
                            baseSubtotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_subtotal_canceled")) {
                        try {
                            baseSubtotalCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_subtotal_incl_tax")) {
                        try {
                            baseSubtotalInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_subtotal_invoiced")) {
                        try {
                            baseSubtotalInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_subtotal_refunded")) {
                        try {
                            baseSubtotalRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_tax_amount")) {
                        try {
                            baseTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_tax_canceled")) {
                        try {
                            baseTaxCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                    } else if (ifield.name.equals("base_to_global_rate")) {
                        try {
                            baseToGlobalRate = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_to_order_rate")) {
                        try {
                            baseToOrderRate = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_total_canceled")) {
                        try {
                            baseTotalCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_total_due")) {
                        try {
                            baseTotalDue = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_total_invoiced")) {
                        try {
                            baseTotalInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_total_invoiced_cost")) {
                        try {
                            baseTotalInvoicedCost = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_total_offline_refunded")) {
                        try {
                            baseTotalOfflineRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_total_online_refunded")) {
                        try {
                            baseTotalOnlineRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_total_paid")) {
                        try {
                            baseTotalPaid = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_total_qty_ordered")) {
                        try {
                            baseTotalQtyOrdered = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("base_total_refunded")) {
                        try {
                            baseTotalRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("billing_address")) {
                        billingAddress = new com.yogento.api.models.sales.order.magento.MagentoOrderAddress(iprot);
                    } else if (ifield.name.equals("billing_address_id")) {
                        try {
                            billingAddressId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("can_ship_partially")) {
                        canShipPartially = iprot.readBool();
                    } else if (ifield.name.equals("can_ship_partially_item")) {
                        canShipPartiallyItem = iprot.readBool();
                    } else if (ifield.name.equals("coupon_code")) {
                        couponCode = iprot.readString();
                    } else if (ifield.name.equals("coupon_rule_name")) {
                        couponRuleName = iprot.readString();
                    } else if (ifield.name.equals("created_at")) {
                        createdAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("currency_code")) {
                        currencyCode = iprot.readString();
                    } else if (ifield.name.equals("currency_rate")) {
                        currencyRate = iprot.readString();
                    } else if (ifield.name.equals("custbalance_amount")) {
                        custbalanceAmount = iprot.readString();
                    } else if (ifield.name.equals("customer_dob")) {
                        customerDob = iprot.readString();
                    } else if (ifield.name.equals("customer_email")) {
                        customerEmail = iprot.readString();
                    } else if (ifield.name.equals("customer_firstname")) {
                        customerFirstname = iprot.readString();
                    } else if (ifield.name.equals("customer_gender")) {
                        customerGender = iprot.readString();
                    } else if (ifield.name.equals("customer_group_id")) {
                        try {
                            customerGroupId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("customer_id")) {
                        try {
                            customerId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("customer_is_guest")) {
                        customerIsGuest = iprot.readBool();
                    } else if (ifield.name.equals("customer_lastname")) {
                        customerLastname = iprot.readString();
                    } else if (ifield.name.equals("customer_middlename")) {
                        customerMiddlename = iprot.readString();
                    } else if (ifield.name.equals("customer_note")) {
                        customerNote = iprot.readString();
                    } else if (ifield.name.equals("customer_note_notify")) {
                        customerNoteNotify = iprot.readBool();
                    } else if (ifield.name.equals("customer_prefix")) {
                        customerPrefix = iprot.readString();
                    } else if (ifield.name.equals("customer_suffix")) {
                        customerSuffix = iprot.readString();
                    } else if (ifield.name.equals("customer_taxvat")) {
                        customerTaxvat = iprot.readString();
                    } else if (ifield.name.equals("discount_amount")) {
                        try {
                            discountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("discount_canceled")) {
                        try {
                            discountCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("discount_description")) {
                        try {
                            discountDescription = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("discount_invoiced")) {
                        try {
                            discountInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("discount_refunded")) {
                        try {
                            discountRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("edit_increment")) {
                        editIncrement = iprot.readString();
                    } else if (ifield.name.equals("email_sent")) {
                        emailSent = iprot.readBool();
                    } else if (ifield.name.equals("forced_do_shipment_with_invoice")) {
                        forcedDoShipmentWithInvoice = iprot.readBool();
                    } else if (ifield.name.equals("forced_shipment_with_invoice")) {
                        forcedShipmentWithInvoice = iprot.readBool();
                    } else if (ifield.name.equals("gift_message_id")) {
                        try {
                            giftMessageId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("global_currency_code")) {
                        globalCurrencyCode = iprot.readString();
                    } else if (ifield.name.equals("grand_total")) {
                        grandTotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                    } else if (ifield.name.equals("hidden_tax_amount")) {
                        try {
                            hiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                    } else if (ifield.name.equals("increment_id")) {
                        incrementId = iprot.readString();
                    } else if (ifield.name.equals("is_hold")) {
                        isHold = iprot.readBool();
                    } else if (ifield.name.equals("is_multi_payment")) {
                        isMultiPayment = iprot.readBool();
                    } else if (ifield.name.equals("is_virtual")) {
                        isVirtual = iprot.readBool();
                    } else if (ifield.name.equals("items")) {
                        items = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem>>() {
                            @Override
                            public com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> apply(org.apache.thrift.protocol.TProtocol iprot) {
                                try {
                                    org.apache.thrift.protocol.TSet sequenceBegin = iprot.readSetBegin();
                                    java.util.Set<com.yogento.api.models.sales.order.magento.MagentoOrderItem> sequence = new java.util.LinkedHashSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.sales.order.magento.MagentoOrderItem(iprot));
                                    }
                                    iprot.readSetEnd();
                                    return com.google.common.collect.ImmutableSet.copyOf(sequence);
                                } catch (org.apache.thrift.TException e) {
                                    return com.google.common.collect.ImmutableSet.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("order_currency_code")) {
                        orderCurrencyCode = iprot.readString();
                    } else if (ifield.name.equals("order_id")) {
                        try {
                            orderId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("original_increment_id")) {
                        originalIncrementId = iprot.readString();
                    } else if (ifield.name.equals("quote_id")) {
                        try {
                            quoteId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("relation_child_id")) {
                        try {
                            relationChildId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("relation_child_real_id")) {
                        try {
                            relationChildRealId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("relation_parent_id")) {
                        try {
                            relationParentId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("relation_parent_real_id")) {
                        try {
                            relationParentRealId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("remote_ip")) {
                        remoteIp = iprot.readString();
                    } else if (ifield.name.equals("shipping_address")) {
                        shippingAddress = new com.yogento.api.models.sales.order.magento.MagentoOrderAddress(iprot);
                    } else if (ifield.name.equals("shipping_address_id")) {
                        try {
                            shippingAddressId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_amount")) {
                        try {
                            shippingAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_canceled")) {
                        try {
                            shippingCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_description")) {
                        shippingDescription = iprot.readString();
                    } else if (ifield.name.equals("shipping_discount_amount")) {
                        try {
                            shippingDiscountAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_hidden_tax_amount")) {
                        try {
                            shippingHiddenTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_incl_tax")) {
                        try {
                            shippingInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_invoiced")) {
                        try {
                            shippingInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_method")) {
                        shippingMethod = iprot.readString();
                    } else if (ifield.name.equals("shipping_refunded")) {
                        try {
                            shippingRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_tax_amount")) {
                        try {
                            shippingTaxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("shipping_tax_refunded")) {
                        try {
                            shippingTaxRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("state")) {
                        state = iprot.readString();
                    } else if (ifield.name.equals("status")) {
                        try {
                            status = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readEnum(com.yogento.api.models.sales.order.magento.MagentoOrderStatus.class) : com.yogento.api.models.sales.order.magento.MagentoOrderStatus.valueOf(iprot.readString().trim().toUpperCase());
                        } catch (IllegalArgumentException e) {
                        }
                    } else if (ifield.name.equals("status_history")) {
                        statusHistory = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> apply(org.apache.thrift.protocol.TProtocol iprot) {
                                try {
                                    org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                                    java.util.List<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> sequence = new java.util.ArrayList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(new com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory(iprot));
                                    }
                                    iprot.readListEnd();
                                    return com.google.common.collect.ImmutableList.copyOf(sequence);
                                } catch (org.apache.thrift.TException e) {
                                    return com.google.common.collect.ImmutableList.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("store_currency_code")) {
                        storeCurrencyCode = iprot.readString();
                    } else if (ifield.name.equals("store_id")) {
                        try {
                            storeId = iprot.readI32();
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("store_name")) {
                        storeName = iprot.readString();
                    } else if (ifield.name.equals("store_to_base_rate")) {
                        try {
                            storeToBaseRate = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("store_to_order_rate")) {
                        try {
                            storeToOrderRate = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("subtotal")) {
                        try {
                            subtotal = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("subtotal_canceled")) {
                        try {
                            subtotalCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("subtotal_incl_tax")) {
                        try {
                            subtotalInclTax = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("subtotal_invoiced")) {
                        try {
                            subtotalInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("subtotal_refunded")) {
                        try {
                            subtotalRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("tax_amount")) {
                        try {
                            taxAmount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
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
                    } else if (ifield.name.equals("total_canceled")) {
                        try {
                            totalCanceled = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("total_due")) {
                        try {
                            totalDue = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("total_invoiced")) {
                        try {
                            totalInvoiced = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("total_item_count")) {
                        try {
                            totalItemCount = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("total_offline_refunded")) {
                        try {
                            totalOfflineRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("total_online_refunded")) {
                        try {
                            totalOnlineRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("total_paid")) {
                        try {
                            totalPaid = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("total_qty_ordered")) {
                        try {
                            totalQtyOrdered = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("total_refunded")) {
                        try {
                            totalRefunded = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("tracking_numbers")) {
                        trackingNumbers = (new com.google.common.base.Function<org.apache.thrift.protocol.TProtocol, com.google.common.collect.ImmutableList<String>>() {
                            @Override
                            public com.google.common.collect.ImmutableList<String> apply(org.apache.thrift.protocol.TProtocol iprot) {
                                try {
                                    org.apache.thrift.protocol.TList sequenceBegin = iprot.readListBegin();
                                    java.util.List<String> sequence = new java.util.ArrayList<String>();
                                    for (int elementI = 0; elementI < sequenceBegin.size; elementI++) {
                                        sequence.add(iprot.readString());
                                    }
                                    iprot.readListEnd();
                                    return com.google.common.collect.ImmutableList.copyOf(sequence);
                                } catch (org.apache.thrift.TException e) {
                                    return com.google.common.collect.ImmutableList.of();
                                }
                            }
                        }).apply(iprot);
                    } else if (ifield.name.equals("updated_at")) {
                        updatedAt = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDateTime() : new org.joda.time.DateTime(iprot.readI64());
                    } else if (ifield.name.equals("weight")) {
                        try {
                            weight = (iprot instanceof org.thryft.protocol.Protocol) ? ((org.thryft.protocol.Protocol)iprot).readDecimal() : new java.math.BigDecimal(iprot.readString());
                        } catch (NumberFormatException e) {
                        }
                    } else if (ifield.name.equals("x_forwarded_for")) {
                        xForwardedFor = iprot.readString();
                    }
                    iprot.readFieldEnd();
                }
                iprot.readStructEnd();
                break;
        }

        this.adjustmentNegative = adjustmentNegative;
        this.adjustmentPositive = adjustmentPositive;
        this.baseAdjustmentNegative = baseAdjustmentNegative;
        this.baseAdjustmentPositive = baseAdjustmentPositive;
        this.baseCurrencyCode = baseCurrencyCode;
        this.baseCustbalanceAmount = baseCustbalanceAmount;
        this.baseDiscountAmount = baseDiscountAmount;
        this.baseDiscountCanceled = baseDiscountCanceled;
        this.baseDiscountInvoiced = baseDiscountInvoiced;
        this.baseDiscountRefunded = baseDiscountRefunded;
        this.baseGrandTotal = baseGrandTotal;
        this.baseHiddenTaxAmount = baseHiddenTaxAmount;
        this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
        this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
        this.baseShippingAmount = baseShippingAmount;
        this.baseShippingCanceled = baseShippingCanceled;
        this.baseShippingDiscountAmount = baseShippingDiscountAmount;
        this.baseShippingHiddenTaxAmnt = baseShippingHiddenTaxAmnt;
        this.baseShippingHiddenTaxAmount = baseShippingHiddenTaxAmount;
        this.baseShippingInclTax = baseShippingInclTax;
        this.baseShippingInvoiced = baseShippingInvoiced;
        this.baseShippingRefunded = baseShippingRefunded;
        this.baseShippingTaxAmount = baseShippingTaxAmount;
        this.baseShippingTaxRefunded = baseShippingTaxRefunded;
        this.baseSubtotal = baseSubtotal;
        this.baseSubtotalCanceled = baseSubtotalCanceled;
        this.baseSubtotalInclTax = baseSubtotalInclTax;
        this.baseSubtotalInvoiced = baseSubtotalInvoiced;
        this.baseSubtotalRefunded = baseSubtotalRefunded;
        this.baseTaxAmount = baseTaxAmount;
        this.baseTaxCanceled = baseTaxCanceled;
        this.baseTaxInvoiced = baseTaxInvoiced;
        this.baseTaxRefunded = baseTaxRefunded;
        this.baseToGlobalRate = baseToGlobalRate;
        this.baseToOrderRate = baseToOrderRate;
        this.baseTotalCanceled = baseTotalCanceled;
        this.baseTotalDue = baseTotalDue;
        this.baseTotalInvoiced = baseTotalInvoiced;
        this.baseTotalInvoicedCost = baseTotalInvoicedCost;
        this.baseTotalOfflineRefunded = baseTotalOfflineRefunded;
        this.baseTotalOnlineRefunded = baseTotalOnlineRefunded;
        this.baseTotalPaid = baseTotalPaid;
        this.baseTotalQtyOrdered = baseTotalQtyOrdered;
        this.baseTotalRefunded = baseTotalRefunded;
        this.billingAddress = billingAddress;
        this.billingAddressId = billingAddressId;
        this.canShipPartially = canShipPartially;
        this.canShipPartiallyItem = canShipPartiallyItem;
        this.couponCode = couponCode;
        this.couponRuleName = couponRuleName;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.currencyCode = currencyCode;
        this.currencyRate = currencyRate;
        this.custbalanceAmount = custbalanceAmount;
        this.customerDob = customerDob;
        this.customerEmail = customerEmail;
        this.customerFirstname = customerFirstname;
        this.customerGender = customerGender;
        this.customerGroupId = customerGroupId;
        this.customerId = customerId;
        this.customerIsGuest = customerIsGuest;
        this.customerLastname = customerLastname;
        this.customerMiddlename = customerMiddlename;
        this.customerNote = customerNote;
        this.customerNoteNotify = customerNoteNotify;
        this.customerPrefix = customerPrefix;
        this.customerSuffix = customerSuffix;
        this.customerTaxvat = customerTaxvat;
        this.discountAmount = discountAmount;
        this.discountCanceled = discountCanceled;
        this.discountDescription = discountDescription;
        this.discountInvoiced = discountInvoiced;
        this.discountRefunded = discountRefunded;
        this.editIncrement = editIncrement;
        this.emailSent = emailSent;
        this.forcedDoShipmentWithInvoice = forcedDoShipmentWithInvoice;
        this.forcedShipmentWithInvoice = forcedShipmentWithInvoice;
        this.giftMessageId = giftMessageId;
        this.globalCurrencyCode = globalCurrencyCode;
        this.grandTotal = com.google.common.base.Preconditions.checkNotNull(grandTotal);
        this.hiddenTaxAmount = hiddenTaxAmount;
        this.hiddenTaxInvoiced = hiddenTaxInvoiced;
        this.hiddenTaxRefunded = hiddenTaxRefunded;
        this.incrementId = com.google.common.base.Preconditions.checkNotNull(incrementId);
        this.isHold = isHold;
        this.isMultiPayment = isMultiPayment;
        this.isVirtual = isVirtual;
        this.items = items;
        this.orderCurrencyCode = com.google.common.base.Preconditions.checkNotNull(orderCurrencyCode);
        this.orderId = orderId;
        this.originalIncrementId = originalIncrementId;
        this.quoteId = quoteId;
        this.relationChildId = relationChildId;
        this.relationChildRealId = relationChildRealId;
        this.relationParentId = relationParentId;
        this.relationParentRealId = relationParentRealId;
        this.remoteIp = remoteIp;
        this.shippingAddress = shippingAddress;
        this.shippingAddressId = shippingAddressId;
        this.shippingAmount = shippingAmount;
        this.shippingCanceled = shippingCanceled;
        this.shippingDescription = shippingDescription;
        this.shippingDiscountAmount = shippingDiscountAmount;
        this.shippingHiddenTaxAmount = shippingHiddenTaxAmount;
        this.shippingInclTax = shippingInclTax;
        this.shippingInvoiced = shippingInvoiced;
        this.shippingMethod = shippingMethod;
        this.shippingRefunded = shippingRefunded;
        this.shippingTaxAmount = shippingTaxAmount;
        this.shippingTaxRefunded = shippingTaxRefunded;
        this.state = state;
        this.status = status;
        this.statusHistory = statusHistory;
        this.storeCurrencyCode = storeCurrencyCode;
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeToBaseRate = storeToBaseRate;
        this.storeToOrderRate = storeToOrderRate;
        this.subtotal = subtotal;
        this.subtotalCanceled = subtotalCanceled;
        this.subtotalInclTax = subtotalInclTax;
        this.subtotalInvoiced = subtotalInvoiced;
        this.subtotalRefunded = subtotalRefunded;
        this.taxAmount = taxAmount;
        this.taxCanceled = taxCanceled;
        this.taxInvoiced = taxInvoiced;
        this.taxPercent = taxPercent;
        this.taxRefunded = taxRefunded;
        this.totalCanceled = totalCanceled;
        this.totalDue = totalDue;
        this.totalInvoiced = totalInvoiced;
        this.totalItemCount = totalItemCount;
        this.totalOfflineRefunded = totalOfflineRefunded;
        this.totalOnlineRefunded = totalOnlineRefunded;
        this.totalPaid = totalPaid;
        this.totalQtyOrdered = totalQtyOrdered;
        this.totalRefunded = totalRefunded;
        this.trackingNumbers = trackingNumbers;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.weight = weight;
        this.xForwardedFor = xForwardedFor;
    }

    public MagentoOrder(final org.joda.time.DateTime createdAt, final java.math.BigDecimal grandTotal, final String incrementId, final boolean isVirtual, final String orderCurrencyCode, final org.joda.time.DateTime updatedAt) {
        this.adjustmentNegative = null;
        this.adjustmentPositive = null;
        this.baseAdjustmentNegative = null;
        this.baseAdjustmentPositive = null;
        this.baseCurrencyCode = null;
        this.baseCustbalanceAmount = null;
        this.baseDiscountAmount = null;
        this.baseDiscountCanceled = null;
        this.baseDiscountInvoiced = null;
        this.baseDiscountRefunded = null;
        this.baseGrandTotal = null;
        this.baseHiddenTaxAmount = null;
        this.baseHiddenTaxInvoiced = null;
        this.baseHiddenTaxRefunded = null;
        this.baseShippingAmount = null;
        this.baseShippingCanceled = null;
        this.baseShippingDiscountAmount = null;
        this.baseShippingHiddenTaxAmnt = null;
        this.baseShippingHiddenTaxAmount = null;
        this.baseShippingInclTax = null;
        this.baseShippingInvoiced = null;
        this.baseShippingRefunded = null;
        this.baseShippingTaxAmount = null;
        this.baseShippingTaxRefunded = null;
        this.baseSubtotal = null;
        this.baseSubtotalCanceled = null;
        this.baseSubtotalInclTax = null;
        this.baseSubtotalInvoiced = null;
        this.baseSubtotalRefunded = null;
        this.baseTaxAmount = null;
        this.baseTaxCanceled = null;
        this.baseTaxInvoiced = null;
        this.baseTaxRefunded = null;
        this.baseToGlobalRate = null;
        this.baseToOrderRate = null;
        this.baseTotalCanceled = null;
        this.baseTotalDue = null;
        this.baseTotalInvoiced = null;
        this.baseTotalInvoicedCost = null;
        this.baseTotalOfflineRefunded = null;
        this.baseTotalOnlineRefunded = null;
        this.baseTotalPaid = null;
        this.baseTotalQtyOrdered = null;
        this.baseTotalRefunded = null;
        this.billingAddress = null;
        this.billingAddressId = null;
        this.canShipPartially = null;
        this.canShipPartiallyItem = null;
        this.couponCode = null;
        this.couponRuleName = null;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.currencyCode = null;
        this.currencyRate = null;
        this.custbalanceAmount = null;
        this.customerDob = null;
        this.customerEmail = null;
        this.customerFirstname = null;
        this.customerGender = null;
        this.customerGroupId = null;
        this.customerId = null;
        this.customerIsGuest = null;
        this.customerLastname = null;
        this.customerMiddlename = null;
        this.customerNote = null;
        this.customerNoteNotify = null;
        this.customerPrefix = null;
        this.customerSuffix = null;
        this.customerTaxvat = null;
        this.discountAmount = null;
        this.discountCanceled = null;
        this.discountDescription = null;
        this.discountInvoiced = null;
        this.discountRefunded = null;
        this.editIncrement = null;
        this.emailSent = null;
        this.forcedDoShipmentWithInvoice = null;
        this.forcedShipmentWithInvoice = null;
        this.giftMessageId = null;
        this.globalCurrencyCode = null;
        this.grandTotal = com.google.common.base.Preconditions.checkNotNull(grandTotal);
        this.hiddenTaxAmount = null;
        this.hiddenTaxInvoiced = null;
        this.hiddenTaxRefunded = null;
        this.incrementId = com.google.common.base.Preconditions.checkNotNull(incrementId);
        this.isHold = null;
        this.isMultiPayment = null;
        this.isVirtual = isVirtual;
        this.items = null;
        this.orderCurrencyCode = com.google.common.base.Preconditions.checkNotNull(orderCurrencyCode);
        this.orderId = null;
        this.originalIncrementId = null;
        this.quoteId = null;
        this.relationChildId = null;
        this.relationChildRealId = null;
        this.relationParentId = null;
        this.relationParentRealId = null;
        this.remoteIp = null;
        this.shippingAddress = null;
        this.shippingAddressId = null;
        this.shippingAmount = null;
        this.shippingCanceled = null;
        this.shippingDescription = null;
        this.shippingDiscountAmount = null;
        this.shippingHiddenTaxAmount = null;
        this.shippingInclTax = null;
        this.shippingInvoiced = null;
        this.shippingMethod = null;
        this.shippingRefunded = null;
        this.shippingTaxAmount = null;
        this.shippingTaxRefunded = null;
        this.state = null;
        this.status = null;
        this.statusHistory = null;
        this.storeCurrencyCode = null;
        this.storeId = null;
        this.storeName = null;
        this.storeToBaseRate = null;
        this.storeToOrderRate = null;
        this.subtotal = null;
        this.subtotalCanceled = null;
        this.subtotalInclTax = null;
        this.subtotalInvoiced = null;
        this.subtotalRefunded = null;
        this.taxAmount = null;
        this.taxCanceled = null;
        this.taxInvoiced = null;
        this.taxPercent = null;
        this.taxRefunded = null;
        this.totalCanceled = null;
        this.totalDue = null;
        this.totalInvoiced = null;
        this.totalItemCount = null;
        this.totalOfflineRefunded = null;
        this.totalOnlineRefunded = null;
        this.totalPaid = null;
        this.totalQtyOrdered = null;
        this.totalRefunded = null;
        this.trackingNumbers = null;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.weight = null;
        this.xForwardedFor = null;
    }

    public MagentoOrder(final java.math.BigDecimal adjustmentNegative, final java.math.BigDecimal adjustmentPositive, final java.math.BigDecimal baseAdjustmentNegative, final java.math.BigDecimal baseAdjustmentPositive, final String baseCurrencyCode, final java.math.BigDecimal baseCustbalanceAmount, final java.math.BigDecimal baseDiscountAmount, final java.math.BigDecimal baseDiscountCanceled, final java.math.BigDecimal baseDiscountInvoiced, final java.math.BigDecimal baseDiscountRefunded, final java.math.BigDecimal baseGrandTotal, final java.math.BigDecimal baseHiddenTaxAmount, final java.math.BigDecimal baseHiddenTaxInvoiced, final java.math.BigDecimal baseHiddenTaxRefunded, final java.math.BigDecimal baseShippingAmount, final java.math.BigDecimal baseShippingCanceled, final java.math.BigDecimal baseShippingDiscountAmount, final java.math.BigDecimal baseShippingHiddenTaxAmnt, final java.math.BigDecimal baseShippingHiddenTaxAmount, final java.math.BigDecimal baseShippingInclTax, final java.math.BigDecimal baseShippingInvoiced, final java.math.BigDecimal baseShippingRefunded, final java.math.BigDecimal baseShippingTaxAmount, final java.math.BigDecimal baseShippingTaxRefunded, final java.math.BigDecimal baseSubtotal, final java.math.BigDecimal baseSubtotalCanceled, final java.math.BigDecimal baseSubtotalInclTax, final java.math.BigDecimal baseSubtotalInvoiced, final java.math.BigDecimal baseSubtotalRefunded, final java.math.BigDecimal baseTaxAmount, final java.math.BigDecimal baseTaxCanceled, final java.math.BigDecimal baseTaxInvoiced, final java.math.BigDecimal baseTaxRefunded, final java.math.BigDecimal baseToGlobalRate, final java.math.BigDecimal baseToOrderRate, final java.math.BigDecimal baseTotalCanceled, final java.math.BigDecimal baseTotalDue, final java.math.BigDecimal baseTotalInvoiced, final java.math.BigDecimal baseTotalInvoicedCost, final java.math.BigDecimal baseTotalOfflineRefunded, final java.math.BigDecimal baseTotalOnlineRefunded, final java.math.BigDecimal baseTotalPaid, final java.math.BigDecimal baseTotalQtyOrdered, final java.math.BigDecimal baseTotalRefunded, final com.yogento.api.models.sales.order.magento.MagentoOrderAddress billingAddress, final Integer billingAddressId, final Boolean canShipPartially, final Boolean canShipPartiallyItem, final String couponCode, final String couponRuleName, final org.joda.time.DateTime createdAt, final String currencyCode, final String currencyRate, final String custbalanceAmount, final String customerDob, final String customerEmail, final String customerFirstname, final String customerGender, final Integer customerGroupId, final Integer customerId, final Boolean customerIsGuest, final String customerLastname, final String customerMiddlename, final String customerNote, final Boolean customerNoteNotify, final String customerPrefix, final String customerSuffix, final String customerTaxvat, final java.math.BigDecimal discountAmount, final java.math.BigDecimal discountCanceled, final java.math.BigDecimal discountDescription, final java.math.BigDecimal discountInvoiced, final java.math.BigDecimal discountRefunded, final String editIncrement, final Boolean emailSent, final Boolean forcedDoShipmentWithInvoice, final Boolean forcedShipmentWithInvoice, final Integer giftMessageId, final String globalCurrencyCode, final java.math.BigDecimal grandTotal, final java.math.BigDecimal hiddenTaxAmount, final java.math.BigDecimal hiddenTaxInvoiced, final java.math.BigDecimal hiddenTaxRefunded, final String incrementId, final Boolean isHold, final Boolean isMultiPayment, final boolean isVirtual, final com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> items, final String orderCurrencyCode, final Integer orderId, final String originalIncrementId, final Integer quoteId, final Integer relationChildId, final Integer relationChildRealId, final Integer relationParentId, final Integer relationParentRealId, final String remoteIp, final com.yogento.api.models.sales.order.magento.MagentoOrderAddress shippingAddress, final Integer shippingAddressId, final java.math.BigDecimal shippingAmount, final java.math.BigDecimal shippingCanceled, final String shippingDescription, final java.math.BigDecimal shippingDiscountAmount, final java.math.BigDecimal shippingHiddenTaxAmount, final java.math.BigDecimal shippingInclTax, final java.math.BigDecimal shippingInvoiced, final String shippingMethod, final java.math.BigDecimal shippingRefunded, final java.math.BigDecimal shippingTaxAmount, final java.math.BigDecimal shippingTaxRefunded, final String state, final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status, final com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> statusHistory, final String storeCurrencyCode, final Integer storeId, final String storeName, final java.math.BigDecimal storeToBaseRate, final java.math.BigDecimal storeToOrderRate, final java.math.BigDecimal subtotal, final java.math.BigDecimal subtotalCanceled, final java.math.BigDecimal subtotalInclTax, final java.math.BigDecimal subtotalInvoiced, final java.math.BigDecimal subtotalRefunded, final java.math.BigDecimal taxAmount, final java.math.BigDecimal taxCanceled, final java.math.BigDecimal taxInvoiced, final java.math.BigDecimal taxPercent, final java.math.BigDecimal taxRefunded, final java.math.BigDecimal totalCanceled, final java.math.BigDecimal totalDue, final java.math.BigDecimal totalInvoiced, final java.math.BigDecimal totalItemCount, final java.math.BigDecimal totalOfflineRefunded, final java.math.BigDecimal totalOnlineRefunded, final java.math.BigDecimal totalPaid, final java.math.BigDecimal totalQtyOrdered, final java.math.BigDecimal totalRefunded, final com.google.common.collect.ImmutableList<String> trackingNumbers, final org.joda.time.DateTime updatedAt, final java.math.BigDecimal weight, final String xForwardedFor) {
        this.adjustmentNegative = adjustmentNegative;
        this.adjustmentPositive = adjustmentPositive;
        this.baseAdjustmentNegative = baseAdjustmentNegative;
        this.baseAdjustmentPositive = baseAdjustmentPositive;
        this.baseCurrencyCode = baseCurrencyCode;
        this.baseCustbalanceAmount = baseCustbalanceAmount;
        this.baseDiscountAmount = baseDiscountAmount;
        this.baseDiscountCanceled = baseDiscountCanceled;
        this.baseDiscountInvoiced = baseDiscountInvoiced;
        this.baseDiscountRefunded = baseDiscountRefunded;
        this.baseGrandTotal = baseGrandTotal;
        this.baseHiddenTaxAmount = baseHiddenTaxAmount;
        this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
        this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
        this.baseShippingAmount = baseShippingAmount;
        this.baseShippingCanceled = baseShippingCanceled;
        this.baseShippingDiscountAmount = baseShippingDiscountAmount;
        this.baseShippingHiddenTaxAmnt = baseShippingHiddenTaxAmnt;
        this.baseShippingHiddenTaxAmount = baseShippingHiddenTaxAmount;
        this.baseShippingInclTax = baseShippingInclTax;
        this.baseShippingInvoiced = baseShippingInvoiced;
        this.baseShippingRefunded = baseShippingRefunded;
        this.baseShippingTaxAmount = baseShippingTaxAmount;
        this.baseShippingTaxRefunded = baseShippingTaxRefunded;
        this.baseSubtotal = baseSubtotal;
        this.baseSubtotalCanceled = baseSubtotalCanceled;
        this.baseSubtotalInclTax = baseSubtotalInclTax;
        this.baseSubtotalInvoiced = baseSubtotalInvoiced;
        this.baseSubtotalRefunded = baseSubtotalRefunded;
        this.baseTaxAmount = baseTaxAmount;
        this.baseTaxCanceled = baseTaxCanceled;
        this.baseTaxInvoiced = baseTaxInvoiced;
        this.baseTaxRefunded = baseTaxRefunded;
        this.baseToGlobalRate = baseToGlobalRate;
        this.baseToOrderRate = baseToOrderRate;
        this.baseTotalCanceled = baseTotalCanceled;
        this.baseTotalDue = baseTotalDue;
        this.baseTotalInvoiced = baseTotalInvoiced;
        this.baseTotalInvoicedCost = baseTotalInvoicedCost;
        this.baseTotalOfflineRefunded = baseTotalOfflineRefunded;
        this.baseTotalOnlineRefunded = baseTotalOnlineRefunded;
        this.baseTotalPaid = baseTotalPaid;
        this.baseTotalQtyOrdered = baseTotalQtyOrdered;
        this.baseTotalRefunded = baseTotalRefunded;
        this.billingAddress = billingAddress;
        this.billingAddressId = billingAddressId;
        this.canShipPartially = canShipPartially;
        this.canShipPartiallyItem = canShipPartiallyItem;
        this.couponCode = couponCode;
        this.couponRuleName = couponRuleName;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.currencyCode = currencyCode;
        this.currencyRate = currencyRate;
        this.custbalanceAmount = custbalanceAmount;
        this.customerDob = customerDob;
        this.customerEmail = customerEmail;
        this.customerFirstname = customerFirstname;
        this.customerGender = customerGender;
        this.customerGroupId = customerGroupId;
        this.customerId = customerId;
        this.customerIsGuest = customerIsGuest;
        this.customerLastname = customerLastname;
        this.customerMiddlename = customerMiddlename;
        this.customerNote = customerNote;
        this.customerNoteNotify = customerNoteNotify;
        this.customerPrefix = customerPrefix;
        this.customerSuffix = customerSuffix;
        this.customerTaxvat = customerTaxvat;
        this.discountAmount = discountAmount;
        this.discountCanceled = discountCanceled;
        this.discountDescription = discountDescription;
        this.discountInvoiced = discountInvoiced;
        this.discountRefunded = discountRefunded;
        this.editIncrement = editIncrement;
        this.emailSent = emailSent;
        this.forcedDoShipmentWithInvoice = forcedDoShipmentWithInvoice;
        this.forcedShipmentWithInvoice = forcedShipmentWithInvoice;
        this.giftMessageId = giftMessageId;
        this.globalCurrencyCode = globalCurrencyCode;
        this.grandTotal = com.google.common.base.Preconditions.checkNotNull(grandTotal);
        this.hiddenTaxAmount = hiddenTaxAmount;
        this.hiddenTaxInvoiced = hiddenTaxInvoiced;
        this.hiddenTaxRefunded = hiddenTaxRefunded;
        this.incrementId = com.google.common.base.Preconditions.checkNotNull(incrementId);
        this.isHold = isHold;
        this.isMultiPayment = isMultiPayment;
        this.isVirtual = isVirtual;
        this.items = items;
        this.orderCurrencyCode = com.google.common.base.Preconditions.checkNotNull(orderCurrencyCode);
        this.orderId = orderId;
        this.originalIncrementId = originalIncrementId;
        this.quoteId = quoteId;
        this.relationChildId = relationChildId;
        this.relationChildRealId = relationChildRealId;
        this.relationParentId = relationParentId;
        this.relationParentRealId = relationParentRealId;
        this.remoteIp = remoteIp;
        this.shippingAddress = shippingAddress;
        this.shippingAddressId = shippingAddressId;
        this.shippingAmount = shippingAmount;
        this.shippingCanceled = shippingCanceled;
        this.shippingDescription = shippingDescription;
        this.shippingDiscountAmount = shippingDiscountAmount;
        this.shippingHiddenTaxAmount = shippingHiddenTaxAmount;
        this.shippingInclTax = shippingInclTax;
        this.shippingInvoiced = shippingInvoiced;
        this.shippingMethod = shippingMethod;
        this.shippingRefunded = shippingRefunded;
        this.shippingTaxAmount = shippingTaxAmount;
        this.shippingTaxRefunded = shippingTaxRefunded;
        this.state = state;
        this.status = status;
        this.statusHistory = statusHistory;
        this.storeCurrencyCode = storeCurrencyCode;
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeToBaseRate = storeToBaseRate;
        this.storeToOrderRate = storeToOrderRate;
        this.subtotal = subtotal;
        this.subtotalCanceled = subtotalCanceled;
        this.subtotalInclTax = subtotalInclTax;
        this.subtotalInvoiced = subtotalInvoiced;
        this.subtotalRefunded = subtotalRefunded;
        this.taxAmount = taxAmount;
        this.taxCanceled = taxCanceled;
        this.taxInvoiced = taxInvoiced;
        this.taxPercent = taxPercent;
        this.taxRefunded = taxRefunded;
        this.totalCanceled = totalCanceled;
        this.totalDue = totalDue;
        this.totalInvoiced = totalInvoiced;
        this.totalItemCount = totalItemCount;
        this.totalOfflineRefunded = totalOfflineRefunded;
        this.totalOnlineRefunded = totalOnlineRefunded;
        this.totalPaid = totalPaid;
        this.totalQtyOrdered = totalQtyOrdered;
        this.totalRefunded = totalRefunded;
        this.trackingNumbers = trackingNumbers;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.weight = weight;
        this.xForwardedFor = xForwardedFor;
    }

    public MagentoOrder(final java.math.BigDecimal adjustmentNegative, final java.math.BigDecimal adjustmentPositive, final java.math.BigDecimal baseAdjustmentNegative, final java.math.BigDecimal baseAdjustmentPositive, final String baseCurrencyCode, final java.math.BigDecimal baseCustbalanceAmount, final java.math.BigDecimal baseDiscountAmount, final java.math.BigDecimal baseDiscountCanceled, final java.math.BigDecimal baseDiscountInvoiced, final java.math.BigDecimal baseDiscountRefunded, final java.math.BigDecimal baseGrandTotal, final java.math.BigDecimal baseHiddenTaxAmount, final java.math.BigDecimal baseHiddenTaxInvoiced, final java.math.BigDecimal baseHiddenTaxRefunded, final java.math.BigDecimal baseShippingAmount, final java.math.BigDecimal baseShippingCanceled, final java.math.BigDecimal baseShippingDiscountAmount, final java.math.BigDecimal baseShippingHiddenTaxAmnt, final java.math.BigDecimal baseShippingHiddenTaxAmount, final java.math.BigDecimal baseShippingInclTax, final java.math.BigDecimal baseShippingInvoiced, final java.math.BigDecimal baseShippingRefunded, final java.math.BigDecimal baseShippingTaxAmount, final java.math.BigDecimal baseShippingTaxRefunded, final java.math.BigDecimal baseSubtotal, final java.math.BigDecimal baseSubtotalCanceled, final java.math.BigDecimal baseSubtotalInclTax, final java.math.BigDecimal baseSubtotalInvoiced, final java.math.BigDecimal baseSubtotalRefunded, final java.math.BigDecimal baseTaxAmount, final java.math.BigDecimal baseTaxCanceled, final java.math.BigDecimal baseTaxInvoiced, final java.math.BigDecimal baseTaxRefunded, final java.math.BigDecimal baseToGlobalRate, final java.math.BigDecimal baseToOrderRate, final java.math.BigDecimal baseTotalCanceled, final java.math.BigDecimal baseTotalDue, final java.math.BigDecimal baseTotalInvoiced, final java.math.BigDecimal baseTotalInvoicedCost, final java.math.BigDecimal baseTotalOfflineRefunded, final java.math.BigDecimal baseTotalOnlineRefunded, final java.math.BigDecimal baseTotalPaid, final java.math.BigDecimal baseTotalQtyOrdered, final java.math.BigDecimal baseTotalRefunded, final com.yogento.api.models.sales.order.magento.MagentoOrderAddress billingAddress, final Integer billingAddressId, final Boolean canShipPartially, final Boolean canShipPartiallyItem, final String couponCode, final String couponRuleName, final org.joda.time.DateTime createdAt, final String currencyCode, final String currencyRate, final String custbalanceAmount, final String customerDob, final String customerEmail, final String customerFirstname, final String customerGender, final Integer customerGroupId, final Integer customerId, final Boolean customerIsGuest, final String customerLastname, final String customerMiddlename, final String customerNote, final Boolean customerNoteNotify, final String customerPrefix, final String customerSuffix, final String customerTaxvat, final java.math.BigDecimal discountAmount, final java.math.BigDecimal discountCanceled, final java.math.BigDecimal discountDescription, final java.math.BigDecimal discountInvoiced, final java.math.BigDecimal discountRefunded, final String editIncrement, final Boolean emailSent, final Boolean forcedDoShipmentWithInvoice, final Boolean forcedShipmentWithInvoice, final Integer giftMessageId, final String globalCurrencyCode, final java.math.BigDecimal grandTotal, final java.math.BigDecimal hiddenTaxAmount, final java.math.BigDecimal hiddenTaxInvoiced, final java.math.BigDecimal hiddenTaxRefunded, final String incrementId, final Boolean isHold, final Boolean isMultiPayment, final Boolean isVirtual, final com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> items, final String orderCurrencyCode, final Integer orderId, final String originalIncrementId, final Integer quoteId, final Integer relationChildId, final Integer relationChildRealId, final Integer relationParentId, final Integer relationParentRealId, final String remoteIp, final com.yogento.api.models.sales.order.magento.MagentoOrderAddress shippingAddress, final Integer shippingAddressId, final java.math.BigDecimal shippingAmount, final java.math.BigDecimal shippingCanceled, final String shippingDescription, final java.math.BigDecimal shippingDiscountAmount, final java.math.BigDecimal shippingHiddenTaxAmount, final java.math.BigDecimal shippingInclTax, final java.math.BigDecimal shippingInvoiced, final String shippingMethod, final java.math.BigDecimal shippingRefunded, final java.math.BigDecimal shippingTaxAmount, final java.math.BigDecimal shippingTaxRefunded, final String state, final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status, final com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> statusHistory, final String storeCurrencyCode, final Integer storeId, final String storeName, final java.math.BigDecimal storeToBaseRate, final java.math.BigDecimal storeToOrderRate, final java.math.BigDecimal subtotal, final java.math.BigDecimal subtotalCanceled, final java.math.BigDecimal subtotalInclTax, final java.math.BigDecimal subtotalInvoiced, final java.math.BigDecimal subtotalRefunded, final java.math.BigDecimal taxAmount, final java.math.BigDecimal taxCanceled, final java.math.BigDecimal taxInvoiced, final java.math.BigDecimal taxPercent, final java.math.BigDecimal taxRefunded, final java.math.BigDecimal totalCanceled, final java.math.BigDecimal totalDue, final java.math.BigDecimal totalInvoiced, final java.math.BigDecimal totalItemCount, final java.math.BigDecimal totalOfflineRefunded, final java.math.BigDecimal totalOnlineRefunded, final java.math.BigDecimal totalPaid, final java.math.BigDecimal totalQtyOrdered, final java.math.BigDecimal totalRefunded, final com.google.common.collect.ImmutableList<String> trackingNumbers, final org.joda.time.DateTime updatedAt, final java.math.BigDecimal weight, final String xForwardedFor) {
        this.adjustmentNegative = adjustmentNegative;
        this.adjustmentPositive = adjustmentPositive;
        this.baseAdjustmentNegative = baseAdjustmentNegative;
        this.baseAdjustmentPositive = baseAdjustmentPositive;
        this.baseCurrencyCode = baseCurrencyCode;
        this.baseCustbalanceAmount = baseCustbalanceAmount;
        this.baseDiscountAmount = baseDiscountAmount;
        this.baseDiscountCanceled = baseDiscountCanceled;
        this.baseDiscountInvoiced = baseDiscountInvoiced;
        this.baseDiscountRefunded = baseDiscountRefunded;
        this.baseGrandTotal = baseGrandTotal;
        this.baseHiddenTaxAmount = baseHiddenTaxAmount;
        this.baseHiddenTaxInvoiced = baseHiddenTaxInvoiced;
        this.baseHiddenTaxRefunded = baseHiddenTaxRefunded;
        this.baseShippingAmount = baseShippingAmount;
        this.baseShippingCanceled = baseShippingCanceled;
        this.baseShippingDiscountAmount = baseShippingDiscountAmount;
        this.baseShippingHiddenTaxAmnt = baseShippingHiddenTaxAmnt;
        this.baseShippingHiddenTaxAmount = baseShippingHiddenTaxAmount;
        this.baseShippingInclTax = baseShippingInclTax;
        this.baseShippingInvoiced = baseShippingInvoiced;
        this.baseShippingRefunded = baseShippingRefunded;
        this.baseShippingTaxAmount = baseShippingTaxAmount;
        this.baseShippingTaxRefunded = baseShippingTaxRefunded;
        this.baseSubtotal = baseSubtotal;
        this.baseSubtotalCanceled = baseSubtotalCanceled;
        this.baseSubtotalInclTax = baseSubtotalInclTax;
        this.baseSubtotalInvoiced = baseSubtotalInvoiced;
        this.baseSubtotalRefunded = baseSubtotalRefunded;
        this.baseTaxAmount = baseTaxAmount;
        this.baseTaxCanceled = baseTaxCanceled;
        this.baseTaxInvoiced = baseTaxInvoiced;
        this.baseTaxRefunded = baseTaxRefunded;
        this.baseToGlobalRate = baseToGlobalRate;
        this.baseToOrderRate = baseToOrderRate;
        this.baseTotalCanceled = baseTotalCanceled;
        this.baseTotalDue = baseTotalDue;
        this.baseTotalInvoiced = baseTotalInvoiced;
        this.baseTotalInvoicedCost = baseTotalInvoicedCost;
        this.baseTotalOfflineRefunded = baseTotalOfflineRefunded;
        this.baseTotalOnlineRefunded = baseTotalOnlineRefunded;
        this.baseTotalPaid = baseTotalPaid;
        this.baseTotalQtyOrdered = baseTotalQtyOrdered;
        this.baseTotalRefunded = baseTotalRefunded;
        this.billingAddress = billingAddress;
        this.billingAddressId = billingAddressId;
        this.canShipPartially = canShipPartially;
        this.canShipPartiallyItem = canShipPartiallyItem;
        this.couponCode = couponCode;
        this.couponRuleName = couponRuleName;
        this.createdAt = com.google.common.base.Preconditions.checkNotNull(createdAt);
        this.currencyCode = currencyCode;
        this.currencyRate = currencyRate;
        this.custbalanceAmount = custbalanceAmount;
        this.customerDob = customerDob;
        this.customerEmail = customerEmail;
        this.customerFirstname = customerFirstname;
        this.customerGender = customerGender;
        this.customerGroupId = customerGroupId;
        this.customerId = customerId;
        this.customerIsGuest = customerIsGuest;
        this.customerLastname = customerLastname;
        this.customerMiddlename = customerMiddlename;
        this.customerNote = customerNote;
        this.customerNoteNotify = customerNoteNotify;
        this.customerPrefix = customerPrefix;
        this.customerSuffix = customerSuffix;
        this.customerTaxvat = customerTaxvat;
        this.discountAmount = discountAmount;
        this.discountCanceled = discountCanceled;
        this.discountDescription = discountDescription;
        this.discountInvoiced = discountInvoiced;
        this.discountRefunded = discountRefunded;
        this.editIncrement = editIncrement;
        this.emailSent = emailSent;
        this.forcedDoShipmentWithInvoice = forcedDoShipmentWithInvoice;
        this.forcedShipmentWithInvoice = forcedShipmentWithInvoice;
        this.giftMessageId = giftMessageId;
        this.globalCurrencyCode = globalCurrencyCode;
        this.grandTotal = com.google.common.base.Preconditions.checkNotNull(grandTotal);
        this.hiddenTaxAmount = hiddenTaxAmount;
        this.hiddenTaxInvoiced = hiddenTaxInvoiced;
        this.hiddenTaxRefunded = hiddenTaxRefunded;
        this.incrementId = com.google.common.base.Preconditions.checkNotNull(incrementId);
        this.isHold = isHold;
        this.isMultiPayment = isMultiPayment;
        this.isVirtual = isVirtual;
        this.items = items;
        this.orderCurrencyCode = com.google.common.base.Preconditions.checkNotNull(orderCurrencyCode);
        this.orderId = orderId;
        this.originalIncrementId = originalIncrementId;
        this.quoteId = quoteId;
        this.relationChildId = relationChildId;
        this.relationChildRealId = relationChildRealId;
        this.relationParentId = relationParentId;
        this.relationParentRealId = relationParentRealId;
        this.remoteIp = remoteIp;
        this.shippingAddress = shippingAddress;
        this.shippingAddressId = shippingAddressId;
        this.shippingAmount = shippingAmount;
        this.shippingCanceled = shippingCanceled;
        this.shippingDescription = shippingDescription;
        this.shippingDiscountAmount = shippingDiscountAmount;
        this.shippingHiddenTaxAmount = shippingHiddenTaxAmount;
        this.shippingInclTax = shippingInclTax;
        this.shippingInvoiced = shippingInvoiced;
        this.shippingMethod = shippingMethod;
        this.shippingRefunded = shippingRefunded;
        this.shippingTaxAmount = shippingTaxAmount;
        this.shippingTaxRefunded = shippingTaxRefunded;
        this.state = state;
        this.status = status;
        this.statusHistory = statusHistory;
        this.storeCurrencyCode = storeCurrencyCode;
        this.storeId = storeId;
        this.storeName = storeName;
        this.storeToBaseRate = storeToBaseRate;
        this.storeToOrderRate = storeToOrderRate;
        this.subtotal = subtotal;
        this.subtotalCanceled = subtotalCanceled;
        this.subtotalInclTax = subtotalInclTax;
        this.subtotalInvoiced = subtotalInvoiced;
        this.subtotalRefunded = subtotalRefunded;
        this.taxAmount = taxAmount;
        this.taxCanceled = taxCanceled;
        this.taxInvoiced = taxInvoiced;
        this.taxPercent = taxPercent;
        this.taxRefunded = taxRefunded;
        this.totalCanceled = totalCanceled;
        this.totalDue = totalDue;
        this.totalInvoiced = totalInvoiced;
        this.totalItemCount = totalItemCount;
        this.totalOfflineRefunded = totalOfflineRefunded;
        this.totalOnlineRefunded = totalOnlineRefunded;
        this.totalPaid = totalPaid;
        this.totalQtyOrdered = totalQtyOrdered;
        this.totalRefunded = totalRefunded;
        this.trackingNumbers = trackingNumbers;
        this.updatedAt = com.google.common.base.Preconditions.checkNotNull(updatedAt);
        this.weight = weight;
        this.xForwardedFor = xForwardedFor;
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int compareTo(final MagentoOrder other) {
        throw new UnsupportedOperationException();
    }

    @Override
    public org.apache.thrift.TBase<MagentoOrder, org.apache.thrift.TFieldIdEnum> deepCopy() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(final Object otherObject) {
        if (otherObject == this) {
            return true;
        } else if (!(otherObject instanceof MagentoOrder)) {
            return false;
        }

        final MagentoOrder other = (MagentoOrder)otherObject;
        return
            ((getAdjustmentNegative() == null && other.getAdjustmentNegative() == null) ||
            (getAdjustmentNegative() != null && other.getAdjustmentNegative() != null &&
            getAdjustmentNegative().equals(other.getAdjustmentNegative()))) &&
            ((getAdjustmentPositive() == null && other.getAdjustmentPositive() == null) ||
            (getAdjustmentPositive() != null && other.getAdjustmentPositive() != null &&
            getAdjustmentPositive().equals(other.getAdjustmentPositive()))) &&
            ((getBaseAdjustmentNegative() == null && other.getBaseAdjustmentNegative() == null) ||
            (getBaseAdjustmentNegative() != null && other.getBaseAdjustmentNegative() != null &&
            getBaseAdjustmentNegative().equals(other.getBaseAdjustmentNegative()))) &&
            ((getBaseAdjustmentPositive() == null && other.getBaseAdjustmentPositive() == null) ||
            (getBaseAdjustmentPositive() != null && other.getBaseAdjustmentPositive() != null &&
            getBaseAdjustmentPositive().equals(other.getBaseAdjustmentPositive()))) &&
            ((getBaseCurrencyCode() == null && other.getBaseCurrencyCode() == null) ||
            (getBaseCurrencyCode() != null && other.getBaseCurrencyCode() != null &&
            getBaseCurrencyCode().equals(other.getBaseCurrencyCode()))) &&
            ((getBaseCustbalanceAmount() == null && other.getBaseCustbalanceAmount() == null) ||
            (getBaseCustbalanceAmount() != null && other.getBaseCustbalanceAmount() != null &&
            getBaseCustbalanceAmount().equals(other.getBaseCustbalanceAmount()))) &&
            ((getBaseDiscountAmount() == null && other.getBaseDiscountAmount() == null) ||
            (getBaseDiscountAmount() != null && other.getBaseDiscountAmount() != null &&
            getBaseDiscountAmount().equals(other.getBaseDiscountAmount()))) &&
            ((getBaseDiscountCanceled() == null && other.getBaseDiscountCanceled() == null) ||
            (getBaseDiscountCanceled() != null && other.getBaseDiscountCanceled() != null &&
            getBaseDiscountCanceled().equals(other.getBaseDiscountCanceled()))) &&
            ((getBaseDiscountInvoiced() == null && other.getBaseDiscountInvoiced() == null) ||
            (getBaseDiscountInvoiced() != null && other.getBaseDiscountInvoiced() != null &&
            getBaseDiscountInvoiced().equals(other.getBaseDiscountInvoiced()))) &&
            ((getBaseDiscountRefunded() == null && other.getBaseDiscountRefunded() == null) ||
            (getBaseDiscountRefunded() != null && other.getBaseDiscountRefunded() != null &&
            getBaseDiscountRefunded().equals(other.getBaseDiscountRefunded()))) &&
            ((getBaseGrandTotal() == null && other.getBaseGrandTotal() == null) ||
            (getBaseGrandTotal() != null && other.getBaseGrandTotal() != null &&
            getBaseGrandTotal().equals(other.getBaseGrandTotal()))) &&
            ((getBaseHiddenTaxAmount() == null && other.getBaseHiddenTaxAmount() == null) ||
            (getBaseHiddenTaxAmount() != null && other.getBaseHiddenTaxAmount() != null &&
            getBaseHiddenTaxAmount().equals(other.getBaseHiddenTaxAmount()))) &&
            ((getBaseHiddenTaxInvoiced() == null && other.getBaseHiddenTaxInvoiced() == null) ||
            (getBaseHiddenTaxInvoiced() != null && other.getBaseHiddenTaxInvoiced() != null &&
            getBaseHiddenTaxInvoiced().equals(other.getBaseHiddenTaxInvoiced()))) &&
            ((getBaseHiddenTaxRefunded() == null && other.getBaseHiddenTaxRefunded() == null) ||
            (getBaseHiddenTaxRefunded() != null && other.getBaseHiddenTaxRefunded() != null &&
            getBaseHiddenTaxRefunded().equals(other.getBaseHiddenTaxRefunded()))) &&
            ((getBaseShippingAmount() == null && other.getBaseShippingAmount() == null) ||
            (getBaseShippingAmount() != null && other.getBaseShippingAmount() != null &&
            getBaseShippingAmount().equals(other.getBaseShippingAmount()))) &&
            ((getBaseShippingCanceled() == null && other.getBaseShippingCanceled() == null) ||
            (getBaseShippingCanceled() != null && other.getBaseShippingCanceled() != null &&
            getBaseShippingCanceled().equals(other.getBaseShippingCanceled()))) &&
            ((getBaseShippingDiscountAmount() == null && other.getBaseShippingDiscountAmount() == null) ||
            (getBaseShippingDiscountAmount() != null && other.getBaseShippingDiscountAmount() != null &&
            getBaseShippingDiscountAmount().equals(other.getBaseShippingDiscountAmount()))) &&
            ((getBaseShippingHiddenTaxAmnt() == null && other.getBaseShippingHiddenTaxAmnt() == null) ||
            (getBaseShippingHiddenTaxAmnt() != null && other.getBaseShippingHiddenTaxAmnt() != null &&
            getBaseShippingHiddenTaxAmnt().equals(other.getBaseShippingHiddenTaxAmnt()))) &&
            ((getBaseShippingHiddenTaxAmount() == null && other.getBaseShippingHiddenTaxAmount() == null) ||
            (getBaseShippingHiddenTaxAmount() != null && other.getBaseShippingHiddenTaxAmount() != null &&
            getBaseShippingHiddenTaxAmount().equals(other.getBaseShippingHiddenTaxAmount()))) &&
            ((getBaseShippingInclTax() == null && other.getBaseShippingInclTax() == null) ||
            (getBaseShippingInclTax() != null && other.getBaseShippingInclTax() != null &&
            getBaseShippingInclTax().equals(other.getBaseShippingInclTax()))) &&
            ((getBaseShippingInvoiced() == null && other.getBaseShippingInvoiced() == null) ||
            (getBaseShippingInvoiced() != null && other.getBaseShippingInvoiced() != null &&
            getBaseShippingInvoiced().equals(other.getBaseShippingInvoiced()))) &&
            ((getBaseShippingRefunded() == null && other.getBaseShippingRefunded() == null) ||
            (getBaseShippingRefunded() != null && other.getBaseShippingRefunded() != null &&
            getBaseShippingRefunded().equals(other.getBaseShippingRefunded()))) &&
            ((getBaseShippingTaxAmount() == null && other.getBaseShippingTaxAmount() == null) ||
            (getBaseShippingTaxAmount() != null && other.getBaseShippingTaxAmount() != null &&
            getBaseShippingTaxAmount().equals(other.getBaseShippingTaxAmount()))) &&
            ((getBaseShippingTaxRefunded() == null && other.getBaseShippingTaxRefunded() == null) ||
            (getBaseShippingTaxRefunded() != null && other.getBaseShippingTaxRefunded() != null &&
            getBaseShippingTaxRefunded().equals(other.getBaseShippingTaxRefunded()))) &&
            ((getBaseSubtotal() == null && other.getBaseSubtotal() == null) ||
            (getBaseSubtotal() != null && other.getBaseSubtotal() != null &&
            getBaseSubtotal().equals(other.getBaseSubtotal()))) &&
            ((getBaseSubtotalCanceled() == null && other.getBaseSubtotalCanceled() == null) ||
            (getBaseSubtotalCanceled() != null && other.getBaseSubtotalCanceled() != null &&
            getBaseSubtotalCanceled().equals(other.getBaseSubtotalCanceled()))) &&
            ((getBaseSubtotalInclTax() == null && other.getBaseSubtotalInclTax() == null) ||
            (getBaseSubtotalInclTax() != null && other.getBaseSubtotalInclTax() != null &&
            getBaseSubtotalInclTax().equals(other.getBaseSubtotalInclTax()))) &&
            ((getBaseSubtotalInvoiced() == null && other.getBaseSubtotalInvoiced() == null) ||
            (getBaseSubtotalInvoiced() != null && other.getBaseSubtotalInvoiced() != null &&
            getBaseSubtotalInvoiced().equals(other.getBaseSubtotalInvoiced()))) &&
            ((getBaseSubtotalRefunded() == null && other.getBaseSubtotalRefunded() == null) ||
            (getBaseSubtotalRefunded() != null && other.getBaseSubtotalRefunded() != null &&
            getBaseSubtotalRefunded().equals(other.getBaseSubtotalRefunded()))) &&
            ((getBaseTaxAmount() == null && other.getBaseTaxAmount() == null) ||
            (getBaseTaxAmount() != null && other.getBaseTaxAmount() != null &&
            getBaseTaxAmount().equals(other.getBaseTaxAmount()))) &&
            ((getBaseTaxCanceled() == null && other.getBaseTaxCanceled() == null) ||
            (getBaseTaxCanceled() != null && other.getBaseTaxCanceled() != null &&
            getBaseTaxCanceled().equals(other.getBaseTaxCanceled()))) &&
            ((getBaseTaxInvoiced() == null && other.getBaseTaxInvoiced() == null) ||
            (getBaseTaxInvoiced() != null && other.getBaseTaxInvoiced() != null &&
            getBaseTaxInvoiced().equals(other.getBaseTaxInvoiced()))) &&
            ((getBaseTaxRefunded() == null && other.getBaseTaxRefunded() == null) ||
            (getBaseTaxRefunded() != null && other.getBaseTaxRefunded() != null &&
            getBaseTaxRefunded().equals(other.getBaseTaxRefunded()))) &&
            ((getBaseToGlobalRate() == null && other.getBaseToGlobalRate() == null) ||
            (getBaseToGlobalRate() != null && other.getBaseToGlobalRate() != null &&
            getBaseToGlobalRate().equals(other.getBaseToGlobalRate()))) &&
            ((getBaseToOrderRate() == null && other.getBaseToOrderRate() == null) ||
            (getBaseToOrderRate() != null && other.getBaseToOrderRate() != null &&
            getBaseToOrderRate().equals(other.getBaseToOrderRate()))) &&
            ((getBaseTotalCanceled() == null && other.getBaseTotalCanceled() == null) ||
            (getBaseTotalCanceled() != null && other.getBaseTotalCanceled() != null &&
            getBaseTotalCanceled().equals(other.getBaseTotalCanceled()))) &&
            ((getBaseTotalDue() == null && other.getBaseTotalDue() == null) ||
            (getBaseTotalDue() != null && other.getBaseTotalDue() != null &&
            getBaseTotalDue().equals(other.getBaseTotalDue()))) &&
            ((getBaseTotalInvoiced() == null && other.getBaseTotalInvoiced() == null) ||
            (getBaseTotalInvoiced() != null && other.getBaseTotalInvoiced() != null &&
            getBaseTotalInvoiced().equals(other.getBaseTotalInvoiced()))) &&
            ((getBaseTotalInvoicedCost() == null && other.getBaseTotalInvoicedCost() == null) ||
            (getBaseTotalInvoicedCost() != null && other.getBaseTotalInvoicedCost() != null &&
            getBaseTotalInvoicedCost().equals(other.getBaseTotalInvoicedCost()))) &&
            ((getBaseTotalOfflineRefunded() == null && other.getBaseTotalOfflineRefunded() == null) ||
            (getBaseTotalOfflineRefunded() != null && other.getBaseTotalOfflineRefunded() != null &&
            getBaseTotalOfflineRefunded().equals(other.getBaseTotalOfflineRefunded()))) &&
            ((getBaseTotalOnlineRefunded() == null && other.getBaseTotalOnlineRefunded() == null) ||
            (getBaseTotalOnlineRefunded() != null && other.getBaseTotalOnlineRefunded() != null &&
            getBaseTotalOnlineRefunded().equals(other.getBaseTotalOnlineRefunded()))) &&
            ((getBaseTotalPaid() == null && other.getBaseTotalPaid() == null) ||
            (getBaseTotalPaid() != null && other.getBaseTotalPaid() != null &&
            getBaseTotalPaid().equals(other.getBaseTotalPaid()))) &&
            ((getBaseTotalQtyOrdered() == null && other.getBaseTotalQtyOrdered() == null) ||
            (getBaseTotalQtyOrdered() != null && other.getBaseTotalQtyOrdered() != null &&
            getBaseTotalQtyOrdered().equals(other.getBaseTotalQtyOrdered()))) &&
            ((getBaseTotalRefunded() == null && other.getBaseTotalRefunded() == null) ||
            (getBaseTotalRefunded() != null && other.getBaseTotalRefunded() != null &&
            getBaseTotalRefunded().equals(other.getBaseTotalRefunded()))) &&
            ((getBillingAddress() == null && other.getBillingAddress() == null) ||
            (getBillingAddress() != null && other.getBillingAddress() != null &&
            getBillingAddress().equals(other.getBillingAddress()))) &&
            ((getBillingAddressId() == null && other.getBillingAddressId() == null) ||
            (getBillingAddressId() != null && other.getBillingAddressId() != null &&
            getBillingAddressId().equals(other.getBillingAddressId()))) &&
            ((isCanShipPartially() == null && other.isCanShipPartially() == null) ||
            (isCanShipPartially() != null && other.isCanShipPartially() != null &&
            isCanShipPartially().equals(other.isCanShipPartially()))) &&
            ((isCanShipPartiallyItem() == null && other.isCanShipPartiallyItem() == null) ||
            (isCanShipPartiallyItem() != null && other.isCanShipPartiallyItem() != null &&
            isCanShipPartiallyItem().equals(other.isCanShipPartiallyItem()))) &&
            ((getCouponCode() == null && other.getCouponCode() == null) ||
            (getCouponCode() != null && other.getCouponCode() != null &&
            getCouponCode().equals(other.getCouponCode()))) &&
            ((getCouponRuleName() == null && other.getCouponRuleName() == null) ||
            (getCouponRuleName() != null && other.getCouponRuleName() != null &&
            getCouponRuleName().equals(other.getCouponRuleName()))) &&
            getCreatedAt().equals(other.getCreatedAt()) &&
            ((getCurrencyCode() == null && other.getCurrencyCode() == null) ||
            (getCurrencyCode() != null && other.getCurrencyCode() != null &&
            getCurrencyCode().equals(other.getCurrencyCode()))) &&
            ((getCurrencyRate() == null && other.getCurrencyRate() == null) ||
            (getCurrencyRate() != null && other.getCurrencyRate() != null &&
            getCurrencyRate().equals(other.getCurrencyRate()))) &&
            ((getCustbalanceAmount() == null && other.getCustbalanceAmount() == null) ||
            (getCustbalanceAmount() != null && other.getCustbalanceAmount() != null &&
            getCustbalanceAmount().equals(other.getCustbalanceAmount()))) &&
            ((getCustomerDob() == null && other.getCustomerDob() == null) ||
            (getCustomerDob() != null && other.getCustomerDob() != null &&
            getCustomerDob().equals(other.getCustomerDob()))) &&
            ((getCustomerEmail() == null && other.getCustomerEmail() == null) ||
            (getCustomerEmail() != null && other.getCustomerEmail() != null &&
            getCustomerEmail().equals(other.getCustomerEmail()))) &&
            ((getCustomerFirstname() == null && other.getCustomerFirstname() == null) ||
            (getCustomerFirstname() != null && other.getCustomerFirstname() != null &&
            getCustomerFirstname().equals(other.getCustomerFirstname()))) &&
            ((getCustomerGender() == null && other.getCustomerGender() == null) ||
            (getCustomerGender() != null && other.getCustomerGender() != null &&
            getCustomerGender().equals(other.getCustomerGender()))) &&
            ((getCustomerGroupId() == null && other.getCustomerGroupId() == null) ||
            (getCustomerGroupId() != null && other.getCustomerGroupId() != null &&
            getCustomerGroupId().equals(other.getCustomerGroupId()))) &&
            ((getCustomerId() == null && other.getCustomerId() == null) ||
            (getCustomerId() != null && other.getCustomerId() != null &&
            getCustomerId().equals(other.getCustomerId()))) &&
            ((isCustomerIsGuest() == null && other.isCustomerIsGuest() == null) ||
            (isCustomerIsGuest() != null && other.isCustomerIsGuest() != null &&
            isCustomerIsGuest().equals(other.isCustomerIsGuest()))) &&
            ((getCustomerLastname() == null && other.getCustomerLastname() == null) ||
            (getCustomerLastname() != null && other.getCustomerLastname() != null &&
            getCustomerLastname().equals(other.getCustomerLastname()))) &&
            ((getCustomerMiddlename() == null && other.getCustomerMiddlename() == null) ||
            (getCustomerMiddlename() != null && other.getCustomerMiddlename() != null &&
            getCustomerMiddlename().equals(other.getCustomerMiddlename()))) &&
            ((getCustomerNote() == null && other.getCustomerNote() == null) ||
            (getCustomerNote() != null && other.getCustomerNote() != null &&
            getCustomerNote().equals(other.getCustomerNote()))) &&
            ((isCustomerNoteNotify() == null && other.isCustomerNoteNotify() == null) ||
            (isCustomerNoteNotify() != null && other.isCustomerNoteNotify() != null &&
            isCustomerNoteNotify().equals(other.isCustomerNoteNotify()))) &&
            ((getCustomerPrefix() == null && other.getCustomerPrefix() == null) ||
            (getCustomerPrefix() != null && other.getCustomerPrefix() != null &&
            getCustomerPrefix().equals(other.getCustomerPrefix()))) &&
            ((getCustomerSuffix() == null && other.getCustomerSuffix() == null) ||
            (getCustomerSuffix() != null && other.getCustomerSuffix() != null &&
            getCustomerSuffix().equals(other.getCustomerSuffix()))) &&
            ((getCustomerTaxvat() == null && other.getCustomerTaxvat() == null) ||
            (getCustomerTaxvat() != null && other.getCustomerTaxvat() != null &&
            getCustomerTaxvat().equals(other.getCustomerTaxvat()))) &&
            ((getDiscountAmount() == null && other.getDiscountAmount() == null) ||
            (getDiscountAmount() != null && other.getDiscountAmount() != null &&
            getDiscountAmount().equals(other.getDiscountAmount()))) &&
            ((getDiscountCanceled() == null && other.getDiscountCanceled() == null) ||
            (getDiscountCanceled() != null && other.getDiscountCanceled() != null &&
            getDiscountCanceled().equals(other.getDiscountCanceled()))) &&
            ((getDiscountDescription() == null && other.getDiscountDescription() == null) ||
            (getDiscountDescription() != null && other.getDiscountDescription() != null &&
            getDiscountDescription().equals(other.getDiscountDescription()))) &&
            ((getDiscountInvoiced() == null && other.getDiscountInvoiced() == null) ||
            (getDiscountInvoiced() != null && other.getDiscountInvoiced() != null &&
            getDiscountInvoiced().equals(other.getDiscountInvoiced()))) &&
            ((getDiscountRefunded() == null && other.getDiscountRefunded() == null) ||
            (getDiscountRefunded() != null && other.getDiscountRefunded() != null &&
            getDiscountRefunded().equals(other.getDiscountRefunded()))) &&
            ((getEditIncrement() == null && other.getEditIncrement() == null) ||
            (getEditIncrement() != null && other.getEditIncrement() != null &&
            getEditIncrement().equals(other.getEditIncrement()))) &&
            ((isEmailSent() == null && other.isEmailSent() == null) ||
            (isEmailSent() != null && other.isEmailSent() != null &&
            isEmailSent().equals(other.isEmailSent()))) &&
            ((isForcedDoShipmentWithInvoice() == null && other.isForcedDoShipmentWithInvoice() == null) ||
            (isForcedDoShipmentWithInvoice() != null && other.isForcedDoShipmentWithInvoice() != null &&
            isForcedDoShipmentWithInvoice().equals(other.isForcedDoShipmentWithInvoice()))) &&
            ((isForcedShipmentWithInvoice() == null && other.isForcedShipmentWithInvoice() == null) ||
            (isForcedShipmentWithInvoice() != null && other.isForcedShipmentWithInvoice() != null &&
            isForcedShipmentWithInvoice().equals(other.isForcedShipmentWithInvoice()))) &&
            ((getGiftMessageId() == null && other.getGiftMessageId() == null) ||
            (getGiftMessageId() != null && other.getGiftMessageId() != null &&
            getGiftMessageId().equals(other.getGiftMessageId()))) &&
            ((getGlobalCurrencyCode() == null && other.getGlobalCurrencyCode() == null) ||
            (getGlobalCurrencyCode() != null && other.getGlobalCurrencyCode() != null &&
            getGlobalCurrencyCode().equals(other.getGlobalCurrencyCode()))) &&
            getGrandTotal().equals(other.getGrandTotal()) &&
            ((getHiddenTaxAmount() == null && other.getHiddenTaxAmount() == null) ||
            (getHiddenTaxAmount() != null && other.getHiddenTaxAmount() != null &&
            getHiddenTaxAmount().equals(other.getHiddenTaxAmount()))) &&
            ((getHiddenTaxInvoiced() == null && other.getHiddenTaxInvoiced() == null) ||
            (getHiddenTaxInvoiced() != null && other.getHiddenTaxInvoiced() != null &&
            getHiddenTaxInvoiced().equals(other.getHiddenTaxInvoiced()))) &&
            ((getHiddenTaxRefunded() == null && other.getHiddenTaxRefunded() == null) ||
            (getHiddenTaxRefunded() != null && other.getHiddenTaxRefunded() != null &&
            getHiddenTaxRefunded().equals(other.getHiddenTaxRefunded()))) &&
            getIncrementId().equals(other.getIncrementId()) &&
            ((isHold() == null && other.isHold() == null) ||
            (isHold() != null && other.isHold() != null &&
            isHold().equals(other.isHold()))) &&
            ((isMultiPayment() == null && other.isMultiPayment() == null) ||
            (isMultiPayment() != null && other.isMultiPayment() != null &&
            isMultiPayment().equals(other.isMultiPayment()))) &&
            isVirtual() == other.isVirtual() &&
            ((getItems() == null && other.getItems() == null) ||
            (getItems() != null && other.getItems() != null &&
            getItems().equals(other.getItems()))) &&
            getOrderCurrencyCode().equals(other.getOrderCurrencyCode()) &&
            ((getOrderId() == null && other.getOrderId() == null) ||
            (getOrderId() != null && other.getOrderId() != null &&
            getOrderId().equals(other.getOrderId()))) &&
            ((getOriginalIncrementId() == null && other.getOriginalIncrementId() == null) ||
            (getOriginalIncrementId() != null && other.getOriginalIncrementId() != null &&
            getOriginalIncrementId().equals(other.getOriginalIncrementId()))) &&
            ((getQuoteId() == null && other.getQuoteId() == null) ||
            (getQuoteId() != null && other.getQuoteId() != null &&
            getQuoteId().equals(other.getQuoteId()))) &&
            ((getRelationChildId() == null && other.getRelationChildId() == null) ||
            (getRelationChildId() != null && other.getRelationChildId() != null &&
            getRelationChildId().equals(other.getRelationChildId()))) &&
            ((getRelationChildRealId() == null && other.getRelationChildRealId() == null) ||
            (getRelationChildRealId() != null && other.getRelationChildRealId() != null &&
            getRelationChildRealId().equals(other.getRelationChildRealId()))) &&
            ((getRelationParentId() == null && other.getRelationParentId() == null) ||
            (getRelationParentId() != null && other.getRelationParentId() != null &&
            getRelationParentId().equals(other.getRelationParentId()))) &&
            ((getRelationParentRealId() == null && other.getRelationParentRealId() == null) ||
            (getRelationParentRealId() != null && other.getRelationParentRealId() != null &&
            getRelationParentRealId().equals(other.getRelationParentRealId()))) &&
            ((getRemoteIp() == null && other.getRemoteIp() == null) ||
            (getRemoteIp() != null && other.getRemoteIp() != null &&
            getRemoteIp().equals(other.getRemoteIp()))) &&
            ((getShippingAddress() == null && other.getShippingAddress() == null) ||
            (getShippingAddress() != null && other.getShippingAddress() != null &&
            getShippingAddress().equals(other.getShippingAddress()))) &&
            ((getShippingAddressId() == null && other.getShippingAddressId() == null) ||
            (getShippingAddressId() != null && other.getShippingAddressId() != null &&
            getShippingAddressId().equals(other.getShippingAddressId()))) &&
            ((getShippingAmount() == null && other.getShippingAmount() == null) ||
            (getShippingAmount() != null && other.getShippingAmount() != null &&
            getShippingAmount().equals(other.getShippingAmount()))) &&
            ((getShippingCanceled() == null && other.getShippingCanceled() == null) ||
            (getShippingCanceled() != null && other.getShippingCanceled() != null &&
            getShippingCanceled().equals(other.getShippingCanceled()))) &&
            ((getShippingDescription() == null && other.getShippingDescription() == null) ||
            (getShippingDescription() != null && other.getShippingDescription() != null &&
            getShippingDescription().equals(other.getShippingDescription()))) &&
            ((getShippingDiscountAmount() == null && other.getShippingDiscountAmount() == null) ||
            (getShippingDiscountAmount() != null && other.getShippingDiscountAmount() != null &&
            getShippingDiscountAmount().equals(other.getShippingDiscountAmount()))) &&
            ((getShippingHiddenTaxAmount() == null && other.getShippingHiddenTaxAmount() == null) ||
            (getShippingHiddenTaxAmount() != null && other.getShippingHiddenTaxAmount() != null &&
            getShippingHiddenTaxAmount().equals(other.getShippingHiddenTaxAmount()))) &&
            ((getShippingInclTax() == null && other.getShippingInclTax() == null) ||
            (getShippingInclTax() != null && other.getShippingInclTax() != null &&
            getShippingInclTax().equals(other.getShippingInclTax()))) &&
            ((getShippingInvoiced() == null && other.getShippingInvoiced() == null) ||
            (getShippingInvoiced() != null && other.getShippingInvoiced() != null &&
            getShippingInvoiced().equals(other.getShippingInvoiced()))) &&
            ((getShippingMethod() == null && other.getShippingMethod() == null) ||
            (getShippingMethod() != null && other.getShippingMethod() != null &&
            getShippingMethod().equals(other.getShippingMethod()))) &&
            ((getShippingRefunded() == null && other.getShippingRefunded() == null) ||
            (getShippingRefunded() != null && other.getShippingRefunded() != null &&
            getShippingRefunded().equals(other.getShippingRefunded()))) &&
            ((getShippingTaxAmount() == null && other.getShippingTaxAmount() == null) ||
            (getShippingTaxAmount() != null && other.getShippingTaxAmount() != null &&
            getShippingTaxAmount().equals(other.getShippingTaxAmount()))) &&
            ((getShippingTaxRefunded() == null && other.getShippingTaxRefunded() == null) ||
            (getShippingTaxRefunded() != null && other.getShippingTaxRefunded() != null &&
            getShippingTaxRefunded().equals(other.getShippingTaxRefunded()))) &&
            ((getState() == null && other.getState() == null) ||
            (getState() != null && other.getState() != null &&
            getState().equals(other.getState()))) &&
            ((getStatus() == null && other.getStatus() == null) ||
            (getStatus() != null && other.getStatus() != null &&
            getStatus().equals(other.getStatus()))) &&
            ((getStatusHistory() == null && other.getStatusHistory() == null) ||
            (getStatusHistory() != null && other.getStatusHistory() != null &&
            getStatusHistory().equals(other.getStatusHistory()))) &&
            ((getStoreCurrencyCode() == null && other.getStoreCurrencyCode() == null) ||
            (getStoreCurrencyCode() != null && other.getStoreCurrencyCode() != null &&
            getStoreCurrencyCode().equals(other.getStoreCurrencyCode()))) &&
            ((getStoreId() == null && other.getStoreId() == null) ||
            (getStoreId() != null && other.getStoreId() != null &&
            getStoreId().equals(other.getStoreId()))) &&
            ((getStoreName() == null && other.getStoreName() == null) ||
            (getStoreName() != null && other.getStoreName() != null &&
            getStoreName().equals(other.getStoreName()))) &&
            ((getStoreToBaseRate() == null && other.getStoreToBaseRate() == null) ||
            (getStoreToBaseRate() != null && other.getStoreToBaseRate() != null &&
            getStoreToBaseRate().equals(other.getStoreToBaseRate()))) &&
            ((getStoreToOrderRate() == null && other.getStoreToOrderRate() == null) ||
            (getStoreToOrderRate() != null && other.getStoreToOrderRate() != null &&
            getStoreToOrderRate().equals(other.getStoreToOrderRate()))) &&
            ((getSubtotal() == null && other.getSubtotal() == null) ||
            (getSubtotal() != null && other.getSubtotal() != null &&
            getSubtotal().equals(other.getSubtotal()))) &&
            ((getSubtotalCanceled() == null && other.getSubtotalCanceled() == null) ||
            (getSubtotalCanceled() != null && other.getSubtotalCanceled() != null &&
            getSubtotalCanceled().equals(other.getSubtotalCanceled()))) &&
            ((getSubtotalInclTax() == null && other.getSubtotalInclTax() == null) ||
            (getSubtotalInclTax() != null && other.getSubtotalInclTax() != null &&
            getSubtotalInclTax().equals(other.getSubtotalInclTax()))) &&
            ((getSubtotalInvoiced() == null && other.getSubtotalInvoiced() == null) ||
            (getSubtotalInvoiced() != null && other.getSubtotalInvoiced() != null &&
            getSubtotalInvoiced().equals(other.getSubtotalInvoiced()))) &&
            ((getSubtotalRefunded() == null && other.getSubtotalRefunded() == null) ||
            (getSubtotalRefunded() != null && other.getSubtotalRefunded() != null &&
            getSubtotalRefunded().equals(other.getSubtotalRefunded()))) &&
            ((getTaxAmount() == null && other.getTaxAmount() == null) ||
            (getTaxAmount() != null && other.getTaxAmount() != null &&
            getTaxAmount().equals(other.getTaxAmount()))) &&
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
            ((getTotalCanceled() == null && other.getTotalCanceled() == null) ||
            (getTotalCanceled() != null && other.getTotalCanceled() != null &&
            getTotalCanceled().equals(other.getTotalCanceled()))) &&
            ((getTotalDue() == null && other.getTotalDue() == null) ||
            (getTotalDue() != null && other.getTotalDue() != null &&
            getTotalDue().equals(other.getTotalDue()))) &&
            ((getTotalInvoiced() == null && other.getTotalInvoiced() == null) ||
            (getTotalInvoiced() != null && other.getTotalInvoiced() != null &&
            getTotalInvoiced().equals(other.getTotalInvoiced()))) &&
            ((getTotalItemCount() == null && other.getTotalItemCount() == null) ||
            (getTotalItemCount() != null && other.getTotalItemCount() != null &&
            getTotalItemCount().equals(other.getTotalItemCount()))) &&
            ((getTotalOfflineRefunded() == null && other.getTotalOfflineRefunded() == null) ||
            (getTotalOfflineRefunded() != null && other.getTotalOfflineRefunded() != null &&
            getTotalOfflineRefunded().equals(other.getTotalOfflineRefunded()))) &&
            ((getTotalOnlineRefunded() == null && other.getTotalOnlineRefunded() == null) ||
            (getTotalOnlineRefunded() != null && other.getTotalOnlineRefunded() != null &&
            getTotalOnlineRefunded().equals(other.getTotalOnlineRefunded()))) &&
            ((getTotalPaid() == null && other.getTotalPaid() == null) ||
            (getTotalPaid() != null && other.getTotalPaid() != null &&
            getTotalPaid().equals(other.getTotalPaid()))) &&
            ((getTotalQtyOrdered() == null && other.getTotalQtyOrdered() == null) ||
            (getTotalQtyOrdered() != null && other.getTotalQtyOrdered() != null &&
            getTotalQtyOrdered().equals(other.getTotalQtyOrdered()))) &&
            ((getTotalRefunded() == null && other.getTotalRefunded() == null) ||
            (getTotalRefunded() != null && other.getTotalRefunded() != null &&
            getTotalRefunded().equals(other.getTotalRefunded()))) &&
            ((getTrackingNumbers() == null && other.getTrackingNumbers() == null) ||
            (getTrackingNumbers() != null && other.getTrackingNumbers() != null &&
            getTrackingNumbers().equals(other.getTrackingNumbers()))) &&
            getUpdatedAt().equals(other.getUpdatedAt()) &&
            ((getWeight() == null && other.getWeight() == null) ||
            (getWeight() != null && other.getWeight() != null &&
            getWeight().equals(other.getWeight()))) &&
            ((getXForwardedFor() == null && other.getXForwardedFor() == null) ||
            (getXForwardedFor() != null && other.getXForwardedFor() != null &&
            getXForwardedFor().equals(other.getXForwardedFor())));
    }

    @Override
    public org.apache.thrift.TFieldIdEnum fieldForId(final int fieldId) {
        throw new UnsupportedOperationException();
    }

    public Object get(final String fieldName) {
        if (fieldName.equals("adjustment_negative")) {
            return getAdjustmentNegative();
        } else if (fieldName.equals("adjustment_positive")) {
            return getAdjustmentPositive();
        } else if (fieldName.equals("base_adjustment_negative")) {
            return getBaseAdjustmentNegative();
        } else if (fieldName.equals("base_adjustment_positive")) {
            return getBaseAdjustmentPositive();
        } else if (fieldName.equals("base_currency_code")) {
            return getBaseCurrencyCode();
        } else if (fieldName.equals("base_custbalance_amount")) {
            return getBaseCustbalanceAmount();
        } else if (fieldName.equals("base_discount_amount")) {
            return getBaseDiscountAmount();
        } else if (fieldName.equals("base_discount_canceled")) {
            return getBaseDiscountCanceled();
        } else if (fieldName.equals("base_discount_invoiced")) {
            return getBaseDiscountInvoiced();
        } else if (fieldName.equals("base_discount_refunded")) {
            return getBaseDiscountRefunded();
        } else if (fieldName.equals("base_grand_total")) {
            return getBaseGrandTotal();
        } else if (fieldName.equals("base_hidden_tax_amount")) {
            return getBaseHiddenTaxAmount();
        } else if (fieldName.equals("base_hidden_tax_invoiced")) {
            return getBaseHiddenTaxInvoiced();
        } else if (fieldName.equals("base_hidden_tax_refunded")) {
            return getBaseHiddenTaxRefunded();
        } else if (fieldName.equals("base_shipping_amount")) {
            return getBaseShippingAmount();
        } else if (fieldName.equals("base_shipping_canceled")) {
            return getBaseShippingCanceled();
        } else if (fieldName.equals("base_shipping_discount_amount")) {
            return getBaseShippingDiscountAmount();
        } else if (fieldName.equals("base_shipping_hidden_tax_amnt")) {
            return getBaseShippingHiddenTaxAmnt();
        } else if (fieldName.equals("base_shipping_hidden_tax_amount")) {
            return getBaseShippingHiddenTaxAmount();
        } else if (fieldName.equals("base_shipping_incl_tax")) {
            return getBaseShippingInclTax();
        } else if (fieldName.equals("base_shipping_invoiced")) {
            return getBaseShippingInvoiced();
        } else if (fieldName.equals("base_shipping_refunded")) {
            return getBaseShippingRefunded();
        } else if (fieldName.equals("base_shipping_tax_amount")) {
            return getBaseShippingTaxAmount();
        } else if (fieldName.equals("base_shipping_tax_refunded")) {
            return getBaseShippingTaxRefunded();
        } else if (fieldName.equals("base_subtotal")) {
            return getBaseSubtotal();
        } else if (fieldName.equals("base_subtotal_canceled")) {
            return getBaseSubtotalCanceled();
        } else if (fieldName.equals("base_subtotal_incl_tax")) {
            return getBaseSubtotalInclTax();
        } else if (fieldName.equals("base_subtotal_invoiced")) {
            return getBaseSubtotalInvoiced();
        } else if (fieldName.equals("base_subtotal_refunded")) {
            return getBaseSubtotalRefunded();
        } else if (fieldName.equals("base_tax_amount")) {
            return getBaseTaxAmount();
        } else if (fieldName.equals("base_tax_canceled")) {
            return getBaseTaxCanceled();
        } else if (fieldName.equals("base_tax_invoiced")) {
            return getBaseTaxInvoiced();
        } else if (fieldName.equals("base_tax_refunded")) {
            return getBaseTaxRefunded();
        } else if (fieldName.equals("base_to_global_rate")) {
            return getBaseToGlobalRate();
        } else if (fieldName.equals("base_to_order_rate")) {
            return getBaseToOrderRate();
        } else if (fieldName.equals("base_total_canceled")) {
            return getBaseTotalCanceled();
        } else if (fieldName.equals("base_total_due")) {
            return getBaseTotalDue();
        } else if (fieldName.equals("base_total_invoiced")) {
            return getBaseTotalInvoiced();
        } else if (fieldName.equals("base_total_invoiced_cost")) {
            return getBaseTotalInvoicedCost();
        } else if (fieldName.equals("base_total_offline_refunded")) {
            return getBaseTotalOfflineRefunded();
        } else if (fieldName.equals("base_total_online_refunded")) {
            return getBaseTotalOnlineRefunded();
        } else if (fieldName.equals("base_total_paid")) {
            return getBaseTotalPaid();
        } else if (fieldName.equals("base_total_qty_ordered")) {
            return getBaseTotalQtyOrdered();
        } else if (fieldName.equals("base_total_refunded")) {
            return getBaseTotalRefunded();
        } else if (fieldName.equals("billing_address")) {
            return getBillingAddress();
        } else if (fieldName.equals("billing_address_id")) {
            return getBillingAddressId();
        } else if (fieldName.equals("can_ship_partially")) {
            return isCanShipPartially();
        } else if (fieldName.equals("can_ship_partially_item")) {
            return isCanShipPartiallyItem();
        } else if (fieldName.equals("coupon_code")) {
            return getCouponCode();
        } else if (fieldName.equals("coupon_rule_name")) {
            return getCouponRuleName();
        } else if (fieldName.equals("created_at")) {
            return getCreatedAt();
        } else if (fieldName.equals("currency_code")) {
            return getCurrencyCode();
        } else if (fieldName.equals("currency_rate")) {
            return getCurrencyRate();
        } else if (fieldName.equals("custbalance_amount")) {
            return getCustbalanceAmount();
        } else if (fieldName.equals("customer_dob")) {
            return getCustomerDob();
        } else if (fieldName.equals("customer_email")) {
            return getCustomerEmail();
        } else if (fieldName.equals("customer_firstname")) {
            return getCustomerFirstname();
        } else if (fieldName.equals("customer_gender")) {
            return getCustomerGender();
        } else if (fieldName.equals("customer_group_id")) {
            return getCustomerGroupId();
        } else if (fieldName.equals("customer_id")) {
            return getCustomerId();
        } else if (fieldName.equals("customer_is_guest")) {
            return isCustomerIsGuest();
        } else if (fieldName.equals("customer_lastname")) {
            return getCustomerLastname();
        } else if (fieldName.equals("customer_middlename")) {
            return getCustomerMiddlename();
        } else if (fieldName.equals("customer_note")) {
            return getCustomerNote();
        } else if (fieldName.equals("customer_note_notify")) {
            return isCustomerNoteNotify();
        } else if (fieldName.equals("customer_prefix")) {
            return getCustomerPrefix();
        } else if (fieldName.equals("customer_suffix")) {
            return getCustomerSuffix();
        } else if (fieldName.equals("customer_taxvat")) {
            return getCustomerTaxvat();
        } else if (fieldName.equals("discount_amount")) {
            return getDiscountAmount();
        } else if (fieldName.equals("discount_canceled")) {
            return getDiscountCanceled();
        } else if (fieldName.equals("discount_description")) {
            return getDiscountDescription();
        } else if (fieldName.equals("discount_invoiced")) {
            return getDiscountInvoiced();
        } else if (fieldName.equals("discount_refunded")) {
            return getDiscountRefunded();
        } else if (fieldName.equals("edit_increment")) {
            return getEditIncrement();
        } else if (fieldName.equals("email_sent")) {
            return isEmailSent();
        } else if (fieldName.equals("forced_do_shipment_with_invoice")) {
            return isForcedDoShipmentWithInvoice();
        } else if (fieldName.equals("forced_shipment_with_invoice")) {
            return isForcedShipmentWithInvoice();
        } else if (fieldName.equals("gift_message_id")) {
            return getGiftMessageId();
        } else if (fieldName.equals("global_currency_code")) {
            return getGlobalCurrencyCode();
        } else if (fieldName.equals("grand_total")) {
            return getGrandTotal();
        } else if (fieldName.equals("hidden_tax_amount")) {
            return getHiddenTaxAmount();
        } else if (fieldName.equals("hidden_tax_invoiced")) {
            return getHiddenTaxInvoiced();
        } else if (fieldName.equals("hidden_tax_refunded")) {
            return getHiddenTaxRefunded();
        } else if (fieldName.equals("increment_id")) {
            return getIncrementId();
        } else if (fieldName.equals("is_hold")) {
            return isHold();
        } else if (fieldName.equals("is_multi_payment")) {
            return isMultiPayment();
        } else if (fieldName.equals("is_virtual")) {
            return isVirtual();
        } else if (fieldName.equals("items")) {
            return getItems();
        } else if (fieldName.equals("order_currency_code")) {
            return getOrderCurrencyCode();
        } else if (fieldName.equals("order_id")) {
            return getOrderId();
        } else if (fieldName.equals("original_increment_id")) {
            return getOriginalIncrementId();
        } else if (fieldName.equals("quote_id")) {
            return getQuoteId();
        } else if (fieldName.equals("relation_child_id")) {
            return getRelationChildId();
        } else if (fieldName.equals("relation_child_real_id")) {
            return getRelationChildRealId();
        } else if (fieldName.equals("relation_parent_id")) {
            return getRelationParentId();
        } else if (fieldName.equals("relation_parent_real_id")) {
            return getRelationParentRealId();
        } else if (fieldName.equals("remote_ip")) {
            return getRemoteIp();
        } else if (fieldName.equals("shipping_address")) {
            return getShippingAddress();
        } else if (fieldName.equals("shipping_address_id")) {
            return getShippingAddressId();
        } else if (fieldName.equals("shipping_amount")) {
            return getShippingAmount();
        } else if (fieldName.equals("shipping_canceled")) {
            return getShippingCanceled();
        } else if (fieldName.equals("shipping_description")) {
            return getShippingDescription();
        } else if (fieldName.equals("shipping_discount_amount")) {
            return getShippingDiscountAmount();
        } else if (fieldName.equals("shipping_hidden_tax_amount")) {
            return getShippingHiddenTaxAmount();
        } else if (fieldName.equals("shipping_incl_tax")) {
            return getShippingInclTax();
        } else if (fieldName.equals("shipping_invoiced")) {
            return getShippingInvoiced();
        } else if (fieldName.equals("shipping_method")) {
            return getShippingMethod();
        } else if (fieldName.equals("shipping_refunded")) {
            return getShippingRefunded();
        } else if (fieldName.equals("shipping_tax_amount")) {
            return getShippingTaxAmount();
        } else if (fieldName.equals("shipping_tax_refunded")) {
            return getShippingTaxRefunded();
        } else if (fieldName.equals("state")) {
            return getState();
        } else if (fieldName.equals("status")) {
            return getStatus();
        } else if (fieldName.equals("status_history")) {
            return getStatusHistory();
        } else if (fieldName.equals("store_currency_code")) {
            return getStoreCurrencyCode();
        } else if (fieldName.equals("store_id")) {
            return getStoreId();
        } else if (fieldName.equals("store_name")) {
            return getStoreName();
        } else if (fieldName.equals("store_to_base_rate")) {
            return getStoreToBaseRate();
        } else if (fieldName.equals("store_to_order_rate")) {
            return getStoreToOrderRate();
        } else if (fieldName.equals("subtotal")) {
            return getSubtotal();
        } else if (fieldName.equals("subtotal_canceled")) {
            return getSubtotalCanceled();
        } else if (fieldName.equals("subtotal_incl_tax")) {
            return getSubtotalInclTax();
        } else if (fieldName.equals("subtotal_invoiced")) {
            return getSubtotalInvoiced();
        } else if (fieldName.equals("subtotal_refunded")) {
            return getSubtotalRefunded();
        } else if (fieldName.equals("tax_amount")) {
            return getTaxAmount();
        } else if (fieldName.equals("tax_canceled")) {
            return getTaxCanceled();
        } else if (fieldName.equals("tax_invoiced")) {
            return getTaxInvoiced();
        } else if (fieldName.equals("tax_percent")) {
            return getTaxPercent();
        } else if (fieldName.equals("tax_refunded")) {
            return getTaxRefunded();
        } else if (fieldName.equals("total_canceled")) {
            return getTotalCanceled();
        } else if (fieldName.equals("total_due")) {
            return getTotalDue();
        } else if (fieldName.equals("total_invoiced")) {
            return getTotalInvoiced();
        } else if (fieldName.equals("total_item_count")) {
            return getTotalItemCount();
        } else if (fieldName.equals("total_offline_refunded")) {
            return getTotalOfflineRefunded();
        } else if (fieldName.equals("total_online_refunded")) {
            return getTotalOnlineRefunded();
        } else if (fieldName.equals("total_paid")) {
            return getTotalPaid();
        } else if (fieldName.equals("total_qty_ordered")) {
            return getTotalQtyOrdered();
        } else if (fieldName.equals("total_refunded")) {
            return getTotalRefunded();
        } else if (fieldName.equals("tracking_numbers")) {
            return getTrackingNumbers();
        } else if (fieldName.equals("updated_at")) {
            return getUpdatedAt();
        } else if (fieldName.equals("weight")) {
            return getWeight();
        } else if (fieldName.equals("x_forwarded_for")) {
            return getXForwardedFor();
        }
        return null;
    }

    public final java.math.BigDecimal getAdjustmentNegative() {
        return adjustmentNegative;
    }

    public final java.math.BigDecimal getAdjustmentPositive() {
        return adjustmentPositive;
    }

    public final java.math.BigDecimal getBaseAdjustmentNegative() {
        return baseAdjustmentNegative;
    }

    public final java.math.BigDecimal getBaseAdjustmentPositive() {
        return baseAdjustmentPositive;
    }

    public final String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public final java.math.BigDecimal getBaseCustbalanceAmount() {
        return baseCustbalanceAmount;
    }

    public final java.math.BigDecimal getBaseDiscountAmount() {
        return baseDiscountAmount;
    }

    public final java.math.BigDecimal getBaseDiscountCanceled() {
        return baseDiscountCanceled;
    }

    public final java.math.BigDecimal getBaseDiscountInvoiced() {
        return baseDiscountInvoiced;
    }

    public final java.math.BigDecimal getBaseDiscountRefunded() {
        return baseDiscountRefunded;
    }

    public final java.math.BigDecimal getBaseGrandTotal() {
        return baseGrandTotal;
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

    public final java.math.BigDecimal getBaseShippingAmount() {
        return baseShippingAmount;
    }

    public final java.math.BigDecimal getBaseShippingCanceled() {
        return baseShippingCanceled;
    }

    public final java.math.BigDecimal getBaseShippingDiscountAmount() {
        return baseShippingDiscountAmount;
    }

    public final java.math.BigDecimal getBaseShippingHiddenTaxAmnt() {
        return baseShippingHiddenTaxAmnt;
    }

    public final java.math.BigDecimal getBaseShippingHiddenTaxAmount() {
        return baseShippingHiddenTaxAmount;
    }

    public final java.math.BigDecimal getBaseShippingInclTax() {
        return baseShippingInclTax;
    }

    public final java.math.BigDecimal getBaseShippingInvoiced() {
        return baseShippingInvoiced;
    }

    public final java.math.BigDecimal getBaseShippingRefunded() {
        return baseShippingRefunded;
    }

    public final java.math.BigDecimal getBaseShippingTaxAmount() {
        return baseShippingTaxAmount;
    }

    public final java.math.BigDecimal getBaseShippingTaxRefunded() {
        return baseShippingTaxRefunded;
    }

    public final java.math.BigDecimal getBaseSubtotal() {
        return baseSubtotal;
    }

    public final java.math.BigDecimal getBaseSubtotalCanceled() {
        return baseSubtotalCanceled;
    }

    public final java.math.BigDecimal getBaseSubtotalInclTax() {
        return baseSubtotalInclTax;
    }

    public final java.math.BigDecimal getBaseSubtotalInvoiced() {
        return baseSubtotalInvoiced;
    }

    public final java.math.BigDecimal getBaseSubtotalRefunded() {
        return baseSubtotalRefunded;
    }

    public final java.math.BigDecimal getBaseTaxAmount() {
        return baseTaxAmount;
    }

    public final java.math.BigDecimal getBaseTaxCanceled() {
        return baseTaxCanceled;
    }

    public final java.math.BigDecimal getBaseTaxInvoiced() {
        return baseTaxInvoiced;
    }

    public final java.math.BigDecimal getBaseTaxRefunded() {
        return baseTaxRefunded;
    }

    public final java.math.BigDecimal getBaseToGlobalRate() {
        return baseToGlobalRate;
    }

    public final java.math.BigDecimal getBaseToOrderRate() {
        return baseToOrderRate;
    }

    public final java.math.BigDecimal getBaseTotalCanceled() {
        return baseTotalCanceled;
    }

    public final java.math.BigDecimal getBaseTotalDue() {
        return baseTotalDue;
    }

    public final java.math.BigDecimal getBaseTotalInvoiced() {
        return baseTotalInvoiced;
    }

    public final java.math.BigDecimal getBaseTotalInvoicedCost() {
        return baseTotalInvoicedCost;
    }

    public final java.math.BigDecimal getBaseTotalOfflineRefunded() {
        return baseTotalOfflineRefunded;
    }

    public final java.math.BigDecimal getBaseTotalOnlineRefunded() {
        return baseTotalOnlineRefunded;
    }

    public final java.math.BigDecimal getBaseTotalPaid() {
        return baseTotalPaid;
    }

    public final java.math.BigDecimal getBaseTotalQtyOrdered() {
        return baseTotalQtyOrdered;
    }

    public final java.math.BigDecimal getBaseTotalRefunded() {
        return baseTotalRefunded;
    }

    public final com.yogento.api.models.sales.order.magento.MagentoOrderAddress getBillingAddress() {
        return billingAddress;
    }

    public final Integer getBillingAddressId() {
        return billingAddressId;
    }

    public final String getCouponCode() {
        return couponCode;
    }

    public final String getCouponRuleName() {
        return couponRuleName;
    }

    public final org.joda.time.DateTime getCreatedAt() {
        return createdAt;
    }

    public final String getCurrencyCode() {
        return currencyCode;
    }

    public final String getCurrencyRate() {
        return currencyRate;
    }

    public final String getCustbalanceAmount() {
        return custbalanceAmount;
    }

    public final String getCustomerDob() {
        return customerDob;
    }

    public final String getCustomerEmail() {
        return customerEmail;
    }

    public final String getCustomerFirstname() {
        return customerFirstname;
    }

    public final String getCustomerGender() {
        return customerGender;
    }

    public final Integer getCustomerGroupId() {
        return customerGroupId;
    }

    public final Integer getCustomerId() {
        return customerId;
    }

    public final String getCustomerLastname() {
        return customerLastname;
    }

    public final String getCustomerMiddlename() {
        return customerMiddlename;
    }

    public final String getCustomerNote() {
        return customerNote;
    }

    public final String getCustomerPrefix() {
        return customerPrefix;
    }

    public final String getCustomerSuffix() {
        return customerSuffix;
    }

    public final String getCustomerTaxvat() {
        return customerTaxvat;
    }

    public final java.math.BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public final java.math.BigDecimal getDiscountCanceled() {
        return discountCanceled;
    }

    public final java.math.BigDecimal getDiscountDescription() {
        return discountDescription;
    }

    public final java.math.BigDecimal getDiscountInvoiced() {
        return discountInvoiced;
    }

    public final java.math.BigDecimal getDiscountRefunded() {
        return discountRefunded;
    }

    public final String getEditIncrement() {
        return editIncrement;
    }

    @Override
    public Object getFieldValue(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final Integer getGiftMessageId() {
        return giftMessageId;
    }

    public final String getGlobalCurrencyCode() {
        return globalCurrencyCode;
    }

    public final java.math.BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public final java.math.BigDecimal getHiddenTaxAmount() {
        return hiddenTaxAmount;
    }

    public final java.math.BigDecimal getHiddenTaxInvoiced() {
        return hiddenTaxInvoiced;
    }

    public final java.math.BigDecimal getHiddenTaxRefunded() {
        return hiddenTaxRefunded;
    }

    public final String getIncrementId() {
        return incrementId;
    }

    public final com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> getItems() {
        return items;
    }

    public final String getOrderCurrencyCode() {
        return orderCurrencyCode;
    }

    public final Integer getOrderId() {
        return orderId;
    }

    public final String getOriginalIncrementId() {
        return originalIncrementId;
    }

    public final Integer getQuoteId() {
        return quoteId;
    }

    public final Integer getRelationChildId() {
        return relationChildId;
    }

    public final Integer getRelationChildRealId() {
        return relationChildRealId;
    }

    public final Integer getRelationParentId() {
        return relationParentId;
    }

    public final Integer getRelationParentRealId() {
        return relationParentRealId;
    }

    public final String getRemoteIp() {
        return remoteIp;
    }

    public final com.yogento.api.models.sales.order.magento.MagentoOrderAddress getShippingAddress() {
        return shippingAddress;
    }

    public final Integer getShippingAddressId() {
        return shippingAddressId;
    }

    public final java.math.BigDecimal getShippingAmount() {
        return shippingAmount;
    }

    public final java.math.BigDecimal getShippingCanceled() {
        return shippingCanceled;
    }

    public final String getShippingDescription() {
        return shippingDescription;
    }

    public final java.math.BigDecimal getShippingDiscountAmount() {
        return shippingDiscountAmount;
    }

    public final java.math.BigDecimal getShippingHiddenTaxAmount() {
        return shippingHiddenTaxAmount;
    }

    public final java.math.BigDecimal getShippingInclTax() {
        return shippingInclTax;
    }

    public final java.math.BigDecimal getShippingInvoiced() {
        return shippingInvoiced;
    }

    public final String getShippingMethod() {
        return shippingMethod;
    }

    public final java.math.BigDecimal getShippingRefunded() {
        return shippingRefunded;
    }

    public final java.math.BigDecimal getShippingTaxAmount() {
        return shippingTaxAmount;
    }

    public final java.math.BigDecimal getShippingTaxRefunded() {
        return shippingTaxRefunded;
    }

    public final String getState() {
        return state;
    }

    public final com.yogento.api.models.sales.order.magento.MagentoOrderStatus getStatus() {
        return status;
    }

    public final com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> getStatusHistory() {
        return statusHistory;
    }

    public final String getStoreCurrencyCode() {
        return storeCurrencyCode;
    }

    public final Integer getStoreId() {
        return storeId;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final java.math.BigDecimal getStoreToBaseRate() {
        return storeToBaseRate;
    }

    public final java.math.BigDecimal getStoreToOrderRate() {
        return storeToOrderRate;
    }

    public final java.math.BigDecimal getSubtotal() {
        return subtotal;
    }

    public final java.math.BigDecimal getSubtotalCanceled() {
        return subtotalCanceled;
    }

    public final java.math.BigDecimal getSubtotalInclTax() {
        return subtotalInclTax;
    }

    public final java.math.BigDecimal getSubtotalInvoiced() {
        return subtotalInvoiced;
    }

    public final java.math.BigDecimal getSubtotalRefunded() {
        return subtotalRefunded;
    }

    public final java.math.BigDecimal getTaxAmount() {
        return taxAmount;
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

    public final java.math.BigDecimal getTotalCanceled() {
        return totalCanceled;
    }

    public final java.math.BigDecimal getTotalDue() {
        return totalDue;
    }

    public final java.math.BigDecimal getTotalInvoiced() {
        return totalInvoiced;
    }

    public final java.math.BigDecimal getTotalItemCount() {
        return totalItemCount;
    }

    public final java.math.BigDecimal getTotalOfflineRefunded() {
        return totalOfflineRefunded;
    }

    public final java.math.BigDecimal getTotalOnlineRefunded() {
        return totalOnlineRefunded;
    }

    public final java.math.BigDecimal getTotalPaid() {
        return totalPaid;
    }

    public final java.math.BigDecimal getTotalQtyOrdered() {
        return totalQtyOrdered;
    }

    public final java.math.BigDecimal getTotalRefunded() {
        return totalRefunded;
    }

    public final com.google.common.collect.ImmutableList<String> getTrackingNumbers() {
        return trackingNumbers;
    }

    public final org.joda.time.DateTime getUpdatedAt() {
        return updatedAt;
    }

    public final java.math.BigDecimal getWeight() {
        return weight;
    }

    public final String getXForwardedFor() {
        return xForwardedFor;
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        if (getAdjustmentNegative() != null) {
            hashCode = 31 * hashCode + getAdjustmentNegative().hashCode();
        }
        if (getAdjustmentPositive() != null) {
            hashCode = 31 * hashCode + getAdjustmentPositive().hashCode();
        }
        if (getBaseAdjustmentNegative() != null) {
            hashCode = 31 * hashCode + getBaseAdjustmentNegative().hashCode();
        }
        if (getBaseAdjustmentPositive() != null) {
            hashCode = 31 * hashCode + getBaseAdjustmentPositive().hashCode();
        }
        if (getBaseCurrencyCode() != null) {
            hashCode = 31 * hashCode + getBaseCurrencyCode().hashCode();
        }
        if (getBaseCustbalanceAmount() != null) {
            hashCode = 31 * hashCode + getBaseCustbalanceAmount().hashCode();
        }
        if (getBaseDiscountAmount() != null) {
            hashCode = 31 * hashCode + getBaseDiscountAmount().hashCode();
        }
        if (getBaseDiscountCanceled() != null) {
            hashCode = 31 * hashCode + getBaseDiscountCanceled().hashCode();
        }
        if (getBaseDiscountInvoiced() != null) {
            hashCode = 31 * hashCode + getBaseDiscountInvoiced().hashCode();
        }
        if (getBaseDiscountRefunded() != null) {
            hashCode = 31 * hashCode + getBaseDiscountRefunded().hashCode();
        }
        if (getBaseGrandTotal() != null) {
            hashCode = 31 * hashCode + getBaseGrandTotal().hashCode();
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
        if (getBaseShippingAmount() != null) {
            hashCode = 31 * hashCode + getBaseShippingAmount().hashCode();
        }
        if (getBaseShippingCanceled() != null) {
            hashCode = 31 * hashCode + getBaseShippingCanceled().hashCode();
        }
        if (getBaseShippingDiscountAmount() != null) {
            hashCode = 31 * hashCode + getBaseShippingDiscountAmount().hashCode();
        }
        if (getBaseShippingHiddenTaxAmnt() != null) {
            hashCode = 31 * hashCode + getBaseShippingHiddenTaxAmnt().hashCode();
        }
        if (getBaseShippingHiddenTaxAmount() != null) {
            hashCode = 31 * hashCode + getBaseShippingHiddenTaxAmount().hashCode();
        }
        if (getBaseShippingInclTax() != null) {
            hashCode = 31 * hashCode + getBaseShippingInclTax().hashCode();
        }
        if (getBaseShippingInvoiced() != null) {
            hashCode = 31 * hashCode + getBaseShippingInvoiced().hashCode();
        }
        if (getBaseShippingRefunded() != null) {
            hashCode = 31 * hashCode + getBaseShippingRefunded().hashCode();
        }
        if (getBaseShippingTaxAmount() != null) {
            hashCode = 31 * hashCode + getBaseShippingTaxAmount().hashCode();
        }
        if (getBaseShippingTaxRefunded() != null) {
            hashCode = 31 * hashCode + getBaseShippingTaxRefunded().hashCode();
        }
        if (getBaseSubtotal() != null) {
            hashCode = 31 * hashCode + getBaseSubtotal().hashCode();
        }
        if (getBaseSubtotalCanceled() != null) {
            hashCode = 31 * hashCode + getBaseSubtotalCanceled().hashCode();
        }
        if (getBaseSubtotalInclTax() != null) {
            hashCode = 31 * hashCode + getBaseSubtotalInclTax().hashCode();
        }
        if (getBaseSubtotalInvoiced() != null) {
            hashCode = 31 * hashCode + getBaseSubtotalInvoiced().hashCode();
        }
        if (getBaseSubtotalRefunded() != null) {
            hashCode = 31 * hashCode + getBaseSubtotalRefunded().hashCode();
        }
        if (getBaseTaxAmount() != null) {
            hashCode = 31 * hashCode + getBaseTaxAmount().hashCode();
        }
        if (getBaseTaxCanceled() != null) {
            hashCode = 31 * hashCode + getBaseTaxCanceled().hashCode();
        }
        if (getBaseTaxInvoiced() != null) {
            hashCode = 31 * hashCode + getBaseTaxInvoiced().hashCode();
        }
        if (getBaseTaxRefunded() != null) {
            hashCode = 31 * hashCode + getBaseTaxRefunded().hashCode();
        }
        if (getBaseToGlobalRate() != null) {
            hashCode = 31 * hashCode + getBaseToGlobalRate().hashCode();
        }
        if (getBaseToOrderRate() != null) {
            hashCode = 31 * hashCode + getBaseToOrderRate().hashCode();
        }
        if (getBaseTotalCanceled() != null) {
            hashCode = 31 * hashCode + getBaseTotalCanceled().hashCode();
        }
        if (getBaseTotalDue() != null) {
            hashCode = 31 * hashCode + getBaseTotalDue().hashCode();
        }
        if (getBaseTotalInvoiced() != null) {
            hashCode = 31 * hashCode + getBaseTotalInvoiced().hashCode();
        }
        if (getBaseTotalInvoicedCost() != null) {
            hashCode = 31 * hashCode + getBaseTotalInvoicedCost().hashCode();
        }
        if (getBaseTotalOfflineRefunded() != null) {
            hashCode = 31 * hashCode + getBaseTotalOfflineRefunded().hashCode();
        }
        if (getBaseTotalOnlineRefunded() != null) {
            hashCode = 31 * hashCode + getBaseTotalOnlineRefunded().hashCode();
        }
        if (getBaseTotalPaid() != null) {
            hashCode = 31 * hashCode + getBaseTotalPaid().hashCode();
        }
        if (getBaseTotalQtyOrdered() != null) {
            hashCode = 31 * hashCode + getBaseTotalQtyOrdered().hashCode();
        }
        if (getBaseTotalRefunded() != null) {
            hashCode = 31 * hashCode + getBaseTotalRefunded().hashCode();
        }
        if (getBillingAddress() != null) {
            hashCode = 31 * hashCode + getBillingAddress().hashCode();
        }
        if (getBillingAddressId() != null) {
            hashCode = 31 * hashCode + ((int)getBillingAddressId());
        }
        if (isCanShipPartially() != null) {
            hashCode = 31 * hashCode + (isCanShipPartially() ? 1 : 0);
        }
        if (isCanShipPartiallyItem() != null) {
            hashCode = 31 * hashCode + (isCanShipPartiallyItem() ? 1 : 0);
        }
        if (getCouponCode() != null) {
            hashCode = 31 * hashCode + getCouponCode().hashCode();
        }
        if (getCouponRuleName() != null) {
            hashCode = 31 * hashCode + getCouponRuleName().hashCode();
        }
        hashCode = 31 * hashCode + getCreatedAt().hashCode();
        if (getCurrencyCode() != null) {
            hashCode = 31 * hashCode + getCurrencyCode().hashCode();
        }
        if (getCurrencyRate() != null) {
            hashCode = 31 * hashCode + getCurrencyRate().hashCode();
        }
        if (getCustbalanceAmount() != null) {
            hashCode = 31 * hashCode + getCustbalanceAmount().hashCode();
        }
        if (getCustomerDob() != null) {
            hashCode = 31 * hashCode + getCustomerDob().hashCode();
        }
        if (getCustomerEmail() != null) {
            hashCode = 31 * hashCode + getCustomerEmail().hashCode();
        }
        if (getCustomerFirstname() != null) {
            hashCode = 31 * hashCode + getCustomerFirstname().hashCode();
        }
        if (getCustomerGender() != null) {
            hashCode = 31 * hashCode + getCustomerGender().hashCode();
        }
        if (getCustomerGroupId() != null) {
            hashCode = 31 * hashCode + ((int)getCustomerGroupId());
        }
        if (getCustomerId() != null) {
            hashCode = 31 * hashCode + ((int)getCustomerId());
        }
        if (isCustomerIsGuest() != null) {
            hashCode = 31 * hashCode + (isCustomerIsGuest() ? 1 : 0);
        }
        if (getCustomerLastname() != null) {
            hashCode = 31 * hashCode + getCustomerLastname().hashCode();
        }
        if (getCustomerMiddlename() != null) {
            hashCode = 31 * hashCode + getCustomerMiddlename().hashCode();
        }
        if (getCustomerNote() != null) {
            hashCode = 31 * hashCode + getCustomerNote().hashCode();
        }
        if (isCustomerNoteNotify() != null) {
            hashCode = 31 * hashCode + (isCustomerNoteNotify() ? 1 : 0);
        }
        if (getCustomerPrefix() != null) {
            hashCode = 31 * hashCode + getCustomerPrefix().hashCode();
        }
        if (getCustomerSuffix() != null) {
            hashCode = 31 * hashCode + getCustomerSuffix().hashCode();
        }
        if (getCustomerTaxvat() != null) {
            hashCode = 31 * hashCode + getCustomerTaxvat().hashCode();
        }
        if (getDiscountAmount() != null) {
            hashCode = 31 * hashCode + getDiscountAmount().hashCode();
        }
        if (getDiscountCanceled() != null) {
            hashCode = 31 * hashCode + getDiscountCanceled().hashCode();
        }
        if (getDiscountDescription() != null) {
            hashCode = 31 * hashCode + getDiscountDescription().hashCode();
        }
        if (getDiscountInvoiced() != null) {
            hashCode = 31 * hashCode + getDiscountInvoiced().hashCode();
        }
        if (getDiscountRefunded() != null) {
            hashCode = 31 * hashCode + getDiscountRefunded().hashCode();
        }
        if (getEditIncrement() != null) {
            hashCode = 31 * hashCode + getEditIncrement().hashCode();
        }
        if (isEmailSent() != null) {
            hashCode = 31 * hashCode + (isEmailSent() ? 1 : 0);
        }
        if (isForcedDoShipmentWithInvoice() != null) {
            hashCode = 31 * hashCode + (isForcedDoShipmentWithInvoice() ? 1 : 0);
        }
        if (isForcedShipmentWithInvoice() != null) {
            hashCode = 31 * hashCode + (isForcedShipmentWithInvoice() ? 1 : 0);
        }
        if (getGiftMessageId() != null) {
            hashCode = 31 * hashCode + ((int)getGiftMessageId());
        }
        if (getGlobalCurrencyCode() != null) {
            hashCode = 31 * hashCode + getGlobalCurrencyCode().hashCode();
        }
        hashCode = 31 * hashCode + getGrandTotal().hashCode();
        if (getHiddenTaxAmount() != null) {
            hashCode = 31 * hashCode + getHiddenTaxAmount().hashCode();
        }
        if (getHiddenTaxInvoiced() != null) {
            hashCode = 31 * hashCode + getHiddenTaxInvoiced().hashCode();
        }
        if (getHiddenTaxRefunded() != null) {
            hashCode = 31 * hashCode + getHiddenTaxRefunded().hashCode();
        }
        hashCode = 31 * hashCode + getIncrementId().hashCode();
        if (isHold() != null) {
            hashCode = 31 * hashCode + (isHold() ? 1 : 0);
        }
        if (isMultiPayment() != null) {
            hashCode = 31 * hashCode + (isMultiPayment() ? 1 : 0);
        }
        hashCode = 31 * hashCode + (isVirtual() ? 1 : 0);
        if (getItems() != null) {
            hashCode = 31 * hashCode + getItems().hashCode();
        }
        hashCode = 31 * hashCode + getOrderCurrencyCode().hashCode();
        if (getOrderId() != null) {
            hashCode = 31 * hashCode + ((int)getOrderId());
        }
        if (getOriginalIncrementId() != null) {
            hashCode = 31 * hashCode + getOriginalIncrementId().hashCode();
        }
        if (getQuoteId() != null) {
            hashCode = 31 * hashCode + ((int)getQuoteId());
        }
        if (getRelationChildId() != null) {
            hashCode = 31 * hashCode + ((int)getRelationChildId());
        }
        if (getRelationChildRealId() != null) {
            hashCode = 31 * hashCode + ((int)getRelationChildRealId());
        }
        if (getRelationParentId() != null) {
            hashCode = 31 * hashCode + ((int)getRelationParentId());
        }
        if (getRelationParentRealId() != null) {
            hashCode = 31 * hashCode + ((int)getRelationParentRealId());
        }
        if (getRemoteIp() != null) {
            hashCode = 31 * hashCode + getRemoteIp().hashCode();
        }
        if (getShippingAddress() != null) {
            hashCode = 31 * hashCode + getShippingAddress().hashCode();
        }
        if (getShippingAddressId() != null) {
            hashCode = 31 * hashCode + ((int)getShippingAddressId());
        }
        if (getShippingAmount() != null) {
            hashCode = 31 * hashCode + getShippingAmount().hashCode();
        }
        if (getShippingCanceled() != null) {
            hashCode = 31 * hashCode + getShippingCanceled().hashCode();
        }
        if (getShippingDescription() != null) {
            hashCode = 31 * hashCode + getShippingDescription().hashCode();
        }
        if (getShippingDiscountAmount() != null) {
            hashCode = 31 * hashCode + getShippingDiscountAmount().hashCode();
        }
        if (getShippingHiddenTaxAmount() != null) {
            hashCode = 31 * hashCode + getShippingHiddenTaxAmount().hashCode();
        }
        if (getShippingInclTax() != null) {
            hashCode = 31 * hashCode + getShippingInclTax().hashCode();
        }
        if (getShippingInvoiced() != null) {
            hashCode = 31 * hashCode + getShippingInvoiced().hashCode();
        }
        if (getShippingMethod() != null) {
            hashCode = 31 * hashCode + getShippingMethod().hashCode();
        }
        if (getShippingRefunded() != null) {
            hashCode = 31 * hashCode + getShippingRefunded().hashCode();
        }
        if (getShippingTaxAmount() != null) {
            hashCode = 31 * hashCode + getShippingTaxAmount().hashCode();
        }
        if (getShippingTaxRefunded() != null) {
            hashCode = 31 * hashCode + getShippingTaxRefunded().hashCode();
        }
        if (getState() != null) {
            hashCode = 31 * hashCode + getState().hashCode();
        }
        if (getStatus() != null) {
            hashCode = 31 * hashCode + getStatus().ordinal();
        }
        if (getStatusHistory() != null) {
            hashCode = 31 * hashCode + getStatusHistory().hashCode();
        }
        if (getStoreCurrencyCode() != null) {
            hashCode = 31 * hashCode + getStoreCurrencyCode().hashCode();
        }
        if (getStoreId() != null) {
            hashCode = 31 * hashCode + ((int)getStoreId());
        }
        if (getStoreName() != null) {
            hashCode = 31 * hashCode + getStoreName().hashCode();
        }
        if (getStoreToBaseRate() != null) {
            hashCode = 31 * hashCode + getStoreToBaseRate().hashCode();
        }
        if (getStoreToOrderRate() != null) {
            hashCode = 31 * hashCode + getStoreToOrderRate().hashCode();
        }
        if (getSubtotal() != null) {
            hashCode = 31 * hashCode + getSubtotal().hashCode();
        }
        if (getSubtotalCanceled() != null) {
            hashCode = 31 * hashCode + getSubtotalCanceled().hashCode();
        }
        if (getSubtotalInclTax() != null) {
            hashCode = 31 * hashCode + getSubtotalInclTax().hashCode();
        }
        if (getSubtotalInvoiced() != null) {
            hashCode = 31 * hashCode + getSubtotalInvoiced().hashCode();
        }
        if (getSubtotalRefunded() != null) {
            hashCode = 31 * hashCode + getSubtotalRefunded().hashCode();
        }
        if (getTaxAmount() != null) {
            hashCode = 31 * hashCode + getTaxAmount().hashCode();
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
        if (getTotalCanceled() != null) {
            hashCode = 31 * hashCode + getTotalCanceled().hashCode();
        }
        if (getTotalDue() != null) {
            hashCode = 31 * hashCode + getTotalDue().hashCode();
        }
        if (getTotalInvoiced() != null) {
            hashCode = 31 * hashCode + getTotalInvoiced().hashCode();
        }
        if (getTotalItemCount() != null) {
            hashCode = 31 * hashCode + getTotalItemCount().hashCode();
        }
        if (getTotalOfflineRefunded() != null) {
            hashCode = 31 * hashCode + getTotalOfflineRefunded().hashCode();
        }
        if (getTotalOnlineRefunded() != null) {
            hashCode = 31 * hashCode + getTotalOnlineRefunded().hashCode();
        }
        if (getTotalPaid() != null) {
            hashCode = 31 * hashCode + getTotalPaid().hashCode();
        }
        if (getTotalQtyOrdered() != null) {
            hashCode = 31 * hashCode + getTotalQtyOrdered().hashCode();
        }
        if (getTotalRefunded() != null) {
            hashCode = 31 * hashCode + getTotalRefunded().hashCode();
        }
        if (getTrackingNumbers() != null) {
            hashCode = 31 * hashCode + getTrackingNumbers().hashCode();
        }
        hashCode = 31 * hashCode + getUpdatedAt().hashCode();
        if (getWeight() != null) {
            hashCode = 31 * hashCode + getWeight().hashCode();
        }
        if (getXForwardedFor() != null) {
            hashCode = 31 * hashCode + getXForwardedFor().hashCode();
        }
        return hashCode;
    }

    public final Boolean isCanShipPartially() {
        return canShipPartially;
    }

    public final Boolean isCanShipPartiallyItem() {
        return canShipPartiallyItem;
    }

    public final Boolean isCustomerIsGuest() {
        return customerIsGuest;
    }

    public final Boolean isCustomerNoteNotify() {
        return customerNoteNotify;
    }

    public final Boolean isEmailSent() {
        return emailSent;
    }

    public final Boolean isForcedDoShipmentWithInvoice() {
        return forcedDoShipmentWithInvoice;
    }

    public final Boolean isForcedShipmentWithInvoice() {
        return forcedShipmentWithInvoice;
    }

    public final Boolean isHold() {
        return isHold;
    }

    public final Boolean isMultiPayment() {
        return isMultiPayment;
    }

    @Override
    public boolean isSet(final org.apache.thrift.TFieldIdEnum field) {
        throw new UnsupportedOperationException();
    }

    public final boolean isVirtual() {
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
        if (getAdjustmentNegative() != null) {
            helper.add("adjustment_negative", getAdjustmentNegative());
        }
        if (getAdjustmentPositive() != null) {
            helper.add("adjustment_positive", getAdjustmentPositive());
        }
        if (getBaseAdjustmentNegative() != null) {
            helper.add("base_adjustment_negative", getBaseAdjustmentNegative());
        }
        if (getBaseAdjustmentPositive() != null) {
            helper.add("base_adjustment_positive", getBaseAdjustmentPositive());
        }
        if (getBaseCurrencyCode() != null) {
            helper.add("base_currency_code", getBaseCurrencyCode());
        }
        if (getBaseCustbalanceAmount() != null) {
            helper.add("base_custbalance_amount", getBaseCustbalanceAmount());
        }
        if (getBaseDiscountAmount() != null) {
            helper.add("base_discount_amount", getBaseDiscountAmount());
        }
        if (getBaseDiscountCanceled() != null) {
            helper.add("base_discount_canceled", getBaseDiscountCanceled());
        }
        if (getBaseDiscountInvoiced() != null) {
            helper.add("base_discount_invoiced", getBaseDiscountInvoiced());
        }
        if (getBaseDiscountRefunded() != null) {
            helper.add("base_discount_refunded", getBaseDiscountRefunded());
        }
        if (getBaseGrandTotal() != null) {
            helper.add("base_grand_total", getBaseGrandTotal());
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
        if (getBaseShippingAmount() != null) {
            helper.add("base_shipping_amount", getBaseShippingAmount());
        }
        if (getBaseShippingCanceled() != null) {
            helper.add("base_shipping_canceled", getBaseShippingCanceled());
        }
        if (getBaseShippingDiscountAmount() != null) {
            helper.add("base_shipping_discount_amount", getBaseShippingDiscountAmount());
        }
        if (getBaseShippingHiddenTaxAmnt() != null) {
            helper.add("base_shipping_hidden_tax_amnt", getBaseShippingHiddenTaxAmnt());
        }
        if (getBaseShippingHiddenTaxAmount() != null) {
            helper.add("base_shipping_hidden_tax_amount", getBaseShippingHiddenTaxAmount());
        }
        if (getBaseShippingInclTax() != null) {
            helper.add("base_shipping_incl_tax", getBaseShippingInclTax());
        }
        if (getBaseShippingInvoiced() != null) {
            helper.add("base_shipping_invoiced", getBaseShippingInvoiced());
        }
        if (getBaseShippingRefunded() != null) {
            helper.add("base_shipping_refunded", getBaseShippingRefunded());
        }
        if (getBaseShippingTaxAmount() != null) {
            helper.add("base_shipping_tax_amount", getBaseShippingTaxAmount());
        }
        if (getBaseShippingTaxRefunded() != null) {
            helper.add("base_shipping_tax_refunded", getBaseShippingTaxRefunded());
        }
        if (getBaseSubtotal() != null) {
            helper.add("base_subtotal", getBaseSubtotal());
        }
        if (getBaseSubtotalCanceled() != null) {
            helper.add("base_subtotal_canceled", getBaseSubtotalCanceled());
        }
        if (getBaseSubtotalInclTax() != null) {
            helper.add("base_subtotal_incl_tax", getBaseSubtotalInclTax());
        }
        if (getBaseSubtotalInvoiced() != null) {
            helper.add("base_subtotal_invoiced", getBaseSubtotalInvoiced());
        }
        if (getBaseSubtotalRefunded() != null) {
            helper.add("base_subtotal_refunded", getBaseSubtotalRefunded());
        }
        if (getBaseTaxAmount() != null) {
            helper.add("base_tax_amount", getBaseTaxAmount());
        }
        if (getBaseTaxCanceled() != null) {
            helper.add("base_tax_canceled", getBaseTaxCanceled());
        }
        if (getBaseTaxInvoiced() != null) {
            helper.add("base_tax_invoiced", getBaseTaxInvoiced());
        }
        if (getBaseTaxRefunded() != null) {
            helper.add("base_tax_refunded", getBaseTaxRefunded());
        }
        if (getBaseToGlobalRate() != null) {
            helper.add("base_to_global_rate", getBaseToGlobalRate());
        }
        if (getBaseToOrderRate() != null) {
            helper.add("base_to_order_rate", getBaseToOrderRate());
        }
        if (getBaseTotalCanceled() != null) {
            helper.add("base_total_canceled", getBaseTotalCanceled());
        }
        if (getBaseTotalDue() != null) {
            helper.add("base_total_due", getBaseTotalDue());
        }
        if (getBaseTotalInvoiced() != null) {
            helper.add("base_total_invoiced", getBaseTotalInvoiced());
        }
        if (getBaseTotalInvoicedCost() != null) {
            helper.add("base_total_invoiced_cost", getBaseTotalInvoicedCost());
        }
        if (getBaseTotalOfflineRefunded() != null) {
            helper.add("base_total_offline_refunded", getBaseTotalOfflineRefunded());
        }
        if (getBaseTotalOnlineRefunded() != null) {
            helper.add("base_total_online_refunded", getBaseTotalOnlineRefunded());
        }
        if (getBaseTotalPaid() != null) {
            helper.add("base_total_paid", getBaseTotalPaid());
        }
        if (getBaseTotalQtyOrdered() != null) {
            helper.add("base_total_qty_ordered", getBaseTotalQtyOrdered());
        }
        if (getBaseTotalRefunded() != null) {
            helper.add("base_total_refunded", getBaseTotalRefunded());
        }
        if (getBillingAddress() != null) {
            helper.add("billing_address", getBillingAddress());
        }
        if (getBillingAddressId() != null) {
            helper.add("billing_address_id", getBillingAddressId());
        }
        if (isCanShipPartially() != null) {
            helper.add("can_ship_partially", isCanShipPartially());
        }
        if (isCanShipPartiallyItem() != null) {
            helper.add("can_ship_partially_item", isCanShipPartiallyItem());
        }
        if (getCouponCode() != null) {
            helper.add("coupon_code", getCouponCode());
        }
        if (getCouponRuleName() != null) {
            helper.add("coupon_rule_name", getCouponRuleName());
        }
        helper.add("created_at", getCreatedAt());
        if (getCurrencyCode() != null) {
            helper.add("currency_code", getCurrencyCode());
        }
        if (getCurrencyRate() != null) {
            helper.add("currency_rate", getCurrencyRate());
        }
        if (getCustbalanceAmount() != null) {
            helper.add("custbalance_amount", getCustbalanceAmount());
        }
        if (getCustomerDob() != null) {
            helper.add("customer_dob", getCustomerDob());
        }
        if (getCustomerEmail() != null) {
            helper.add("customer_email", getCustomerEmail());
        }
        if (getCustomerFirstname() != null) {
            helper.add("customer_firstname", getCustomerFirstname());
        }
        if (getCustomerGender() != null) {
            helper.add("customer_gender", getCustomerGender());
        }
        if (getCustomerGroupId() != null) {
            helper.add("customer_group_id", getCustomerGroupId());
        }
        if (getCustomerId() != null) {
            helper.add("customer_id", getCustomerId());
        }
        if (isCustomerIsGuest() != null) {
            helper.add("customer_is_guest", isCustomerIsGuest());
        }
        if (getCustomerLastname() != null) {
            helper.add("customer_lastname", getCustomerLastname());
        }
        if (getCustomerMiddlename() != null) {
            helper.add("customer_middlename", getCustomerMiddlename());
        }
        if (getCustomerNote() != null) {
            helper.add("customer_note", getCustomerNote());
        }
        if (isCustomerNoteNotify() != null) {
            helper.add("customer_note_notify", isCustomerNoteNotify());
        }
        if (getCustomerPrefix() != null) {
            helper.add("customer_prefix", getCustomerPrefix());
        }
        if (getCustomerSuffix() != null) {
            helper.add("customer_suffix", getCustomerSuffix());
        }
        if (getCustomerTaxvat() != null) {
            helper.add("customer_taxvat", getCustomerTaxvat());
        }
        if (getDiscountAmount() != null) {
            helper.add("discount_amount", getDiscountAmount());
        }
        if (getDiscountCanceled() != null) {
            helper.add("discount_canceled", getDiscountCanceled());
        }
        if (getDiscountDescription() != null) {
            helper.add("discount_description", getDiscountDescription());
        }
        if (getDiscountInvoiced() != null) {
            helper.add("discount_invoiced", getDiscountInvoiced());
        }
        if (getDiscountRefunded() != null) {
            helper.add("discount_refunded", getDiscountRefunded());
        }
        if (getEditIncrement() != null) {
            helper.add("edit_increment", getEditIncrement());
        }
        if (isEmailSent() != null) {
            helper.add("email_sent", isEmailSent());
        }
        if (isForcedDoShipmentWithInvoice() != null) {
            helper.add("forced_do_shipment_with_invoice", isForcedDoShipmentWithInvoice());
        }
        if (isForcedShipmentWithInvoice() != null) {
            helper.add("forced_shipment_with_invoice", isForcedShipmentWithInvoice());
        }
        if (getGiftMessageId() != null) {
            helper.add("gift_message_id", getGiftMessageId());
        }
        if (getGlobalCurrencyCode() != null) {
            helper.add("global_currency_code", getGlobalCurrencyCode());
        }
        helper.add("grand_total", getGrandTotal());
        if (getHiddenTaxAmount() != null) {
            helper.add("hidden_tax_amount", getHiddenTaxAmount());
        }
        if (getHiddenTaxInvoiced() != null) {
            helper.add("hidden_tax_invoiced", getHiddenTaxInvoiced());
        }
        if (getHiddenTaxRefunded() != null) {
            helper.add("hidden_tax_refunded", getHiddenTaxRefunded());
        }
        helper.add("increment_id", getIncrementId());
        if (isHold() != null) {
            helper.add("is_hold", isHold());
        }
        if (isMultiPayment() != null) {
            helper.add("is_multi_payment", isMultiPayment());
        }
        helper.add("is_virtual", isVirtual());
        if (getItems() != null) {
            helper.add("items", getItems());
        }
        helper.add("order_currency_code", getOrderCurrencyCode());
        if (getOrderId() != null) {
            helper.add("order_id", getOrderId());
        }
        if (getOriginalIncrementId() != null) {
            helper.add("original_increment_id", getOriginalIncrementId());
        }
        if (getQuoteId() != null) {
            helper.add("quote_id", getQuoteId());
        }
        if (getRelationChildId() != null) {
            helper.add("relation_child_id", getRelationChildId());
        }
        if (getRelationChildRealId() != null) {
            helper.add("relation_child_real_id", getRelationChildRealId());
        }
        if (getRelationParentId() != null) {
            helper.add("relation_parent_id", getRelationParentId());
        }
        if (getRelationParentRealId() != null) {
            helper.add("relation_parent_real_id", getRelationParentRealId());
        }
        if (getRemoteIp() != null) {
            helper.add("remote_ip", getRemoteIp());
        }
        if (getShippingAddress() != null) {
            helper.add("shipping_address", getShippingAddress());
        }
        if (getShippingAddressId() != null) {
            helper.add("shipping_address_id", getShippingAddressId());
        }
        if (getShippingAmount() != null) {
            helper.add("shipping_amount", getShippingAmount());
        }
        if (getShippingCanceled() != null) {
            helper.add("shipping_canceled", getShippingCanceled());
        }
        if (getShippingDescription() != null) {
            helper.add("shipping_description", getShippingDescription());
        }
        if (getShippingDiscountAmount() != null) {
            helper.add("shipping_discount_amount", getShippingDiscountAmount());
        }
        if (getShippingHiddenTaxAmount() != null) {
            helper.add("shipping_hidden_tax_amount", getShippingHiddenTaxAmount());
        }
        if (getShippingInclTax() != null) {
            helper.add("shipping_incl_tax", getShippingInclTax());
        }
        if (getShippingInvoiced() != null) {
            helper.add("shipping_invoiced", getShippingInvoiced());
        }
        if (getShippingMethod() != null) {
            helper.add("shipping_method", getShippingMethod());
        }
        if (getShippingRefunded() != null) {
            helper.add("shipping_refunded", getShippingRefunded());
        }
        if (getShippingTaxAmount() != null) {
            helper.add("shipping_tax_amount", getShippingTaxAmount());
        }
        if (getShippingTaxRefunded() != null) {
            helper.add("shipping_tax_refunded", getShippingTaxRefunded());
        }
        if (getState() != null) {
            helper.add("state", getState());
        }
        if (getStatus() != null) {
            helper.add("status", getStatus());
        }
        if (getStatusHistory() != null) {
            helper.add("status_history", getStatusHistory());
        }
        if (getStoreCurrencyCode() != null) {
            helper.add("store_currency_code", getStoreCurrencyCode());
        }
        if (getStoreId() != null) {
            helper.add("store_id", getStoreId());
        }
        if (getStoreName() != null) {
            helper.add("store_name", getStoreName());
        }
        if (getStoreToBaseRate() != null) {
            helper.add("store_to_base_rate", getStoreToBaseRate());
        }
        if (getStoreToOrderRate() != null) {
            helper.add("store_to_order_rate", getStoreToOrderRate());
        }
        if (getSubtotal() != null) {
            helper.add("subtotal", getSubtotal());
        }
        if (getSubtotalCanceled() != null) {
            helper.add("subtotal_canceled", getSubtotalCanceled());
        }
        if (getSubtotalInclTax() != null) {
            helper.add("subtotal_incl_tax", getSubtotalInclTax());
        }
        if (getSubtotalInvoiced() != null) {
            helper.add("subtotal_invoiced", getSubtotalInvoiced());
        }
        if (getSubtotalRefunded() != null) {
            helper.add("subtotal_refunded", getSubtotalRefunded());
        }
        if (getTaxAmount() != null) {
            helper.add("tax_amount", getTaxAmount());
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
        if (getTotalCanceled() != null) {
            helper.add("total_canceled", getTotalCanceled());
        }
        if (getTotalDue() != null) {
            helper.add("total_due", getTotalDue());
        }
        if (getTotalInvoiced() != null) {
            helper.add("total_invoiced", getTotalInvoiced());
        }
        if (getTotalItemCount() != null) {
            helper.add("total_item_count", getTotalItemCount());
        }
        if (getTotalOfflineRefunded() != null) {
            helper.add("total_offline_refunded", getTotalOfflineRefunded());
        }
        if (getTotalOnlineRefunded() != null) {
            helper.add("total_online_refunded", getTotalOnlineRefunded());
        }
        if (getTotalPaid() != null) {
            helper.add("total_paid", getTotalPaid());
        }
        if (getTotalQtyOrdered() != null) {
            helper.add("total_qty_ordered", getTotalQtyOrdered());
        }
        if (getTotalRefunded() != null) {
            helper.add("total_refunded", getTotalRefunded());
        }
        if (getTrackingNumbers() != null) {
            helper.add("tracking_numbers", getTrackingNumbers());
        }
        helper.add("updated_at", getUpdatedAt());
        if (getWeight() != null) {
            helper.add("weight", getWeight());
        }
        if (getXForwardedFor() != null) {
            helper.add("x_forwarded_for", getXForwardedFor());
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
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.VOID, 141));

                if (getAdjustmentNegative() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getAdjustmentNegative()); } else { oprot.writeString(getAdjustmentNegative().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getAdjustmentPositive() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getAdjustmentPositive()); } else { oprot.writeString(getAdjustmentPositive().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseAdjustmentNegative() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseAdjustmentNegative()); } else { oprot.writeString(getBaseAdjustmentNegative().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseAdjustmentPositive() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseAdjustmentPositive()); } else { oprot.writeString(getBaseAdjustmentPositive().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseCurrencyCode() != null) {
                    oprot.writeString(getBaseCurrencyCode());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseCustbalanceAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseCustbalanceAmount()); } else { oprot.writeString(getBaseCustbalanceAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseDiscountAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountAmount()); } else { oprot.writeString(getBaseDiscountAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseDiscountCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountCanceled()); } else { oprot.writeString(getBaseDiscountCanceled().toString()); }
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

                if (getBaseGrandTotal() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseGrandTotal()); } else { oprot.writeString(getBaseGrandTotal().toString()); }
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

                if (getBaseShippingAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingAmount()); } else { oprot.writeString(getBaseShippingAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseShippingCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingCanceled()); } else { oprot.writeString(getBaseShippingCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseShippingDiscountAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingDiscountAmount()); } else { oprot.writeString(getBaseShippingDiscountAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseShippingHiddenTaxAmnt() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingHiddenTaxAmnt()); } else { oprot.writeString(getBaseShippingHiddenTaxAmnt().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseShippingHiddenTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingHiddenTaxAmount()); } else { oprot.writeString(getBaseShippingHiddenTaxAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseShippingInclTax() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingInclTax()); } else { oprot.writeString(getBaseShippingInclTax().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseShippingInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingInvoiced()); } else { oprot.writeString(getBaseShippingInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseShippingRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingRefunded()); } else { oprot.writeString(getBaseShippingRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseShippingTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingTaxAmount()); } else { oprot.writeString(getBaseShippingTaxAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseShippingTaxRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingTaxRefunded()); } else { oprot.writeString(getBaseShippingTaxRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseSubtotal() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotal()); } else { oprot.writeString(getBaseSubtotal().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseSubtotalCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotalCanceled()); } else { oprot.writeString(getBaseSubtotalCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseSubtotalInclTax() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotalInclTax()); } else { oprot.writeString(getBaseSubtotalInclTax().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseSubtotalInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotalInvoiced()); } else { oprot.writeString(getBaseSubtotalInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseSubtotalRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotalRefunded()); } else { oprot.writeString(getBaseSubtotalRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxAmount()); } else { oprot.writeString(getBaseTaxAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTaxCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxCanceled()); } else { oprot.writeString(getBaseTaxCanceled().toString()); }
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

                if (getBaseToGlobalRate() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseToGlobalRate()); } else { oprot.writeString(getBaseToGlobalRate().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseToOrderRate() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseToOrderRate()); } else { oprot.writeString(getBaseToOrderRate().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTotalCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalCanceled()); } else { oprot.writeString(getBaseTotalCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTotalDue() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalDue()); } else { oprot.writeString(getBaseTotalDue().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTotalInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalInvoiced()); } else { oprot.writeString(getBaseTotalInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTotalInvoicedCost() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalInvoicedCost()); } else { oprot.writeString(getBaseTotalInvoicedCost().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTotalOfflineRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalOfflineRefunded()); } else { oprot.writeString(getBaseTotalOfflineRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTotalOnlineRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalOnlineRefunded()); } else { oprot.writeString(getBaseTotalOnlineRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTotalPaid() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalPaid()); } else { oprot.writeString(getBaseTotalPaid().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTotalQtyOrdered() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalQtyOrdered()); } else { oprot.writeString(getBaseTotalQtyOrdered().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBaseTotalRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalRefunded()); } else { oprot.writeString(getBaseTotalRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBillingAddress() != null) {
                    getBillingAddress().write(oprot);
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getBillingAddressId() != null) {
                    oprot.writeI32(getBillingAddressId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isCanShipPartially() != null) {
                    oprot.writeBool(isCanShipPartially());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isCanShipPartiallyItem() != null) {
                    oprot.writeBool(isCanShipPartiallyItem());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCouponCode() != null) {
                    oprot.writeString(getCouponCode());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCouponRuleName() != null) {
                    oprot.writeString(getCouponRuleName());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }

                if (getCurrencyCode() != null) {
                    oprot.writeString(getCurrencyCode());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCurrencyRate() != null) {
                    oprot.writeString(getCurrencyRate());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustbalanceAmount() != null) {
                    oprot.writeString(getCustbalanceAmount());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerDob() != null) {
                    oprot.writeString(getCustomerDob());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerEmail() != null) {
                    oprot.writeString(getCustomerEmail());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerFirstname() != null) {
                    oprot.writeString(getCustomerFirstname());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerGender() != null) {
                    oprot.writeString(getCustomerGender());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerGroupId() != null) {
                    oprot.writeI32(getCustomerGroupId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerId() != null) {
                    oprot.writeI32(getCustomerId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isCustomerIsGuest() != null) {
                    oprot.writeBool(isCustomerIsGuest());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerLastname() != null) {
                    oprot.writeString(getCustomerLastname());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerMiddlename() != null) {
                    oprot.writeString(getCustomerMiddlename());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerNote() != null) {
                    oprot.writeString(getCustomerNote());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isCustomerNoteNotify() != null) {
                    oprot.writeBool(isCustomerNoteNotify());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerPrefix() != null) {
                    oprot.writeString(getCustomerPrefix());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerSuffix() != null) {
                    oprot.writeString(getCustomerSuffix());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getCustomerTaxvat() != null) {
                    oprot.writeString(getCustomerTaxvat());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDiscountAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountAmount()); } else { oprot.writeString(getDiscountAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDiscountCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountCanceled()); } else { oprot.writeString(getDiscountCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDiscountDescription() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountDescription()); } else { oprot.writeString(getDiscountDescription().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDiscountInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountInvoiced()); } else { oprot.writeString(getDiscountInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getDiscountRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountRefunded()); } else { oprot.writeString(getDiscountRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getEditIncrement() != null) {
                    oprot.writeString(getEditIncrement());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isEmailSent() != null) {
                    oprot.writeBool(isEmailSent());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isForcedDoShipmentWithInvoice() != null) {
                    oprot.writeBool(isForcedDoShipmentWithInvoice());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isForcedShipmentWithInvoice() != null) {
                    oprot.writeBool(isForcedShipmentWithInvoice());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getGiftMessageId() != null) {
                    oprot.writeI32(getGiftMessageId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getGlobalCurrencyCode() != null) {
                    oprot.writeString(getGlobalCurrencyCode());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getGrandTotal()); } else { oprot.writeString(getGrandTotal().toString()); }

                if (getHiddenTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxAmount()); } else { oprot.writeString(getHiddenTaxAmount().toString()); }
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

                oprot.writeString(getIncrementId());

                if (isHold() != null) {
                    oprot.writeBool(isHold());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (isMultiPayment() != null) {
                    oprot.writeBool(isMultiPayment());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeBool(isVirtual());

                if (getItems() != null) {
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getItems().size()));
                    for (com.yogento.api.models.sales.order.magento.MagentoOrderItem _iter0 : getItems()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeString(getOrderCurrencyCode());

                if (getOrderId() != null) {
                    oprot.writeI32(getOrderId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getOriginalIncrementId() != null) {
                    oprot.writeString(getOriginalIncrementId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getQuoteId() != null) {
                    oprot.writeI32(getQuoteId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRelationChildId() != null) {
                    oprot.writeI32(getRelationChildId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRelationChildRealId() != null) {
                    oprot.writeI32(getRelationChildRealId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRelationParentId() != null) {
                    oprot.writeI32(getRelationParentId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRelationParentRealId() != null) {
                    oprot.writeI32(getRelationParentRealId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getRemoteIp() != null) {
                    oprot.writeString(getRemoteIp());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingAddress() != null) {
                    getShippingAddress().write(oprot);
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingAddressId() != null) {
                    oprot.writeI32(getShippingAddressId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingAmount()); } else { oprot.writeString(getShippingAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingCanceled()); } else { oprot.writeString(getShippingCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingDescription() != null) {
                    oprot.writeString(getShippingDescription());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingDiscountAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingDiscountAmount()); } else { oprot.writeString(getShippingDiscountAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingHiddenTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingHiddenTaxAmount()); } else { oprot.writeString(getShippingHiddenTaxAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingInclTax() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingInclTax()); } else { oprot.writeString(getShippingInclTax().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingInvoiced()); } else { oprot.writeString(getShippingInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingMethod() != null) {
                    oprot.writeString(getShippingMethod());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingRefunded()); } else { oprot.writeString(getShippingRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingTaxAmount()); } else { oprot.writeString(getShippingTaxAmount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getShippingTaxRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingTaxRefunded()); } else { oprot.writeString(getShippingTaxRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getState() != null) {
                    oprot.writeString(getState());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStatus() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getStatus()); } else { oprot.writeString(getStatus().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStatusHistory() != null) {
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, getStatusHistory().size()));
                    for (com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory _iter0 : getStatusHistory()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeListEnd();
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStoreCurrencyCode() != null) {
                    oprot.writeString(getStoreCurrencyCode());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStoreId() != null) {
                    oprot.writeI32(getStoreId());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStoreName() != null) {
                    oprot.writeString(getStoreName());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStoreToBaseRate() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getStoreToBaseRate()); } else { oprot.writeString(getStoreToBaseRate().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getStoreToOrderRate() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getStoreToOrderRate()); } else { oprot.writeString(getStoreToOrderRate().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getSubtotal() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotal()); } else { oprot.writeString(getSubtotal().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getSubtotalCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotalCanceled()); } else { oprot.writeString(getSubtotalCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getSubtotalInclTax() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotalInclTax()); } else { oprot.writeString(getSubtotalInclTax().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getSubtotalInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotalInvoiced()); } else { oprot.writeString(getSubtotalInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getSubtotalRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotalRefunded()); } else { oprot.writeString(getSubtotalRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTaxAmount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxAmount()); } else { oprot.writeString(getTaxAmount().toString()); }
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

                if (getTotalCanceled() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalCanceled()); } else { oprot.writeString(getTotalCanceled().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTotalDue() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalDue()); } else { oprot.writeString(getTotalDue().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTotalInvoiced() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalInvoiced()); } else { oprot.writeString(getTotalInvoiced().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTotalItemCount() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalItemCount()); } else { oprot.writeString(getTotalItemCount().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTotalOfflineRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalOfflineRefunded()); } else { oprot.writeString(getTotalOfflineRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTotalOnlineRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalOnlineRefunded()); } else { oprot.writeString(getTotalOnlineRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTotalPaid() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalPaid()); } else { oprot.writeString(getTotalPaid().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTotalQtyOrdered() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalQtyOrdered()); } else { oprot.writeString(getTotalQtyOrdered().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTotalRefunded() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalRefunded()); } else { oprot.writeString(getTotalRefunded().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getTrackingNumbers() != null) {
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, getTrackingNumbers().size()));
                    for (String _iter0 : getTrackingNumbers()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }

                if (getWeight() != null) {
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeight()); } else { oprot.writeString(getWeight().toString()); }
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                if (getXForwardedFor() != null) {
                    oprot.writeString(getXForwardedFor());
                } else {
                    ((org.thryft.protocol.Protocol)oprot).writeNull();
                }

                oprot.writeListEnd();
                break;

            case org.apache.thrift.protocol.TType.STRUCT:
            default:
                oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("MagentoOrder"));

                if (getAdjustmentNegative() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("adjustment_negative", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getAdjustmentNegative()); } else { oprot.writeString(getAdjustmentNegative().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getAdjustmentPositive() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("adjustment_positive", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getAdjustmentPositive()); } else { oprot.writeString(getAdjustmentPositive().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseAdjustmentNegative() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_adjustment_negative", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseAdjustmentNegative()); } else { oprot.writeString(getBaseAdjustmentNegative().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseAdjustmentPositive() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_adjustment_positive", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseAdjustmentPositive()); } else { oprot.writeString(getBaseAdjustmentPositive().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseCurrencyCode() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_currency_code", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getBaseCurrencyCode());
                    oprot.writeFieldEnd();
                }

                if (getBaseCustbalanceAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_custbalance_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseCustbalanceAmount()); } else { oprot.writeString(getBaseCustbalanceAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseDiscountAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_discount_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountAmount()); } else { oprot.writeString(getBaseDiscountAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseDiscountCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_discount_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseDiscountCanceled()); } else { oprot.writeString(getBaseDiscountCanceled().toString()); }
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

                if (getBaseGrandTotal() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_grand_total", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseGrandTotal()); } else { oprot.writeString(getBaseGrandTotal().toString()); }
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

                if (getBaseShippingAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingAmount()); } else { oprot.writeString(getBaseShippingAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseShippingCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingCanceled()); } else { oprot.writeString(getBaseShippingCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseShippingDiscountAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_discount_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingDiscountAmount()); } else { oprot.writeString(getBaseShippingDiscountAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseShippingHiddenTaxAmnt() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_hidden_tax_amnt", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingHiddenTaxAmnt()); } else { oprot.writeString(getBaseShippingHiddenTaxAmnt().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseShippingHiddenTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_hidden_tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingHiddenTaxAmount()); } else { oprot.writeString(getBaseShippingHiddenTaxAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseShippingInclTax() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_incl_tax", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingInclTax()); } else { oprot.writeString(getBaseShippingInclTax().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseShippingInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingInvoiced()); } else { oprot.writeString(getBaseShippingInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseShippingRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingRefunded()); } else { oprot.writeString(getBaseShippingRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseShippingTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingTaxAmount()); } else { oprot.writeString(getBaseShippingTaxAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseShippingTaxRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_shipping_tax_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseShippingTaxRefunded()); } else { oprot.writeString(getBaseShippingTaxRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseSubtotal() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_subtotal", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotal()); } else { oprot.writeString(getBaseSubtotal().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseSubtotalCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_subtotal_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotalCanceled()); } else { oprot.writeString(getBaseSubtotalCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseSubtotalInclTax() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_subtotal_incl_tax", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotalInclTax()); } else { oprot.writeString(getBaseSubtotalInclTax().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseSubtotalInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_subtotal_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotalInvoiced()); } else { oprot.writeString(getBaseSubtotalInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseSubtotalRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_subtotal_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseSubtotalRefunded()); } else { oprot.writeString(getBaseSubtotalRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxAmount()); } else { oprot.writeString(getBaseTaxAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTaxCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_tax_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTaxCanceled()); } else { oprot.writeString(getBaseTaxCanceled().toString()); }
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

                if (getBaseToGlobalRate() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_to_global_rate", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseToGlobalRate()); } else { oprot.writeString(getBaseToGlobalRate().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseToOrderRate() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_to_order_rate", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseToOrderRate()); } else { oprot.writeString(getBaseToOrderRate().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTotalCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_total_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalCanceled()); } else { oprot.writeString(getBaseTotalCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTotalDue() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_total_due", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalDue()); } else { oprot.writeString(getBaseTotalDue().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTotalInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_total_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalInvoiced()); } else { oprot.writeString(getBaseTotalInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTotalInvoicedCost() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_total_invoiced_cost", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalInvoicedCost()); } else { oprot.writeString(getBaseTotalInvoicedCost().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTotalOfflineRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_total_offline_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalOfflineRefunded()); } else { oprot.writeString(getBaseTotalOfflineRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTotalOnlineRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_total_online_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalOnlineRefunded()); } else { oprot.writeString(getBaseTotalOnlineRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTotalPaid() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_total_paid", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalPaid()); } else { oprot.writeString(getBaseTotalPaid().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTotalQtyOrdered() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_total_qty_ordered", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalQtyOrdered()); } else { oprot.writeString(getBaseTotalQtyOrdered().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBaseTotalRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("base_total_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getBaseTotalRefunded()); } else { oprot.writeString(getBaseTotalRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getBillingAddress() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("billing_address", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    getBillingAddress().write(oprot);
                    oprot.writeFieldEnd();
                }

                if (getBillingAddressId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("billing_address_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getBillingAddressId());
                    oprot.writeFieldEnd();
                }

                if (isCanShipPartially() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("can_ship_partially", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isCanShipPartially());
                    oprot.writeFieldEnd();
                }

                if (isCanShipPartiallyItem() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("can_ship_partially_item", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isCanShipPartiallyItem());
                    oprot.writeFieldEnd();
                }

                if (getCouponCode() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("coupon_code", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCouponCode());
                    oprot.writeFieldEnd();
                }

                if (getCouponRuleName() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("coupon_rule_name", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCouponRuleName());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("created_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getCreatedAt()); } else { oprot.writeI64(getCreatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (getCurrencyCode() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("currency_code", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCurrencyCode());
                    oprot.writeFieldEnd();
                }

                if (getCurrencyRate() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("currency_rate", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCurrencyRate());
                    oprot.writeFieldEnd();
                }

                if (getCustbalanceAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("custbalance_amount", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustbalanceAmount());
                    oprot.writeFieldEnd();
                }

                if (getCustomerDob() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_dob", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerDob());
                    oprot.writeFieldEnd();
                }

                if (getCustomerEmail() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_email", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerEmail());
                    oprot.writeFieldEnd();
                }

                if (getCustomerFirstname() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_firstname", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerFirstname());
                    oprot.writeFieldEnd();
                }

                if (getCustomerGender() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_gender", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerGender());
                    oprot.writeFieldEnd();
                }

                if (getCustomerGroupId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_group_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getCustomerGroupId());
                    oprot.writeFieldEnd();
                }

                if (getCustomerId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getCustomerId());
                    oprot.writeFieldEnd();
                }

                if (isCustomerIsGuest() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_is_guest", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isCustomerIsGuest());
                    oprot.writeFieldEnd();
                }

                if (getCustomerLastname() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_lastname", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerLastname());
                    oprot.writeFieldEnd();
                }

                if (getCustomerMiddlename() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_middlename", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerMiddlename());
                    oprot.writeFieldEnd();
                }

                if (getCustomerNote() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_note", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerNote());
                    oprot.writeFieldEnd();
                }

                if (isCustomerNoteNotify() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_note_notify", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isCustomerNoteNotify());
                    oprot.writeFieldEnd();
                }

                if (getCustomerPrefix() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_prefix", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerPrefix());
                    oprot.writeFieldEnd();
                }

                if (getCustomerSuffix() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_suffix", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerSuffix());
                    oprot.writeFieldEnd();
                }

                if (getCustomerTaxvat() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("customer_taxvat", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getCustomerTaxvat());
                    oprot.writeFieldEnd();
                }

                if (getDiscountAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("discount_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountAmount()); } else { oprot.writeString(getDiscountAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getDiscountCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("discount_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountCanceled()); } else { oprot.writeString(getDiscountCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getDiscountDescription() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("discount_description", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountDescription()); } else { oprot.writeString(getDiscountDescription().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getDiscountInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("discount_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountInvoiced()); } else { oprot.writeString(getDiscountInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getDiscountRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("discount_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getDiscountRefunded()); } else { oprot.writeString(getDiscountRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getEditIncrement() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("edit_increment", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getEditIncrement());
                    oprot.writeFieldEnd();
                }

                if (isEmailSent() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("email_sent", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isEmailSent());
                    oprot.writeFieldEnd();
                }

                if (isForcedDoShipmentWithInvoice() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("forced_do_shipment_with_invoice", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isForcedDoShipmentWithInvoice());
                    oprot.writeFieldEnd();
                }

                if (isForcedShipmentWithInvoice() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("forced_shipment_with_invoice", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isForcedShipmentWithInvoice());
                    oprot.writeFieldEnd();
                }

                if (getGiftMessageId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("gift_message_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getGiftMessageId());
                    oprot.writeFieldEnd();
                }

                if (getGlobalCurrencyCode() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("global_currency_code", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getGlobalCurrencyCode());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("grand_total", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getGrandTotal()); } else { oprot.writeString(getGrandTotal().toString()); }
                oprot.writeFieldEnd();

                if (getHiddenTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("hidden_tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getHiddenTaxAmount()); } else { oprot.writeString(getHiddenTaxAmount().toString()); }
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

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("increment_id", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getIncrementId());
                oprot.writeFieldEnd();

                if (isHold() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_hold", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isHold());
                    oprot.writeFieldEnd();
                }

                if (isMultiPayment() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_multi_payment", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                    oprot.writeBool(isMultiPayment());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("is_virtual", org.apache.thrift.protocol.TType.BOOL, (short)-1));
                oprot.writeBool(isVirtual());
                oprot.writeFieldEnd();

                if (getItems() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("items", org.apache.thrift.protocol.TType.SET, (short)-1));
                    oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, getItems().size()));
                    for (com.yogento.api.models.sales.order.magento.MagentoOrderItem _iter0 : getItems()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeSetEnd();
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("order_currency_code", org.apache.thrift.protocol.TType.STRING, (short)-1));
                oprot.writeString(getOrderCurrencyCode());
                oprot.writeFieldEnd();

                if (getOrderId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("order_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getOrderId());
                    oprot.writeFieldEnd();
                }

                if (getOriginalIncrementId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("original_increment_id", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getOriginalIncrementId());
                    oprot.writeFieldEnd();
                }

                if (getQuoteId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("quote_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getQuoteId());
                    oprot.writeFieldEnd();
                }

                if (getRelationChildId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("relation_child_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getRelationChildId());
                    oprot.writeFieldEnd();
                }

                if (getRelationChildRealId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("relation_child_real_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getRelationChildRealId());
                    oprot.writeFieldEnd();
                }

                if (getRelationParentId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("relation_parent_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getRelationParentId());
                    oprot.writeFieldEnd();
                }

                if (getRelationParentRealId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("relation_parent_real_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getRelationParentRealId());
                    oprot.writeFieldEnd();
                }

                if (getRemoteIp() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("remote_ip", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getRemoteIp());
                    oprot.writeFieldEnd();
                }

                if (getShippingAddress() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_address", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    getShippingAddress().write(oprot);
                    oprot.writeFieldEnd();
                }

                if (getShippingAddressId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_address_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getShippingAddressId());
                    oprot.writeFieldEnd();
                }

                if (getShippingAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingAmount()); } else { oprot.writeString(getShippingAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getShippingCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingCanceled()); } else { oprot.writeString(getShippingCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getShippingDescription() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_description", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getShippingDescription());
                    oprot.writeFieldEnd();
                }

                if (getShippingDiscountAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_discount_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingDiscountAmount()); } else { oprot.writeString(getShippingDiscountAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getShippingHiddenTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_hidden_tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingHiddenTaxAmount()); } else { oprot.writeString(getShippingHiddenTaxAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getShippingInclTax() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_incl_tax", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingInclTax()); } else { oprot.writeString(getShippingInclTax().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getShippingInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingInvoiced()); } else { oprot.writeString(getShippingInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getShippingMethod() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_method", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getShippingMethod());
                    oprot.writeFieldEnd();
                }

                if (getShippingRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingRefunded()); } else { oprot.writeString(getShippingRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getShippingTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingTaxAmount()); } else { oprot.writeString(getShippingTaxAmount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getShippingTaxRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("shipping_tax_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getShippingTaxRefunded()); } else { oprot.writeString(getShippingTaxRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getState() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getState());
                    oprot.writeFieldEnd();
                }

                if (getStatus() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeEnum(getStatus()); } else { oprot.writeString(getStatus().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getStatusHistory() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("status_history", org.apache.thrift.protocol.TType.LIST, (short)-1));
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, getStatusHistory().size()));
                    for (com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory _iter0 : getStatusHistory()) {
                        _iter0.write(oprot);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }

                if (getStoreCurrencyCode() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("store_currency_code", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getStoreCurrencyCode());
                    oprot.writeFieldEnd();
                }

                if (getStoreId() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("store_id", org.apache.thrift.protocol.TType.I32, (short)-1));
                    oprot.writeI32(getStoreId());
                    oprot.writeFieldEnd();
                }

                if (getStoreName() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("store_name", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getStoreName());
                    oprot.writeFieldEnd();
                }

                if (getStoreToBaseRate() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("store_to_base_rate", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getStoreToBaseRate()); } else { oprot.writeString(getStoreToBaseRate().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getStoreToOrderRate() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("store_to_order_rate", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getStoreToOrderRate()); } else { oprot.writeString(getStoreToOrderRate().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getSubtotal() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("subtotal", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotal()); } else { oprot.writeString(getSubtotal().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getSubtotalCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("subtotal_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotalCanceled()); } else { oprot.writeString(getSubtotalCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getSubtotalInclTax() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("subtotal_incl_tax", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotalInclTax()); } else { oprot.writeString(getSubtotalInclTax().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getSubtotalInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("subtotal_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotalInvoiced()); } else { oprot.writeString(getSubtotalInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getSubtotalRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("subtotal_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getSubtotalRefunded()); } else { oprot.writeString(getSubtotalRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTaxAmount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("tax_amount", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTaxAmount()); } else { oprot.writeString(getTaxAmount().toString()); }
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

                if (getTotalCanceled() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("total_canceled", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalCanceled()); } else { oprot.writeString(getTotalCanceled().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTotalDue() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("total_due", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalDue()); } else { oprot.writeString(getTotalDue().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTotalInvoiced() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("total_invoiced", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalInvoiced()); } else { oprot.writeString(getTotalInvoiced().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTotalItemCount() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("total_item_count", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalItemCount()); } else { oprot.writeString(getTotalItemCount().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTotalOfflineRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("total_offline_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalOfflineRefunded()); } else { oprot.writeString(getTotalOfflineRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTotalOnlineRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("total_online_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalOnlineRefunded()); } else { oprot.writeString(getTotalOnlineRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTotalPaid() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("total_paid", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalPaid()); } else { oprot.writeString(getTotalPaid().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTotalQtyOrdered() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("total_qty_ordered", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalQtyOrdered()); } else { oprot.writeString(getTotalQtyOrdered().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTotalRefunded() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("total_refunded", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getTotalRefunded()); } else { oprot.writeString(getTotalRefunded().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getTrackingNumbers() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("tracking_numbers", org.apache.thrift.protocol.TType.LIST, (short)-1));
                    oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, getTrackingNumbers().size()));
                    for (String _iter0 : getTrackingNumbers()) {
                        oprot.writeString(_iter0);
                    }
                    oprot.writeListEnd();
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("updated_at", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDateTime(getUpdatedAt()); } else { oprot.writeI64(getUpdatedAt().getMillis()); }
                oprot.writeFieldEnd();

                if (getWeight() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("weight", org.apache.thrift.protocol.TType.STRUCT, (short)-1));
                    if (oprot instanceof org.thryft.protocol.Protocol) { ((org.thryft.protocol.Protocol)oprot).writeDecimal(getWeight()); } else { oprot.writeString(getWeight().toString()); }
                    oprot.writeFieldEnd();
                }

                if (getXForwardedFor() != null) {
                    oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("x_forwarded_for", org.apache.thrift.protocol.TType.STRING, (short)-1));
                    oprot.writeString(getXForwardedFor());
                    oprot.writeFieldEnd();
                }

                oprot.writeFieldStop();

                oprot.writeStructEnd();
                break;
        }
    }

    private final java.math.BigDecimal adjustmentNegative;
    private final java.math.BigDecimal adjustmentPositive;
    private final java.math.BigDecimal baseAdjustmentNegative;
    private final java.math.BigDecimal baseAdjustmentPositive;
    private final String baseCurrencyCode;
    private final java.math.BigDecimal baseCustbalanceAmount;
    private final java.math.BigDecimal baseDiscountAmount;
    private final java.math.BigDecimal baseDiscountCanceled;
    private final java.math.BigDecimal baseDiscountInvoiced;
    private final java.math.BigDecimal baseDiscountRefunded;
    private final java.math.BigDecimal baseGrandTotal;
    private final java.math.BigDecimal baseHiddenTaxAmount;
    private final java.math.BigDecimal baseHiddenTaxInvoiced;
    private final java.math.BigDecimal baseHiddenTaxRefunded;
    private final java.math.BigDecimal baseShippingAmount;
    private final java.math.BigDecimal baseShippingCanceled;
    private final java.math.BigDecimal baseShippingDiscountAmount;
    private final java.math.BigDecimal baseShippingHiddenTaxAmnt;
    private final java.math.BigDecimal baseShippingHiddenTaxAmount;
    private final java.math.BigDecimal baseShippingInclTax;
    private final java.math.BigDecimal baseShippingInvoiced;
    private final java.math.BigDecimal baseShippingRefunded;
    private final java.math.BigDecimal baseShippingTaxAmount;
    private final java.math.BigDecimal baseShippingTaxRefunded;
    private final java.math.BigDecimal baseSubtotal;
    private final java.math.BigDecimal baseSubtotalCanceled;
    private final java.math.BigDecimal baseSubtotalInclTax;
    private final java.math.BigDecimal baseSubtotalInvoiced;
    private final java.math.BigDecimal baseSubtotalRefunded;
    private final java.math.BigDecimal baseTaxAmount;
    private final java.math.BigDecimal baseTaxCanceled;
    private final java.math.BigDecimal baseTaxInvoiced;
    private final java.math.BigDecimal baseTaxRefunded;
    private final java.math.BigDecimal baseToGlobalRate;
    private final java.math.BigDecimal baseToOrderRate;
    private final java.math.BigDecimal baseTotalCanceled;
    private final java.math.BigDecimal baseTotalDue;
    private final java.math.BigDecimal baseTotalInvoiced;
    private final java.math.BigDecimal baseTotalInvoicedCost;
    private final java.math.BigDecimal baseTotalOfflineRefunded;
    private final java.math.BigDecimal baseTotalOnlineRefunded;
    private final java.math.BigDecimal baseTotalPaid;
    private final java.math.BigDecimal baseTotalQtyOrdered;
    private final java.math.BigDecimal baseTotalRefunded;
    private final com.yogento.api.models.sales.order.magento.MagentoOrderAddress billingAddress;
    private final Integer billingAddressId;
    private final Boolean canShipPartially;
    private final Boolean canShipPartiallyItem;
    private final String couponCode;
    private final String couponRuleName;
    private final org.joda.time.DateTime createdAt;
    private final String currencyCode;
    private final String currencyRate;
    private final String custbalanceAmount;
    private final String customerDob;
    private final String customerEmail;
    private final String customerFirstname;
    private final String customerGender;
    private final Integer customerGroupId;
    private final Integer customerId;
    private final Boolean customerIsGuest;
    private final String customerLastname;
    private final String customerMiddlename;
    private final String customerNote;
    private final Boolean customerNoteNotify;
    private final String customerPrefix;
    private final String customerSuffix;
    private final String customerTaxvat;
    private final java.math.BigDecimal discountAmount;
    private final java.math.BigDecimal discountCanceled;
    private final java.math.BigDecimal discountDescription;
    private final java.math.BigDecimal discountInvoiced;
    private final java.math.BigDecimal discountRefunded;
    private final String editIncrement;
    private final Boolean emailSent;
    private final Boolean forcedDoShipmentWithInvoice;
    private final Boolean forcedShipmentWithInvoice;
    private final Integer giftMessageId;
    private final String globalCurrencyCode;
    private final java.math.BigDecimal grandTotal;
    private final java.math.BigDecimal hiddenTaxAmount;
    private final java.math.BigDecimal hiddenTaxInvoiced;
    private final java.math.BigDecimal hiddenTaxRefunded;
    private final String incrementId;
    private final Boolean isHold;
    private final Boolean isMultiPayment;
    private final boolean isVirtual;
    private final com.google.common.collect.ImmutableSet<com.yogento.api.models.sales.order.magento.MagentoOrderItem> items;
    private final String orderCurrencyCode;
    private final Integer orderId;
    private final String originalIncrementId;
    private final Integer quoteId;
    private final Integer relationChildId;
    private final Integer relationChildRealId;
    private final Integer relationParentId;
    private final Integer relationParentRealId;
    private final String remoteIp;
    private final com.yogento.api.models.sales.order.magento.MagentoOrderAddress shippingAddress;
    private final Integer shippingAddressId;
    private final java.math.BigDecimal shippingAmount;
    private final java.math.BigDecimal shippingCanceled;
    private final String shippingDescription;
    private final java.math.BigDecimal shippingDiscountAmount;
    private final java.math.BigDecimal shippingHiddenTaxAmount;
    private final java.math.BigDecimal shippingInclTax;
    private final java.math.BigDecimal shippingInvoiced;
    private final String shippingMethod;
    private final java.math.BigDecimal shippingRefunded;
    private final java.math.BigDecimal shippingTaxAmount;
    private final java.math.BigDecimal shippingTaxRefunded;
    private final String state;
    private final com.yogento.api.models.sales.order.magento.MagentoOrderStatus status;
    private final com.google.common.collect.ImmutableList<com.yogento.api.models.sales.order.magento.MagentoOrderStatusHistory> statusHistory;
    private final String storeCurrencyCode;
    private final Integer storeId;
    private final String storeName;
    private final java.math.BigDecimal storeToBaseRate;
    private final java.math.BigDecimal storeToOrderRate;
    private final java.math.BigDecimal subtotal;
    private final java.math.BigDecimal subtotalCanceled;
    private final java.math.BigDecimal subtotalInclTax;
    private final java.math.BigDecimal subtotalInvoiced;
    private final java.math.BigDecimal subtotalRefunded;
    private final java.math.BigDecimal taxAmount;
    private final java.math.BigDecimal taxCanceled;
    private final java.math.BigDecimal taxInvoiced;
    private final java.math.BigDecimal taxPercent;
    private final java.math.BigDecimal taxRefunded;
    private final java.math.BigDecimal totalCanceled;
    private final java.math.BigDecimal totalDue;
    private final java.math.BigDecimal totalInvoiced;
    private final java.math.BigDecimal totalItemCount;
    private final java.math.BigDecimal totalOfflineRefunded;
    private final java.math.BigDecimal totalOnlineRefunded;
    private final java.math.BigDecimal totalPaid;
    private final java.math.BigDecimal totalQtyOrdered;
    private final java.math.BigDecimal totalRefunded;
    private final com.google.common.collect.ImmutableList<String> trackingNumbers;
    private final org.joda.time.DateTime updatedAt;
    private final java.math.BigDecimal weight;
    private final String xForwardedFor;
}
