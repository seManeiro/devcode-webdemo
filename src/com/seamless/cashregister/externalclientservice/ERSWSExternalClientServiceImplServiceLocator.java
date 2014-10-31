/**
 * ERSWSExternalClientServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seamless.cashregister.externalclientservice;

public class ERSWSExternalClientServiceImplServiceLocator extends org.apache.axis.client.Service implements com.seamless.cashregister.externalclientservice.ERSWSExternalClientServiceImplService {

    public ERSWSExternalClientServiceImplServiceLocator() {
    }


    public ERSWSExternalClientServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ERSWSExternalClientServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ERSWSExternalClientServiceImplPort
    private java.lang.String ERSWSExternalClientServiceImplPort_address = "https://extdev.seqr.com/soap/merchant/cashregister-2";

    public java.lang.String getERSWSExternalClientServiceImplPortAddress() {
        return ERSWSExternalClientServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ERSWSExternalClientServiceImplPortWSDDServiceName = "ERSWSExternalClientServiceImplPort";

    public java.lang.String getERSWSExternalClientServiceImplPortWSDDServiceName() {
        return ERSWSExternalClientServiceImplPortWSDDServiceName;
    }

    public void setERSWSExternalClientServiceImplPortWSDDServiceName(java.lang.String name) {
        ERSWSExternalClientServiceImplPortWSDDServiceName = name;
    }

    public com.seamless.ers.interfaces.external.ERSWSExternalClientService getERSWSExternalClientServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ERSWSExternalClientServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getERSWSExternalClientServiceImplPort(endpoint);
    }

    public com.seamless.ers.interfaces.external.ERSWSExternalClientService getERSWSExternalClientServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seamless.cashregister.externalclientservice.ERSWSExternalClientServiceImplServiceSoapBindingStub _stub = new com.seamless.cashregister.externalclientservice.ERSWSExternalClientServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getERSWSExternalClientServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setERSWSExternalClientServiceImplPortEndpointAddress(java.lang.String address) {
        ERSWSExternalClientServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seamless.ers.interfaces.external.ERSWSExternalClientService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seamless.cashregister.externalclientservice.ERSWSExternalClientServiceImplServiceSoapBindingStub _stub = new com.seamless.cashregister.externalclientservice.ERSWSExternalClientServiceImplServiceSoapBindingStub(new java.net.URL(ERSWSExternalClientServiceImplPort_address), this);
                _stub.setPortName(getERSWSExternalClientServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ERSWSExternalClientServiceImplPort".equals(inputPortName)) {
            return getERSWSExternalClientServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://externalclientservice.cashregister.seamless.com/", "ERSWSExternalClientServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://externalclientservice.cashregister.seamless.com/", "ERSWSExternalClientServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ERSWSExternalClientServiceImplPort".equals(portName)) {
            setERSWSExternalClientServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
