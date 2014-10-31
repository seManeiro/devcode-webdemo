/**
 * Invoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public class Invoice  implements java.io.Serializable {
    private com.seamless.ers.interfaces.external.PaymentMode paymentMode;

    private com.seamless.ers.interfaces.external.AcknowledgmentMode acknowledgmentMode;

    private java.util.Calendar issueDate;

    private java.lang.String title;

    private java.lang.String clientInvoiceId;

    private com.seamless.ers.interfaces.external.PaymentInvoiceRow[] invoiceRows;

    private com.seamless.ers.interfaces.external.Amount totalAmount;

    private java.lang.String cashierId;

    private java.lang.String footer;

    private java.lang.String backURL;

    private java.lang.String notificationUrl;

    public Invoice() {
    }

    public Invoice(
           com.seamless.ers.interfaces.external.PaymentMode paymentMode,
           com.seamless.ers.interfaces.external.AcknowledgmentMode acknowledgmentMode,
           java.util.Calendar issueDate,
           java.lang.String title,
           java.lang.String clientInvoiceId,
           com.seamless.ers.interfaces.external.PaymentInvoiceRow[] invoiceRows,
           com.seamless.ers.interfaces.external.Amount totalAmount,
           java.lang.String cashierId,
           java.lang.String footer,
           java.lang.String backURL,
           java.lang.String notificationUrl) {
           this.paymentMode = paymentMode;
           this.acknowledgmentMode = acknowledgmentMode;
           this.issueDate = issueDate;
           this.title = title;
           this.clientInvoiceId = clientInvoiceId;
           this.invoiceRows = invoiceRows;
           this.totalAmount = totalAmount;
           this.cashierId = cashierId;
           this.footer = footer;
           this.backURL = backURL;
           this.notificationUrl = notificationUrl;
    }


    /**
     * Gets the paymentMode value for this Invoice.
     * 
     * @return paymentMode
     */
    public com.seamless.ers.interfaces.external.PaymentMode getPaymentMode() {
        return paymentMode;
    }


    /**
     * Sets the paymentMode value for this Invoice.
     * 
     * @param paymentMode
     */
    public void setPaymentMode(com.seamless.ers.interfaces.external.PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }


    /**
     * Gets the acknowledgmentMode value for this Invoice.
     * 
     * @return acknowledgmentMode
     */
    public com.seamless.ers.interfaces.external.AcknowledgmentMode getAcknowledgmentMode() {
        return acknowledgmentMode;
    }


    /**
     * Sets the acknowledgmentMode value for this Invoice.
     * 
     * @param acknowledgmentMode
     */
    public void setAcknowledgmentMode(com.seamless.ers.interfaces.external.AcknowledgmentMode acknowledgmentMode) {
        this.acknowledgmentMode = acknowledgmentMode;
    }


    /**
     * Gets the issueDate value for this Invoice.
     * 
     * @return issueDate
     */
    public java.util.Calendar getIssueDate() {
        return issueDate;
    }


    /**
     * Sets the issueDate value for this Invoice.
     * 
     * @param issueDate
     */
    public void setIssueDate(java.util.Calendar issueDate) {
        this.issueDate = issueDate;
    }


    /**
     * Gets the title value for this Invoice.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Invoice.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the clientInvoiceId value for this Invoice.
     * 
     * @return clientInvoiceId
     */
    public java.lang.String getClientInvoiceId() {
        return clientInvoiceId;
    }


    /**
     * Sets the clientInvoiceId value for this Invoice.
     * 
     * @param clientInvoiceId
     */
    public void setClientInvoiceId(java.lang.String clientInvoiceId) {
        this.clientInvoiceId = clientInvoiceId;
    }


    /**
     * Gets the invoiceRows value for this Invoice.
     * 
     * @return invoiceRows
     */
    public com.seamless.ers.interfaces.external.PaymentInvoiceRow[] getInvoiceRows() {
        return invoiceRows;
    }


    /**
     * Sets the invoiceRows value for this Invoice.
     * 
     * @param invoiceRows
     */
    public void setInvoiceRows(com.seamless.ers.interfaces.external.PaymentInvoiceRow[] invoiceRows) {
        this.invoiceRows = invoiceRows;
    }


    /**
     * Gets the totalAmount value for this Invoice.
     * 
     * @return totalAmount
     */
    public com.seamless.ers.interfaces.external.Amount getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this Invoice.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(com.seamless.ers.interfaces.external.Amount totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the cashierId value for this Invoice.
     * 
     * @return cashierId
     */
    public java.lang.String getCashierId() {
        return cashierId;
    }


    /**
     * Sets the cashierId value for this Invoice.
     * 
     * @param cashierId
     */
    public void setCashierId(java.lang.String cashierId) {
        this.cashierId = cashierId;
    }


    /**
     * Gets the footer value for this Invoice.
     * 
     * @return footer
     */
    public java.lang.String getFooter() {
        return footer;
    }


    /**
     * Sets the footer value for this Invoice.
     * 
     * @param footer
     */
    public void setFooter(java.lang.String footer) {
        this.footer = footer;
    }


    /**
     * Gets the backURL value for this Invoice.
     * 
     * @return backURL
     */
    public java.lang.String getBackURL() {
        return backURL;
    }


    /**
     * Sets the backURL value for this Invoice.
     * 
     * @param backURL
     */
    public void setBackURL(java.lang.String backURL) {
        this.backURL = backURL;
    }


    /**
     * Gets the notificationUrl value for this Invoice.
     * 
     * @return notificationUrl
     */
    public java.lang.String getNotificationUrl() {
        return notificationUrl;
    }


    /**
     * Sets the notificationUrl value for this Invoice.
     * 
     * @param notificationUrl
     */
    public void setNotificationUrl(java.lang.String notificationUrl) {
        this.notificationUrl = notificationUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Invoice)) return false;
        Invoice other = (Invoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentMode==null && other.getPaymentMode()==null) || 
             (this.paymentMode!=null &&
              this.paymentMode.equals(other.getPaymentMode()))) &&
            ((this.acknowledgmentMode==null && other.getAcknowledgmentMode()==null) || 
             (this.acknowledgmentMode!=null &&
              this.acknowledgmentMode.equals(other.getAcknowledgmentMode()))) &&
            ((this.issueDate==null && other.getIssueDate()==null) || 
             (this.issueDate!=null &&
              this.issueDate.equals(other.getIssueDate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.clientInvoiceId==null && other.getClientInvoiceId()==null) || 
             (this.clientInvoiceId!=null &&
              this.clientInvoiceId.equals(other.getClientInvoiceId()))) &&
            ((this.invoiceRows==null && other.getInvoiceRows()==null) || 
             (this.invoiceRows!=null &&
              java.util.Arrays.equals(this.invoiceRows, other.getInvoiceRows()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.cashierId==null && other.getCashierId()==null) || 
             (this.cashierId!=null &&
              this.cashierId.equals(other.getCashierId()))) &&
            ((this.footer==null && other.getFooter()==null) || 
             (this.footer!=null &&
              this.footer.equals(other.getFooter()))) &&
            ((this.backURL==null && other.getBackURL()==null) || 
             (this.backURL!=null &&
              this.backURL.equals(other.getBackURL()))) &&
            ((this.notificationUrl==null && other.getNotificationUrl()==null) || 
             (this.notificationUrl!=null &&
              this.notificationUrl.equals(other.getNotificationUrl())));
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
        if (getPaymentMode() != null) {
            _hashCode += getPaymentMode().hashCode();
        }
        if (getAcknowledgmentMode() != null) {
            _hashCode += getAcknowledgmentMode().hashCode();
        }
        if (getIssueDate() != null) {
            _hashCode += getIssueDate().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getClientInvoiceId() != null) {
            _hashCode += getClientInvoiceId().hashCode();
        }
        if (getInvoiceRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceRows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getCashierId() != null) {
            _hashCode += getCashierId().hashCode();
        }
        if (getFooter() != null) {
            _hashCode += getFooter().hashCode();
        }
        if (getBackURL() != null) {
            _hashCode += getBackURL().hashCode();
        }
        if (getNotificationUrl() != null) {
            _hashCode += getNotificationUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Invoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "invoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "paymentMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acknowledgmentMode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acknowledgmentMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "acknowledgmentMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("invoiceRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "paymentInvoiceRow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "invoiceRow"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashierId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cashierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("footer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "footer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationUrl"));
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
