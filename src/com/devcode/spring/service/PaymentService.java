package com.devcode.spring.service;

import java.io.IOException;
import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Service;

import com.devcode.spring.web.dao.ws.CustomerBank;
import com.devcode.spring.web.dao.ws.CustomerCreditcard;
import com.devcode.spring.web.dao.ws.CustomerPayPal;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;

@Service("paymentService")
public class PaymentService {

	Client client = Client.create();

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
						+ jsonOutput.getString("error_message"));
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

			if (jsonOutput.has("errors")) {

				throw new RuntimeException("Failed : "+jsonOutput.getString("success")+ jsonOutput.getString("error_message"));
			}

			String url = jsonOutput.getString("url");

			System.out.println(url);

			return "redirect:" + url;

		} catch (Exception e) {
			e.printStackTrace();
		

		return "purchasingerror";
		// String redirectUrl = "http://www.yahoo.com";
		// return "redirect:" + redirectUrl;
		}
	}

	public String payPalPayment(CustomerPayPal customerPayPal) {
		try {

			Gson gson = new Gson();
			String json = gson.toJson(customerPayPal);
			System.out.println(json);

			WebResource webResource = client.resource("http://test.paymentiq.biz:8080/paymentiq/api/paypal/deposit/process");
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,json);
			JSONObject jsonOutput = new JSONObject(response.getEntity(String.class));
			System.out.println(jsonOutput);

			if (jsonOutput.has("errors")) {	
				throw new RuntimeException("Failed : "+jsonOutput.getString("success"));	
			}
			
			String url = jsonOutput.getString("url");

			System.out.println(url);

			return "redirect:" + url;
			
		} catch (Exception e) {
			e.printStackTrace();
			return "purchasingerror";
		}
	}
}