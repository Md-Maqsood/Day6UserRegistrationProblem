package com.org.day6UserRegistrationProblem;

public class InvalidNameException extends Exception {
	ExceptionType type;
	public InvalidNameException(ExceptionType type,String message) {
		super(message);
		this.type=type;
	}
	
}
