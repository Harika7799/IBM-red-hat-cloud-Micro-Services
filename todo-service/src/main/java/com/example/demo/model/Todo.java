package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Data
@Table(name ="todo")
public class Todo {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "Id")
	private int todoId;
	@Column(name = "Desc")
	private String desc;
	@Column(name = "is_Completed")
	private boolean isCompleted;
	
	
}