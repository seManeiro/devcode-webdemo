/**
 * PaymentInvoiceRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class PaymentInvoiceRow implements java.io.Serializable {
    private java.lang.String itemDescription;

    private com.seamless.ers.interfaces.external.Amount itemDiscount;

    private java.lang.String itemEAN;

    private java.math.BigDecimal itemQuantity;

    private java.lang.String itemSKU;

    private java.math.BigDecimal itemTaxRate;

    private com.seamless.ers.interfaces.external.Amount itemTotalAmount;

    private java.lang.String itemUnit;

    private com.seamless.ers.interfaces.external.Amount itemUnitPrice;

    public PaymentInvoiceRow() {
    }

    public PaymentInvoiceRow(
           java.lang.String itemDescription,
           com.seamless.ers.interfaces.external.Amount itemDiscount,
           java.lang.String itemEAN,
           java.math.BigDecimal itemQuantity,
           java.lang.String itemSKU,
           java.math.BigDecimal itemTaxRate,
           com.seamless.ers.interfaces.external.Amount itemTotalAmount,
           java.lang.String itemUnit,
           com.seamless.ers.interfaces.external.Amount itemUnitPrice) {
           this.itemDescription = itemDescription;
           this.itemDiscount = itemDiscount;
           this.itemEAN = itemEAN;
           this.itemQuantity = itemQuantity;
           this.itemSKU = itemSKU;
           this.itemTaxRate = itemTaxRate;
           this.itemTotalAmount = itemTotalAmount;
           this.itemUnit = itemUnit;
           this.itemUnitPrice = itemUnitPrice;
    }


    /**
     * Gets the itemDescription value for this PaymentInvoiceRow.
     * 
     * @return itemDescription
     */
    public java.lang.String getItemDescription() {
        return itemDescription;
    }


    /**
     * Sets the itemDescription value for this PaymentInvoiceRow.
     * 
     * @param itemDescription
     */
    public void setItemDescription(java.lang.String itemDescription) {
        this.itemDescription = itemDescription;
    }


    /**
     * Gets the itemDiscount value for this PaymentInvoiceRow.
     * 
     * @return itemDiscount
     */
    public com.seamless.ers.interfaces.external.Amount getItemDiscount() {
        return itemDiscount;
    }


    /**
     * Sets the itemDiscount value for this PaymentInvoiceRow.
     * 
     * @param itemDiscount
     */
    public void setItemDiscount(com.seamless.ers.interfaces.external.Amount itemDiscount) {
        this.itemDiscount = itemDiscount;
    }


    /**
     * Gets the itemEAN value for this PaymentInvoiceRow.
     * 
     * @return itemEAN
     */
    public java.lang.String getItemEAN() {
        return itemEAN;
    }


    /**
     * Sets the itemEAN value for this PaymentInvoiceRow.
     * 
     * @param itemEAN
     */
    public void setItemEAN(java.lang.String itemEAN) {
        this.itemEAN = itemEAN;
    }


    /**
     * Gets the itemQuantity value for this PaymentInvoiceRow.
     * 
     * @return itemQuantity
     */
    public java.math.BigDecimal getItemQuantity() {
        return itemQuantity;
    }


    /**
     * Sets the itemQuantity value for this PaymentInvoiceRow.
     * 
     * @param itemQuantity
     */
    public void setItemQuantity(java.math.BigDecimal itemQuantity) {
        this.itemQuantity = itemQuantity;
    }


    /**
     * Gets the itemSKU value for this PaymentInvoiceRow.
     * 
     * @return itemSKU
     */
    public java.lang.String getItemSKU() {
        return itemSKU;
    }


    /**
     * Sets the itemSKU value for this PaymentInvoiceRow.
     * 
     * @param itemSKU
     */
    public void setItemSKU(java.lang.String itemSKU) {
        this.itemSKU = itemSKU;
    }


    /**
     * Gets the itemTaxRate value for this PaymentInvoiceRow.
     * 
     * @return itemTaxRate
     */
    public java.math.BigDecimal getItemTaxRate() {
        return itemTaxRate;
    }


    /**
     * Sets the itemTaxRate value for this PaymentInvoiceRow.
     * 
     * @param itemTaxRate
     */
    public void setItemTaxRate(java.math.BigDecimal itemTaxRate) {
        this.itemTaxRate = itemTaxRate;
    }


    /**
     * Gets the itemTotalAmount value for this PaymentInvoiceRow.
     * 
     * @return itemTotalAmount
     */
    public com.seamless.ers.interfaces.external.Amount getItemTotalAmount() {
        return itemTotalAmount;
    }


    /**
     * Sets the itemTotalAmount value for this PaymentInvoiceRow.
     * 
     * @param itemTotalAmount
     */
    public void setItemTotalAmount(com.seamless.ers.interfaces.external.Amount itemTotalAmount) {
        this.itemTotalAmount = itemTotalAmount;
    }


    /**
     * Gets the itemUnit value for this PaymentInvoiceRow.
     * 
     * @return itemUnit
     */
    public java.lang.String getItemUnit() {
        return itemUnit;
    }


    /**
     * Sets the itemUnit value for this PaymentInvoiceRow.
     * 
     * @param itemUnit
     */
    public void setItemUnit(java.lang.String itemUnit) {
        this.itemUnit = itemUnit;
    }


    /**
     * Gets the itemUnitPrice value for this PaymentInvoiceRow.
     * 
     * @return itemUnitPrice
     */
    public com.seamless.ers.interfaces.external.Amount getItemUnitPrice() {
        return itemUnitPrice;
    }


    /**
     * Sets the itemUnitPrice value for this PaymentInvoiceRow.
     * 
     * @param itemUnitPrice
     */
    public void setItemUnitPrice(com.seamless.ers.interfaces.external.Amount itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentInvoiceRow)) return false;
        PaymentInvoiceRow other = (PaymentInvoiceRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemDescription==null && other.getItemDescription()==null) || 
             (this.itemDescription!=null &&
              this.itemDescription.equals(other.getItemDescription()))) &&
            ((this.itemDiscount==null && other.getItemDiscount()==null) || 
             (this.itemDiscount!=null &&
              this.itemDiscount.equals(other.getItemDiscount()))) &&
            ((this.itemEAN==null && other.getItemEAN()==null) || 
             (this.itemEAN!=null &&
              this.itemEAN.equals(other.getItemEAN()))) &&
            ((this.itemQuantity==null && other.getItemQuantity()==null) || 
             (this.itemQuantity!=null &&
              this.itemQuantity.equals(other.getItemQuantity()))) &&
            ((this.itemSKU==null && other.getItemSKU()==null) || 
             (this.itemSKU!=null &&
              this.itemSKU.equals(other.getItemSKU()))) &&
            ((this.itemTaxRate==null && other.getItemTaxRate()==null) || 
             (this.itemTaxRate!=null &&
              this.itemTaxRate.equals(other.getItemTaxRate()))) &&
            ((this.itemTotalAmount==null && other.getItemTotalAmount()==null) || 
             (this.itemTotalAmount!=null &&
              this.itemTotalAmount.equals(other.getItemTotalAmount()))) &&
            ((this.itemUnit==null && other.getItemUnit()==null) || 
             (this.itemUnit!=null &&
              this.itemUnit.equals(other.getItemUnit()))) &&
            ((this.itemUnitPrice==null && other.getItemUnitPrice()==null) || 
             (this.itemUnitPrice!=null &&
              this.itemUnitPrice.equals(other.getItemUnitPrice())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getItemDescription() != null) {
            _hashCode += getItemDescription().hashCode();
        }
        if (getItemDiscount() != null) {
            _hashCode += getItemDiscount().hashCode();
        }
        if (getItemEAN() != null) {
            _hashCode += getItemEAN().hashCode();
        }
        if (getItemQuantity() != null) {
            _hashCode += getItemQuantity().hashCode();
        }
        if (getItemSKU() != null) {
            _hashCode += getItemSKU().hashCode();
        }
        if (getItemTaxRate() != null) {
            _hashCode += getItemTaxRate().hashCode();
        }
        if (getItemTotalAmount() != null) {
            _hashCode += getItemTotalAmount().hashCode();
        }
        if (getItemUnit() != null) {
            _hashCode += getItemUnit().hashCode();
        }
        if (getItemUnitPrice() != null) {
            _hashCode += getItemUnitPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentInvoiceRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "paymentInvoiceRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemEAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemEAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSKU");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemSKU"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTaxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemTaxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
