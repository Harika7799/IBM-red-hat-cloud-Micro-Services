package org.example.service;

import java.util.List;

import org.example.set.Student;

public interface Student_S {
	public Student createStudent(Student stu);
	public List<Student> displayAllStudent();
	public Student findById(Integer id);
	public Student updateStudent(Integer id);
	public void deleteStudent(Integer id);

}
