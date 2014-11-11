package com.devcode.spring.web.controller;

import java.net.MalformedURLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

import com.devcode.spring.service.OrderService;
import com.devcode.spring.service.PaymentService;
import com.devcode.spring.web.dao.CustomerOrder;
import com.devcode.spring.web.dao.FormValidationGroup;
import com.devcode.spring.web.dao.ws.CustomerBank;
import com.devcode.spring.web.dao.ws.CustomerCreditcard;
import com.devcode.spring.web.dao.ws.CustomerPayPal;
import com.seamless.ers.interfaces.external.ErswsSendInvoiceResponse;

@Controller
public class OrderController {

	private OrderService orderService;

	private PaymentService paymentService;

	@Autowired
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@Autowired
	public void setOService(OrderService orderService) {
		this.orderService = orderService;
	}

	@RequestMapping("/addtocart")
	public String addToCart(HttpServletRequest request,
			@RequestParam(value = "productId", required = true) int productId,
			@RequestParam(value = "qty", required = true) int qty) {

		CustomerOrder cart = getCurrentCart(request);

		if (qty == 0) {
			return "redirect:/products";
		}
		orderService.addProduct(productId, qty, cart);
		return "redirect:/products";

	}

	private CustomerOrder getCurrentCart(HttpServletRequest request) {
		CustomerOrder cart = (CustomerOrder) request.getSession().getAttribute(
				"cart");
		if (cart != null) {
			return cart;
		}
		cart = new CustomerOrder();
		request.getSession().setAttribute("cart", cart);
		return cart;
	}

	@RequestMapping("/checkout")
	public String checkOut(HttpServletRequest request, Model model) {

		CustomerOrder cart = getCurrentCart(request);
		orderService.calculateCart(cart);
		model.addAttribute("cart", cart);
		model.addAttribute("customerCreditcard", new CustomerCreditcard());
		model.addAttribute("customerPayPal", new CustomerPayPal());

		return "checkout";

	}

	@RequestMapping("/paypal")
	public String payPal(HttpServletRequest request, Model model) {

		CustomerOrder cart = getCurrentCart(request);
		orderService.calculateCart(cart);
		model.addAttribute("cart", cart);
		model.addAttribute("customerCreditcard", new CustomerCreditcard());
		model.addAttribute("customerPayPal", new CustomerPayPal());

		return "paypal";

	}

	@RequestMapping(value = "/verifyCustomerCreditcard", method = RequestMethod.POST)
	public String verifyCustomerCreditcard(
			HttpServletRequest request,
			Model model,
			@Validated(FormValidationGroup.class) CustomerCreditcard customerCreditcard,
			BindingResult result) {

		if (result.hasErrors()) {
			return "checkout";

		}
		customerCreditcard.setSessionId(RequestContextHolder.currentRequestAttributes().getSessionId());
		customerCreditcard.setUserId(SecurityContextHolder.getContext() .getAuthentication().getName());

		CustomerOrder cart = getCurrentCart(request);
		orderService.calculateCart(cart);

		if (paymentService.verifyCard(customerCreditcard) == true) {

			String customer = SecurityContextHolder.getContext().getAuthentication().getName();
			orderService.submitOrder(cart, customer);

			return "thankspage";
		}

		return "purchasingerror";

	}

	@RequestMapping("/sendinvoice")
	public String SendInvoiceSEQR(HttpServletRequest request) {

		return "qrcodepayment";
	}

	
	@RequestMapping("/qrcodepayment")
	public String sEQRPayment(HttpServletRequest request, Model model) {

		CustomerOrder cart = getCurrentCart(request);
		orderService.calculateCart(cart);
		
		try {
			
			ErswsSendInvoiceResponse invoiceResponse = paymentService.sendInvoice(cart);
            paymentService.generateQRCode(invoiceResponse);
					
//			String customer = SecurityContextHolder.getContext().getAuthentication().getName();
//			orderService.submitOrder(cart, customer);
				return "qrsepayment";
				
			
		
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		

		return "purchasingerror";

	}
	
	@RequestMapping(value ="/bankPayment",method = RequestMethod.GET)
	public ModelAndView  bankPayment(HttpServletRequest request, Model model,@Validated(FormValidationGroup.class) CustomerBank customerBank,
			                           BindingResult result) {

		customerBank.setSessionId(RequestContextHolder.currentRequestAttributes().getSessionId());
		customerBank.setUserId(SecurityContextHolder.getContext().getAuthentication().getName());

		CustomerOrder cart = getCurrentCart(request);
		orderService.calculateCart(cart);
		double totalAmount = cart.getTotalPrice();
		String amount = Double.toString(totalAmount);
		customerBank.setAmount(amount);
//		model.addAttribute("exUrl", new ModelAndView("redirect:" + paymentService.bankPayment(customerBank)));
		
		return new ModelAndView("redirect:"+ paymentService.bankPayment(customerBank));
	
	}

	@RequestMapping("/bankLink")
	public String bankLink(HttpServletRequest request) {

		return "thankspage";

	}

	@RequestMapping(value = "/PayPalPayment", method = RequestMethod.POST)
	public ModelAndView PayPalPayment(
			HttpServletRequest request,
			Model model,
			@Validated(FormValidationGroup.class) CustomerPayPal customerPayPal,
			BindingResult result) {

		if (result.hasErrors()) {

			return  new ModelAndView("purchasingerror");

		}
		customerPayPal.setSessionId(RequestContextHolder.currentRequestAttributes().getSessionId());
		customerPayPal.setUserId(SecurityContextHolder.getContext().getAuthentication().getName());

		CustomerOrder cart = getCurrentCart(request);
		orderService.calculateCart(cart);
		double totalAmount = cart.getTotalPrice();
		String amount = Double.toString(totalAmount);
		customerPayPal.setAmount(amount);

		 return  new ModelAndView(paymentService.payPalPayment(customerPayPal));

	}

	@RequestMapping("/cart")
	public String showCart(HttpServletRequest request, Model model) {
		CustomerOrder cart = getCurrentCart(request);
		orderService.calculateCart(cart);
		model.addAttribute("cart", cart);
		return "cart";
	}

	@RequestMapping("/removeproduct")
	public String updateCart(HttpServletRequest request,
			@RequestParam(value = "productId", required = true) int productId,
			Model model) {

		CustomerOrder cart = getCurrentCart(request);
		orderService.removeProduct(productId, cart);
		model.addAttribute("cart", cart);
		return "redirect:/cart";
	}

	@RequestMapping("/remove")
	public String updateCheckout(HttpServletRequest request,
			@RequestParam(value = "productId", required = true) int productId,
			Model model) {

		CustomerOrder cart = getCurrentCart(request);
		orderService.removeProduct(productId, cart);
		model.addAttribute("cart", cart);
		return "redirect:/checkout";
	}

}
