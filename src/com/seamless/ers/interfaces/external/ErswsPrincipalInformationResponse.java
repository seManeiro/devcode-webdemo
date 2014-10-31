/**
 * ErswsPrincipalInformationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class ErswsPrincipalInformationResponse  extends com.seamless.ers.interfaces.external.ErswsResponse  implements java.io.Serializable {
    private com.seamless.ers.interfaces.external.Principal requestedPrincipal;

    public ErswsPrincipalInformationResponse() {
    }

    public ErswsPrincipalInformationResponse(
           java.lang.String ersReference,
           int resultCode,
           java.lang.String resultDescription,
           com.seamless.ers.interfaces.external.Principal requestedPrincipal) {
        super(
            ersReference,
            resultCode,
            resultDescription);
        this.requestedPrincipal = requestedPrincipal;
    }


    /**
     * Gets the requestedPrincipal value for this ErswsPrincipalInformationResponse.
     * 
     * @return requestedPrincipal
     */
    public com.seamless.ers.interfaces.external.Principal getRequestedPrincipal() {
        return requestedPrincipal;
    }


    /**
     * Sets the requestedPrincipal value for this ErswsPrincipalInformationResponse.
     * 
     * @param requestedPrincipal
     */
    public void setRequestedPrincipal(com.seamless.ers.interfaces.external.Principal requestedPrincipal) {
        this.requestedPrincipal = requestedPrincipal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErswsPrincipalInformationResponse)) return false;
        ErswsPrincipalInformationResponse other = (ErswsPrincipalInformationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.requestedPrincipal==null && other.getRequestedPrincipal()==null) || 
             (this.requestedPrincipal!=null &&
              this.requestedPrincipal.equals(other.getRequestedPrincipal())));
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
        if (getRequestedPrincipal() != null) {
            _hashCode += getRequestedPrincipal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErswsPrincipalInformationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsPrincipalInformationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestedPrincipal"));
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
