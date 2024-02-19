package com.naveenautomation.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pages.ContactUsPage;

public class ContactUsPageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void validateContactUs() {
		ContactUsPage contact = new ContactUsPage();
		contact.submitContactUs("Tresa", "xyz@hotmail.com",RandomStringUtils.randomAlphabetic(20));
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
