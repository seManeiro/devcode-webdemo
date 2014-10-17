package com.devcode.spring.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();

		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setEmail(rs.getString("email"));
		user.setEnabled(rs.getBoolean("true"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setCountry(rs.getString("country"));
		user.setCity(rs.getString("city"));
		user.setZipcode(rs.getString("zipcode"));
		user.setStreet(rs.getString("street"));
		user.setPhone(rs.getString("phone"));

		return user;
	}

}
