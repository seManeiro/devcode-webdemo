package com.devcode.spring.web.dao;

import java.util.List;

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
@Component("productDao")
public class ProductDao {

	@Autowired
	private SessionFactory sessionfactory;


	public Session session() {

		return sessionfactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {

		return session().createQuery("from Product").list();
	}

	public void addOrUpdateProduct(Product product) {

		session().saveOrUpdate(product);
	}

	public boolean exists(int id) {

		Criteria crit = session().createCriteria(Product.class);
		crit.add(Restrictions.idEq(id));
		Product product = (Product) crit.uniqueResult();

		return product != null;

	}

	public boolean deleteProduct(int id) {

		Query query = session().createQuery("delete from Product where id=:id");

		query.setLong("id", id);

		return query.executeUpdate() == 1;

	}

	public Product getProductById(int id) {

		Criteria crit = session().createCriteria(Product.class);
		crit.add(Restrictions.idEq(id));
		return (Product) crit.uniqueResult();
	}

}