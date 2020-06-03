package com.maven.boot.rest.services;

import java.util.List;

import com.maven.boot.rest.model.Customer;

public interface CustomerService {

	/**
	 * Create a new Customer
	 * @param customer
	 */
	void create(Customer customer);
	
	/**
	 * Returns a list of all existing Customers
	 * @return
	 */
	List<Customer> readAll();
	
	/**
	 * Returns a Customer based on its Id
	 * @param id
	 * @return
	 */
	Customer read(int id);
	
	/**
	 * Updates the Customer of given id
	 * @param customer
	 * @param id
	 * @return
	 */
	boolean update(Customer customer, int id);
	
	/**
	 * Deletes a Customer of given id
	 * @param id
	 * @return
	 */
	boolean delete(int id);
}
