package com.maven.boot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maven.boot.rest.model.Customer;
import com.maven.boot.rest.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService)
	{
		this.customerService = customerService;
	}
	
	@PostMapping(value = "/customers")
	public ResponseEntity<?> create(@RequestBody Customer customer){
		customerService.create(customer);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/customers")
	public ResponseEntity<List<Customer>> read(){
		final List<Customer> customers = customerService.readAll();
		
		return customers != null && !customers.isEmpty()? new ResponseEntity<>(customers, HttpStatus.OK): new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value = "/customers/{id}")
	public ResponseEntity<Customer> read(@PathVariable(name = "id") int id){
		final Customer customer = customerService.read(id);
		
		return customer != null? new ResponseEntity<>(customer, HttpStatus.OK): new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping(value = "/customers/{id}")
	public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Customer customer){
		final boolean updated = customerService.update(customer, id);
		return updated? new ResponseEntity<>(HttpStatus.OK): new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
	}
	
	@DeleteMapping(value  = "/customers/{id}")
	public ResponseEntity<?> delete(@PathVariable(name = "id") int id){
		final boolean deleted = customerService.delete(id);
		
		return deleted? new ResponseEntity<>(HttpStatus.OK): new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
	}

}
