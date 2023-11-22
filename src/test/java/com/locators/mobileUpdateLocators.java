package com.locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mobileUpdateLocators {
	@FindBy(xpath="//a[@id='loginRegisterDropdown']")
	public WebElement Accountdropdown;
	
	@FindBy(xpath="//button[@id='viewAccount']")
	public WebElement Viewmyaccount;
	
	@FindBy(xpath="(//span[text()='Edit'])[1]")
	public WebElement Edit;
	
	@FindBy(xpath="//input[@id='myp_mobile']")
	public WebElement mobileNumber;
	
	@FindBy(xpath="//button[@id='myprofile_save']")
	public WebElement saveButton;
	
	@FindBy(id="success-cust-info")
	public WebElement successMessege;
	
}

