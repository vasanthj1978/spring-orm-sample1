package com.intraedge.spring.springorm.dao;

import com.intraedge.spring.springorm.entity.Product;

public interface ProductDao {
	
	public int create(Product product);
	
	public Product getById(int id);

}

