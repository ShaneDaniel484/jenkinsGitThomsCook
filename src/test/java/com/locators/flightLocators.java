package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  flightLocators {
		
	@FindBy(xpath = "//li[@class='mainMenu flight_menu']")
	public WebElement FlightButton;
	
	@FindBy(xpath= "//label[@id='oneWay']")
	public WebElement clickOneway;
	
	@FindBy(xpath="//input[@id='input-search-from']")
	public WebElement FromAirport;
	
	@FindBy(xpath="//input[@id='input-search-to']")
	public WebElement ToAirport;
	
	@FindBy(xpath="//a[text()='Close']")
	public WebElement closeAd;
	
	@FindBy(xpath="//input[@class='form-control departCal hasDatepicker']")
	public WebElement clickDate;
	
	@FindBy(xpath="(//a[text()='28'])[1]")
	public WebElement Date;
	
	@FindBy(xpath="//button[@id='search-button']")
	public WebElement FlightSearch; 
	
	@FindBy(id="AIR-AZ")
	public WebElement ShowingFlight;
}
