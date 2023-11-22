package com.actions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.locators.loginPageLocators;
import com.utility.BaseClass;

public class loginPageActions {
loginPageLocators loginpagelocators;
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(),Duration.ofSeconds(20));
	public loginPageActions() {
		loginpagelocators = new loginPageLocators();
		PageFactory.initElements(BaseClass.getDriver(), loginpagelocators);
	}
	public void clickButton1() {
		loginpagelocators.loginButton.click();
		BaseClass.log.info("user clicks login button");
	}
	public void clickButton2() {
		loginpagelocators.mainLogin.click();
		BaseClass.log.info("user clicks login link");
	}
	public void setEmail(String strEmail) {
		loginpagelocators.EmailId.sendKeys(strEmail);
		BaseClass.log.info("user enters email");
	}
	public void setPassword(String strPass) {
		loginpagelocators.Password.sendKeys(strPass);
		BaseClass.log.info("user enters password");
	}
	public void Button() {
		loginpagelocators.Button.click();
		BaseClass.log.info("user clicks login button");
	}
	public void logout() {
		loginpagelocators.logout.click();
		BaseClass.log.info("user logs out");
	}
	public void Message() {
		wait.until(ExpectedConditions.visibilityOf(loginpagelocators.Message));
		Assert.assertEquals(loginpagelocators.Message.getText(),"Please enter valid email id");
		System.out.println("Assert Sucessfully");
		BaseClass.log.info("invalid email asserted successfully");
	}
	public void LoginUser(String strEmail,String strPass) {
		setEmail(strEmail);
		setPassword(strPass);
		Button();
	}
}
