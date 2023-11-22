package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPageLocators {
	@FindBy (id="LoginLogoutToggel")
	public WebElement loginButton;
	
	@FindBy (xpath = "//a[contains(text(),'Register')]")
	public WebElement registerUser;
	
	@FindBy (id="registerFName")
	public WebElement firstname;
	
	@FindBy(id="registerLName")
	public WebElement lastname;
	
	@FindBy(id="registerEmailId")
	public WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='Mobile No']")
	public WebElement mobile;
	
	@FindBy(id="registerPwd")
	public WebElement password;
	
	@FindBy(id="registerConfirmPwd")
	public WebElement cPassword;
	
	@FindBy(id="registerButton")
	public WebElement registerButton;
	
	
	@FindBy(id="loginRegisterDropdown")
	public WebElement userAvatar;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public WebElement logoutButton;
	
	@FindBy(xpath = "//a[@id='loginRegisterDropdown']")
	public WebElement dropDown;
	
	@FindBy(xpath = "//label[@class='login_reg_sprite css-label']")
	public WebElement chkbox;
}