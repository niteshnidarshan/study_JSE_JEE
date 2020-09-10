package com.boot.hibernate.mysql.springboothibernatemysql.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boot.hibernate.mysql.springboothibernatemysql.model.Person;

@Repository
@Transactional
public class PersonDao {

	@Autowired(required=true)
	private SessionFactory factory;
	
	private Session getSession(){
		Session session = factory.getCurrentSession();
		if(session == null){
			session = factory.openSession();
		}
		return session;
	}
	
	public void savePerson(Person person){
		getSession().save(person);
	}
	
	//@SuppressWarnings("unchecked")
	public List<Person> getPersons(){
		//return getSession().createCriteria(Person.class).list();
		Session session = getSession();
		NativeQuery<Person> nq = session.createNativeQuery("select * from PERSON",Person.class);
		List<Person> list = nq.getResultList();
		return list;
	}
}
