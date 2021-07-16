package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Assignee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer assigneeId;
	@Column(name = "assignee_name",unique = true)
	private String assigneeName;
	@JsonProperty
	private boolean IsAvailable;
	
	public Assignee(Integer assigneeId, String assigneeName, boolean isAvailable) {
		super();
		this.assigneeId = assigneeId;
		this.assigneeName = assigneeName;
		IsAvailable = isAvailable;
	}

}
