package com.devcode.spring.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devcode.spring.service.OrderService;
import com.devcode.spring.service.ProductService;
import com.devcode.spring.web.dao.FormValidationGroup;
import com.devcode.spring.web.dao.Product;

@Controller
public class productController {

	private ProductService productService;
	
	@SuppressWarnings("unused")
	private OrderService orderService;

	@Autowired
	public void setOService(OrderService orderService) {
		this.orderService = orderService;
	}

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	
	@RequestMapping("/products")
	public String showProducts(Model model) {
		
		List<Product> products = productService.getCurrentProducts();

		model.addAttribute("products", products);
		
		return "products";
	}

	@RequestMapping("/addproduct")
	public String addProduct(Model model) {

		model.addAttribute("product", new Product());

		return "addproduct";
	}

	@RequestMapping(value = "/docreate", method = RequestMethod.POST)
	public String doAddProduct(Model model,
			@Validated(FormValidationGroup.class) Product product,
			BindingResult result) {

		if (result.hasErrors()) {

			return "addproduct";

		}

		productService.addOrUpdateProduct(product);

		return "productcreated";
	}

}
