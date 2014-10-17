package com.devcode.spring.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devcode.spring.web.dao.User;
import com.devcode.spring.web.service.UsersService;

@Controller
public class HomeController {

	private static Logger logger = Logger.getLogger(HomeController.class);

	private UsersService usersService;

	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/")
	public String showHome() {

		logger.info("Showing home page: ");
		return "home";
	}

	@RequestMapping("/denied")
	public String showDenied() {

		return "denied";
	}

	@RequestMapping("/admin")
	public String showAdmin(Model model) {

		List<User> users = usersService.getUsersList();

		model.addAttribute("users", users);
		
		

		return "admin";
	}

}
