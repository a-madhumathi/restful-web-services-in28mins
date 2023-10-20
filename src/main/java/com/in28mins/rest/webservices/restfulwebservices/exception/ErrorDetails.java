package com.in28mins.rest.webservices.restfulwebservices.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

	private LocalDateTime timestamp;
	private String errorMessage;
	private String errorDetails;

	public ErrorDetails(LocalDateTime timestamp, String errorMessage, String errorDetails) {
		super();
		this.timestamp = timestamp;
		this.errorMessage = errorMessage;
		this.errorDetails = errorDetails;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

}
