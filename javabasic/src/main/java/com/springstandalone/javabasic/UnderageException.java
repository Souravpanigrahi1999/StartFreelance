package com.springstandalone.javabasic;


public class UnderageException extends RuntimeException {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UnderageException(String message) {
		super();
		this.message = message;
	}

}
