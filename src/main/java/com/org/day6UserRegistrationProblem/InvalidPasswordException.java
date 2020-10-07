package com.org.day6UserRegistrationProblem;

public class InvalidPasswordException extends Exception {
	ExceptionType type;
	public InvalidPasswordException(ExceptionType type,String message) {
		super(message);
		this.type=type;
	}

}
