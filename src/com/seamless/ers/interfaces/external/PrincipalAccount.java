/**
 * PrincipalAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class PrincipalAccount  implements java.io.Serializable {
    private java.lang.String accountDescription;

    private com.seamless.ers.interfaces.external.PrincipalAccountSpecifier accountSpecifier;

    private com.seamless.ers.interfaces.external.Amount balance;

    private com.seamless.ers.interfaces.external.Amount creditLimit;

    public PrincipalAccount() {
    }

    public PrincipalAccount(
           java.lang.String accountDescription,
           com.seamless.ers.interfaces.external.PrincipalAccountSpecifier accountSpecifier,
           com.seamless.ers.interfaces.external.Amount balance,
           com.seamless.ers.interfaces.external.Amount creditLimit) {
           this.accountDescription = accountDescription;
           this.accountSpecifier = accountSpecifier;
           this.balance = balance;
           this.creditLimit = creditLimit;
    }


    /**
     * Gets the accountDescription value for this PrincipalAccount.
     * 
     * @return accountDescription
     */
    public java.lang.String getAccountDescription() {
        return accountDescription;
    }


    /**
     * Sets the accountDescription value for this PrincipalAccount.
     * 
     * @param accountDescription
     */
    public void setAccountDescription(java.lang.String accountDescription) {
        this.accountDescription = accountDescription;
    }


    /**
     * Gets the accountSpecifier value for this PrincipalAccount.
     * 
     * @return accountSpecifier
     */
    public com.seamless.ers.interfaces.external.PrincipalAccountSpecifier getAccountSpecifier() {
        return accountSpecifier;
    }


    /**
     * Sets the accountSpecifier value for this PrincipalAccount.
     * 
     * @param accountSpecifier
     */
    public void setAccountSpecifier(com.seamless.ers.interfaces.external.PrincipalAccountSpecifier accountSpecifier) {
        this.accountSpecifier = accountSpecifier;
    }


    /**
     * Gets the balance value for this PrincipalAccount.
     * 
     * @return balance
     */
    public com.seamless.ers.interfaces.external.Amount getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this PrincipalAccount.
     * 
     * @param balance
     */
    public void setBalance(com.seamless.ers.interfaces.external.Amount balance) {
        this.balance = balance;
    }


    /**
     * Gets the creditLimit value for this PrincipalAccount.
     * 
     * @return creditLimit
     */
    public com.seamless.ers.interfaces.external.Amount getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this PrincipalAccount.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(com.seamless.ers.interfaces.external.Amount creditLimit) {
        this.creditLimit = creditLimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrincipalAccount)) return false;
        PrincipalAccount other = (PrincipalAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountDescription==null && other.getAccountDescription()==null) || 
             (this.accountDescription!=null &&
              this.accountDescription.equals(other.getAccountDescription()))) &&
            ((this.accountSpecifier==null && other.getAccountSpecifier()==null) || 
             (this.accountSpecifier!=null &&
              this.accountSpecifier.equals(other.getAccountSpecifier()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit())));
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
        if (getAccountDescription() != null) {
            _hashCode += getAccountDescription().hashCode();
        }
        if (getAccountSpecifier() != null) {
            _hashCode += getAccountSpecifier().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrincipalAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountSpecifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountSpecifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"));
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
