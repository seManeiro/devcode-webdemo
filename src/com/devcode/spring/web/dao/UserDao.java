package com.devcode.spring.web.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Component("userDao")
public class UserDao {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private SessionFactory sessionfactory;

	public Session session() {

		return sessionfactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<User> getUsersList() {

		return session().createQuery("from User").list();
	}

	
	
	public void createAdmin(User user) {

		user.setPassword(passwordEncoder.encode(user.getPassword()));
		session().save(user);
	}

	public void createCustomer(User user) {

		user.setPassword(passwordEncoder.encode(user.getPassword()));
		session().save(user);

	}

	public boolean exists(String username) {

		Criteria crit = session().createCriteria(User.class);
		crit.add(Restrictions.idEq(username));
		User user = (User) crit.uniqueResult();

		return user != null;
	}

	public User getUserByUsername(String username) {
		
		return (User) session().createQuery("from User where username=:"+username);
		
		
	}

}