/**
 * ErswsMarkTransactionPeriodResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class ErswsMarkTransactionPeriodResponse  extends com.seamless.ers.interfaces.external.ErswsResponse  implements java.io.Serializable {
    private java.lang.String transactionPeriodId;

    public ErswsMarkTransactionPeriodResponse() {
    }

    public ErswsMarkTransactionPeriodResponse(
           java.lang.String ersReference,
           int resultCode,
           java.lang.String resultDescription,
           java.lang.String transactionPeriodId) {
        super(
            ersReference,
            resultCode,
            resultDescription);
        this.transactionPeriodId = transactionPeriodId;
    }


    /**
     * Gets the transactionPeriodId value for this ErswsMarkTransactionPeriodResponse.
     * 
     * @return transactionPeriodId
     */
    public java.lang.String getTransactionPeriodId() {
        return transactionPeriodId;
    }


    /**
     * Sets the transactionPeriodId value for this ErswsMarkTransactionPeriodResponse.
     * 
     * @param transactionPeriodId
     */
    public void setTransactionPeriodId(java.lang.String transactionPeriodId) {
        this.transactionPeriodId = transactionPeriodId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErswsMarkTransactionPeriodResponse)) return false;
        ErswsMarkTransactionPeriodResponse other = (ErswsMarkTransactionPeriodResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionPeriodId==null && other.getTransactionPeriodId()==null) || 
             (this.transactionPeriodId!=null &&
              this.transactionPeriodId.equals(other.getTransactionPeriodId())));
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
        if (getTransactionPeriodId() != null) {
            _hashCode += getTransactionPeriodId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErswsMarkTransactionPeriodResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsMarkTransactionPeriodResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionPeriodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionPeriodId"));
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
