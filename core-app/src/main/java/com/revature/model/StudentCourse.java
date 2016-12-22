package com.revature.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Data
@Entity
@Table(name = "student_courses", uniqueConstraints = { @UniqueConstraint(columnNames = { "COURSE_ID", "STUDENT_ID" }) })
public class StudentCourse {
	private StudentCourse(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "COURSE_ID",nullable=false)
	private List<Course> course;
	@ManyToOne()
	@JoinColumn(name = "STUDENT_ID",nullable=false)
	private Student student;
	@Column(name = "STARTED_ON")
	@Temporal(TemporalType.DATE)
	private Date startedOn;
	@Column(name = "COMPLETED_ON")
	@Temporal(TemporalType.DATE)
	private Date completedOn;
	@ManyToOne
	@JoinColumn(name = "STATUS_ID")
	private SeedStatus statusId;

}
