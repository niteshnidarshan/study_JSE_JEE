package com.hbm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbm.model.Student;

public class InsertServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("Jay Ram G Ki!");
		//Collect data from request
		int id = Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("sname");
		double marks = Double.parseDouble(request.getParameter("marks"));
		
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class); //If hibernate.cfg.xml file name then to pass this name is optional in configuration(). If file name is other than this then need to provide name.
        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        Object flag = session.save(student);
        
        transaction.commit();
        
        session.close();
        sessionFactory.close();
		//Return message
		PrintWriter pw = response.getWriter();
		
		if(flag != null) {
			pw.println("Student information inserted successfully!");
		}
		else
		{
			pw.println("Record could not inserted!");
		}
		
		pw.println("<br><a href='index.html'>Home</a>");
		pw.close();
	}
}
