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
}
