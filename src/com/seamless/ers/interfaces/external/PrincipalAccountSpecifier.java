/**
 * PrincipalAccountSpecifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class PrincipalAccountSpecifier  implements java.io.Serializable {
    private java.lang.String accountId;

    private java.lang.String accountTypeId;

    public PrincipalAccountSpecifier() {
    }

    public PrincipalAccountSpecifier(
           java.lang.String accountId,
           java.lang.String accountTypeId) {
           this.accountId = accountId;
           this.accountTypeId = accountTypeId;
    }


    /**
     * Gets the accountId value for this PrincipalAccountSpecifier.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this PrincipalAccountSpecifier.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the accountTypeId value for this PrincipalAccountSpecifier.
     * 
     * @return accountTypeId
     */
    public java.lang.String getAccountTypeId() {
        return accountTypeId;
    }


    /**
     * Sets the accountTypeId value for this PrincipalAccountSpecifier.
     * 
     * @param accountTypeId
     */
    public void setAccountTypeId(java.lang.String accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrincipalAccountSpecifier)) return false;
        PrincipalAccountSpecifier other = (PrincipalAccountSpecifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.accountTypeId==null && other.getAccountTypeId()==null) || 
             (this.accountTypeId!=null &&
              this.accountTypeId.equals(other.getAccountTypeId())));
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
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAccountTypeId() != null) {
            _hashCode += getAccountTypeId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrincipalAccountSpecifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountTypeId"));
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
