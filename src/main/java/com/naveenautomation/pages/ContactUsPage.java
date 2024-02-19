package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.tests.TestBase;

public class ContactUsPage extends TestBase {
	
	public ContactUsPage() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//a[text()='Contact Us'] ")
	WebElement contactUs;

	@FindBy(css = "input[name='name']")
	WebElement inputYourName;
	
	@FindBy(css = "input[name='email']")
	WebElement enterEmail;
	
	@FindBy(id = "input-enquiry")
	WebElement inputEnquiry;
	
	@FindBy(css = "input[type='submit']")
	WebElement submitBtn ;
	
	@FindBy(css ="a[href=\"https://naveenautomationlabs.com/opencart/index.php?route=common/home\"][class='btn btn-primary']")
	WebElement continueBtn;


private void clickContactUs() {
	contactUs.click();
}
private void inputName(String name) {
	inputYourName.sendKeys(name);
}
private void enterEmail(String email) {
	enterEmail.sendKeys(email);
}
private void enterEnquiry(String message) {
	inputEnquiry.sendKeys(message);
}
private void clicksubmit() {
	submitBtn.click();
}
private void clickContinue() {
	continueBtn.click();
}
public void submitContactUs(String name, String email, String message) {
	clickContactUs();
	inputName(name);
	enterEmail(email);
	enterEnquiry(message);
	clicksubmit();
	clickContinue();
}

}