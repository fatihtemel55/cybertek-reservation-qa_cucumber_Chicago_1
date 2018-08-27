package com.herokuapp.qa.tests;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.interactions.Actions;

import com.herokuapp.qa.pages.LoginPage;
import com.herokuapp.qa.pages.MapMenuPage;
import com.herokuapp.qa.pages.MyMenuPage;
import com.herokuapp.qa.utilities.BrowserUtils;
import com.herokuapp.qa.utilities.ConfigurationReader;
import com.herokuapp.qa.utilities.DBUtility;
import com.herokuapp.qa.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JDBCTest {

	
	@Given("user logs in using {string} {string}")
	public void user_logs_in_using(String username, String password) {
	   
		MapMenuPage mapmp=new MapMenuPage();
		
		LoginPage lp=new LoginPage();
		
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		
		lp.email.sendKeys(username);
		
		lp.password.sendKeys(password);
		
		lp.singInBtn.click();
		
        String expectedTitle=ConfigurationReader.getProperty("title");
		
		String actualTitle=Driver.getDriver().getTitle();
		
		assertEquals(expectedTitle, actualTitle);
		
		
		
	}

	@When("user is on the my --> self page")
	public void user_is_on_the_my_self_page() {
	  
		MapMenuPage mapMPage=new MapMenuPage();
		
		MyMenuPage mmp=new MyMenuPage();
		
		Actions action = new Actions(Driver.getDriver());
		
		action.moveToElement(mmp.myMenu).perform();
		
		BrowserUtils.waitForVisibility(mapMPage.map, 5);
		
		mmp.mySelf.click();
		
	}

	
	@Then("user info should match the DB records using email {string}")
	public void user_info_should_match_the_DB_records_using_email(String email) throws SQLException {
	
	String sql="select * From users";
	
		List<Map<String,Object>> result=DBUtility.runSQLQuery(sql);
		
//		assertEquals("Returned multiple users with email: " + email, 1, result.size());
//		
//		Map<String, Object> map = result.get(0);
//		
//		String expectedEmail=(String) map.get("email");
//		String expectedFullName=(String) map.get("firstname")+" "+map.get("lastname");
//		String expectedRole=(String) map.get("role");
//		System.out.println(expectedEmail+"dfdfrfer7777777777777");
//		SelfPage sp=new SelfPage();
//		
//		String actualFullName=sp.fullName.getText();
//		String actualRole=sp.role.getText();
//		
//		assertEquals(expectedEmail, actualEmail);
//		assertEquals(expectedFullName, actualFullName);
//		assertEquals(expectedRole, actualRole);
//		
//		DBUtility.closeConnections();
	}
//
//	@When("user is on the my --> team page")
//	public void user_is_on_the_my_team_page() {
//	    
//	}
//
//	@Then("location state should match DB records using campus id of the user")
//	public void location_state_should_match_DB_records_using_campus_id_of_the_user() {
//	    
//	}
//
//	@When("user click on any room tesla that he can reserve")
//	public void user_click_on_any_room_tesla_that_he_can_reserve() {
//	    
//	}
//
//	@Then("correct room info \\(name, goal, capacity, tv, whiteboard) should be displayed")
//	public void correct_room_info_name_goal_capacity_tv_whiteboard_should_be_displayed() {
//	
//	}
//
//	@When("user click on any room amazon that he can reserve")
//	public void user_click_on_any_room_amazon_that_he_can_reserve() {
//	    
//	}
//
//	@When("user click on any room facebook that he can reserve")
//	public void user_click_on_any_room_facebook_that_he_can_reserve() {
//	   
//	}
//
//	@When("user click on any room googlea that he can reserve")
//	public void user_click_on_any_room_googlea_that_he_can_reserve() {
//	    
//	}
//
//	@When("user click on any room apple that he can reserve")
//	public void user_click_on_any_room_apple_that_he_can_reserve() {
//	    
//	}
//
//	@When("user click on any room microsoft that he can reserve")
//	public void user_click_on_any_room_microsoft_that_he_can_reserve() {
//	    
//	}
	
}
