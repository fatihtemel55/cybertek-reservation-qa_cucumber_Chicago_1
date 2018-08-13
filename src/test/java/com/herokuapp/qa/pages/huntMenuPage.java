package com.herokuapp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class huntMenuPage {

	private WebDriver driver;

	public huntMenuPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
}