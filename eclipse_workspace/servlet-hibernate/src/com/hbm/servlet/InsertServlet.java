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

import com.hbm.dao.StudentDAO;
import com.hbm.dao.StudentDAOFactory;
import com.hbm.model.Student;

public class InsertServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("Jay Ram G Ki!");
		//Collect data from request
		//int id = Integer.parseInt(request.getParameter("sid"));
		String name = request.getParameter("sname");
		double marks = Double.parseDouble(request.getParameter("marks"));
		
		//DAO reference
		StudentDAO dao = StudentDAOFactory.getInstance();
		//StudentDAO dao = new StudentDAOImpl();
		
		//invoke dao insert method
		boolean flag = dao.insertStudent(name, marks);
		
		/* JDBC connection test
		boolean flag = false;
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notes_app", "root", "abc@031391743");
			stmt = con.createStatement();
			int result = stmt.executeUpdate("insert into student(id,name,marks) values("+id+",'"+name+"',"+marks+")");
			if(result>0)
				flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		
		/*Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setMarks(marks);
		
		Configuration configuration = new Configuration().configure("com/hbm/config/hibernate.cfg.xml").addAnnotatedClass(Student.class); //If hibernate.cfg.xml file name then to pass this name is optional in configuration(). If file name is other than this then need to provide name.
        
		//ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(); //Deprecated from hibernate 4
		//SessionFactory sessionFactory = configuration.buildSessionFactory(registry);
		
		Session session = sessionFactory.openSession();
        
        Transaction transaction = session.beginTransaction();
        
        Object o = session.save(student);
        
        transaction.commit();
        
        session.close();
        sessionFactory.close();
		
		*/
		//Return message
		PrintWriter pw = response.getWriter();
		pw.println("<html><center>");
		if(flag) {
			pw.println("<p>Student information inserted successfully!</p>");
		}
		else
		{
			pw.println("<p>Record could not inserted!</p>");
		}
		
		pw.println("<br>");
		pw.println("<a href='index.html'>Home</a>");
		pw.println("</center></html>");
		pw.close();
	}
}
