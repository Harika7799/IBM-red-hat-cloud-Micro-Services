package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AssigneeRepository;
import com.example.demo.model.Assignee;
@Service
public class AssigneeServiceImpl implements AssigneeService {
	
	private AssigneeRepository assigneeRepository;
	@Autowired
	public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
		super();
		this.assigneeRepository = assigneeRepository;
	}


	@Override
	public Assignee createAssignee(Assignee assignee) {
		// TODO Auto-generated method stub
		return assigneeRepository.save(assignee);
	}

	@Override
	public List<Assignee> getAllAssignee() {
		// TODO Auto-generated method stub
		return assigneeRepository.findAll();
	}

	@Override
	public Assignee getAssigneeByAssigneeName(String assigneeName) {
		// TODO Auto-generated method stub
		return assigneeRepository.getAssigneeByAssigneeName(assigneeName);
	}

}
