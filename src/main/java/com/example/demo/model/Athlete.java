package com.example.demo.model;


import javax.persistence.*;
@Entity
@Table(name = "persons")
public class Athlete {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long personId;
	private String fullName;
	private String phoneNumber;
	private String emailAddress;
	
	
	
}
