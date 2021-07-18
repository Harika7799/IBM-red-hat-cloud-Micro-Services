package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name ="student")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

@Id
@Column(name ="id")
private Integer id;
@Length(min = 3, max = 255, message = "first name must be atleast 3 char long")
@Column(name ="first_name",nullable =false)
private String firstName;
@Length(min = 3, max = 255, message = "last name must be atleast 3 char long")
@Column(name ="last_name",nullable =false)
private String lastName;
@Column(name = "branch")
private String branch;
@Email
@Column(name ="email" ,unique = true, nullable = false)
private String email;
}
