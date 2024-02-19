package com.naveenautomation.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.tests.TestBase;


public class SignUpPage extends TestBase {
	
	public SignUpPage() {
	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = "ul.list-unstyled>li:first-of-type>a[href*='account']")
	WebElement myAccountDropDown;
	@FindBy(css = "aside#column-right>div>a:nth-of-type(2)")
	WebElement registerBtn;
	@FindBy(css = "input[name='firstname']")
	WebElement firstName;
	@FindBy(css = "input[name='lastname']")
	WebElement lastName;
	@FindBy(css = "input#input-email")
	WebElement email;
	@FindBy(css = "input#input-telephone")
	WebElement telephone;
	@FindBy(css = "input#input-password")
	WebElement password;
	@FindBy(css = "input#input-confirm")
	WebElement confirmPassword;
	@FindBy(css = "input[name='newsletter'][value=\"1\"]")
	WebElement subscribeCheckBox;
	@FindBy(css = "input[name='agree']")
	WebElement privacyCheckBox;
	@FindBy(css = "input[type='submit']")
	WebElement submitBtn;
	
	private void clickMyAccount() {
		myAccountDropDown.click();
	}
	private void clickRegister() {
		registerBtn.click();
	}
	private void inputName(String name) {
		firstName.sendKeys(name);
	}
	private void inputLastName(String lastname) {
		lastName.sendKeys(lastname);
	}
	private void enterEmail(String emailId) {
		email.sendKeys(emailId);
	}
	private void enterTelephone(String phone) {
		telephone.sendKeys(phone);
	}
	private void enterPwd(String pwd) {
		password.sendKeys(pwd);
	}
	private void confirmInputPwd(String cpwd) {
		confirmPassword.sendKeys(cpwd);
	}
	private void clickSubscribe() {
		subscribeCheckBox.click();
	}
	private void clickPrivacyPolicy() {
		privacyCheckBox.click();
	}
	private void clickSubmit() {
		submitBtn.click();
	}
	
	public void submitSignUp(String name, String lastname, String emailId,String phone, String pwd,String cpwd) {
		clickMyAccount();
		clickRegister();
		inputName(name);
		inputLastName(lastname);
		enterEmail(emailId);
		enterTelephone(phone);
		enterPwd(pwd);
		confirmInputPwd( cpwd);
		clickSubscribe();
		clickPrivacyPolicy();
		clickSubmit();
	}
		
	
	

}
