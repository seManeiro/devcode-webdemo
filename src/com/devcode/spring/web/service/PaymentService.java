package com.devcode.spring.web.service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.springframework.stereotype.Service;

import com.devcode.spring.web.dao.CustomerBank;
import com.devcode.spring.web.dao.CustomerCreditcard;
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

		ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class, json);

		System.out.println(response.getStatusInfo().toString());
		
//		if(response.getStatusInfo().toString() == "ok"){
			System.out.println(response.getEntity(String.class));
			return true;
//		}
		
		
//		   return false;
	}
	
	public String bankPayment(CustomerBank customerBank){
		
		Gson gson = new Gson();
		String json = gson.toJson(customerBank);
        System.out.println(json);
		
        WebResource webResource = client.resource("http://dev2.devcode.se/paymentiq/api/bank/deposit/process");
		
        ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class, json);
		
        System.out.println(response.getStatusInfo().toString());
        System.out.println(response.getEntity(String.class));
        
        
		return null;
		
		
	}

}
