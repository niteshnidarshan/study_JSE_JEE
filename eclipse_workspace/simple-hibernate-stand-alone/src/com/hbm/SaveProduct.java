package com.hbm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbm.model.Product;

public class SaveProduct {

	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure("/resources/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Product product = new Product();
		//product.setProductId(111);// Auto incremented in product.hbm.xml
		product.setProductName("JollyZoom");
		product.setPrice(1000.00);
		
		Transaction tx = session.beginTransaction();
		
		session.save(product);
		
		tx.commit();
		
		session.close();
		factory.close();
				
	}
}
