/**
 * Receipt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class Receipt  implements java.io.Serializable {
    private java.lang.String terminalId;

    private java.util.Calendar paymentDate;

    private java.lang.String clientInvoiceId;

    private java.lang.String invoiceReference;

    private java.lang.String paymentReference;

    private java.lang.String payerTerminalId;

    private java.lang.String receiverName;

    private com.seamless.ers.interfaces.external.Invoice invoice;

    public Receipt() {
    }

    public Receipt(
           java.lang.String terminalId,
           java.util.Calendar paymentDate,
           java.lang.String clientInvoiceId,
           java.lang.String invoiceReference,
           java.lang.String paymentReference,
           java.lang.String payerTerminalId,
           java.lang.String receiverName,
           com.seamless.ers.interfaces.external.Invoice invoice) {
           this.terminalId = terminalId;
           this.paymentDate = paymentDate;
           this.clientInvoiceId = clientInvoiceId;
           this.invoiceReference = invoiceReference;
           this.paymentReference = paymentReference;
           this.payerTerminalId = payerTerminalId;
           this.receiverName = receiverName;
           this.invoice = invoice;
    }


    /**
     * Gets the terminalId value for this Receipt.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this Receipt.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets the paymentDate value for this Receipt.
     * 
     * @return paymentDate
     */
    public java.util.Calendar getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this Receipt.
     * 
     * @param paymentDate
     */
    public void setPaymentDate(java.util.Calendar paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the clientInvoiceId value for this Receipt.
     * 
     * @return clientInvoiceId
     */
    public java.lang.String getClientInvoiceId() {
        return clientInvoiceId;
    }


    /**
     * Sets the clientInvoiceId value for this Receipt.
     * 
     * @param clientInvoiceId
     */
    public void setClientInvoiceId(java.lang.String clientInvoiceId) {
        this.clientInvoiceId = clientInvoiceId;
    }


    /**
     * Gets the invoiceReference value for this Receipt.
     * 
     * @return invoiceReference
     */
    public java.lang.String getInvoiceReference() {
        return invoiceReference;
    }


    /**
     * Sets the invoiceReference value for this Receipt.
     * 
     * @param invoiceReference
     */
    public void setInvoiceReference(java.lang.String invoiceReference) {
        this.invoiceReference = invoiceReference;
    }


    /**
     * Gets the paymentReference value for this Receipt.
     * 
     * @return paymentReference
     */
    public java.lang.String getPaymentReference() {
        return paymentReference;
    }


    /**
     * Sets the paymentReference value for this Receipt.
     * 
     * @param paymentReference
     */
    public void setPaymentReference(java.lang.String paymentReference) {
        this.paymentReference = paymentReference;
    }


    /**
     * Gets the payerTerminalId value for this Receipt.
     * 
     * @return payerTerminalId
     */
    public java.lang.String getPayerTerminalId() {
        return payerTerminalId;
    }


    /**
     * Sets the payerTerminalId value for this Receipt.
     * 
     * @param payerTerminalId
     */
    public void setPayerTerminalId(java.lang.String payerTerminalId) {
        this.payerTerminalId = payerTerminalId;
    }


    /**
     * Gets the receiverName value for this Receipt.
     * 
     * @return receiverName
     */
    public java.lang.String getReceiverName() {
        return receiverName;
    }


    /**
     * Sets the receiverName value for this Receipt.
     * 
     * @param receiverName
     */
    public void setReceiverName(java.lang.String receiverName) {
        this.receiverName = receiverName;
    }


    /**
     * Gets the invoice value for this Receipt.
     * 
     * @return invoice
     */
    public com.seamless.ers.interfaces.external.Invoice getInvoice() {
        return invoice;
    }


    /**
     * Sets the invoice value for this Receipt.
     * 
     * @param invoice
     */
    public void setInvoice(com.seamless.ers.interfaces.external.Invoice invoice) {
        this.invoice = invoice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Receipt)) return false;
        Receipt other = (Receipt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate()))) &&
            ((this.clientInvoiceId==null && other.getClientInvoiceId()==null) || 
             (this.clientInvoiceId!=null &&
              this.clientInvoiceId.equals(other.getClientInvoiceId()))) &&
            ((this.invoiceReference==null && other.getInvoiceReference()==null) || 
             (this.invoiceReference!=null &&
              this.invoiceReference.equals(other.getInvoiceReference()))) &&
            ((this.paymentReference==null && other.getPaymentReference()==null) || 
             (this.paymentReference!=null &&
              this.paymentReference.equals(other.getPaymentReference()))) &&
            ((this.payerTerminalId==null && other.getPayerTerminalId()==null) || 
             (this.payerTerminalId!=null &&
              this.payerTerminalId.equals(other.getPayerTerminalId()))) &&
            ((this.receiverName==null && other.getReceiverName()==null) || 
             (this.receiverName!=null &&
              this.receiverName.equals(other.getReceiverName()))) &&
            ((this.invoice==null && other.getInvoice()==null) || 
             (this.invoice!=null &&
              this.invoice.equals(other.getInvoice())));
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
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getClientInvoiceId() != null) {
            _hashCode += getClientInvoiceId().hashCode();
        }
        if (getInvoiceReference() != null) {
            _hashCode += getInvoiceReference().hashCode();
        }
        if (getPaymentReference() != null) {
            _hashCode += getPaymentReference().hashCode();
        }
        if (getPayerTerminalId() != null) {
            _hashCode += getPayerTerminalId().hashCode();
        }
        if (getReceiverName() != null) {
            _hashCode += getReceiverName().hashCode();
        }
        if (getInvoice() != null) {
            _hashCode += getInvoice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Receipt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "receipt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientInvoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientInvoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentReference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerTerminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payerTerminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "invoice"));
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
