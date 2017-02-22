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
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "CATEGORY_ID")
	private Category categoryId;
	@ManyToOne()
	@JoinColumn(name = "LEVEL_ID")
	private Level levelId;
	@Column(unique = true)
	private String name;
	private String description;
	@Column(name = "ENROLLMENT_POINTS")
	private Integer enrollmentPoints;
	@Column(name = "COMPLETION_POINTS")
	private Integer completionPoints;
	@Column(name = "IS_ACTIVE")
	private Boolean isActive = true;

}