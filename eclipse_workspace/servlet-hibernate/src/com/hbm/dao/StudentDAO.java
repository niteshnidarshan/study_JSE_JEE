package com.hbm.dao;

public interface StudentDAO {

	boolean insertStudent(String name, double marks);
	Object selectStudent(int id);
}
