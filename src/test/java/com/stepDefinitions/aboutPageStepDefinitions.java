package com.stepDefinitions;

import com.actions.aboutPageActions;
import com.utility.BaseClass;
import com.utility.utilityclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class aboutPageStepDefinitions {
	
	aboutPageActions aboutActions = new aboutPageActions();
	utilityclass data;
	@Given("USER IS ON THOMASCOOK WEBPAGE")
	public void user_is_on_thomascook_webpage() {
		data = new utilityclass();
    	BaseClass.openPage(data.url);
	}

	@When("user clicks on about us")
	public void user_clicks_on_about_us() {
	   aboutActions.clickAboutThomasCook();
	   aboutActions.clickAboutUs();
	}

	@When("the user gets the information about Thomascook")
	public void the_user_gets_the_information_about_thomascook() {
		aboutActions.aboutUsAssert();
	}

	@When("the user clicks on policies")
	public void the_user_clicks_on_policies(){
		aboutActions.clickPrivacyPolicy();
	}

	@When("the user gets the priacy policy information")
	public void the_user_gets_the_priacy_policy_information() {
		aboutActions.privacyPolicyAssert();
	}

	@When("the user clicks on board of directors")
	public void the_user_clicks_on_board_of_directors() {
		aboutActions.clickBoardOfDirectors();
	}

	@Then("the user get board directors information")
	public void the_user_get_board_directors_information() {
		aboutActions.boardOfDirectorsAssert();
	}
}
