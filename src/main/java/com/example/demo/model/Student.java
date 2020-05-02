package com.example.demo.model;


// POJO for Student
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)// auto generate
	private Long id;

	@Column(name = "first_name", nullable=false)
	
	@NotNull //->  should not have value null
	// server validation / bean, apply for string
	// Database not null on database schema
	@NotEmpty(message = "*Please provide first name")// JPA Validation -> empty string text "" , not validate in database
	@NotBlank // not accepted " " "" null
	private String firstName;
	
	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide last name")
	private String lastName;
	
	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
