package com.revature.model.dto;

import lombok.Data;

@Data

public class StudentCourseDTO {
	private String courseName;
	private Integer noOfVideos;
	private String description;
	private Integer enrollmentPoints;
	private Integer completionPoints;
	
	

}
