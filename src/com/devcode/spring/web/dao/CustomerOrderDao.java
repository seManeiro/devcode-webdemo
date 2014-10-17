package com.devcode.spring.web.dao;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Component("customerOrderDao")
public class CustomerOrderDao {

	@Autowired
	private SessionFactory sessionfactory;

	public Session session() {

		return sessionfactory.getCurrentSession();
	}

	public void addOrUpdateProduct(CustomerOrder customerOrder) {

		session().saveOrUpdate(customerOrder);
	}

	@SuppressWarnings("unchecked")
	public List<CustomerOrder> getAllOrder() {

		Criteria crit = session().createCriteria(OrderLine.class);

		return crit.list();

	}

	public CustomerOrder getOrder(CustomerOrder orderId) {

		Criteria crit = session().createCriteria(OrderLine.class);
		crit.add(Restrictions.eq("orderId", orderId));

		return (CustomerOrder) crit.uniqueResult();

	}

	public boolean deleteOrder(int orderId) {

		Query query = session().createQuery("delete from CustomerOrder where id=:id");

		query.setLong("id", orderId);

		return query.executeUpdate() == 1;

	}

	public CustomerOrder getOrderById(int id) {

		Criteria crit = session().createCriteria(Product.class);
		crit.add(Restrictions.idEq(id));
		return (CustomerOrder) crit.uniqueResult();
	}

	public void submitOrder(CustomerOrder cart, String customer) {
		
		CustomerOrder customerOrder = new CustomerOrder();
		customerOrder.setOrderLines(cart.getOrderLines());
		customerOrder.setCustomer(customer);
		customerOrder.setDateOrderPlaced(new Date());
		customerOrder.setTotalPrice(cart.getTotalPrice());
		customerOrder.setOredrNumber(UUID.randomUUID().toString());
		
		session().save(customerOrder);
	}


}
