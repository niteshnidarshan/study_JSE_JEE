package com.hbm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class SelectServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		PrintWriter pw = response.getWriter();
		
		pw.println("No record available for this Student!");
		
		pw.println("<br>");
		pw.println("<br><a href='index.html'>Home</a>");
		pw.close();
	}
}
