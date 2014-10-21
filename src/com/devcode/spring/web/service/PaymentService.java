package com.devcode.spring.web.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.stereotype.Service;

import com.devcode.spring.web.dao.CustomerBank;
import com.devcode.spring.web.dao.CustomerCreditcard;
import com.devcode.spring.web.service.response.CreditcardRest;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

@Service("paymentService")
public class PaymentService {

	Client client = Client.create();

	public boolean verifyCard(CustomerCreditcard customerCreditcard) {

		Gson gson = new Gson();
		String json = gson.toJson(customerCreditcard);
		System.out.println(json);

		WebResource webResource = client.resource("http://dev2.devcode.se/paymentiq/api/creditcard/deposit/process");

		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,json);
		System.out.println(response.getProperties().toString());

		String status = response.getEntity(String.class);
		System.out.println(status);
		
		   ObjectMapper mapper = new ObjectMapper();

		   try {
			@SuppressWarnings("unchecked")
			Map<String,String> state = mapper.readValue(status, Map.class);
			
			boolean success = state.containsValue(true);

			return success;
			
		} catch (JsonParseException e) {
			
			e.printStackTrace();
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	   
		   
		   return false;
	}

	public String bankPayment(CustomerBank customerBank) {

		Gson gson = new Gson();
		String json = gson.toJson(customerBank);
		System.out.println(json);

		WebResource webResource = client.resource("http://dev2.devcode.se/paymentiq/api/bank/deposit/process");

		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class, json);

		String status = response.getEntity(String.class);
		System.out.println(status);
		
		   ObjectMapper mapper = new ObjectMapper();

		   try {
			@SuppressWarnings("unchecked")
			Map<String,String> state = mapper.readValue(status, Map.class);
			
			String redirectOutput = null;
			
			redirectOutput = state.toString();
			
			System.out.println(redirectOutput);

			return redirectOutput;
			
		} catch (JsonParseException e) {
			
			e.printStackTrace();
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	   
		   
		   return null;
	}
	

}
