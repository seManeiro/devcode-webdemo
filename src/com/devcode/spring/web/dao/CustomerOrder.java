package com.devcode.spring.web.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "customer_order")
public class CustomerOrder {

	@Id
	@GeneratedValue
	@Basic(optional = false)
	@NotNull
	@Column(name = "orderId")
	private Integer orderId;

	
	@Column(name = "oredrNumber")
	private String oredrNumber;

	@Column(name = "date_order_placed")
	@Temporal(TemporalType.DATE)
	private Date dateOrderPlaced;

//	@ManyToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn(name = "customerId")
	@Column(name = "customerId")
	private String customer;

	@Column(name = "total_order_price")
	private double totalPrice;

//	(mappedBy = "order", cascade = CascadeType.PERSIST)
//	@OneToMany
	@Transient
	private Collection<OrderLine> orderLines;

	public CustomerOrder() {
	}

	public CustomerOrder(int orderId) {
		this.orderId = orderId;
	}


	public Collection<OrderLine> getOrderLines() {
		if(orderLines==null){
			orderLines = new ArrayList<OrderLine>();
		}
		return orderLines;
	}

	public void setOrderLines(Collection<OrderLine> orderLine) {
		this.orderLines = orderLine;
	}


	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOredrNumber() {
		return oredrNumber;
	}

	public void setOredrNumber(String oredrNumber) {
		this.oredrNumber = oredrNumber;
	}

	public Date getDateOrderPlaced() {
		return dateOrderPlaced;
	}

	public void setDateOrderPlaced(Date dateOrderPlaced) {
		this.dateOrderPlaced = dateOrderPlaced;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime * result
				+ ((dateOrderPlaced == null) ? 0 : dateOrderPlaced.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result
				+ ((orderLines == null) ? 0 : orderLines.hashCode());
		result = prime * result
				+ ((oredrNumber == null) ? 0 : oredrNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(totalPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerOrder other = (CustomerOrder) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (dateOrderPlaced == null) {
			if (other.dateOrderPlaced != null)
				return false;
		} else if (!dateOrderPlaced.equals(other.dateOrderPlaced))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderLines == null) {
			if (other.orderLines != null)
				return false;
		} else if (!orderLines.equals(other.orderLines))
			return false;
		if (oredrNumber == null) {
			if (other.oredrNumber != null)
				return false;
		} else if (!oredrNumber.equals(other.oredrNumber))
			return false;
		if (Double.doubleToLongBits(totalPrice) != Double
				.doubleToLongBits(other.totalPrice))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerOrder [orderId=" + orderId + ", oredrNumber="
				+ oredrNumber + ", dateOrderPlaced=" + dateOrderPlaced
				+ ", customer=" + customer + ", totalPrice=" + totalPrice
				+ ", orderLines=" + orderLines + "]";
	}



}
