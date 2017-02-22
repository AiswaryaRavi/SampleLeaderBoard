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
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private String name;
	@ManyToOne
	@JoinColumn(name = "UNIVERSITY_ID", nullable = false)
	private University universityId;
	@Column(unique = true, nullable = false)
	private String email;
	private Long phone;
	@Column(name = "IS_ACTIVE", nullable = false)
	private Boolean isActive = true;

}
