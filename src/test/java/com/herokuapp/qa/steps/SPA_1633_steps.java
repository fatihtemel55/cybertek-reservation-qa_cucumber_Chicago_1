package com.herokuapp.qa.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.herokuapp.qa.pages.LoginPage;
import com.herokuapp.qa.pages.MapMenuPage;
import com.herokuapp.qa.pages.ScheduleMenuPage;
import com.herokuapp.qa.utilities.BrowserUtils;
import com.herokuapp.qa.utilities.ConfigurationReader;
import com.herokuapp.qa.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class SPA_1633_steps {
	WebDriver driver = Driver.getDriver();
	ScheduleMenuPage smp = new ScheduleMenuPage();
	
	@Given("admin goes to reservation application")
	public void admin_goes_to_reservation_application() {
		driver.get(ConfigurationReader.getProperty("url"));
		LoginPage lp = new LoginPage();
		lp.email.sendKeys(ConfigurationReader.getProperty("loginAdmin"));
		lp.password.sendKeys(ConfigurationReader.getProperty("passwordAdmin"));
		lp.singInBtn.click();
	}

	@Then("admin clicks on the schedule")
	public void admin_clicks_on_the_schedule() {
		MapMenuPage mmp = new MapMenuPage();
		BrowserUtils.waitFor(2);
		mmp.scheduleMenu.click();
	}

	@Then("choose one conference")
	public void choose_any_conference() {
		BrowserUtils.waitFor(3);
		List<WebElement> conferences = driver.findElements(By.xpath(smp.conferencesXpath));
		conferences.get(0).click();		
	}

	@Then("admin should be able canceled conference succesfully")
	public void admin_should_be_able_canceled_conference_succesfully() {
		smp.cancelBtn.click();
		BrowserUtils.waitFor(2);
		Assert.assertTrue(driver.getPageSource().contains("canceled"));
	}
}
