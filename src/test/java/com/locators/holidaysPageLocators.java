package com.locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class holidaysPageLocators {
	
	@FindBy(xpath="//a[@class='submenu_header_thomas hidden-sm hidden-xs']")
	public WebElement Holidays;
	
	@FindBy(xpath="//a[@title='Europe Tour Packages']")
	public WebElement Europetourpackage;
	
	//@FindBy(xpath = "(//span[@class=\"caret \"])[1]")
	@FindBy(xpath = "//div[@class='filtered departuretype']//child::p[@class='hidden-xs']")
	public WebElement Departure;
	
	@FindBy(xpath="//span[contains(text(),'Chennai')]//parent::label")
	public WebElement Deparutecity;
	
	@FindBy(xpath="//p[text()='Month of Travel']//parent::div")
	public WebElement Monthoftravel;
	
	@FindBy(xpath="//li[contains(text(),'Feb')]//parent::ul//parent::div")
	public WebElement Month;
	
	@FindBy(xpath="//p[contains(text(),\"Duration\")]")
	public WebElement duration;
	
	@FindBy(xpath="//span[contains(text(),'Less than 7 nights')]//parent::label")
	public WebElement StayDuration;
	
	
	
	@FindBy(xpath="//p[contains(text(),\"Package Type\")]")
	public WebElement Packagetype;
	
	@FindBy(xpath="//label[@for='Without Flight Holidays']")
	public WebElement packageWithoutFlight;
	
	@FindBy(xpath="//p[text()=\"Themes\"]")
	public WebElement Themes;
	
	@FindBy(xpath="//span[text()='Family']//parent::label")
	public WebElement familytheme;
	
	@FindBy(xpath="//div[@class='col-lg-9 col-md-9 col-sm-9']//child::a[@title='Marvels Of Georgia']")
	public WebElement MarvelofGeorgia;
	
	
	
}
