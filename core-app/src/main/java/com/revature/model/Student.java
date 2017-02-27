package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
	private Student(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private String name;
	@ManyToOne
	@JoinColumn(name = "UNIVERSITY_ID", nullable = false)
	private University university;
	@Column(unique = true, nullable = false)
	private String email;
	@Column(nullable = false)
	private String department;
	private Long phone;
	@Column(name = "IS_ACTIVE")
	private Boolean isActive = true;

}
