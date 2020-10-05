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
			if (validateName(firstName)) {
				usersList.add(new User(firstName));
			}
		logger.info("To add another use enter 1: ");
		choice = Integer.parseInt(sc.nextLine());
		}
	}

	public static boolean validateName(String name) {
		if (name.matches("^[A-Z][a-z]{2,}$")) {
			return true;
		} else {
			logger.info("Invalid entry for a first_name");
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

	public User(String firstName) {
		super();
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + "]";
	}

}
