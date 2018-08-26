package com.herokuapp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class ScheduleMenuPage {

	private WebDriver driver;

	public ScheduleMenuPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	public String conferencesXpath = "//td[contains(@class, 'conference')]";
	@FindBy(xpath = "//td[contains(@class, 'conference')]")
	public WebElement conferences;
	
	@FindBy(xpath = "//*[@id=\"mat-dialog-1\"]/app-my-conference-info-dialog/mat-dialog-actions/button")
	public WebElement cancelBtn;
	
	
}
