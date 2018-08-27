package com.herokuapp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class MyMenuPage {

	private WebDriver driver;

	public MyMenuPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='my']")
	public WebElement myMenu;
	
	@FindBy(xpath = "//a[text()='self']")
	public WebElement mySelf;
	
	@FindBy(xpath = "//a[text()='team']")
	public WebElement myTeam;
	
}
