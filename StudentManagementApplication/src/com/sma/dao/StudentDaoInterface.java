package com.sma.dao;

import com.sma.model.Student;

public interface StudentDaoInterface {

	public void showAllStudent();
	public boolean insert(Student s);
	public boolean delete(int roll);
	public boolean update(int roll,String update,int ch,Student s);
	public boolean showStudentById(int roll);
}
