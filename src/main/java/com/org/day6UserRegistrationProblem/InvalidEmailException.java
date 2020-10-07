package com.org.day6UserRegistrationProblem;

public class InvalidEmailException extends Exception {
	ExceptionType type;
	public InvalidEmailException(ExceptionType type,String message) {
		super(message);
		this.type=type;
	}
}
