package com.herokuapp.qa.steps;

import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.herokuapp.qa.pages.HuntMenuPage;
import com.herokuapp.qa.pages.SignInPage;
import com.herokuapp.qa.utilities.BrowserUtils;
import com.herokuapp.qa.utilities.ConfigurationReader;
import com.herokuapp.qa.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Reservation {
@Test
@Given("the user is on the home page")
public void the_user_is_on_the_home_page() {
	
	Assert.assertEquals(ConfigurationReader.getProperty("urlAssert"),Driver.getDriver().getCurrentUrl());
	
   }

@Given("the user sign in to the Plan page {string} and {string}")
public void the_user_sign_in_to_the_Plan_page_and(String login, String password) {
	SignInPage signInPage = new SignInPage();
    signInPage.email.sendKeys(login);
    signInPage.password.sendKeys(password);
    signInPage.signInButton.click();
  }

@When("the user click on hunt menu btn")
public void the_user_click_on_hunt_menu_btn() {
	HuntMenuPage hunk=new HuntMenuPage();
	Actions actions = new Actions(Driver.getDriver());
	BrowserUtils.waitFor(3);
	actions.moveToElement(hunk.huntClick).perform();
	BrowserUtils.waitFor(3);
	hunk.huntClick.click();
  }

@Then("user should be on hunt page")
public void user_should_be_on_hunt_page() {
	String expectedTitle="cybertek-bnb";
	Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
  }

@Then("user  choose date , time and  click search")
public void user_choose_date_time_and_click_search() {
	HuntMenuPage hunk=new HuntMenuPage();
	hunk.dateInput.sendKeys(HuntMenuPage.dayOfNextWeek());
	
	Select sl=new Select(hunk.from);
	sl.selectByIndex(0);;
	Select sl1=new Select(hunk.to);
	sl1.selectByIndex(2);;
	hunk.search.click();
  }

@Then("user can see all availble rooms , choose one of them  and book")
public void user_can_see_all_availble_rooms_choose_one_of_them_and_book() {
	HuntMenuPage hunk=new HuntMenuPage();
	hunk.book.click();
   }

@Then("user need to comfirm")
public void user_need_to_comfirm() {
	HuntMenuPage hunk=new HuntMenuPage();
	hunk.confirm.click();
  }

@Then("users reservation need to displayed in schedule page")
public void users_reservation_need_to_displayed_in_schedule_page() {
	HuntMenuPage hunk=new HuntMenuPage();
	Assert.assertTrue(hunk.schedule.isDisplayed());
  }
}
