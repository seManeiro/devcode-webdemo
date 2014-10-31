/**
 * ERSWSExternalClientServiceImplServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.cashregister.externalclientservice;

public class ERSWSExternalClientServiceImplServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.seamless.ers.interfaces.external.ERSWSExternalClientService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("refundPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ersReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "invoice"), com.seamless.ers.interfaces.external.Invoice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmCustomerRegistration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "principalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "secondaryPrincipalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "registrationReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("markTransactionPeriod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "parameterMap"), com.seamless.ers.interfaces.external.ParameterMap.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsMarkTransactionPeriodResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsMarkTransactionPeriodResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("commitReservation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reportId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "parameterMap"), com.seamless.ers.interfaces.external.ParameterMap.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsExecuteReportResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsExecuteReportResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("registerTerminal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "externalTerminalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsRegisterTerminalResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsRegisterTerminalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestPrincipalInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "principalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsPrincipalInformationResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsPrincipalInformationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitPaymentReceipt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ersReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiptDocument"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "receiptDocument"), com.seamless.ers.interfaces.external.ReceiptDocument.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unregisterTerminal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPaymentStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsPaymentStatusResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsPaymentStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestPurchase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senderPrincipalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiverPrincipalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senderAccountSpecifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier"), com.seamless.ers.interfaces.external.PrincipalAccountSpecifier.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiverAccountSpecifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier"), com.seamless.ers.interfaces.external.PrincipalAccountSpecifier.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "purchaseOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "purchaseOrderRow"), com.seamless.ers.interfaces.external.PurchaseOrderRow[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsPurchaseResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsPurchaseResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoiceReference"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "invoice"), com.seamless.ers.interfaces.external.Invoice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tokens"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "customerToken"), com.seamless.ers.interfaces.external.CustomerToken[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestTopup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senderPrincipalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "topupPrincipalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senderAccountSpecifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier"), com.seamless.ers.interfaces.external.PrincipalAccountSpecifier.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "topupAccountSpecifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier"), com.seamless.ers.interfaces.external.PrincipalAccountSpecifier.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"), com.seamless.ers.interfaces.external.Amount.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsTopupResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsTopupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "invoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "invoice"), com.seamless.ers.interfaces.external.Invoice.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "tokens"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "customerToken"), com.seamless.ers.interfaces.external.CustomerToken[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsSendInvoiceResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("changePrincipalPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "principalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senderPrincipalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiverPrincipalId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId"), com.seamless.ers.interfaces.external.PrincipalId.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "senderAccountSpecifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier"), com.seamless.ers.interfaces.external.PrincipalAccountSpecifier.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "receiverAccountSpecifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier"), com.seamless.ers.interfaces.external.PrincipalAccountSpecifier.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "productId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "amount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount"), com.seamless.ers.interfaces.external.Amount.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsTransferResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsTransferResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("assignSeqrId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "context"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext"), com.seamless.ers.interfaces.external.ClientContext.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "seqrId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("benchmarkingNop");
        oper.setReturnType(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse"));
        oper.setReturnClass(com.seamless.ers.interfaces.external.ErswsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

    }

    public ERSWSExternalClientServiceImplServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ERSWSExternalClientServiceImplServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ERSWSExternalClientServiceImplServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", ">erswsPaymentStatusResponse>customerTokens");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.CustomerToken[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "customerToken");
            qName2 = new javax.xml.namespace.QName("", "token");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", ">invoice>invoiceRows");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.PaymentInvoiceRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "paymentInvoiceRow");
            qName2 = new javax.xml.namespace.QName("", "invoiceRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", ">principal>accounts");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.PrincipalAccount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccount");
            qName2 = new javax.xml.namespace.QName("", "account");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "acknowledgmentMode");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.AcknowledgmentMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "amount");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.Amount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "clientContext");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ClientContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "customerToken");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.CustomerToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsExecuteReportResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsExecuteReportResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsMarkTransactionPeriodResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsMarkTransactionPeriodResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsPaymentStatusResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsPaymentStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsPrincipalInformationResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsPrincipalInformationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsPurchaseResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsPurchaseResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsRegisterTerminalResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsRegisterTerminalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsSendInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsTopupResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsTopupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "erswsTransferResponse");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ErswsTransferResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "invoice");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.Invoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "invoiceStatus");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.InvoiceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "mapArray");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.Parameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "parameter");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "parameter");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.Parameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "parameterMap");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ParameterMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "paymentInvoiceRow");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.PaymentInvoiceRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "paymentMode");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.PaymentMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principal");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.Principal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccount");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.PrincipalAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalAccountSpecifier");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.PrincipalAccountSpecifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalId");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.PrincipalId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "principalPurchaseProductSpecifier");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.PrincipalPurchaseProductSpecifier.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "purchaseOrderRow");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.PurchaseOrderRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "receipt");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.Receipt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "receiptDocument");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.ReceiptDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "report");
            cachedSerQNames.add(qName);
            cls = com.seamless.ers.interfaces.external.Report.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.seamless.ers.interfaces.external.ErswsResponse refundPayment(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String ersReference, com.seamless.ers.interfaces.external.Invoice invoice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "refundPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, ersReference, invoice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsResponse confirmCustomerRegistration(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId principalId, com.seamless.ers.interfaces.external.PrincipalId secondaryPrincipalId, java.lang.String registrationReference) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "confirmCustomerRegistration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, principalId, secondaryPrincipalId, registrationReference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsMarkTransactionPeriodResponse markTransactionPeriod(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.ParameterMap parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "markTransactionPeriod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsMarkTransactionPeriodResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsMarkTransactionPeriodResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsMarkTransactionPeriodResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsResponse commitReservation(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "commitReservation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, invoiceReference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsExecuteReportResponse executeReport(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String reportId, java.lang.String language, com.seamless.ers.interfaces.external.ParameterMap parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "executeReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, reportId, language, parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsExecuteReportResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsExecuteReportResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsExecuteReportResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsRegisterTerminalResponse registerTerminal(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String externalTerminalId, java.lang.String password, java.lang.String name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "registerTerminal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, externalTerminalId, password, name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsRegisterTerminalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsRegisterTerminalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsRegisterTerminalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsResponse cancelInvoice(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "cancelInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, invoiceReference});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsPrincipalInformationResponse requestPrincipalInformation(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId principalId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "requestPrincipalInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, principalId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsPrincipalInformationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsPrincipalInformationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsPrincipalInformationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsResponse submitPaymentReceipt(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String ersReference, com.seamless.ers.interfaces.external.ReceiptDocument receiptDocument) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "submitPaymentReceipt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, ersReference, receiptDocument});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsResponse unregisterTerminal(com.seamless.ers.interfaces.external.ClientContext context) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "unregisterTerminal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsPaymentStatusResponse getPaymentStatus(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference, int invoiceVersion) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "getPaymentStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, invoiceReference, new java.lang.Integer(invoiceVersion)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsPaymentStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsPaymentStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsPaymentStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsPurchaseResponse requestPurchase(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId senderPrincipalId, com.seamless.ers.interfaces.external.PrincipalId receiverPrincipalId, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier senderAccountSpecifier, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier receiverAccountSpecifier, com.seamless.ers.interfaces.external.PurchaseOrderRow[] purchaseOrder) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "requestPurchase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, senderPrincipalId, receiverPrincipalId, senderAccountSpecifier, receiverAccountSpecifier, purchaseOrder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsPurchaseResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsPurchaseResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsPurchaseResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsResponse updateInvoice(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference, com.seamless.ers.interfaces.external.Invoice invoice, com.seamless.ers.interfaces.external.CustomerToken[] tokens) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "updateInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, invoiceReference, invoice, tokens});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsTopupResponse requestTopup(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId senderPrincipalId, com.seamless.ers.interfaces.external.PrincipalId topupPrincipalId, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier senderAccountSpecifier, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier topupAccountSpecifier, java.lang.String productId, com.seamless.ers.interfaces.external.Amount amount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "requestTopup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, senderPrincipalId, topupPrincipalId, senderAccountSpecifier, topupAccountSpecifier, productId, amount});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsTopupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsTopupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsTopupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse sendInvoice(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.Invoice invoice, com.seamless.ers.interfaces.external.CustomerToken[] tokens) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "sendInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, invoice, tokens});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsResponse changePrincipalPassword(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId principalId, java.lang.String newPassword) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "changePrincipalPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, principalId, newPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsTransferResponse requestTransfer(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId senderPrincipalId, com.seamless.ers.interfaces.external.PrincipalId receiverPrincipalId, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier senderAccountSpecifier, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier receiverAccountSpecifier, java.lang.String productId, com.seamless.ers.interfaces.external.Amount amount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "requestTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, senderPrincipalId, receiverPrincipalId, senderAccountSpecifier, receiverAccountSpecifier, productId, amount});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsTransferResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsTransferResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsTransferResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsResponse assignSeqrId(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String seqrId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "assignSeqrId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {context, seqrId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.seamless.ers.interfaces.external.ErswsResponse benchmarkingNop() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://external.interfaces.ers.seamless.com/", "benchmarkingNop"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.seamless.ers.interfaces.external.ErswsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.seamless.ers.interfaces.external.ErswsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.seamless.ers.interfaces.external.ErswsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
