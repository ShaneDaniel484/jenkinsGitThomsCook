package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tourPackageLocators {
	@FindBy(id="holidayPlace")
	public WebElement holidayPlace;
	
	@FindBy(xpath = "(//div[@class=\"selectric\"]//child::*)[2]")
	public WebElement budgetSelect;
	
	@FindBy(xpath = "//li[@data-index=\"2\" and contains(text(),\" ₹30,000 to ₹1 Lac \")]")
	public WebElement budget;
	
	@FindBy(xpath = "(//div[@class=\"selectric\"]//child::*)[4]")
	public WebElement monthSelect;
	
	@FindBy(xpath = "//li[@data-index=\"2\" and contains(text(),\"Dec\")]")
	public WebElement month;
	
	@FindBy(id="search-button")
	public WebElement searchButton;
	
	@FindBy(xpath = "//select[@data-bind='value: selectedSortingChoice']")
	public WebElement sortButton;
	
	@FindBy(xpath = "//div[@class=\"all_srp_listing_tc col-sm-8 col-xs-12 trip_schedule\"]//child::div//child::div//child::div//child::h2//child::a[text()='Paradise In Perth']")
	public WebElement sortassert;
	
}
