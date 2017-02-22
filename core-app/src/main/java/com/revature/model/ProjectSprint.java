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
@Table(name = "project_sprints", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "PROJECT_ID", "SPRINT_NAME" }) })
public class ProjectSprint {
	private ProjectSprint(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne()
	@JoinColumn(name = "PROJECT_ID",nullable=false)
	private Project project;
	@Column(name = "SPRINT_NAME",nullable=false)
	private String sprintName;
	@Column(name = "IS_ACTIVE")
	private Boolean isActive = true;

}
