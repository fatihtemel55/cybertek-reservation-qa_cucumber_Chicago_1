package com.herokuapp.qa.steps;

import org.junit.Assert;

import com.herokuapp.qa.pages.LoginPage;
import com.herokuapp.qa.pages.MapMenuPage;
import com.herokuapp.qa.utilities.BrowserUtils;
import com.herokuapp.qa.utilities.ConfigurationReader;
import com.herokuapp.qa.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class LoginPage_steps {
	
	LoginPage log = new LoginPage();
	MapMenuPage map = new MapMenuPage();
	
@Given("user goes to the homepage")
public void user_goes_to_the_homepage() {
	Driver.getDriver().get(ConfigurationReader.getProperty("url"));
}

@Then("user passes {string} and {string}")
public void user_passes_and(String email, String password) {
	log.email.sendKeys(email);
	log.password.sendKeys(password);
	
}

@Then("user clicks signin")
public void user_clicks_signin() {
	log.singInBtn.click();
}

@Then("user verifies if text {string} exist")
public void user_verifies_if_text_exist(String ILtext) {
	BrowserUtils.waitFor(2);
   String actualText = map.ILtext.getText();
   Assert.assertEquals(ILtext, actualText);
}



}
