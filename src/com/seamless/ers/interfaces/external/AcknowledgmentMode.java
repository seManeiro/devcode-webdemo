/**
 * AcknowledgmentMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

import freemarker.core.ReturnInstruction.Return;

public class AcknowledgmentMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AcknowledgmentMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_ACKNOWLEDGMENT = "NO_ACKNOWLEDGMENT";
    public static final java.lang.String _OPTIONAL_ACKNOWLEDGMENT = "OPTIONAL_ACKNOWLEDGMENT";
    public static final java.lang.String _REQUIRE_ACKNOWLEDGMENT = "REQUIRE_ACKNOWLEDGMENT";
    public static final AcknowledgmentMode NO_ACKNOWLEDGMENT = new AcknowledgmentMode(_NO_ACKNOWLEDGMENT);
    public static final AcknowledgmentMode OPTIONAL_ACKNOWLEDGMENT = new AcknowledgmentMode(_OPTIONAL_ACKNOWLEDGMENT);
    public static final AcknowledgmentMode REQUIRE_ACKNOWLEDGMENT = new AcknowledgmentMode(_REQUIRE_ACKNOWLEDGMENT);
    public java.lang.String getValue() { return _value_;}
    public static AcknowledgmentMode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AcknowledgmentMode enumeration = (AcknowledgmentMode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AcknowledgmentMode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AcknowledgmentMode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "acknowledgmentMode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public String getAcknowledgmentMode(){
    	return "NO_ACKNOWLEDGMENT";
    }
    
}
