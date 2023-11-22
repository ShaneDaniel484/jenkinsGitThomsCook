package com.stepDefinitions;
import java.util.List;

import org.junit.Assert; import org.openqa.selenium.WebDriver; import com.actions.cruisepageactions;
import com.utility.BaseClass;
import com.utility.utilityclass;

import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import io.cucumber.java.en.When;

public class cruisePageStepDefinition {


 WebDriver driver;
 cruisepageactions actions;
 utilityclass data;
public cruisePageStepDefinition() {
	this.driver = BaseClass.getDriver();
	this.actions = new cruisepageactions();
}
@Given("user is in the ThomasCOOK page")
public void user_is_in_the_thomasCOOK_page() {
	data = new utilityclass();
	BaseClass.openPage(data.url);
	
}

@When("user clicks the cruise button")
public void user_clicks_the_cruise_button() throws InterruptedException {
	actions.clickButton();
}
@When("user selects the value from dropdown")
public void user_selects_the_value_from_dropdown() {
	actions.setSelectDepartureCity();
	actions.selectSailMonths();
	actions.selectSelectNights();
	actions.selectSelectCruiseLine();
}
@When("user clicks on the search button")
public void user_clicks_on_the_search_button() {
	actions.searchButton();
}

@When("user gets search results for the search")
public void user_gets_search_results_for_the_search() {
   actions.searchResults();
}

@Then("user clicks on modify button")
public void user_clicks_on_modify_button() {
	actions.ModifySearchButton();
}

@When("user clicks on modify search to change date and departure city")
public void user_clicks_on_modify_search_to_change_date_and_departure_city() {
	actions.modifySearch();
}

@Then("user recieve the modified search")
public void user_recieve_the_modified_search() {
	 actions.modifySearchResluts();
}



}