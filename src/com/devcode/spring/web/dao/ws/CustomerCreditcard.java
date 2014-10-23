package com.devcode.spring.web.dao.ws;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerCreditcard {
	
	
	private String sessionId;
	
	
	private String userId;
	
	
	private String merchantId = "4711";
	
	
	private String amount;
	
	
	private String cardHolder;
	
	
	private String creditcardNumber;
	
	private String expiryMonth;
	
	private String expiryYear;
		
	private String cvv;

	public CustomerCreditcard() {

	}

	public CustomerCreditcard(String sessionId, String userId, String merchantId,
			String amount, String cardHolder, String creditcardNumber,
			String expiryMonth, String expiryYear, String cvv) {
		super();
		this.sessionId = sessionId;
		this.userId = userId;
		this.merchantId = merchantId;
		this.amount = amount;
		this.cardHolder = cardHolder;
		this.creditcardNumber = creditcardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvv = cvv;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	

	public String getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}

	public String getCreditcardNumber() {
		return creditcardNumber;
	}

	public void setCreditcardNumber(String creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "CustomerCreditcard [sessionId=" + sessionId + ", userId="
				+ userId + ", merchantId=" + merchantId + ", amount=" + amount
				+ ", cardHolder=" + cardHolder + ", creditcardNumber="
				+ creditcardNumber + ", expiryMonth=" + expiryMonth
				+ ", expiryYear=" + expiryYear + ", cvv=" + cvv + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result
				+ ((cardHolder == null) ? 0 : cardHolder.hashCode());
		result = prime
				* result
				+ ((creditcardNumber == null) ? 0 : creditcardNumber.hashCode());
		result = prime * result + ((cvv == null) ? 0 : cvv.hashCode());
		result = prime * result
				+ ((expiryMonth == null) ? 0 : expiryMonth.hashCode());
		result = prime * result
				+ ((expiryYear == null) ? 0 : expiryYear.hashCode());
		result = prime * result
				+ ((merchantId == null) ? 0 : merchantId.hashCode());
		result = prime * result
				+ ((sessionId == null) ? 0 : sessionId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerCreditcard other = (CustomerCreditcard) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (cardHolder == null) {
			if (other.cardHolder != null)
				return false;
		} else if (!cardHolder.equals(other.cardHolder))
			return false;
		if (creditcardNumber == null) {
			if (other.creditcardNumber != null)
				return false;
		} else if (!creditcardNumber.equals(other.creditcardNumber))
			return false;
		if (cvv == null) {
			if (other.cvv != null)
				return false;
		} else if (!cvv.equals(other.cvv))
			return false;
		if (expiryMonth == null) {
			if (other.expiryMonth != null)
				return false;
		} else if (!expiryMonth.equals(other.expiryMonth))
			return false;
		if (expiryYear == null) {
			if (other.expiryYear != null)
				return false;
		} else if (!expiryYear.equals(other.expiryYear))
			return false;
		if (merchantId == null) {
			if (other.merchantId != null)
				return false;
		} else if (!merchantId.equals(other.merchantId))
			return false;
		if (sessionId == null) {
			if (other.sessionId != null)
				return false;
		} else if (!sessionId.equals(other.sessionId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	
}

