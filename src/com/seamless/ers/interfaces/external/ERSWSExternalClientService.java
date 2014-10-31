/**
 * ERSWSExternalClientService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.ers.interfaces.external;

public interface ERSWSExternalClientService extends java.rmi.Remote {
    public com.seamless.ers.interfaces.external.ErswsResponse refundPayment(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String ersReference, com.seamless.ers.interfaces.external.Invoice invoice) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsResponse confirmCustomerRegistration(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId principalId, com.seamless.ers.interfaces.external.PrincipalId secondaryPrincipalId, java.lang.String registrationReference) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsMarkTransactionPeriodResponse markTransactionPeriod(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.ParameterMap parameters) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsResponse commitReservation(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsRegisterTerminalResponse registerTerminal(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String externalTerminalId, java.lang.String password, java.lang.String name) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsExecuteReportResponse executeReport(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String reportId, java.lang.String language, com.seamless.ers.interfaces.external.ParameterMap parameters) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsResponse cancelInvoice(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsPrincipalInformationResponse requestPrincipalInformation(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId principalId) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsResponse submitPaymentReceipt(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String ersReference, com.seamless.ers.interfaces.external.ReceiptDocument receiptDocument) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsResponse unregisterTerminal(com.seamless.ers.interfaces.external.ClientContext context) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsPaymentStatusResponse getPaymentStatus(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference, int invoiceVersion) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsPurchaseResponse requestPurchase(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId senderPrincipalId, com.seamless.ers.interfaces.external.PrincipalId receiverPrincipalId, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier senderAccountSpecifier, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier receiverAccountSpecifier, com.seamless.ers.interfaces.external.PurchaseOrderRow[] purchaseOrder) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsResponse updateInvoice(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference, com.seamless.ers.interfaces.external.Invoice invoice, com.seamless.ers.interfaces.external.CustomerToken[] tokens) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse sendInvoice(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.Invoice invoice, com.seamless.ers.interfaces.external.CustomerToken[] tokens) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsTopupResponse requestTopup(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId senderPrincipalId, com.seamless.ers.interfaces.external.PrincipalId topupPrincipalId, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier senderAccountSpecifier, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier topupAccountSpecifier, java.lang.String productId, com.seamless.ers.interfaces.external.Amount amount) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsResponse changePrincipalPassword(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId principalId, java.lang.String newPassword) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsTransferResponse requestTransfer(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId senderPrincipalId, com.seamless.ers.interfaces.external.PrincipalId receiverPrincipalId, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier senderAccountSpecifier, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier receiverAccountSpecifier, java.lang.String productId, com.seamless.ers.interfaces.external.Amount amount) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsResponse assignSeqrId(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String seqrId) throws java.rmi.RemoteException;
    public com.seamless.ers.interfaces.external.ErswsResponse benchmarkingNop() throws java.rmi.RemoteException;
}
