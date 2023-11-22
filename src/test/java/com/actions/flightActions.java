package com.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.locators.flightLocators;
import com.utility.BaseClass;

public class flightActions {
	flightLocators flightlocators;
	Actions act = null;
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),Duration.ofSeconds(20));
	public flightActions() {
		flightlocators = new flightLocators();
		this.act=new Actions(BaseClass.getDriver());
		PageFactory.initElements(BaseClass.getDriver(), flightlocators);
	}
	public void FlightButton() {
		flightlocators.FlightButton.click();
		BaseClass.log.info("user is on homepage and clicks flight button");
	}
	
	public void SelectOneway() {
		flightlocators.clickOneway.click();
		BaseClass.log.info("user selects one way trip");
	}
	
	public void FromLocation(String strFromlocation) throws InterruptedException {
		flightlocators.FromAirport.sendKeys(strFromlocation);
		Thread.sleep(5000);
		flightlocators.FromAirport.sendKeys(Keys.ENTER);
		BaseClass.log.info("user gives from location");
		
	}
	
	public void Tolocation(String strTolocation) {
		flightlocators.ToAirport.sendKeys(strTolocation);
		BaseClass.log.info("user gives to location");
	}
	
	public void closeAd() throws InterruptedException {
		//Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) flightlocators.closeAd));
		wait.until(ExpectedConditions.visibilityOf(flightlocators.closeAd));
		BaseClass.getDriver().switchTo().frame(0);
		
		wait.until(ExpectedConditions.visibilityOf(flightlocators.closeAd));
		act.moveToElement(flightlocators.closeAd).click().build().perform();
		
		BaseClass.getDriver().switchTo().parentFrame();
		BaseClass.log.info("user closes ad");
	}
	public void clickDate() {
		
		flightlocators.clickDate.click();
		BaseClass.log.info("user selects date");
	}
	public void DepartureDate() {
		flightlocators.Date.click();
		BaseClass.log.info("user selects departure date");
	}
	
	public void SearchButton() {
		flightlocators.FlightSearch.click();
		BaseClass.log.info("user clicks search button");
	}
	
	public void ShowDetails() {
		wait.until(ExpectedConditions.visibilityOf(flightlocators.ShowingFlight));
		Assert.assertEquals(flightlocators.ShowingFlight.getText(),"Flights Detail");
		System.out.println("Asserted successfully");
		BaseClass.log.info("user getst the desired search results");
		}
	
	public void searchFlight(String strFromlocation,String strTolocation) throws InterruptedException {
		FromLocation(strFromlocation);
		Tolocation(strTolocation);
		
	}
}
