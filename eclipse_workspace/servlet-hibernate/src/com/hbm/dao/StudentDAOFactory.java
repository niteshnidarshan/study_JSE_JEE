package com.hbm.dao;

public class StudentDAOFactory {

	public static StudentDAO getInstance() {
		return new StudentDAOImpl();
	} 
}
