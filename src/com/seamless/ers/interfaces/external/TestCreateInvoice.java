package com.seamless.ers.interfaces.external;

public class TestCreateInvoice {
	
	private String acknowMode= "NO_ACKNOWLEDGMENT";
	private String payMode= "IMMEDIATE_DEBIT";
	
	public TestCreateInvoice(){
		
	}
	
	AcknowledgmentMode acknowledgmentMode = new AcknowledgmentMode(acknowMode);
	
	PaymentMode paymentmode = new PaymentMode(payMode);

	public AcknowledgmentMode getAcknowledgmentMode() {
		return acknowledgmentMode;
	}

	public void setAcknowledgmentMode(AcknowledgmentMode acknowledgmentMode) {
		this.acknowledgmentMode = acknowledgmentMode;
	}

	public PaymentMode getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(PaymentMode paymentmode) {
		this.paymentmode = paymentmode;
	}

	
	
	
	
	

}
