package com.devcode.spring.web.service.response;

public class CreditcardRest {
	
	private String errors;
	private String field;
	private String keys;
	private String msg;
	private String redirectOutput;
	private String messages;
	private String txRefId;
	private String success;
	
	public CreditcardRest(){
		
	}
	
	

	public CreditcardRest(String errors, String field, String keys, String msg,
			String redirectOutput, String messages, String txRefId,
			String success) {
	
		this.errors = errors;
		this.field = field;
		this.keys = keys;
		this.msg = msg;
		this.redirectOutput = redirectOutput;
		this.messages = messages;
		this.txRefId = txRefId;
		this.success = success;
	}



	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getRedirectOutput() {
		return redirectOutput;
	}

	public void setRedirectOutput(String redirectOutput) {
		this.redirectOutput = redirectOutput;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}

	public String getTxRefId() {
		return txRefId;
	}

	public void setTxRefId(String txRefId) {
		this.txRefId = txRefId;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "CreditcardRest [errors=" + errors + ", field=" + field
				+ ", keys=" + keys + ", msg=" + msg + ", redirectOutput="
				+ redirectOutput + ", messages=" + messages + ", txRefId="
				+ txRefId + ", success=" + success + "]";
	}

	
}
