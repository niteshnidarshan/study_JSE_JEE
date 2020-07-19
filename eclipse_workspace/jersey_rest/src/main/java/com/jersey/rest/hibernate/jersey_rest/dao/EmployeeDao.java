package com.jersey.rest.hibernate.jersey_rest.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jersey.rest.hibernate.jersey_rest.dbutil.SessionUtil;
import com.jersey.rest.hibernate.jersey_rest.model.Employee;

public class EmployeeDao {

	public void addEmployee(Employee employee) {
		Session session = SessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		addEmployee(session , employee);
		
		tx.commit();
		session.close();
	}

	private void addEmployee(Session session, Employee employee) {
		
		Employee bean = new Employee();
		bean.setName(employee.getName());
		bean.setAge(employee.getAge());
		session.save(bean);
		
	}
	
	public List<Employee> getEmployees(){
        Session session = SessionUtil.getSession();    
        Query query = session.createQuery("from Employee");
        List<Employee> employees =  query.list();
        session.close();
        return employees;
    }
 
    public int deleteEmployee(int id) {
        Session session = SessionUtil.getSession();
        Transaction tx = session.beginTransaction();
        String hql = "delete from Employee where id = :id";
        Query query = session.createQuery(hql);
        query.setInteger("id",id);
        int rowCount = query.executeUpdate();
        System.out.println("Rows affected: " + rowCount);
        tx.commit();
        session.close();
        return rowCount;
    }
    
    public int updateEmployee(int id, Employee emp){
         if(id <=0)  
               return 0;  
         Session session = SessionUtil.getSession();
            Transaction tx = session.beginTransaction();
            String hql = "update Employee set name = :name, age=:age where id = :id";
            Query query = session.createQuery(hql);
            query.setInteger("id",id);
            query.setString("name",emp.getName());
            query.setInteger("age",emp.getAge());
            int rowCount = query.executeUpdate();
            System.out.println("Rows affected: " + rowCount);
            tx.commit();
            session.close();
            return rowCount;
    }
	
}
