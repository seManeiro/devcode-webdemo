/**
 * InvoiceStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class InvoiceStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InvoiceStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ISSUED = "ISSUED";
    public static final java.lang.String _PAID = "PAID";
    public static final java.lang.String _PENDING_ISSUER_ACKNOWLEDGE = "PENDING_ISSUER_ACKNOWLEDGE";
    public static final java.lang.String _CANCELED = "CANCELED";
    public static final java.lang.String _FAILED = "FAILED";
    public static final java.lang.String _RESERVED = "RESERVED";
    public static final InvoiceStatus ISSUED = new InvoiceStatus(_ISSUED);
    public static final InvoiceStatus PAID = new InvoiceStatus(_PAID);
    public static final InvoiceStatus PENDING_ISSUER_ACKNOWLEDGE = new InvoiceStatus(_PENDING_ISSUER_ACKNOWLEDGE);
    public static final InvoiceStatus CANCELED = new InvoiceStatus(_CANCELED);
    public static final InvoiceStatus FAILED = new InvoiceStatus(_FAILED);
    public static final InvoiceStatus RESERVED = new InvoiceStatus(_RESERVED);
    public java.lang.String getValue() { return _value_;}
    public static InvoiceStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InvoiceStatus enumeration = (InvoiceStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InvoiceStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "invoiceStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
