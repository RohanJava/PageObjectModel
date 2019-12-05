package com.myproject.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myproject.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//li[@class='nav-main-primary nav-main-md-plus-devices']")
	WebElement noteBook;
	
	
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNoteBook() {
		noteBook.click();
	}
	
}
