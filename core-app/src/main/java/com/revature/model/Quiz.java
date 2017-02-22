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
@Table(name = "quizes")

public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID",nullable=false)
	private Category categoryId;
	@ManyToOne
	@JoinColumn(name = "LEVEL_ID",nullable=false)
	private Level levelId;
	@Column(unique = true,nullable=false)
	private String name;
	@Column(name = "DURATION_IN_MINUTES",nullable=false)
	private Integer duration;
	@Column(name = "NUM_OF_QUESTIONS",nullable=false)
	private Integer numOfQuestions;
	@Column(name = "MAX_ATTEMPTS",nullable=false)
	private Integer maxAttempts = 1;
	@Column(name = "IS_ANSWER_DISPLAY",nullable=false)
	private Boolean isAnswerDisplay = false;
	@Column(name = "IS_ACTIVE",nullable=false)
	private Boolean isActive = true;

}
