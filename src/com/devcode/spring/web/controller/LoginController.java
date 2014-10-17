package com.devcode.spring.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.devcode.spring.web.dao.FormValidationGroup;
import com.devcode.spring.web.dao.User;
import com.devcode.spring.web.service.UsersService;

@Controller
public class LoginController {

	private UsersService usersService;

	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/login")
	public String showLogin() {

		return "login";
	}

	@RequestMapping("/loggedout")
	public String showLoggOut() {

		return "loggedout";
	}

	@RequestMapping("/newaccount")
	public String createAccount(Model model) {

		model.addAttribute("user", new User());

		return "newaccount";
	}

	@RequestMapping(value = "/createaccount", method = RequestMethod.POST)
	public String createAccount(@Validated(FormValidationGroup.class) User user, BindingResult result) {

		if (result.hasErrors()) {

			return "newaccount";

		}

		user.setAuthority("ROLE_ADMIN");
		user.setEnabled(true);

		if (usersService.exists(user.getUsername())) {
			result.rejectValue("username", "DuplicateKey.user.username");
			return "newaccount";
		}

		try {
			usersService.createAdmin(user);

		} catch (DataAccessException e) {
			result.rejectValue("username", "DuplicateKey.user.username");
			return "newaccount";
		}

		return "accountcreated";
	}

	@RequestMapping("/newcustomeraccount")
	public String newcustomeraccount(Model model) {

		model.addAttribute("user", new User());

		return "newcustomeraccount";
	}

	
	@RequestMapping(value = "/createcustomeraccount", method = RequestMethod.POST)
	public String createCustomerAccount(@Validated(FormValidationGroup.class) User user, BindingResult result) {

		
		if (result.hasErrors()) {

			return "newcustomeraccount";

		}

		user.setAuthority("ROLE_USER");
		user.setEnabled(true);

		if (usersService.exists(user.getUsername())) {
			result.rejectValue("username", "DuplicateKey.user.username");
			return "newcustomeraccount";
		}
		try {
			usersService.createCustomer(user);

		} catch (DataAccessException e) {
			result.rejectValue("username", "DuplicateKey.user.username");
			return "newcustomeraccount";
		}

		return "customeraccountcreated";
	}
	
	    @InitBinder
	    public void initBinder(WebDataBinder binder) {
	        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
	        sdf.setLenient(true);
	        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	    }

}
