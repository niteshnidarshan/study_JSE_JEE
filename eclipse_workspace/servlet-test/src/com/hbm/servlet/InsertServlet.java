package com.hbm.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
public class InsertServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("Jay Ram G Ki!");
		 
		PrintWriter pw = response.getWriter();
		 
			pw.println("Jay Ram G Ki!");
		 
		pw.println("<br><a href='index.html'>Home</a>");
		pw.close();
	}
}
