package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Issue;


public interface IssueService {
	public Issue createNewIssue(Issue issue);
	public List<Issue> displayAllIssues();
	public java.util.Optional<Issue> findIssueById(String id);
	public Issue updateIssue(String id, Issue issue);
	public Issue removeIssue(String id);
	public Issue UpdateIssue(String description, Issue issue);
	public Issue RemoveIssue(String description);
	
}
