package com.devcode.spring.web.resources;

import java.net.URI;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.json.JSONObject;

import com.devcode.spring.web.dao.CustomerCreditcard;
import com.devcode.spring.web.service.OrderService;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

@Path("/customer")
public class CustomerResource {
	
	private OrderService orderService;
	
	
	


	ClientConfig config = new DefaultClientConfig();
	
	Client client = Client.create(config);
	
	ClientResponse response = null;
	
	WebResource service = client.resource(getBaseURI());
	
	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://dev2.devcode.se/paymentiq/api").build();
	}

//	public boolean authenticateCustomerCreditcard(){
//				
//	response = service.path("rest").path("todos").type(MediaType.APPLICATION_JSON).post(ClientResponse.class,creditcardData);
//	return false;
//	}
	

	
	



}
