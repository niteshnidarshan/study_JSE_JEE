package com.boot.hibernate.mysql.springboothibernatemysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.hibernate.mysql.springboothibernatemysql.dao.PersonDao;
import com.boot.hibernate.mysql.springboothibernatemysql.model.Person;

@RestController
@RequestMapping("/spring-boot-orm")
public class PersonController {
	
	@Autowired
	PersonDao personDao;

	@PostMapping("/savePerson")
	public String save(@RequestBody Person person){
		
		personDao.savePerson(person);
		
		return "Success";
	}
	
	@GetMapping("/getAll")
	public List<Person> getAllPersons(){
		return personDao.getPersons();
	}
}
