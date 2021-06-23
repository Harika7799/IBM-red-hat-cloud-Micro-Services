package org.example.service;

import java.util.List;

import org.example.dao.Student_D;
import org.example.dao.Student_D2;
import org.example.set.Student;

public class Student_I implements Student_S{
	private Student_D  S1;
	{
		S1 =new Student_D2();
	}
	@Override
	public Student createStudent(Student stu) {
		
		return S1.createStudent(stu);
	}

	@Override
	public List<Student> displayAllStudent() {
		
		return S1.displayAllStudent();
	}

	@Override
	public Student findById(Integer id) {
		
		return S1.getStudentById(id);
	}

	@Override
	public Student updateStudent(Integer id) {
		
		return S1.updateStudent(id);
	}

	@Override
	public void deleteStudent(Integer id) {
		S1.deleteStudent(id);
		
	}

}
