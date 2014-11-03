package com.devcode.spring.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Service;

import com.devcode.spring.web.dao.CustomerOrderDao;
import com.devcode.spring.web.dao.ws.CustomerBank;
import com.devcode.spring.web.dao.ws.CustomerCreditcard;
import com.devcode.spring.web.dao.ws.CustomerPayPal;
import com.google.gson.Gson;
import com.seamless.ers.interfaces.external.AcknowledgmentMode;
import com.seamless.ers.interfaces.external.ClientContext;
import com.seamless.ers.interfaces.external.Invoice;
import com.seamless.ers.interfaces.external.PaymentMode;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

@Service("paymentService")
public class PaymentService {

	private String url;
	private Client client = Client.create();
	private Calendar calendar = new GregorianCalendar();

	public boolean verifyCard(CustomerCreditcard customerCreditcard) {

		Gson gson = new Gson();
		String json = gson.toJson(customerCreditcard);
		System.out.println(json);

		WebResource webResource = client
				.resource("http://test.paymentiq.biz:8080/paymentiq/api/creditcard/deposit/process");
		ClientResponse response = webResource.type(
				MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,
				json);

		try {

			JSONObject jsonOutput = new JSONObject(
					response.getEntity(String.class));
			System.out.println(jsonOutput);

			if (jsonOutput.has("errors")) {
				throw new RuntimeException("Failed : "
						+ jsonOutput.getString("errors"));
			}

			boolean success = jsonOutput.getBoolean("success");

			return success;

		} catch (ClientHandlerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (UniformInterfaceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;

	}

	public String bankPayment(CustomerBank customerBank) {

		try {

			Gson gson = new Gson();
			String json = gson.toJson(customerBank);
			System.out.println(json);

			WebResource webResource = client
					.resource("http://test.paymentiq.biz:8080/paymentiq/api/bank/deposit/process");
			ClientResponse response = webResource.type(
					MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,
					json);
			JSONObject jsonOutput = new JSONObject(
					response.getEntity(String.class));

			System.out.println(jsonOutput);

			if (jsonOutput.has("errors")) {

				throw new RuntimeException("Failed : "
						+ jsonOutput.getString("msg"));
			}

			JSONObject redirectOutput = jsonOutput
					.optJSONObject("redirectOutput");

			this.url = redirectOutput.getString("url");

			System.out.println(url);

			return "redirect:" + url;

		} catch (Exception e) {
			e.printStackTrace();

			return "purchasingerror";

		}
	}

	public String payPalPayment(CustomerPayPal customerPayPal) {
		try {

			Gson gson = new Gson();
			String json = gson.toJson(customerPayPal);
			System.out.println(json);

			WebResource webResource = client
					.resource("http://test.paymentiq.biz:8080/paymentiq/api/paypal/deposit/process");
			ClientResponse response = webResource.type(
					MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,
					json);
			JSONObject jsonOutput = new JSONObject(
					response.getEntity(String.class));
			System.out.println(jsonOutput);

			if (jsonOutput.has("errors")) {
				throw new RuntimeException("Failed : "
						+ jsonOutput.getString("errors"));
			}

			JSONObject redirectOutput = jsonOutput
					.optJSONObject("redirectOutput");

			this.url = redirectOutput.getString("url");

			System.out.println(url);

			return "redirect:" + url;

		} catch (Exception e) {
			e.printStackTrace();
			return "purchasingerror";
		}
	}
	
	public void QRPayment(){
		
	}
	
	public Invoice createInvoice(Invoice invoice){
		AcknowledgmentMode ack = null;
		PaymentMode paymentmode = null;
		invoice.setAcknowledgmentMode(ack);
		invoice.setBackURL("thankspage");
		invoice.setClientInvoiceId("Merchant34213421");
		invoice.setFooter("RFC:12389234DKJ3");
		invoice.setInvoiceRows(null);
		invoice.setIssueDate(calendar);
		invoice.setPaymentMode(paymentmode);
		invoice.setTitle("DEVCODE WEBSHOP");
		
	return invoice;
	}

	public ClientContext addClientContext(ClientContext clientContext) {
		clientContext.setClientId("POS Version 3.4.1");
		clientContext.setChannel("ClientWS");
		clientContext.setClientComment(null);
		clientContext.setPassword("1234Qwer");
		clientContext.setClientRequestTimeout(0);
	
		return clientContext;
	}
}