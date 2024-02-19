package com.naveenautomation.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.naveenautomation.pages.GiftCertificatePage;

public class GiftCertificatePageTest extends TestBase {

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void validateGiftCertificate() {
		GiftCertificatePage gift = new GiftCertificatePage();
		gift.submitGiftcertificate("Jubin", "xyz@yahoo.com", "Tresa", "xyz@hotmail.com",RandomStringUtils.randomAlphabetic(15), "00");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
}
