package com.herokuapp.qa.tests;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.herokuapp.qa.utilities.DBType;
import com.herokuapp.qa.utilities.DBUtility;
import com.herokuapp.qa.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before("@DB")
	public void setUpDBConnection() {
		DBUtility.establishConnection();
	}

	@After("@DB")
	public void tearDownDBConnection() {
		DBUtility.closeConnections();
	}
	
	@Before
	public void setUp() {
		
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.getDriver().manage().window().fullscreen();
	
	}


	@After
	public void tearDown(Scenario scenario) {
		// only takes a screenshot if the scenario fails
		if (scenario.isFailed()) {
			// taking a screenshot
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
					.getScreenshotAs(OutputType.BYTES);
			// adding the screenshot to the report
			scenario.embed(screenshot, "image/png");
		}
		Driver.closeDriver();
	}
	
}
