package com.sky.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sky.demo.entity.Product;

public class SaveObjectTest {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory sessionFactory = null;
		Session session =null;
		product product = null;
		
		cfg = new Configuration();
		cfg.configure("com/sky/demo/cfgs/hibernate.cfg.xml");
		
		sessionFactory=cfg.buildSessionFactory();
		
		session = sessionFactory.openSession();
		product = new Product();
		product.setPid(1);
		product.setPname("keyboard");
		product.setPrice(9999.99f);
		product.setQty(1);
		
		session.save(product);
		
}
}
