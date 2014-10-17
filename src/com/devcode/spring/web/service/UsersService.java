package com.devcode.spring.web.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devcode.spring.web.dao.User;
import com.devcode.spring.web.dao.UserDao;

@Service("userservice")
public class UsersService  {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	public List<User> getCurrentUsers() {
		return userDao.getUsersList();
	}

	
	
	public void createAdmin(User user) {
		userDao.createAdmin(user);

	}

	
	public void createCustomer(User user) {
		userDao.createCustomer(user);
		
	}

	public boolean exists(String username) {
		
		return userDao.exists(username);
	}


	public List<User> getUsersList() {
		
		return userDao.getUsersList();
	}


	
	public User getCurrentUser(HttpServletRequest request) {

		User user = (User) request.getUserPrincipal();
		
		if (user == null) {
			return user = new User();
		}
		return user;

	}
		
	 public User getUserByUsername(String username) throws UsernameNotFoundException {
	        final User user = userDao.getUserByUsername(username);
	        if(user == null) {
	            throw new UsernameNotFoundException("No user found for username '" + username +"'.");
	        }
	        return user;
	    }
	


}
