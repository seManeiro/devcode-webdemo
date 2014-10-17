package com.devcode.spring.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();

		product.setId(rs.getInt("id"));
		product.setCategory(rs.getString("category"));
		product.setBrand(rs.getString("brand"));
		product.setName(rs.getString("name"));
		product.setOrigin(rs.getString("origin"));
		product.setCode(rs.getString("code"));
		product.setPrice(rs.getDouble("price"));
		product.setQuantity(rs.getInt("quantity"));
		product.setDescription(rs.getString("description"));
		product.setImg(rs.getString("img"));
		

		return product;
	}

}
