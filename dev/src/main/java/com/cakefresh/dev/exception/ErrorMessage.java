package com.cakefresh.dev.exception;

import java.util.Date;

public class ErrorMessage {
	  private int statusCode;
	  private Date timeStamp;
	  private String message;
	  private String description;

	  public ErrorMessage(int statusCode, Date timestamp, String message, String description) {
	    this.statusCode = statusCode;
	    this.timeStamp = timestamp;
	    this.message = message;
	    this.description = description;
	  }

	  public int getStatusCode() {
	    return statusCode;
	  }

	  public Date getTimestamp() {
	    return timeStamp;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public String getDescription() {
	    return description;
	  }

}
