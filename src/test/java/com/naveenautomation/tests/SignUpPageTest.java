package com.naveenautomation.tests;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pages.SignUpPage;

public class SignUpPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void validateSignUp() {
		SignUpPage signUp = new SignUpPage();
		signUp.submitSignUp("Tresa",RandomStringUtils.randomAlphabetic(7) , "kxx@hotmail.com", "6475228528", "Password@6", "Password@6");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
