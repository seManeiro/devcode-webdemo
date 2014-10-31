/**
 * ErswsPaymentStatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class ErswsPaymentStatusResponse  extends com.seamless.ers.interfaces.external.ErswsResponse  implements java.io.Serializable {
    private com.seamless.ers.interfaces.external.InvoiceStatus status;

    private com.seamless.ers.interfaces.external.Receipt receipt;

    private com.seamless.ers.interfaces.external.CustomerToken[] customerTokens;

    private int version;

    public ErswsPaymentStatusResponse() {
    }

    public ErswsPaymentStatusResponse(
           java.lang.String ersReference,
           int resultCode,
           java.lang.String resultDescription,
           com.seamless.ers.interfaces.external.InvoiceStatus status,
           com.seamless.ers.interfaces.external.Receipt receipt,
           com.seamless.ers.interfaces.external.CustomerToken[] customerTokens,
           int version) {
        super(
            ersReference,
            resultCode,
            resultDescription);
        this.status = status;
        this.receipt = receipt;
        this.customerTokens = customerTokens;
        this.version = version;
    }


    /**
     * Gets the status value for this ErswsPaymentStatusResponse.
     * 
     * @return status
     */
    public com.seamless.ers.interfaces.external.InvoiceStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ErswsPaymentStatusResponse.
     * 
     * @param status
     */
    public void setStatus(com.seamless.ers.interfaces.external.InvoiceStatus status) {
        this.status = status;
    }


    /**
     * Gets the receipt value for this ErswsPaymentStatusResponse.
     * 
     * @return receipt
     */
    public com.seamless.ers.interfaces.external.Receipt getReceipt() {
        return receipt;
    }


    /**
     * Sets the receipt value for this ErswsPaymentStatusResponse.
     * 
     * @param receipt
     */
    public void setReceipt(com.seamless.ers.interfaces.external.Receipt receipt) {
        this.receipt = receipt;
    }


    /**
     * Gets the customerTokens value for this ErswsPaymentStatusResponse.
     * 
     * @return customerTokens
     */
    public com.seamless.ers.interfaces.external.CustomerToken[] getCustomerTokens() {
        return customerTokens;
    }


    /**
     * Sets the customerTokens value for this ErswsPaymentStatusResponse.
     * 
     * @param customerTokens
     */
    public void setCustomerTokens(com.seamless.ers.interfaces.external.CustomerToken[] customerTokens) {
        this.customerTokens = customerTokens;
    }


    /**
     * Gets the version value for this ErswsPaymentStatusResponse.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this ErswsPaymentStatusResponse.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErswsPaymentStatusResponse)) return false;
        ErswsPaymentStatusResponse other = (ErswsPaymentStatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.receipt==null && other.getReceipt()==null) || 
             (this.receipt!=null &&
              this.receipt.equals(other.getReceipt()))) &&
            ((this.customerTokens==null && other.getCustomerTokens()==null) || 
             (this.customerTokens!=null &&
              java.util.Arrays.equals(this.customerTokens, other.getCustomerTokens()))) &&
            this.version == other.getVersion();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getReceipt() != null) {
            _hashCode += getReceipt().hashCode();
        }
        if (getCustomerTokens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerTokens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerTokens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getVersion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErswsPaymentStatusResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsPaymentStatusResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "invoiceStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receipt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "receipt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerTokens");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerTokens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "customerToken"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "token"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
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
