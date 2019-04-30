package com.intraedge.spring.springorm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intraedge.spring.springorm.dao.ProductDao;
import com.intraedge.spring.springorm.entity.Product;

public class OrmTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"configOrm.xml");
		ProductDao productDao = (ProductDao) context.getBean("productDaoImpl");
		Product product = new Product();
		product.setId(30);
		product.setName("Samsung");
		product.setDesc("nice phone");
		product.setPrice(1000);
		productDao.create(product);
	}

}
