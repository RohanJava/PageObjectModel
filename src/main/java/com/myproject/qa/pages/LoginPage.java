package com.myproject.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myproject.qa.base.TestBase;

public class LoginPage extends TestBase {

	// define Page factory or Object Repository
	
	@FindBy(xpath="//a[@class='btn isUser main-header-button']")
	WebElement kontoBtn;
	
	@FindBy(xpath="//input[@name='j_username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='j_password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-right submit']")
	WebElement loginBtn;
	
	//initializing the page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		kontoBtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
	
}
