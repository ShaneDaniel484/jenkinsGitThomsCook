package com.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import com.actions.tourPackageActions;
import com.locators.tourPackageLocators;
import com.utility.BaseClass;
import com.utility.utilityclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tourPackageStepDefinitions {
	
	tourPackageActions tourActions = new tourPackageActions();
	utilityclass data;
	@Given("User Is On Thomascook website")
	public void user_is_on_thomascook_website() {
		data = new utilityclass();
		BaseClass.openPage(data.url);
	}

	@When("user gives place name")
	public void user_gives_place_name(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> signUpForm = dataTable.asMaps(String.class,String.class);
	    for(Map<String,String> data : signUpForm) {
	    	String place = data.get("place");
	    	tourActions.selectPlace(place);
	    }
	}

	@When("selects budget")
	public void selects_budget() {
		tourActions.selectBudget();
	    
	}

	@When("selects month of travel")
	public void selects_month_of_travel() {
	    tourActions.selectMonth();
	}

	@When("Clicks search button")
	public void clicks_search_button() {
	    tourActions.clickSearch();
	}

	@When("user sorts the search")
	public void user_sorts_the_search() {
		tourActions.sort();
	    
	}

	@Then("the desired tour package is displayed")
	public void the_desired_tour_package_is_displayed() {
	   tourActions.sortAssert();
	}

}
