package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.instructor.InstructorDetail;

@Repository
public interface InstructorDetailDao extends CrudRepository<InstructorDetail, Integer> {

}
