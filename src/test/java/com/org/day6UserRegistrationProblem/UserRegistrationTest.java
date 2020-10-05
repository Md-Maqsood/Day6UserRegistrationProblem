package com.org.day6UserRegistrationProblem;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("Maqsood");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("Ma");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenImproper_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("Maq$ood");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("Alam");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("Al");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenImproper_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateName("@lam");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateEmail("abc-100@yahoo.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail_WhenImproper_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validateEmail("abc..2002@gmail.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNo_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePhoneNo("91 8805141523");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPhoneNo_WhenImproper_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePhoneNo("918805141523");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNo_WhenHasSpecialCharacters_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePhoneNo("91 88@5141523");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNo_WhenHasLetters_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePhoneNo("91 88c5141523");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("Skyi$Blue5");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("S$Ble5");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenHasNoUppercase_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("skyi$blue5");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenHasNoNumeric_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("Skyi$Blue");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenHasNoSpecialCharacter_ShouldReturnFalse() {
		UserRegistration userReg = new UserRegistration();
		boolean result = userReg.validatePassword("SkyiBlue5");
		Assert.assertFalse(result);
	}
}
