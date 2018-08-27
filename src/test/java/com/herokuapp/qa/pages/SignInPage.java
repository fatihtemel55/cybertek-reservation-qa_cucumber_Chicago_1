package com.herokuapp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class SignInPage {
	public SignInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(name = "email")
	public WebElement email;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(xpath = "//button[.='sign in']")
	public WebElement signInButton;
	
	@FindBy(xpath = "//h1")
	public WebElement signInTitle;
	
	



}
