package com.myproject.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myproject.qa.base.TestBase;
import com.myproject.qa.pages.HomePage;
import com.myproject.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Cyberport > Notebook, Tablet, Smartphone & Apple günstig kaufen");
	}
	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
