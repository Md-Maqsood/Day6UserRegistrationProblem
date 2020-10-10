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
			result = userReg.nameValidator.validate("Maqsood");
		} catch (InvalidEntryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFirstName_WhenShort_ShouldThrowInvalidEntryExceptionOfTypeName(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.nameValidator.validate("Ma");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_NAME,e.type);
		}
	}
	
	@Test
	public void givenFirstName_WhenImproper_ShouldThrowInvalidEntryExceptionOfTypeName(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.nameValidator.validate("Maq$ood");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_NAME,e.type);
		}
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result=false;
		try {
			result = userReg.nameValidator.validate("Alam");
		} catch (InvalidEntryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldThrowInvalidEntryExceptionOfTypeName(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.nameValidator.validate("Al");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_NAME,e.type);
		}
	}
	
	@Test
	public void givenLastName_WhenImproper_ShouldThrowInvalidEntryExceptionOfTypeName(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.nameValidator.validate("@lam");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_NAME,e.type);
		}
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result=false;
		try {
			result = userReg.emailValidator.validate("abc-100@yahoo.com");
		} catch (InvalidEntryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenEmail_WhenImproper_ShouldThrowInvalidEntryExceptionOfTypeEmail(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.emailValidator.validate("abc..2002@gmail.com");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_EMAIL,e.type);
		}
	}
	
	@Test
	public void givenPhoneNo_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result=false;
		try {
			result = userReg.phoneNoValidator.validate("91 8805141523");
		} catch (InvalidEntryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPhoneNo_WhenImproper_ShouldThrowInvalidEntryExceptionOfTypePhoneNo(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.phoneNoValidator.validate("918805141523");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_PHONENO,e.type);
		}
	}
	
	@Test
	public void givenPhoneNo_WhenHasSpecialCharacters_ShouldThrowInvalidEntryExceptionOfTypePhoneNo(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.phoneNoValidator.validate("91 88@5141523");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_PHONENO,e.type);
		}
	}
	
	@Test
	public void givenPhoneNo_WhenHasLetters_ShouldThrowInvalidEntryExceptionOfTypePhoneNo(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.phoneNoValidator.validate("91880c141523");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_PHONENO,e.type);
		}
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userReg = new UserRegistration();
		boolean result=false;
		try {
			result = userReg.passwordValidator.validate("Skyi$Blue5");
		} catch (InvalidEntryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldThrowInvalidEntryExceptionOfTypePassword(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.passwordValidator.validate("S$Ble5");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_PASSWORD,e.type);
		}
	}
	
	@Test
	public void givenPassword_WhenHasNoUppercase_ShouldThrowInvalidEntryExceptionOfTypePassword(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.passwordValidator.validate("skyi$blue5");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_PASSWORD,e.type);
		}
	}
	
	@Test
	public void givenPassword_WhenHasNoNumeric_ShouldThrowInvalidEntryExceptionOfTypePassword(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.passwordValidator.validate("Skyi$Blue");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_PASSWORD,e.type);
		}
	}
	
	@Test
	public void givenPassword_WhenHasNoSpecialCharacter_ShouldThrowInvalidEntryExceptionOfTypePassword(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.passwordValidator.validate("SkyiBlue5");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_PASSWORD,e.type);
		}
	}
	
	@Test
	public void givenPassword_WhenHasMoreThanOneSpecialCharacters_ShouldThrowInvalidEntryExceptionOfTypePassword(){
		UserRegistration userReg=new UserRegistration();
		try {
			userReg.passwordValidator.validate("Skyi$@Blue5");
		} catch (InvalidEntryException e) {
			Assert.assertEquals(ExceptionType.INVALID_PASSWORD,e.type);
		}
	}
}
