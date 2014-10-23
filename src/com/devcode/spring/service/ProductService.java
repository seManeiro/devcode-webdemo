package com.devcode.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devcode.spring.web.dao.Product;
import com.devcode.spring.web.dao.ProductDao;

@Service("productService")
public class ProductService {

	private ProductDao productDao;

	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public List<Product> getCurrentProducts() {
		return productDao.getProducts();
	}

	
	public void addOrUpdateProduct(Product product) {
		productDao.addOrUpdateProduct(product);

	}


}
