package com.devcode.spring.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;

import javax.ws.rs.core.MediaType;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import org.apache.axis.AxisFault;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;

import com.devcode.spring.web.dao.CustomerOrder;
import com.devcode.spring.web.dao.OrderLine;
import com.devcode.spring.web.dao.Product;
import com.devcode.spring.web.dao.ws.CustomerBank;
import com.devcode.spring.web.dao.ws.CustomerCreditcard;
import com.devcode.spring.web.dao.ws.CustomerPayPal;
import com.google.gson.Gson;
import com.seamless.cashregister.externalclientservice.ERSWSExternalClientServiceImplServiceSoapBindingStub;
import com.seamless.ers.interfaces.external.Amount;
import com.seamless.ers.interfaces.external.ClientContext;
import com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse;
import com.seamless.ers.interfaces.external.Invoice;
import com.seamless.ers.interfaces.external.PaymentInvoiceRow;
import com.seamless.ers.interfaces.external.PrincipalId;
import com.seamless.ers.interfaces.external.TestCreateInvoice;
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

			WebResource webResource = client.resource("http://test.paymentiq.biz:8080/paymentiq/api/bank/deposit/process");
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,json);
			JSONObject jsonOutput = new JSONObject(response.getEntity(String.class));

			System.out.println(jsonOutput);

			if (jsonOutput.has("errors")) {

				throw new RuntimeException("Failed : " + jsonOutput.getString("msg"));
			}

			JSONObject redirectOutput = jsonOutput.optJSONObject("redirectOutput");

			this.url = redirectOutput.getString("url");

			System.out.println(url);

			return url;

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

			WebResource webResource = client.resource("http://test.paymentiq.biz:8080/paymentiq/api/paypal/deposit/process");
			ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).post(ClientResponse.class,json);
			JSONObject jsonOutput = new JSONObject(response.getEntity(String.class));
			System.out.println(jsonOutput);

			if (jsonOutput.has("errors")) {
				throw new RuntimeException("Failed : "+ jsonOutput.getString("errors"));
			}

			JSONObject redirectOutput = jsonOutput.optJSONObject("redirectOutput");

			this.url = redirectOutput.getString("url");

			System.out.println(url);

			return "redirect:" + url;

		} catch (Exception e) {
			e.printStackTrace();
			return "purchasingerror";
		}
	}

	
	public ErswsSendInvoiceResponse sendInvoice(CustomerOrder cart) throws MalformedURLException {

		ClientContext clientContext = new ClientContext();
		Invoice invoice = new Invoice();
		
		try {
			String url = "https://extdev.seqr.com/extclientproxy/service/v2?wsdl";
			URL endpointURL = new URL(url);
			ERSWSExternalClientServiceImplServiceSoapBindingStub erswsClient = new ERSWSExternalClientServiceImplServiceSoapBindingStub(endpointURL,null);

			ErswsSendInvoiceResponse invoiceResponse  = new ErswsSendInvoiceResponse();

            invoiceResponse = erswsClient.sendInvoice(addClientContext(clientContext),createInvoice(invoice,cart), null);
			
			return invoiceResponse;

		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;

	}

	public FileOutputStream generateQRCode(ErswsSendInvoiceResponse invoiceResponse){
		
		String invoiceQRCode = invoiceResponse.getInvoiceQRCode();
		ByteArrayOutputStream out = QRCode.from(invoiceQRCode).to(ImageType.PNG).stream();
				
		       try {
				
				FileOutputStream fileOut = new FileOutputStream(new File("C:\\Users\\se\\workspace\\devcode\\devcode-webdemo-9-ws\\WebContent\\resources\\img\\DEVCODE_QR_Code.PNG"));
				
				fileOut.write(out.toByteArray());
				
				return fileOut;
		
			} catch (FileNotFoundException e) {
				// Do Logging
				e.printStackTrace();
			} catch (IOException e) {
				// Do Logging
				e.printStackTrace();
		}
				return null;	
	}
		
		
	

	public ClientContext addClientContext(ClientContext clientContext) {
		
		PrincipalId principalId = new PrincipalId();
		principalId.setId("8609bf533abf4a20816e8bfe76639521");
		principalId.setType("TERMINALID");
		principalId.setUserId(SecurityContextHolder.getContext().getAuthentication().getName());

		clientContext.setInitiatorPrincipalId(principalId);
		clientContext.setClientReference(RequestContextHolder.currentRequestAttributes().getSessionId());
		clientContext.setClientId("POS Version 3.4.1");
		clientContext.setChannel("ClientWS");
		clientContext.setClientComment(null);
		clientContext.setPassword("1234Qwer");
		clientContext.setClientRequestTimeout(0);
		clientContext.setPassword("N2YFUhKaB1ZSuVF");

		return clientContext;
	}


	public Invoice createInvoice(Invoice invoice,CustomerOrder cart) {

		invoice.setInvoiceRows(createInvoiceRow(cart));
		Amount amount = new Amount();
		BigDecimal value = new BigDecimal(cart.getTotalPrice(),MathContext.DECIMAL64);
		String currency = "USD";
		amount.setCurrency(currency);
		amount.setValue(value);

		invoice.setTotalAmount(amount);
		invoice.setCashierId(SecurityContextHolder.getContext().getAuthentication().getName());
		
		TestCreateInvoice tci = new TestCreateInvoice();		
		invoice.setAcknowledgmentMode(tci.getAcknowledgmentMode());
		invoice.setPaymentMode(tci.getPaymentmode());
		invoice.setBackURL("thankspage");
		invoice.setClientInvoiceId("Merchant34213421");
		invoice.setFooter("RFC:12389234DKJ3");
		invoice.setIssueDate(calendar);

		invoice.setTitle("Grand Cinema");

		return invoice;
	}

	public PaymentInvoiceRow[] createInvoiceRow(CustomerOrder cart) {

		List<OrderLine> orderLines = (List<OrderLine>) cart.getOrderLines();
		Collection<PaymentInvoiceRow> invoiceRowsList = new ArrayList<PaymentInvoiceRow>();

		for (OrderLine orderLine : orderLines) {

			PaymentInvoiceRow invoiceRow = new PaymentInvoiceRow();
			Product product = new Product();
			product = orderLine.getProduct();
			int pquantity = orderLine.getQuantity();
			BigDecimal quantity = new BigDecimal(String.valueOf(pquantity));
			int totalPrice = (int) (product.getPrice() * pquantity);
			double unitPrice = product.getPrice();
			BigDecimal totalAmount = new BigDecimal(String.valueOf(totalPrice));
			BigDecimal unitPriceBD = new BigDecimal(String.valueOf(unitPrice));
			Amount amount = new Amount();
			amount.setCurrency("USD");
			amount.setValue(totalAmount);
			Amount unitAmount = new Amount();
			unitAmount.setCurrency("USD");
			unitAmount.setValue(unitPriceBD);

			invoiceRow.setItemDescription(product.getDescription());
			invoiceRow.setItemDiscount(null);
			invoiceRow.setItemEAN(null);
			invoiceRow.setItemQuantity(quantity);
			invoiceRow.setItemSKU(null);
			invoiceRow.setItemTaxRate(null);
			invoiceRow.setItemTotalAmount(amount);
			invoiceRow.setItemUnit(String.valueOf(orderLine.getQuantity()));
			invoiceRow.setItemUnitPrice(unitAmount);
			invoiceRowsList.add(invoiceRow);

		}
		return invoiceRowsList.toArray(new PaymentInvoiceRow[invoiceRowsList
				.size()]);
	}

	
}