/**
 * ErswsTransferResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class ErswsTransferResponse  extends com.seamless.ers.interfaces.external.ErswsResponse  implements java.io.Serializable {
    private com.seamless.ers.interfaces.external.Amount receivedAmount;

    private com.seamless.ers.interfaces.external.Principal receiverPrincipal;

    private com.seamless.ers.interfaces.external.Amount requestedTransferAmount;

    private com.seamless.ers.interfaces.external.Principal senderPrincipal;

    public ErswsTransferResponse() {
    }

    public ErswsTransferResponse(
           java.lang.String ersReference,
           int resultCode,
           java.lang.String resultDescription,
           com.seamless.ers.interfaces.external.Amount receivedAmount,
           com.seamless.ers.interfaces.external.Principal receiverPrincipal,
           com.seamless.ers.interfaces.external.Amount requestedTransferAmount,
           com.seamless.ers.interfaces.external.Principal senderPrincipal) {
        super(
            ersReference,
            resultCode,
            resultDescription);
        this.receivedAmount = receivedAmount;
        this.receiverPrincipal = receiverPrincipal;
        this.requestedTransferAmount = requestedTransferAmount;
        this.senderPrincipal = senderPrincipal;
    }


    /**
     * Gets the receivedAmount value for this ErswsTransferResponse.
     * 
     * @return receivedAmount
     */
    public com.seamless.ers.interfaces.external.Amount getReceivedAmount() {
        return receivedAmount;
    }


    /**
     * Sets the receivedAmount value for this ErswsTransferResponse.
     * 
     * @param receivedAmount
     */
    public void setReceivedAmount(com.seamless.ers.interfaces.external.Amount receivedAmount) {
        this.receivedAmount = receivedAmount;
    }


    /**
     * Gets the receiverPrincipal value for this ErswsTransferResponse.
     * 
     * @return receiverPrincipal
     */
    public com.seamless.ers.interfaces.external.Principal getReceiverPrincipal() {
        return receiverPrincipal;
    }


    /**
     * Sets the receiverPrincipal value for this ErswsTransferResponse.
     * 
     * @param receiverPrincipal
     */
    public void setReceiverPrincipal(com.seamless.ers.interfaces.external.Principal receiverPrincipal) {
        this.receiverPrincipal = receiverPrincipal;
    }


    /**
     * Gets the requestedTransferAmount value for this ErswsTransferResponse.
     * 
     * @return requestedTransferAmount
     */
    public com.seamless.ers.interfaces.external.Amount getRequestedTransferAmount() {
        return requestedTransferAmount;
    }


    /**
     * Sets the requestedTransferAmount value for this ErswsTransferResponse.
     * 
     * @param requestedTransferAmount
     */
    public void setRequestedTransferAmount(com.seamless.ers.interfaces.external.Amount requestedTransferAmount) {
        this.requestedTransferAmount = requestedTransferAmount;
    }


    /**
     * Gets the senderPrincipal value for this ErswsTransferResponse.
     * 
     * @return senderPrincipal
     */
    public com.seamless.ers.interfaces.external.Principal getSenderPrincipal() {
        return senderPrincipal;
    }


    /**
     * Sets the senderPrincipal value for this ErswsTransferResponse.
     * 
     * @param senderPrincipal
     */
    public void setSenderPrincipal(com.seamless.ers.interfaces.external.Principal senderPrincipal) {
        this.senderPrincipal = senderPrincipal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErswsTransferResponse)) return false;
        ErswsTransferResponse other = (ErswsTransferResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.receivedAmount==null && other.getReceivedAmount()==null) || 
             (this.receivedAmount!=null &&
              this.receivedAmount.equals(other.getReceivedAmount()))) &&
            ((this.receiverPrincipal==null && other.getReceiverPrincipal()==null) || 
             (this.receiverPrincipal!=null &&
              this.receiverPrincipal.equals(other.getReceiverPrincipal()))) &&
            ((this.requestedTransferAmount==null && other.getRequestedTransferAmount()==null) || 
             (this.requestedTransferAmount!=null &&
              this.requestedTransferAmount.equals(other.getRequestedTransferAmount()))) &&
            ((this.senderPrincipal==null && other.getSenderPrincipal()==null) || 
             (this.senderPrincipal!=null &&
              this.senderPrincipal.equals(other.getSenderPrincipal())));
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
        if (getReceivedAmount() != null) {
            _hashCode += getReceivedAmount().hashCode();
        }
        if (getReceiverPrincipal() != null) {
            _hashCode += getReceiverPrincipal().hashCode();
        }
        if (getRequestedTransferAmount() != null) {
            _hashCode += getRequestedTransferAmount().hashCode();
        }
        if (getSenderPrincipal() != null) {
            _hashCode += getSenderPrincipal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErswsTransferResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsTransferResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedTransferAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestedTransferAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderPrincipal"));
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
