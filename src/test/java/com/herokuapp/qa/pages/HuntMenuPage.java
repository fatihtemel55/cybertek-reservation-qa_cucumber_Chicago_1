package com.herokuapp.qa.pages;

import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class HuntMenuPage {

	private WebDriver driver;

	public HuntMenuPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText= "hunt")
	public WebElement huntClick;
	
	@FindBy(xpath= "//input")
	public WebElement dateInput;
	
	
	@FindBy(id= "timelineStart")
	public WebElement from;
	
	@FindBy(id= "timelineFinish")
	public WebElement to;
	
	@FindBy(name= "search")
	public WebElement search;
	
	@FindBy(xpath= "(//button)[2]")
	public WebElement book;
	
	@FindBy(xpath= "//button[@class='button is-dark']")
	public WebElement confirm;
	
	@FindBy(xpath= "//td[@class='conference ng-star-inserted']")
	public WebElement schedule;
	
	public  static String dayOfNextWeek() {
		LocalDate currentDate = LocalDate.now();
		currentDate = currentDate.plusDays(3);
		int month = currentDate.getMonthValue();
		int dow = currentDate.getDayOfMonth();
		String rtrn= month+""+dow;
		return rtrn;
	
}}