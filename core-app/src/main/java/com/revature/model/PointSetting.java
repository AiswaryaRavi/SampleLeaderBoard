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
	@Table(name = "point_settings")
	public class PointSetting {
	public PointSetting() {
	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "LOGIN_ACTIVITY_ID", nullable = false)
	private LoginActivity loginActivity;
	@Column(nullable=false)
	private Integer points;
	@Column(name = "IS_ACTIVE")
	private Boolean isActive = true;
	
	
	}