package com.org.day6UserRegistrationProblem;

public class InvalidEntryException extends Exception {
	ExceptionType type;
	public InvalidEntryException(ExceptionType type, String message) {
		super(message);
		this.type=type;
	}

}
