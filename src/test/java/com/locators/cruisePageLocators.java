package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cruisePageLocators {
	@FindBy(id="cruisePath")
		public WebElement cruiseButton;
		
		@FindBy(xpath = "//select[@name='city']")
		public WebElement SelectDepartureCity;
		
		
		@FindBy(xpath = "//select[@name='sailDate']")
		public WebElement SailMonths;
		
		@FindBy(id="duration")
		public WebElement SelectNights;
		
		@FindBy(id="cruiselines")
		public WebElement SelectCruiseLine;
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-block']")	 
		public WebElement  Search;
		
		@FindBy(xpath = "//div[@class=\"col-10 pt-1 pb-1\"]//child::h2[contains(text(),'2 Nights | Cruise Weekender')]")
		public WebElement searchResults;
		
		@FindBy(id="modifysearch")
		public WebElement ModifySearch;
		
		@FindBy(id="hotelsCheckIn")
		public WebElement modifyDate;
		
		@FindBy(xpath = "//button[@class=\"search_btn\"]")
		public WebElement applyModifySearch;
		
		@FindBy(xpath = "//div[@class='col-10 pt-1 pb-1']//child::h2[contains(text(),'15 Nights | Australia')]")
		public WebElement modifySearchResults;
	}

