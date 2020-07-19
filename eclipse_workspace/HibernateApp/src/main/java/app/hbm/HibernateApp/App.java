package app.hbm.HibernateApp;

import java.util.ArrayList;
import java.util.List;

import app.hbm.dao.AppDao;
import app.hbm.model.Address;
import app.hbm.model.Dealer;
import app.hbm.model.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//AppDao.retrieveData(101);
    	
//    	AddressShipping addressShipping = new AddressShipping();
//        addressShipping.setLine1("Ayodhhya Nagari");
//        addressShipping.setLine2("Kaushal");
//        addressShipping.setLine3("Bharat");
//        addressShipping.setLandmark("Ayodhhya");
//        addressShipping.setPin("123456");
//        
//        Customer customer = new Customer();
//        customer.setId(106);
//        customer.setName("Shatrughan G");
//        customer.setAge(27);
//        customer.setAddressShipping(addressShipping);
    	
    	//AppDao.insertCustomer(customer);
    	//AppDao.retrieveData(106);
    	/*
    	List<Address> addressList = new ArrayList<Address>();
    	
    	Address a = new Address();
        a.setAddressType("Customer");
        a.setCity("Patna");
        a.setCountry("India");
        a.setLine1("Line1");
        a.setPin("123456");
        a.setLattitude(23.559938);
        a.setLongitude(333.333334);
        
        Address b = new Address();
        b.setAddressType("Customer");
        b.setCity("Lakhhisarai");
        b.setCountry("India");
        b.setLine1("Line1");
        b.setPin("123456");
        b.setLattitude(23.559938);
        b.setLongitude(333.333334);
        
        addressList.add(a);
        addressList.add(b);
        
    	Customer customer = new Customer();
        customer.setId(101);
        customer.setName("RAM G");
        customer.setAge(27);
        customer.setAddresses(addressList);
    	
        AppDao.insertAddress(a);
        AppDao.insertAddress(b);
        AppDao.insertCustomer(customer);
        */
    	
    	Address a = new Address();
        a.setAddressType("Dealer");
        a.setCity("Ayodhhya");
        a.setCountry("India");
        a.setLine1("Line1");
        a.setPin("123456");
        a.setLattitude(23.559938);
        a.setLongitude(333.333334);
    	
    	List<Product> pList = new ArrayList<Product>();
    	
    	Product p1 = new Product();
    	p1.setName("Product_1");
    	p1.setSalePrice(2000);
    	
    	Product p2 = new Product();
    	p2.setName("Product_2");
    	p2.setSalePrice(2000);
    	
    	pList.add(p1);
    	pList.add(p2);
    	
    	Dealer d1 = new Dealer();
    	d1.setName("Ram G");
    	d1.setShopeName("World");
    	d1.setPhone("12345678910+");
    	d1.setAddress(a);
    	d1.setProduct(pList);
    	
    	
    	AppDao.insertAddress(a);
    	AppDao.insertProduct(p1);
    	AppDao.insertProduct(p2);
    	AppDao.insertDealer(d1);
    }
}
