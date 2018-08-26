package com.herokuapp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class MyMenuPage {

	private WebDriver driver;

	public MyMenuPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
}
