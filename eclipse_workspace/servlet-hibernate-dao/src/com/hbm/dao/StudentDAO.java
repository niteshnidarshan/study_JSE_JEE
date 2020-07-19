package com.hbm.dao;

public interface StudentDAO {

	boolean insertStudent(int id, String name, double marks);
	Object selectStudent(int id);
}
