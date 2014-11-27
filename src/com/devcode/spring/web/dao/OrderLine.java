package com.devcode.spring.web.dao;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "orderline")
public class OrderLine {

	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "id")
	private int id;

	@Column(name = "price")
	private double price;

	@Column(name = "quantity")
	private int quantity;


	@Column (name = "orderId")
	private String orderId;
	
	@Transient
	private CustomerOrder customerOrder;

	@Column(name = "productId")
	private int productId;
	
	@Transient
	private Product product;

	public OrderLine() {
	}
	

	public OrderLine(int id, double price, int quantity,
			String orderId, int productId ) {
	
		
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.orderId = orderId;
		this.productId = productId;
		
	}

	
	

	public String getOrderId() {
		return orderId;
	}


	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public CustomerOrder getOrder() {
		return customerOrder;
	}

	public void setOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public OrderLine(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int newQty) {
		this.quantity = newQty;
	}

	





	
}
