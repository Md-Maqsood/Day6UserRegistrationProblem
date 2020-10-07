package com.org.day6UserRegistrationProblem;

public class InvalidPhoneNoException extends Exception {
	ExceptionType type;
	public InvalidPhoneNoException(ExceptionType type,String message) {
		super(message);
		this.type=type;
	}

}
