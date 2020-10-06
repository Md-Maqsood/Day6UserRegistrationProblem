package com.org.day6UserRegistrationProblem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationTest {
	@Rule
	public ExpectedException thrown=ExpectedException.none();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result=false;
		try {
			result = userReg.validateName("Maqsood");
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldThrowInvalidNameException() throws InvalidNameException {
		thrown.expect(InvalidNameException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("Ma");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenImproper_ShouldThrowInvalidNameException() throws InvalidNameException {
		thrown.expect(InvalidNameException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("Maq$ood");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result=false;
		try {
			result = userReg.validateName("Alam");
		} catch (InvalidNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldThrowInvalidNameException() throws InvalidNameException {
		thrown.expect(InvalidNameException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("Al");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenImproper_ShouldInvalidNameThrowException() throws InvalidNameException {
		thrown.expect(InvalidNameException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("@lam");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result=false;
		try {
			result = userReg.validateEmail("abc-100@yahoo.com");
		} catch (InvalidEmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail_WhenImproper_ShouldThrowInvalidEmailException() throws InvalidEmailException {
		thrown.expect(InvalidEmailException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateEmail("abc..2002@gmail.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNo_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result=false;
		try {
			result = userReg.validatePhoneNo("91 8805141523");
		} catch (InvalidPhoneNoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPhoneNo_WhenImproper_ShouldThrowInvalidPhoneNoException() throws InvalidPhoneNoException {
		thrown.expect(InvalidPhoneNoException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePhoneNo("918805141523");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNo_WhenHasSpecialCharacters_ShouldThrowInvalidPhoneNoException() throws InvalidPhoneNoException {
		thrown.expect(InvalidPhoneNoException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePhoneNo("91 88@5141523");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNo_WhenHasLetters_ShouldThrowInvalidPhoneNoException() throws InvalidPhoneNoException {
		thrown.expect(InvalidPhoneNoException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePhoneNo("91 88c5141523");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result=false;
		try {
			result = userReg.validatePassword("Skyi$Blue5");
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldThrowInvalidPasswordException() throws InvalidPasswordException {
		thrown.expect(InvalidPasswordException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("S$Ble5");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenHasNoUppercase_ShouldThrowInvalidPasswordException() throws InvalidPasswordException {
		thrown.expect(InvalidPasswordException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("skyi$blue5");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenHasNoNumeric_ShouldThrowInvalidPasswordException() throws InvalidPasswordException {
		thrown.expect(InvalidPasswordException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("Skyi$Blue");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenHasNoSpecialCharacter_ShouldThrowInvalidPasswordException() throws InvalidPasswordException {
		thrown.expect(InvalidPasswordException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("SkyiBlue5");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenHasMoreThanOneSpecialCharacters_ShouldThrowInvalidPasswordException() throws InvalidPasswordException {
		thrown.expect(InvalidPasswordException.class);
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("Skyi$@Blue5");
		Assert.assertFalse(result);
	}
}
