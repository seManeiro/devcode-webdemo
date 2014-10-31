package com.seamless.ers.interfaces.external;

public class ERSWSExternalClientServiceProxy implements com.seamless.ers.interfaces.external.ERSWSExternalClientService {
  private String _endpoint = null;
  private com.seamless.ers.interfaces.external.ERSWSExternalClientService eRSWSExternalClientService = null;
  
  public ERSWSExternalClientServiceProxy() {
    _initERSWSExternalClientServiceProxy();
  }
  
  public ERSWSExternalClientServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initERSWSExternalClientServiceProxy();
  }
  
  private void _initERSWSExternalClientServiceProxy() {
    try {
      eRSWSExternalClientService = (new com.seamless.cashregister.externalclientservice.ERSWSExternalClientServiceImplServiceLocator()).getERSWSExternalClientServiceImplPort();
      if (eRSWSExternalClientService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eRSWSExternalClientService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eRSWSExternalClientService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eRSWSExternalClientService != null)
      ((javax.xml.rpc.Stub)eRSWSExternalClientService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.seamless.ers.interfaces.external.ERSWSExternalClientService getERSWSExternalClientService() {
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService;
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse refundPayment(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String ersReference, com.seamless.ers.interfaces.external.Invoice invoice) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.refundPayment(context, ersReference, invoice);
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse confirmCustomerRegistration(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId principalId, com.seamless.ers.interfaces.external.PrincipalId secondaryPrincipalId, java.lang.String registrationReference) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.confirmCustomerRegistration(context, principalId, secondaryPrincipalId, registrationReference);
  }
  
  public com.seamless.ers.interfaces.external.ErswsMarkTransactionPeriodResponse markTransactionPeriod(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.ParameterMap parameters) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.markTransactionPeriod(context, parameters);
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse commitReservation(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.commitReservation(context, invoiceReference);
  }
  
  public com.seamless.ers.interfaces.external.ErswsRegisterTerminalResponse registerTerminal(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String externalTerminalId, java.lang.String password, java.lang.String name) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.registerTerminal(context, externalTerminalId, password, name);
  }
  
  public com.seamless.ers.interfaces.external.ErswsExecuteReportResponse executeReport(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String reportId, java.lang.String language, com.seamless.ers.interfaces.external.ParameterMap parameters) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.executeReport(context, reportId, language, parameters);
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse cancelInvoice(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.cancelInvoice(context, invoiceReference);
  }
  
  public com.seamless.ers.interfaces.external.ErswsPrincipalInformationResponse requestPrincipalInformation(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId principalId) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.requestPrincipalInformation(context, principalId);
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse submitPaymentReceipt(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String ersReference, com.seamless.ers.interfaces.external.ReceiptDocument receiptDocument) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.submitPaymentReceipt(context, ersReference, receiptDocument);
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse unregisterTerminal(com.seamless.ers.interfaces.external.ClientContext context) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.unregisterTerminal(context);
  }
  
  public com.seamless.ers.interfaces.external.ErswsPaymentStatusResponse getPaymentStatus(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference, int invoiceVersion) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.getPaymentStatus(context, invoiceReference, invoiceVersion);
  }
  
  public com.seamless.ers.interfaces.external.ErswsPurchaseResponse requestPurchase(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId senderPrincipalId, com.seamless.ers.interfaces.external.PrincipalId receiverPrincipalId, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier senderAccountSpecifier, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier receiverAccountSpecifier, com.seamless.ers.interfaces.external.PurchaseOrderRow[] purchaseOrder) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.requestPurchase(context, senderPrincipalId, receiverPrincipalId, senderAccountSpecifier, receiverAccountSpecifier, purchaseOrder);
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse updateInvoice(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String invoiceReference, com.seamless.ers.interfaces.external.Invoice invoice, com.seamless.ers.interfaces.external.CustomerToken[] tokens) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.updateInvoice(context, invoiceReference, invoice, tokens);
  }
  
  public com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse sendInvoice(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.Invoice invoice, com.seamless.ers.interfaces.external.CustomerToken[] tokens) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.sendInvoice(context, invoice, tokens);
  }
  
  public com.seamless.ers.interfaces.external.ErswsTopupResponse requestTopup(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId senderPrincipalId, com.seamless.ers.interfaces.external.PrincipalId topupPrincipalId, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier senderAccountSpecifier, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier topupAccountSpecifier, java.lang.String productId, com.seamless.ers.interfaces.external.Amount amount) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.requestTopup(context, senderPrincipalId, topupPrincipalId, senderAccountSpecifier, topupAccountSpecifier, productId, amount);
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse changePrincipalPassword(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId principalId, java.lang.String newPassword) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.changePrincipalPassword(context, principalId, newPassword);
  }
  
  public com.seamless.ers.interfaces.external.ErswsTransferResponse requestTransfer(com.seamless.ers.interfaces.external.ClientContext context, com.seamless.ers.interfaces.external.PrincipalId senderPrincipalId, com.seamless.ers.interfaces.external.PrincipalId receiverPrincipalId, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier senderAccountSpecifier, com.seamless.ers.interfaces.external.PrincipalAccountSpecifier receiverAccountSpecifier, java.lang.String productId, com.seamless.ers.interfaces.external.Amount amount) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.requestTransfer(context, senderPrincipalId, receiverPrincipalId, senderAccountSpecifier, receiverAccountSpecifier, productId, amount);
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse assignSeqrId(com.seamless.ers.interfaces.external.ClientContext context, java.lang.String seqrId) throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.assignSeqrId(context, seqrId);
  }
  
  public com.seamless.ers.interfaces.external.ErswsResponse benchmarkingNop() throws java.rmi.RemoteException{
    if (eRSWSExternalClientService == null)
      _initERSWSExternalClientServiceProxy();
    return eRSWSExternalClientService.benchmarkingNop();
  }
  
  
}