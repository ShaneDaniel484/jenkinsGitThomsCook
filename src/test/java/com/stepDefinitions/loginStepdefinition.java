package com.stepDefinitions;

import java.util.List;
import java.util.Map;

import com.actions.loginPageActions;
import com.utility.BaseClass;
import com.utility.utilityclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.experimental.UtilityClass;

public class loginStepdefinition {
	BaseClass Baseclass;
	utilityclass data;
	loginPageActions login = new loginPageActions();
	
	@Given("user is in the Thomascook page from Login")
	public void user_is_in_the_thomascook_page_from_login() {
		data = new utilityclass();
		BaseClass.openPage(data.url);
		  BaseClass.log.info("WebPage Launched");
	    System.out.println("Login Page");
	}

	@When("user clicks the login button on top right corner of homepage.")
	public void user_clicks_the_login_button_on_top_right_corner_of_homepage() {
		 login.clickButton1();
		 BaseClass.log.info("User clicks login button in Homepage");
		 
	}

	@When("Again user clicks login button shows in drop down.")
	public void again_user_clicks_login_button_shows_in_drop_down() {
		login.clickButton2();
		BaseClass.log.info("User clicks login button in PopUp");
	}

	@When("user enters the valid email id in popup which shown")
	public void user_enters_the_valid_email_id_in_popup_which_shown() {
		data = new utilityclass();
		login.setEmail(data.EmailId);
		
	}

	@When("user enters the valid password.")
	public void user_enters_the_valid_password() {
		data = new utilityclass();
	    login.setPassword(data.Password);
	}

	@Then("Finally user clicks the loginbutton and user in homepage Logged in")
	public void finally_user_clicks_the_loginbutton_and_user_in_homepage_logged_in() {
		 login.Button();
		 login.clickButton1();
		 login.logout();
		 BaseClass.log.info("User clicks register button");

	}

	@Given("user is in the Thomascook page")
	public void user_is_in_the_thomascook_page() {
		BaseClass.openPage("https://www.thomascook.in");
	    System.out.println("Login Page");
	}

	@When("user enters the Invalid email")
	public void user_enters_the_invalid_email() {
		data = new utilityclass();
		login.setEmail(data.email);
	}

	@When("user enters the invalid password")
	public void user_enters_the_invalid_password() {
		data = new utilityclass();
		login.setPassword(data.password);
		
	}
	@Then("Finally user clicks the loginbutton and user gets Error message.")
	public void finally_user_clicks_the_loginbutton_and_user_gets_error_message() {
	   login.Button();
		login.Message();
	}


}
