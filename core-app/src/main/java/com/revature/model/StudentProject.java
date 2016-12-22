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
@Table(name = "student_projects", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "STUDENT_ID", "PROJECT_ID" }) })

public class StudentProject {
	private StudentProject(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID", nullable = false)
	private Student student;
	@ManyToOne
	@JoinColumn(name = "PROJECT_ID", nullable = false)
	private List<Project> project;
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
