package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data

@Entity
@Table(name = "course_contents", uniqueConstraints = { @UniqueConstraint(columnNames = { "COURSE_ID", "VIDEO_ID" }),
		@UniqueConstraint(columnNames = { "COURSE_ID", "TEXT_CONTENT" }) })
public class CourseContent {
	private CourseContent(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "COURSE_ID",nullable=false)
	private Course course;
	@ManyToOne()
	@JoinColumn(name = "VIDEO_ID")
	private Video video;
	@Column(name = "TEXT_CONTENT")
	private String textContent;
	@Column(nullable=false)
	private String name;
	@Column(name = "SKILL_POINTS",nullable=false)
	private Integer skillPoints;

}