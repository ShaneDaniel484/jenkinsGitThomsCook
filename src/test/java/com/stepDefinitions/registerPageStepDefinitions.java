package com.stepDefinitions;
 
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
 
import org.openqa.selenium.support.ui.WebDriverWait;
 
import com.actions.registerPageActions;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.utility.BaseClass;
import com.utility.ExcelReader;
import com.utility.utilityclass;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class registerPageStepDefinitions {

	registerPageActions registerActions = new registerPageActions();
	utilityclass data;
	@Given("user is on thomascook homepage")
	public void user_is_on_thomascook_homepage() {
		data = new utilityclass();
		BaseClass.openPage(data.url);
	}
 
	@When("user clicks on loginbutton")
	public void user_clicks_on_loginbutton() {
		registerActions.clickLogin();
	}
 
	@When("clicks on register")
	public void clicks_on_register() {
	    registerActions.clickRegisterUser();
	}
 
	@When("user enter the details using sheetname  {string} and rownumber {int}")
	public void user_enter_the_details_using_sheetname_and_rownumber(String sheetname, Integer rownumber) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException, IOException  {
		registerActions.registerAccount( sheetname, rownumber);
	    }
	@When("user clicks register button")
	public void user_clicks_register_button() throws InterruptedException {
	    registerActions.clickRegister();
	}
 
	@Then("user is navigated to homepage with user logged in")
	public void user_is_navigated_to_homepage_with_user_logged_in() {
		registerActions.registerAssert();
	}

}