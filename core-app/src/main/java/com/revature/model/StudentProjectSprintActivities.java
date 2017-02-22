package com.revature.model;
import java.util.Date;


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
@Table(name = "student_project_sprint_activities",uniqueConstraints = {
		@UniqueConstraint(columnNames={"STUDENT_PROJECT_SPRINT_ID", "PROJECT_SPRINT_ACTIVITY_ID"})})

public class StudentProjectSprintActivities {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Integer id;
	  @ManyToOne
	    @JoinColumn(name = "STUDENT_PROJECT_SPRINT_ID")
	  private StudentProjectSprint studentProjectSprintId;
	  @ManyToOne
	    @JoinColumn(name = "PROJECT_SPRINT_ACTIVITY_ID")
	  private ProjectSprintActivity projectSprintActivityId;
	  @Column(name = "STARTED_ON")
	  @Temporal(TemporalType.DATE)
	 private Date startedOn;
	  @Column(name ="COMPLETED_ON")
	  @Temporal(TemporalType.DATE)
	 private Date completedOn;
	  @ManyToOne
	    @JoinColumn(name = "STATUS_ID")
	  private SeedStatus statusId;
	

}

