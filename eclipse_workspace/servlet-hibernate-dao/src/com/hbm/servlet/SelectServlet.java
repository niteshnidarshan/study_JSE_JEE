package com.hbm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hbm.dao.StudentDAO;
import com.hbm.dao.StudentDAOFactory;
import com.hbm.model.Student;

public class SelectServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//Read request parameter
		int id = Integer.parseInt(request.getParameter("sid"));
		
		//get object of DAO
		StudentDAO dao = StudentDAOFactory.getInstance();
		
		//invloke dao select method
		Object studentObj = dao.selectStudent(id);
		
		//Return result
		PrintWriter pw = response.getWriter();
		if(studentObj == null) {
			pw.println("No record available for this Student!");
		}
		else
		{
			Student student = (Student)studentObj;
			pw.println("ID = "+student.getId());
			pw.println("Name = "+student.getName());
			pw.println("Marks = "+student.getMarks());
		}
		pw.println("<br>");
		pw.println("<br><a href='index.html'>Home</a>");
		pw.close();
	}
}
