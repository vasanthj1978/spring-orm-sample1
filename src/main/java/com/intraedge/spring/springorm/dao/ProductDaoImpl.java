package com.intraedge.spring.springorm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.intraedge.spring.springorm.entity.Product;

@Component
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional 
	public int create(Product product) {
		return (Integer) hibernateTemplate.save(product);
	}

	public Product getById(int id) {
		return hibernateTemplate.get(Product.class, id);
	}

}
