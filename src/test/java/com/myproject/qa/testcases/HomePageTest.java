package com.myproject.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myproject.qa.base.TestBase;
import com.myproject.qa.pages.HomePage;
import com.myproject.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest(){
		super();
		
	}
	
		//test cases should be separated -- independent with each other
		//before each test case -- launch the browser and login
		//@test -- execute test case
		//after each test case -- close the browser
	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage= new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyClickOnNotebook() {
		homePage.clickOnNoteBook();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
