package com.cakefresh.dev.exception;

import java.util.Date;

public class AuthException {
	private int statusCode;
	private String error;
	private String path;
	private String message;
	private Date timestamp;
	
	public int getStatus() {
		return statusCode;
	}
	public void setStatus(int status) {
		this.statusCode = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public AuthException(int scUnauthorized, String error, String path, String message, Date timestamp) {
		super();
		this.statusCode = scUnauthorized;
		this.error = error;
		this.path = path;
		this.message = message;
		this.timestamp = timestamp;
	}
	
	
}
