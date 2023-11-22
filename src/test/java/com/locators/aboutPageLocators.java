package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class aboutPageLocators {
	@FindBy(xpath = "//a[@href='#menu1']")
	public WebElement aboutThomasCook;
	
	@FindBy(xpath = "//a[@href='/about-us']")
	public WebElement aboutUs;
	
	@FindBy(xpath = "//h1[@class='ttl center']")
	public WebElement aboutUsAssert;
	
	@FindBy(xpath = "//div[@id='mCSB_1_container']//child::li[4]")
	public WebElement privacyPolicy;
	
	@FindBy(xpath = "//h1[@class='ttl center line-bottom']")
	public WebElement privacyPolicyAssert;
	
	@FindBy(xpath = "//div[@id='mCSB_1_container']//child::li[2]")
	public WebElement boardOfDirectors;
	
	@FindBy(xpath = "//h1[@class='ttl center line-bottom']")
	public WebElement boardOfDirectorsAssert;
	
	
}
