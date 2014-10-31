/**
 * ErswsTopupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class ErswsTopupResponse  extends com.seamless.ers.interfaces.external.ErswsResponse  implements java.io.Serializable {
    private com.seamless.ers.interfaces.external.Amount requestedTopupAmount;

    private com.seamless.ers.interfaces.external.Principal senderPrincipal;

    private com.seamless.ers.interfaces.external.PrincipalAccountSpecifier topupAccountSpecifier;

    private com.seamless.ers.interfaces.external.Amount topupAmount;

    private com.seamless.ers.interfaces.external.Principal topupPrincipal;

    public ErswsTopupResponse() {
    }

    public ErswsTopupResponse(
           java.lang.String ersReference,
           int resultCode,
           java.lang.String resultDescription,
           com.seamless.ers.interfaces.external.Amount requestedTopupAmount,
           com.seamless.ers.interfaces.external.Principal senderPrincipal,
           com.seamless.ers.interfaces.external.PrincipalAccountSpecifier topupAccountSpecifier,
           com.seamless.ers.interfaces.external.Amount topupAmount,
           com.seamless.ers.interfaces.external.Principal topupPrincipal) {
        super(
            ersReference,
            resultCode,
            resultDescription);
        this.requestedTopupAmount = requestedTopupAmount;
        this.senderPrincipal = senderPrincipal;
        this.topupAccountSpecifier = topupAccountSpecifier;
        this.topupAmount = topupAmount;
        this.topupPrincipal = topupPrincipal;
    }


    /**
     * Gets the requestedTopupAmount value for this ErswsTopupResponse.
     * 
     * @return requestedTopupAmount
     */
    public com.seamless.ers.interfaces.external.Amount getRequestedTopupAmount() {
        return requestedTopupAmount;
    }


    /**
     * Sets the requestedTopupAmount value for this ErswsTopupResponse.
     * 
     * @param requestedTopupAmount
     */
    public void setRequestedTopupAmount(com.seamless.ers.interfaces.external.Amount requestedTopupAmount) {
        this.requestedTopupAmount = requestedTopupAmount;
    }


    /**
     * Gets the senderPrincipal value for this ErswsTopupResponse.
     * 
     * @return senderPrincipal
     */
    public com.seamless.ers.interfaces.external.Principal getSenderPrincipal() {
        return senderPrincipal;
    }


    /**
     * Sets the senderPrincipal value for this ErswsTopupResponse.
     * 
     * @param senderPrincipal
     */
    public void setSenderPrincipal(com.seamless.ers.interfaces.external.Principal senderPrincipal) {
        this.senderPrincipal = senderPrincipal;
    }


    /**
     * Gets the topupAccountSpecifier value for this ErswsTopupResponse.
     * 
     * @return topupAccountSpecifier
     */
    public com.seamless.ers.interfaces.external.PrincipalAccountSpecifier getTopupAccountSpecifier() {
        return topupAccountSpecifier;
    }


    /**
     * Sets the topupAccountSpecifier value for this ErswsTopupResponse.
     * 
     * @param topupAccountSpecifier
     */
    public void setTopupAccountSpecifier(com.seamless.ers.interfaces.external.PrincipalAccountSpecifier topupAccountSpecifier) {
        this.topupAccountSpecifier = topupAccountSpecifier;
    }


    /**
     * Gets the topupAmount value for this ErswsTopupResponse.
     * 
     * @return topupAmount
     */
    public com.seamless.ers.interfaces.external.Amount getTopupAmount() {
        return topupAmount;
    }


    /**
     * Sets the topupAmount value for this ErswsTopupResponse.
     * 
     * @param topupAmount
     */
    public void setTopupAmount(com.seamless.ers.interfaces.external.Amount topupAmount) {
        this.topupAmount = topupAmount;
    }


    /**
     * Gets the topupPrincipal value for this ErswsTopupResponse.
     * 
     * @return topupPrincipal
     */
    public com.seamless.ers.interfaces.external.Principal getTopupPrincipal() {
        return topupPrincipal;
    }


    /**
     * Sets the topupPrincipal value for this ErswsTopupResponse.
     * 
     * @param topupPrincipal
     */
    public void setTopupPrincipal(com.seamless.ers.interfaces.external.Principal topupPrincipal) {
        this.topupPrincipal = topupPrincipal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErswsTopupResponse)) return false;
        ErswsTopupResponse other = (ErswsTopupResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.requestedTopupAmount==null && other.getRequestedTopupAmount()==null) || 
             (this.requestedTopupAmount!=null &&
              this.requestedTopupAmount.equals(other.getRequestedTopupAmount()))) &&
            ((this.senderPrincipal==null && other.getSenderPrincipal()==null) || 
             (this.senderPrincipal!=null &&
              this.senderPrincipal.equals(other.getSenderPrincipal()))) &&
            ((this.topupAccountSpecifier==null && other.getTopupAccountSpecifier()==null) || 
             (this.topupAccountSpecifier!=null &&
              this.topupAccountSpecifier.equals(other.getTopupAccountSpecifier()))) &&
            ((this.topupAmount==null && other.getTopupAmount()==null) || 
             (this.topupAmount!=null &&
              this.topupAmount.equals(other.getTopupAmount()))) &&
            ((this.topupPrincipal==null && other.getTopupPrincipal()==null) || 
             (this.topupPrincipal!=null &&
              this.topupPrincipal.equals(other.getTopupPrincipal())));
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
        if (getRequestedTopupAmount() != null) {
            _hashCode += getRequestedTopupAmount().hashCode();
        }
        if (getSenderPrincipal() != null) {
            _hashCode += getSenderPrincipal().hashCode();
        }
        if (getTopupAccountSpecifier() != null) {
            _hashCode += getTopupAccountSpecifier().hashCode();
        }
        if (getTopupAmount() != null) {
            _hashCode += getTopupAmount().hashCode();
        }
        if (getTopupPrincipal() != null) {
            _hashCode += getTopupPrincipal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErswsTopupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsTopupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedTopupAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestedTopupAmount"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topupAccountSpecifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topupAccountSpecifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topupAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topupAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topupPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "topupPrincipal"));
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
