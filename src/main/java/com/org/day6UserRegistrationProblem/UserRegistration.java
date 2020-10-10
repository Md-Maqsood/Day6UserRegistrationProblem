package com.org.day6UserRegistrationProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@FunctionalInterface
interface Validator{
	public boolean validate(String entry) throws InvalidEntryException ;
}

public class UserRegistration {
	private final static Logger logger=LogManager.getLogger(UserRegistration.class);
	static Scanner sc = new Scanner(System.in);
	List<User> usersList;
	
	/**
	 * uc13
	 */
	public Validator nameValidator=name->{
		if (name.matches("^[A-Z][a-z]{2,}$")) {
			return true;
		} else {
			throw new InvalidEntryException(ExceptionType.INVALID_NAME,"Invalid entry for a first name or last name");
		}
	};
	
	/**
	 * uc13
	 */
	public Validator emailValidator=email->{
		if (email.matches("^[a-zA-Z0-9]+([_+-.]{1}[a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]{2,3})?$")) {
			return true;
		} else {
			throw new InvalidEntryException(ExceptionType.INVALID_EMAIL,"Invalid entry for an email");
		}
	};
	
	/**
	 * uc13
	 */
	public Validator phoneNoValidator=phoneNo->{
		if (phoneNo.matches("^[1-9]{1,3}[ ]{1}[1-9]{1}[0-9]{9}$")) {
			return true;
		} else {
			throw new InvalidEntryException(ExceptionType.INVALID_PHONENO,"Invalid entry for a phone number");
		}
	};
	
	/**
	 * uc13
	 */
	public Validator passwordValidator=password->{
		if (password.matches("^(?=.{8,}$)(?=.*[A-Z].*$)(?=.*[0-9].*$)(?=[a-zA-Z0-9]*[^a-z^A-Z^0-9^ ][a-zA-Z0-9]*$).*$")) {
			return true;
		} else {
			throw new InvalidEntryException(ExceptionType.INVALID_PASSWORD,"Invalid entry for a password");
		}
	};
	
	public UserRegistration() {
		super();
		usersList = new ArrayList<User>();
	}
	
	public void addUser() {
		do{
			logger.debug("Enter the first name: ");
			String firstName = sc.nextLine();
			logger.debug("Enter the last name: ");
			String lastName = sc.nextLine();
			logger.debug("Enter the email: ");
			String email = sc.nextLine();
			logger.debug("Enter the phone number: ");
			String phoneNo = sc.nextLine();
			logger.debug("Enter the password: ");
			String password = sc.nextLine();
				try {
					if (nameValidator.validate(firstName) && nameValidator.validate(lastName) && emailValidator.validate(email) && phoneNoValidator.validate(phoneNo) && passwordValidator.validate(password)) {
						usersList.add(new User(firstName, lastName, email, phoneNo, password));
					}
				} catch (InvalidEntryException e) {
					logger.debug(e.getMessage());
				}
			logger.debug("To add another user enter 1, else enter 0: ");
		}while(Integer.parseInt(sc.nextLine())==1);		
	}

	public static void main(String[] args) {
		UserRegistration userReg = new UserRegistration();
		userReg.addUser();
		userReg.usersList.forEach(user->logger.debug(user));
		sc.close();
	}
}

class User {
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
	private String password;

	public User(String firstName, String lastName, String email, String phoneNo, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "User [\nFirstName=" + firstName + "\nLastName=" + lastName + "\nEmail=" + email + "\nPhoneNo=" + phoneNo
				+ "\nPassword=" + password + "\n]";
	}

}