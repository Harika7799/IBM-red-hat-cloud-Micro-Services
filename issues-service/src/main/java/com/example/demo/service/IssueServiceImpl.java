package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.IssueNotFoundException;
import com.example.demo.model.Issue;
import com.example.demo.repo.IssueRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IssueServiceImpl implements IssueService{
	
	private IssueRepository issueRepository;
	@Autowired
	public IssueServiceImpl(IssueRepository issueRepository) {
		this.issueRepository = issueRepository;
	}


	@Override
	public Issue createNewIssue(Issue issue) {
		log.info("within create issue service");
		return issueRepository.insert(issue);
	}

	@Override
	public List<Issue> displayAllIssues() {
		log.info("within display issue service");
		return issueRepository.findAll();
	}


	@Override
	public Optional<Issue> findIssueById(String id) {
		Optional<Issue> issue=issueRepository.findById(id);
		if(issue.isEmpty())
		{
			throw new IssueNotFoundException("isue with the given id not found.");
		}
		
		return issue;
	}


	@Override
	public Issue updateIssue(String id, Issue issue) {
		Optional<Issue> i1=issueRepository.findById(id);
		if(i1.isEmpty())
		{
			throw new IssueNotFoundException("isue with the given id not found.");
		}
		Issue temp=i1.get();
		temp.setSeverity(issue.getSeverity());
		temp.setAssignee(issue.getAssignee());
		temp.setDescription(issue.getAssignee());
		issueRepository.save(temp);
		log.info("updated");
		return temp;
	}


	@Override
	public Issue removeIssue(String id) {
		
		Optional<Issue> i1=issueRepository.findById(id);
		if(i1.isEmpty())
		{
			throw new IssueNotFoundException("isue with the given id not found.");
		}
		Issue temp=i1.get();
		issueRepository.delete(temp);
		return temp;
	}


	

}
