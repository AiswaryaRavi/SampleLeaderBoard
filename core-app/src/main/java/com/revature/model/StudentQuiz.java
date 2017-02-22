package com.revature.model;

import java.sql.Time;

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

import lombok.Data;

@Data
@Entity
@Table(name = "student_quizes")

public class StudentQuiz {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "STUDENT_ID",nullable=false)
	private Student studentId;
	@ManyToOne
	@JoinColumn(name = "QUIZ_ID",nullable=false)
	private Quiz quizId;
	@Column(name = "STARTED_ON")
	@Temporal(TemporalType.TIME)
	private Time startedOn;
	@Column(name = "COMPLETED_ON")
	@Temporal(TemporalType.TIME)
	private Time completedOn;
	@ManyToOne
	@JoinColumn(name = "STATUS_ID",nullable=false)
	private SeedStatus statusId;

}
