package com.devcode.spring.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devcode.spring.web.dao.CustomerOrder;
import com.devcode.spring.web.dao.CustomerOrderDao;
import com.devcode.spring.web.dao.OrderLine;
import com.devcode.spring.web.dao.Product;
import com.devcode.spring.web.dao.ProductDao;

@Service("orderService")
public class OrderService {

	

	@Autowired
	private ProductDao productDao;

	@Autowired
	private CustomerOrderDao cutomerOrderDao;

	public void addProduct(int productId, int qty, CustomerOrder cart) {
		OrderLine existingOrderLine = getExistsingOrderLine(productId,
				cart.getOrderLines());
		if (existingOrderLine != null) {
			int newQty = existingOrderLine.getQuantity() + qty;
			existingOrderLine.setQuantity(newQty);
		} else {
			Product product = productDao.getProductById(productId);
			OrderLine orderline = new OrderLine();
			orderline.setProduct(product);
			orderline.setProductId(product.getId());
			orderline.setQuantity(qty);
			orderline.setPrice(product.getPrice());
			cart.getOrderLines().add(orderline);
		}
	}

	public void removeProduct(int productId, CustomerOrder cart) {

		OrderLine existingOrderLine = getExistsingOrderLine(productId,
				cart.getOrderLines());
		cart.getOrderLines().remove(existingOrderLine);

	}

	private OrderLine getExistsingOrderLine(int productId,
			Collection<OrderLine> orderLines) {
		for (OrderLine orderLine : orderLines) {
			if (orderLine.getProduct().getId() == productId) {
				return orderLine;
			}
		}
		return null;
	}

	public void calculateCart(CustomerOrder cart) {
		Collection<OrderLine> orderLines = cart.getOrderLines();
		double totalPrice = 0;
		for (OrderLine orderLine : orderLines) {
			totalPrice += orderLine.getQuantity() * orderLine.getPrice();
		}
		cart.setTotalPrice(totalPrice);
	}

	public void submitOrder(CustomerOrder cart, String customer ) {
		
		cutomerOrderDao.submitOrder(cart,customer);
		
	}




}
