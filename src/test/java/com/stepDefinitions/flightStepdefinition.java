package com.stepDefinitions;

import com.actions.flightActions;
import com.utility.BaseClass;
import com.utility.utilityclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flightStepdefinition {
	BaseClass Baseclass;
	utilityclass data;
	flightActions fly = new flightActions();
	
	
	@Given("customer is on thomascook page.")
	public void customer_is_on_thomascook_page() {
		data = new utilityclass();
		BaseClass.openPage(data.url);
	    System.out.println("Login Page");
	}

	@When("The user clicks on the Flights")
	public void the_user_clicks_on_the_flights() {
	    fly.FlightButton();
	}

	@When("user clicks on the Oneway trip")
	public void user_clicks_on_the_oneway_trip() {
	    fly.SelectOneway();
	}

	@When("user gives the from location")
	public void user_gives_the_from_location() throws InterruptedException {
		data = new utilityclass();
	    fly.FromLocation(data.FromLocation);
	}

	@When("user gives the to location")
	public void user_gives_the_to_location() {
		data = new utilityclass();
		fly.Tolocation(data.Tolocation);
	}

	@When("user clicks the date")
	public void user_clicks_the_date() throws InterruptedException {
	    //fly.closeAd();
		fly.clickDate();
	    
	}

	@When("user selects the date from calendar")
	public void user_selects_the_date_from_calendar() {
		fly.DepartureDate();
	}
	@Then("user clicks on the Search flight button")
	public void user_clicks_on_the_search_flight_button() {
	    fly.SearchButton();
	    fly.ShowDetails();
	    System.out.println("Showing flight details");
	}

}
