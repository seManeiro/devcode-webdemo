/**
 * ErswsPurchaseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class ErswsPurchaseResponse  extends com.seamless.ers.interfaces.external.ErswsResponse  implements java.io.Serializable {
    private com.seamless.ers.interfaces.external.Principal paymentPrincipal;

    private java.lang.String purchaseReference;

    private com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier[] purchasedProducts;

    private com.seamless.ers.interfaces.external.Principal receiverPrincipal;

    public ErswsPurchaseResponse() {
    }

    public ErswsPurchaseResponse(
           java.lang.String ersReference,
           int resultCode,
           java.lang.String resultDescription,
           com.seamless.ers.interfaces.external.Principal paymentPrincipal,
           java.lang.String purchaseReference,
           com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier[] purchasedProducts,
           com.seamless.ers.interfaces.external.Principal receiverPrincipal) {
        super(
            ersReference,
            resultCode,
            resultDescription);
        this.paymentPrincipal = paymentPrincipal;
        this.purchaseReference = purchaseReference;
        this.purchasedProducts = purchasedProducts;
        this.receiverPrincipal = receiverPrincipal;
    }


    /**
     * Gets the paymentPrincipal value for this ErswsPurchaseResponse.
     * 
     * @return paymentPrincipal
     */
    public com.seamless.ers.interfaces.external.Principal getPaymentPrincipal() {
        return paymentPrincipal;
    }


    /**
     * Sets the paymentPrincipal value for this ErswsPurchaseResponse.
     * 
     * @param paymentPrincipal
     */
    public void setPaymentPrincipal(com.seamless.ers.interfaces.external.Principal paymentPrincipal) {
        this.paymentPrincipal = paymentPrincipal;
    }


    /**
     * Gets the purchaseReference value for this ErswsPurchaseResponse.
     * 
     * @return purchaseReference
     */
    public java.lang.String getPurchaseReference() {
        return purchaseReference;
    }


    /**
     * Sets the purchaseReference value for this ErswsPurchaseResponse.
     * 
     * @param purchaseReference
     */
    public void setPurchaseReference(java.lang.String purchaseReference) {
        this.purchaseReference = purchaseReference;
    }


    /**
     * Gets the purchasedProducts value for this ErswsPurchaseResponse.
     * 
     * @return purchasedProducts
     */
    public com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier[] getPurchasedProducts() {
        return purchasedProducts;
    }


    /**
     * Sets the purchasedProducts value for this ErswsPurchaseResponse.
     * 
     * @param purchasedProducts
     */
    public void setPurchasedProducts(com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier getPurchasedProducts(int i) {
        return this.purchasedProducts[i];
    }

    public void setPurchasedProducts(int i, com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier _value) {
        this.purchasedProducts[i] = _value;
    }


    /**
     * Gets the receiverPrincipal value for this ErswsPurchaseResponse.
     * 
     * @return receiverPrincipal
     */
    public com.seamless.ers.interfaces.external.Principal getReceiverPrincipal() {
        return receiverPrincipal;
    }


    /**
     * Sets the receiverPrincipal value for this ErswsPurchaseResponse.
     * 
     * @param receiverPrincipal
     */
    public void setReceiverPrincipal(com.seamless.ers.interfaces.external.Principal receiverPrincipal) {
        this.receiverPrincipal = receiverPrincipal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErswsPurchaseResponse)) return false;
        ErswsPurchaseResponse other = (ErswsPurchaseResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentPrincipal==null && other.getPaymentPrincipal()==null) || 
             (this.paymentPrincipal!=null &&
              this.paymentPrincipal.equals(other.getPaymentPrincipal()))) &&
            ((this.purchaseReference==null && other.getPurchaseReference()==null) || 
             (this.purchaseReference!=null &&
              this.purchaseReference.equals(other.getPurchaseReference()))) &&
            ((this.purchasedProducts==null && other.getPurchasedProducts()==null) || 
             (this.purchasedProducts!=null &&
              java.util.Arrays.equals(this.purchasedProducts, other.getPurchasedProducts()))) &&
            ((this.receiverPrincipal==null && other.getReceiverPrincipal()==null) || 
             (this.receiverPrincipal!=null &&
              this.receiverPrincipal.equals(other.getReceiverPrincipal())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPaymentPrincipal() != null) {
            _hashCode += getPaymentPrincipal().hashCode();
        }
        if (getPurchaseReference() != null) {
            _hashCode += getPurchaseReference().hashCode();
        }
        if (getPurchasedProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchasedProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchasedProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiverPrincipal() != null) {
            _hashCode += getReceiverPrincipal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErswsPurchaseResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsPurchaseResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchaseReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchasedProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchasedProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalPurchaseProductSpecifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principal"));
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
