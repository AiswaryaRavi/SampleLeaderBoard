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
	private Course(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "CATEGORY_ID",nullable=false)
	private Category category;
	@ManyToOne()
	@JoinColumn(name = "LEVEL_ID",nullable=false)
	private Level level;
	@Column(unique = true,nullable=false)
	private String name;
	@Column(nullable=false)
	private String description;
	@Column(name = "ENROLLMENT_POINTS",nullable=false)
	private Integer enrollmentPoints;
	@Column(name = "COMPLETION_POINTS",nullable=false)
	private Integer completionPoints;
	@Column(name = "IS_ACTIVE")
	private Boolean isActive = true;

}