package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name = "videos")

public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(unique = true,nullable=false)
	private String name;
	@Column(unique = true,nullable=false)
	private String url;
	@Column(name = "TRANSCRIPT_TEXT",nullable=false)
	private String transcript;
	@Column(name = "IS_ACTIVE",nullable=false)
	private Boolean isActive = true;
}
