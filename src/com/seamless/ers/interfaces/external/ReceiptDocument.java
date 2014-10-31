/**
 * ReceiptDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class ReceiptDocument  implements java.io.Serializable {
    private java.lang.String mimeType;

    private byte[] receiptData;

    private java.lang.String receiptType;

    public ReceiptDocument() {
    }

    public ReceiptDocument(
           java.lang.String mimeType,
           byte[] receiptData,
           java.lang.String receiptType) {
           this.mimeType = mimeType;
           this.receiptData = receiptData;
           this.receiptType = receiptType;
    }


    /**
     * Gets the mimeType value for this ReceiptDocument.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this ReceiptDocument.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the receiptData value for this ReceiptDocument.
     * 
     * @return receiptData
     */
    public byte[] getReceiptData() {
        return receiptData;
    }


    /**
     * Sets the receiptData value for this ReceiptDocument.
     * 
     * @param receiptData
     */
    public void setReceiptData(byte[] receiptData) {
        this.receiptData = receiptData;
    }


    /**
     * Gets the receiptType value for this ReceiptDocument.
     * 
     * @return receiptType
     */
    public java.lang.String getReceiptType() {
        return receiptType;
    }


    /**
     * Sets the receiptType value for this ReceiptDocument.
     * 
     * @param receiptType
     */
    public void setReceiptType(java.lang.String receiptType) {
        this.receiptType = receiptType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReceiptDocument)) return false;
        ReceiptDocument other = (ReceiptDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            ((this.receiptData==null && other.getReceiptData()==null) || 
             (this.receiptData!=null &&
              java.util.Arrays.equals(this.receiptData, other.getReceiptData()))) &&
            ((this.receiptType==null && other.getReceiptType()==null) || 
             (this.receiptType!=null &&
              this.receiptType.equals(other.getReceiptType())));
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
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        if (getReceiptData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReceiptData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReceiptData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReceiptType() != null) {
            _hashCode += getReceiptType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReceiptDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "receiptDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiptType"));
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
