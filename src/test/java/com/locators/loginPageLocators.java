package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageLocators {
	//locator for login button in Homepage.
		@FindBy(xpath ="//a[@id='loginRegisterDropdown']")
		public WebElement loginButton;
		
		@FindBy(id="mainLogIn")
		public WebElement mainLogin;
		
		@FindBy(id="loginId")
		public WebElement EmailId;
		
		@FindBy(id="existloginPass")
		public WebElement Password;
		
		@FindBy(id="loginButton")
		public WebElement Button;
		
		@FindBy(xpath="//a[text()='Logout']")
		public WebElement logout;
		
		@FindBy(xpath="//p[text()='Please enter valid email id']")
		public WebElement Message;
}
