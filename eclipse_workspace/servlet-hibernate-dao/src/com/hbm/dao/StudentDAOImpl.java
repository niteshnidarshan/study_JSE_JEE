package com.hbm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hbm.model.Student;
import com.hbm.util.HibernateUtils;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public boolean insertStudent(int id, String name, double marks) {
		
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setMarks(marks);
		
		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
			session.save(student);
			tx.commit();
			return true;
		}catch(Exception e) {
			tx.rollback();
			return false;
		}finally {
			session.close();
			factory.close();
		}
	}

	@Override
	public Object selectStudent(int id) {

		SessionFactory factory = HibernateUtils.getSessionFactory();
		Session session = factory.openSession();
		Object student = session.get(Student.class, id);
				
		return student;
	}

}
