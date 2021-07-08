package com.example.demo.service;
import java.util.List;
import com.example.demo.instructor.Instructor;
import com.example.demo.instructor.InstructorDetail;

public interface InstructorService {
	
	public Instructor createInstructor(Instructor instructor);
	public List<Instructor> getAllInstructor();
	public Instructor getInstructorById(Integer Id);
	public Instructor updateInstructorById(Integer Id,Instructor instructor,InstructorDetail instructorDetail);
	public String deleteById(Integer Id);
	
	
}
