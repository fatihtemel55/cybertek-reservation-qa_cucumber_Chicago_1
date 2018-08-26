package com.herokuapp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class ScheduleMenuPage {

	private WebDriver driver;

	public ScheduleMenuPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
}
