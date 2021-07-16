package com.example.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Assignee;
import com.example.demo.model.Issue;

@Repository
public interface AssigneeRepository extends MongoRepository<Assignee, Integer>{
	@Query
	public Assignee getAssigneeByAssigneeName(String assigneeName);

}
