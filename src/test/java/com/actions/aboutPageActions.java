package com.actions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.locators.aboutPageLocators;
import com.utility.BaseClass;

public class aboutPageActions {
	JavascriptExecutor jse = (JavascriptExecutor)BaseClass.getDriver();
	Actions act = new Actions(BaseClass.getDriver());
	aboutPageLocators aboutLocators = null;
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Duration.ofSeconds(15));
	
	public aboutPageActions() {
		this.aboutLocators = new aboutPageLocators();
		PageFactory.initElements(BaseClass.getDriver(), aboutLocators);
	}
	
	public void clickAboutThomasCook() {
		jse.executeScript("window.scrollTo(0, 500)");
		//act.scrollToElement(aboutLocators.aboutThomasCook).perform();
		aboutLocators.aboutThomasCook.click();
		BaseClass.log.info("users clicks about thomascook link");
	}
	
	public void clickAboutUs() {
		aboutLocators.aboutUs.click();
		BaseClass.log.info("user clicks about");
	}
	
	public void aboutUsAssert() {
		String aboutUsAssert = aboutLocators.aboutUsAssert.getText();
		Assert.assertEquals(aboutUsAssert,"About Thomas Cook India");
		System.out.println("About us page Asserted");
		BaseClass.log.info("about page is asserted");
	}
	
	public void clickPrivacyPolicy() {
		act.moveToElement(aboutLocators.privacyPolicy).click().perform();
		BaseClass.log.info("user clicks on privacy policy");
	}
	
	public void privacyPolicyAssert() {
		String privacyPolicyAssert = aboutLocators.privacyPolicyAssert.getText();
		Assert.assertEquals(privacyPolicyAssert,"Thomas Cook Privacy Policies");
		System.out.println("Privacy policy page Asserted");
		BaseClass.log.info("privacy policy page is asserted");
	}
	
	public void clickBoardOfDirectors() {
		aboutLocators.boardOfDirectors.click();
		BaseClass.log.info("board of directors is clicked");
	}
	
	public void boardOfDirectorsAssert() {
		String boardOfDirectorsAssert = aboutLocators.boardOfDirectorsAssert.getText();
		Assert.assertEquals(boardOfDirectorsAssert,"Thomas Cook Board of Directors");
		System.out.println("Board of directors page Asserted");
		BaseClass.log.info("board of directors page is asserted");
	}
}
