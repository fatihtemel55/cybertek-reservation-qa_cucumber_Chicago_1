package com.herokuapp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class scheduleMenuPage {

	private WebDriver driver;

	public scheduleMenuPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
}
