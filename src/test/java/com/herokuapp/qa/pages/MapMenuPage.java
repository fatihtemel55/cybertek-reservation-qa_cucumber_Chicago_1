package com.herokuapp.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.herokuapp.qa.utilities.Driver;

public class MapMenuPage {

	private WebDriver driver;

	public MapMenuPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "room-211")
	public WebElement googleRoom;

	@FindBy(id = "room-212")
	public WebElement appleRoom;

	@FindBy(id = "room-213")
	public WebElement microsoftRoom;

	@FindBy(id = "room-214")
	public WebElement bay_areaRoom;

	@FindBy(id = "room-215")
	public WebElement amazonRoom;

	@FindBy(id = "room-216")
	public WebElement teslaRoom;

	@FindBy(id = "room-217")
	public WebElement facebookRoom;

	@FindBy(xpath = "//div[@class='navbar-end']/a[1]")
	public WebElement mapMenu;

	@FindBy(xpath = "//div[@class='navbar-end']/a[2]")
	public WebElement scheduleMenu;

	@FindBy(xpath = "//div[@class='navbar-end']/a[3]")
	public WebElement huntMenu;

	@FindBy(xpath = "//div[@class='navbar-end']//div/a")
	public WebElement myMenu;

	@FindBy(xpath = "//div[@class='navbar-end']//div/div/a[1]")
	public WebElement selfSubMenu;

	@FindBy(xpath = "//div[@class='navbar-end']//div/div/a[2]")
	public WebElement teamSubMenu;

	@FindBy(xpath = "//div[@class='navbar-end']//div/div/a[3]")
	public WebElement singOutSubMenu;

}
