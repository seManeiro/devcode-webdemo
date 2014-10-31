/**
 * ErswsSendInvoiceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class ErswsSendInvoiceResponse  extends com.seamless.ers.interfaces.external.ErswsResponse  implements java.io.Serializable {
    private java.lang.String invoiceQRCode;

    private java.lang.String invoiceReference;

    public ErswsSendInvoiceResponse() {
    }

    public ErswsSendInvoiceResponse(
           java.lang.String ersReference,
           int resultCode,
           java.lang.String resultDescription,
           java.lang.String invoiceQRCode,
           java.lang.String invoiceReference) {
        super(
            ersReference,
            resultCode,
            resultDescription);
        this.invoiceQRCode = invoiceQRCode;
        this.invoiceReference = invoiceReference;
    }


    /**
     * Gets the invoiceQRCode value for this ErswsSendInvoiceResponse.
     * 
     * @return invoiceQRCode
     */
    public java.lang.String getInvoiceQRCode() {
        return invoiceQRCode;
    }


    /**
     * Sets the invoiceQRCode value for this ErswsSendInvoiceResponse.
     * 
     * @param invoiceQRCode
     */
    public void setInvoiceQRCode(java.lang.String invoiceQRCode) {
        this.invoiceQRCode = invoiceQRCode;
    }


    /**
     * Gets the invoiceReference value for this ErswsSendInvoiceResponse.
     * 
     * @return invoiceReference
     */
    public java.lang.String getInvoiceReference() {
        return invoiceReference;
    }


    /**
     * Sets the invoiceReference value for this ErswsSendInvoiceResponse.
     * 
     * @param invoiceReference
     */
    public void setInvoiceReference(java.lang.String invoiceReference) {
        this.invoiceReference = invoiceReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErswsSendInvoiceResponse)) return false;
        ErswsSendInvoiceResponse other = (ErswsSendInvoiceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.invoiceQRCode==null && other.getInvoiceQRCode()==null) || 
             (this.invoiceQRCode!=null &&
              this.invoiceQRCode.equals(other.getInvoiceQRCode()))) &&
            ((this.invoiceReference==null && other.getInvoiceReference()==null) || 
             (this.invoiceReference!=null &&
              this.invoiceReference.equals(other.getInvoiceReference())));
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
        if (getInvoiceQRCode() != null) {
            _hashCode += getInvoiceQRCode().hashCode();
        }
        if (getInvoiceReference() != null) {
            _hashCode += getInvoiceReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErswsSendInvoiceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsSendInvoiceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceQRCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceQRCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
