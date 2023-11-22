package com.actions;

//Import necessary packages
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//Import custom class
import com.locators.mobileUpdateLocators;
import com.utility.BaseClass;

//Class to perform actions on the Mobile Update page
public class mobileUpdateAction {

 // Initialize mobileUpdateLocators for interacting with elements
 private mobileUpdateLocators locators;

 // Constructor to initialize locators using PageFactory
 public mobileUpdateAction() {
     this.locators = new mobileUpdateLocators();
     PageFactory.initElements(BaseClass.getDriver(), this.locators);
 }

 // Clicks on the "My Account" dropdown
 public void clickOnMyAccount() {
     locators.Accountdropdown.click();
     BaseClass.log.info("user clicks on my account and logs in");
 }

 // Clicks on the "View My Account" option
 public void clickOnViewMyAccount() {
     locators.Viewmyaccount.click();
     BaseClass.log.info("user clicks view account");
 }

 // Clicks on the "Edit" button to modify account details
 public void clickOnEditButton() {
     locators.Edit.click();
     BaseClass.log.info("user clicks edit button");
 }

 // Clears the existing mobile number and enters a new one
 public void changeMobileNumber() {
     locators.mobileNumber.clear();
     locators.mobileNumber.sendKeys("9876584501");
     BaseClass.log.info("user updates phone number");
 }

 // Clicks on the "Save" button to save the changes
 public void clickOnSaveButton() {
     locators.saveButton.click();
     BaseClass.log.info("user clicks save button");
 }

 // Retrieves the success message and asserts it
 public void getSuccessMessage() {
     String successMessage = locators.successMessege.getText();
     Assert.assertEquals(successMessage, "Changes are saved successfully.");
     System.out.println("Mobile number update asserted successfully");
     BaseClass.log.info("user receives successfully saved messege");
 }
}
