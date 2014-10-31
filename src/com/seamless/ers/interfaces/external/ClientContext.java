/**
 * ClientContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class ClientContext  implements java.io.Serializable {
    private java.lang.String channel;

    private java.lang.String clientComment;

    private java.lang.String clientId;

    private java.lang.String clientReference;

    private long clientRequestTimeout;

    private com.seamless.ers.interfaces.external.PrincipalId initiatorPrincipalId;

    private java.lang.String password;

    public ClientContext() {
    }

    public ClientContext(
           java.lang.String channel,
           java.lang.String clientComment,
           java.lang.String clientId,
           java.lang.String clientReference,
           long clientRequestTimeout,
           com.seamless.ers.interfaces.external.PrincipalId initiatorPrincipalId,
           java.lang.String password) {
           this.channel = channel;
           this.clientComment = clientComment;
           this.clientId = clientId;
           this.clientReference = clientReference;
           this.clientRequestTimeout = clientRequestTimeout;
           this.initiatorPrincipalId = initiatorPrincipalId;
           this.password = password;
    }


    /**
     * Gets the channel value for this ClientContext.
     * 
     * @return channel
     */
    public java.lang.String getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this ClientContext.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    /**
     * Gets the clientComment value for this ClientContext.
     * 
     * @return clientComment
     */
    public java.lang.String getClientComment() {
        return clientComment;
    }


    /**
     * Sets the clientComment value for this ClientContext.
     * 
     * @param clientComment
     */
    public void setClientComment(java.lang.String clientComment) {
        this.clientComment = clientComment;
    }


    /**
     * Gets the clientId value for this ClientContext.
     * 
     * @return clientId
     */
    public java.lang.String getClientId() {
        return clientId;
    }


    /**
     * Sets the clientId value for this ClientContext.
     * 
     * @param clientId
     */
    public void setClientId(java.lang.String clientId) {
        this.clientId = clientId;
    }


    /**
     * Gets the clientReference value for this ClientContext.
     * 
     * @return clientReference
     */
    public java.lang.String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this ClientContext.
     * 
     * @param clientReference
     */
    public void setClientReference(java.lang.String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the clientRequestTimeout value for this ClientContext.
     * 
     * @return clientRequestTimeout
     */
    public long getClientRequestTimeout() {
        return clientRequestTimeout;
    }


    /**
     * Sets the clientRequestTimeout value for this ClientContext.
     * 
     * @param clientRequestTimeout
     */
    public void setClientRequestTimeout(long clientRequestTimeout) {
        this.clientRequestTimeout = clientRequestTimeout;
    }


    /**
     * Gets the initiatorPrincipalId value for this ClientContext.
     * 
     * @return initiatorPrincipalId
     */
    public com.seamless.ers.interfaces.external.PrincipalId getInitiatorPrincipalId() {
        return initiatorPrincipalId;
    }


    /**
     * Sets the initiatorPrincipalId value for this ClientContext.
     * 
     * @param initiatorPrincipalId
     */
    public void setInitiatorPrincipalId(com.seamless.ers.interfaces.external.PrincipalId initiatorPrincipalId) {
        this.initiatorPrincipalId = initiatorPrincipalId;
    }


    /**
     * Gets the password value for this ClientContext.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ClientContext.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientContext)) return false;
        ClientContext other = (ClientContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.clientComment==null && other.getClientComment()==null) || 
             (this.clientComment!=null &&
              this.clientComment.equals(other.getClientComment()))) &&
            ((this.clientId==null && other.getClientId()==null) || 
             (this.clientId!=null &&
              this.clientId.equals(other.getClientId()))) &&
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            this.clientRequestTimeout == other.getClientRequestTimeout() &&
            ((this.initiatorPrincipalId==null && other.getInitiatorPrincipalId()==null) || 
             (this.initiatorPrincipalId!=null &&
              this.initiatorPrincipalId.equals(other.getInitiatorPrincipalId()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getClientComment() != null) {
            _hashCode += getClientComment().hashCode();
        }
        if (getClientId() != null) {
            _hashCode += getClientId().hashCode();
        }
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        _hashCode += new Long(getClientRequestTimeout()).hashCode();
        if (getInitiatorPrincipalId() != null) {
            _hashCode += getInitiatorPrincipalId().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientRequestTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientRequestTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiatorPrincipalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initiatorPrincipalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
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
