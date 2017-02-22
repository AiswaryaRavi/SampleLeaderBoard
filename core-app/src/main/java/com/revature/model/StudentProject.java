package com.revature.model;
import java.sql.Date;
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
@Table(name = "student_projects")

public class StudentProject {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;
	  @ManyToOne
	    @JoinColumn(name = "STUDENT_ID")
	  private Student studentId;
	  @ManyToOne
	    @JoinColumn(name = "PROJECT_ID")
	  private Project projectId;
	  @Column(name = "STARTED_ON")
	  @Temporal(TemporalType.DATE)
	 private Date startedOn;
	  @Column(name ="COMPLETED_ON")
	  @Temporal(TemporalType.DATE)
	 private Date completedOn;
	  @ManyToOne
	    @JoinColumn(name = "STATUS_ID")
	  private SeedStatus statusId=1;

}

