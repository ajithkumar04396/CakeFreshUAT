package com.cakefresh.dev.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

//@JsonIgnoreProperties({"hibernateLazyInitializer"})
//@Entity
//@Table(name = "[data_usertype]", schema = "cakeFresh")
public class UserTypeJPA {
	
//	@Id
//	@Column(name = "[usertype_id]", nullable = false)
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//	@NotNull(message = "User type can not be null!")
//	@Column(name = "[usertype]", nullable = false)
//	@JsonProperty("user_type")
//	private String userType;
//	
//	@JsonIgnore
//	@Column(name = "[created_date]")
//	private Date createdDate;
//	
//	public String getUserType() {
//		return userType;
//	}
//
//	public void setUserType(String userType) {
//		this.userType = userType;
//	}
//
//	public Date getCreatedDate() {
//		return createdDate;
//	}
//
//	public void setCreatedDate(Date createdDate) {
//		this.createdDate = createdDate;
//	}
//
//	public Boolean getIs_active() {
//		return is_active;
//	}
//
//	public void setIs_active(Boolean is_active) {
//		this.is_active = is_active;
//	}
//
//	@JsonIgnore
//	@Column(name = "[is_active]")
//	private Boolean is_active;
//
//	public UserTypeJPA(@NotNull(message = "User type can not be null!") String userType, Date createdDate,
//			Boolean is_active) {
//		super();
//		this.userType = userType;
//		this.createdDate = createdDate;
//		this.is_active = is_active;
//	}
}
