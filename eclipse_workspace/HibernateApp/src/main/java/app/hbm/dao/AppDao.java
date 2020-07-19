package app.hbm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import app.hbm.model.Address;
import app.hbm.model.Customer;
import app.hbm.model.Dealer;
import app.hbm.model.Product;
import app.hbm.utility.HibernateUtility;

public class AppDao {

	public static void insertCustomer(Customer customer){
		
		Session session = null;
		try {
			SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
			
			session = sessionFactory.openSession();
	        
	        Transaction transaction = session.beginTransaction();
	        
	        session.save(customer);
	        
	        transaction.commit();
	        
	        System.out.println("Record inserted successfully!");
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session != null)
				session.close();
		}
	}
	
	public static void retrieveData(int id) {
	
		Session session = null;
		try {
			Customer customer = null;
		
			SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
			
			session = sessionFactory.openSession();
			
			customer = (Customer) session.get(Customer.class, id);
			
			System.out.println(customer);//Use FetchType.EAGER in @OneToMany property of Customer. Then hibernate will fetch all the related table values also in qeury with LEFT OUTER JOIN.
			//System.out.println(customer.getAddresses()); //Used FetchType.EAGER in @OneToMany property of Customer. Then hibernate will fetch all the related table values also in qeury with LEFT OUTER JOIN.
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(session != null)
				session.close();
		}
	}
	public static void insertAddress(Address address){
		
		Session session = null;
		try {
			SessionFactory sessionFactory = HibernateUtility.getSessionFactory();
			
			session = sessionFactory.openSession();
	        
	        Transaction transaction = session.beginTransaction();
	        
	        session.save(address);
	        
	        transaction.commit();
	        
	        System.out.println("Address inserted successfully!");
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(session != null)
				session.close();
		}
	}
	
	public static void insertDealer(Dealer dealer) {
		Session session = null;
		try {
			
			SessionFactory factory = HibernateUtility.getSessionFactory();
			session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(dealer);
			tx.commit();
			System.out.println("Dealer inserted successfully!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
	public static void insertProduct(Product product) {
		Session session = null;
		try {
			
			SessionFactory factory = HibernateUtility.getSessionFactory();
			session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(product);
			tx.commit();
			System.out.println("Product inserted successfully!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}
	
}
