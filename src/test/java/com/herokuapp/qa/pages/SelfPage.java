package com.herokuapp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class SelfPage {

	private WebDriver driver;

	public SelfPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Kanya Bang']")
	public WebElement fullName;
	
	@FindBy(xpath = "//p[text()='student-team-leader']")
	public WebElement role;
	
	@FindBy(xpath = "//p[text()='Hibernate']")
	public WebElement team;
	
	@FindBy(xpath = "//p[text()='#8']")
	public WebElement batch;
	
	@FindBy(xpath = "//p[text()='IL']")
	public WebElement campus;

	
	
	
}
