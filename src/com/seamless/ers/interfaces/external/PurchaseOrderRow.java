/**
 * PurchaseOrderRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class PurchaseOrderRow  implements java.io.Serializable {
    private com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier productSpecifier;

    private int purchaseCount;

    public PurchaseOrderRow() {
    }

    public PurchaseOrderRow(
           com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier productSpecifier,
           int purchaseCount) {
           this.productSpecifier = productSpecifier;
           this.purchaseCount = purchaseCount;
    }


    /**
     * Gets the productSpecifier value for this PurchaseOrderRow.
     * 
     * @return productSpecifier
     */
    public com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier getProductSpecifier() {
        return productSpecifier;
    }


    /**
     * Sets the productSpecifier value for this PurchaseOrderRow.
     * 
     * @param productSpecifier
     */
    public void setProductSpecifier(com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier productSpecifier) {
        this.productSpecifier = productSpecifier;
    }


    /**
     * Gets the purchaseCount value for this PurchaseOrderRow.
     * 
     * @return purchaseCount
     */
    public int getPurchaseCount() {
        return purchaseCount;
    }


    /**
     * Sets the purchaseCount value for this PurchaseOrderRow.
     * 
     * @param purchaseCount
     */
    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurchaseOrderRow)) return false;
        PurchaseOrderRow other = (PurchaseOrderRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productSpecifier==null && other.getProductSpecifier()==null) || 
             (this.productSpecifier!=null &&
              this.productSpecifier.equals(other.getProductSpecifier()))) &&
            this.purchaseCount == other.getPurchaseCount();
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
        if (getProductSpecifier() != null) {
            _hashCode += getProductSpecifier().hashCode();
        }
        _hashCode += getPurchaseCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurchaseOrderRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "purchaseOrderRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productSpecifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productSpecifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalPurchaseProductSpecifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
