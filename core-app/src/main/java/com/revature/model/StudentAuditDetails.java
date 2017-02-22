package com.revature.model;

import java.sql.Timestamp;

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
@Table(name = "student_audit_details")
public class StudentAuditDetails {
	private StudentAuditDetails(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID",nullable=false)
	private Student student;
	@Column(name = "LOGIN_ACTIVITY",nullable=false)
	private String loginActivity;
	@Column(name = "ACTIVITY_TIMESTAMP",nullable=false)
	private Timestamp activityTimestamp;
	@Column(name = "IS_SUCCESS")
	private Boolean isSuccess = true;
}