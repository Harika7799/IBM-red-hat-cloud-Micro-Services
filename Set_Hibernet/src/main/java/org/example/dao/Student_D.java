package org.example.dao;

import java.util.List;

import org.example.set.Student;


public interface Student_D {
	
	public Student createStudent(Student Stu);
	public List<Student> displayAllStudent();
	public Student getStudentById(Integer id);
	public Student updateStudent(Integer id);
	public void deleteStudent(Integer id);

}


