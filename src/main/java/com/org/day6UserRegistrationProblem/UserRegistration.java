package com.org.day6UserRegistrationProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserRegistration {
	private final static Logger logger=LogManager.getLogger(UserRegistration.class);
	static Scanner sc = new Scanner(System.in);
	List<User> usersList;

	public UserRegistration() {
		super();
		usersList = new ArrayList<User>();
	}
	
	public void addUser() {
		int choice=1;
		while (choice==1) {
			logger.info("Enter the first name: ");
			String firstName = sc.nextLine();
			logger.info("Enter the last name: ");
			String lastName = sc.nextLine();
			logger.info("Enter the email: ");
			String email = sc.nextLine();
			if (validateName(firstName) && validateName(lastName) && validateEmail(email)) {
				usersList.add(new User(firstName, lastName, email));
			}
		logger.info("To add another user enter 1: ");
		choice = Integer.parseInt(sc.nextLine());
		}
	}

	public static boolean validateName(String name) {
		if (name.matches("^[A-Z][a-z]{2,}$")) {
			return true;
		} else {
			logger.info("Invalid entry for a first_name or a last_name");
			return false;
		}
	}
	
	public static boolean validateEmail(String email) {
		if (email.matches("^[a-zA-Z0-9]+([_+-.]{1}[a-zA-Z0-9]+)?@[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,4}([.]{1}[a-zA-Z]{2,3})?$")) {
			return true;
		} else {
			logger.info("Invalid entry for an email.");
			return false;
		}
	}

	public static void main(String[] args) {
		UserRegistration userReg = new UserRegistration();
		userReg.addUser();
		for (User user : userReg.usersList) {
			logger.info(user);
		}
		sc.close();
	}
}

class User {
	private String firstName;
	private String lastName;
	private String email;

	public User(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
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
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}