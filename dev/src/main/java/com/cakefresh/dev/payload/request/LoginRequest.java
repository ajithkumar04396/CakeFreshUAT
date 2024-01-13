package com.cakefresh.dev.payload.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
	
	@NotBlank(message = "User Name field is missing!")
	@JsonProperty("user_name")
	private String userName;
	
	@NotBlank(message = "Password field is missing!")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginRequest(@NotBlank(message = "User Name field is missing!") String userName,
			@NotBlank(message = "Password field is missing!") String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	

}
