package com.stepDefinitions;
import com.actions.holidayPageActions;
import com.utility.BaseClass;
import com.utility.utilityclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class holidayStepDefinition {
    holidayPageActions actions = new holidayPageActions();
    utilityclass data;
    

    @Given("I want to select a Holiday category")
    public void i_want_to_select_a_holiday_category() {
    	data = new utilityclass();
    	BaseClass.openPage(data.url);
        actions.setHolidays();
    }

    @When("the user  select a Europe Tour package")
    public void the_user_select_a_europe_tour_package() throws InterruptedException {
        actions.setEurope();
    }

    @When("the user select a departure city as chennai")
    public void the_user_select_a_departure_city_as_chennai() throws InterruptedException {
    	actions.setDeparture();
        actions.setDeparturecityChennai();
    }

    @When("the  user select a month of travel as feb")
    public void the_user_select_a_month_of_travel_as_feb() {
    	actions.setMonthofTravel();
        actions.setMonthFeb();
    }

    @When("the user select a duration of travel less than {int} nights")
    public void the_user_select_a_duration_of_travel_less_than_nights(Integer int1) {
    	actions.setDuration();
        actions.setStayDuration();
    }

    @When("the user select a package type without a flight")
    public void the_user_select_a_package_type_without_a_flight() {
    	actions.setPackageType();
        actions.setPackageWithoutFlight();
    }

    @When("the user select theme with a family")
    public void the_user_select_theme_with_a_family() {
    	actions.setTheme();
        actions.setFamilyTheme();
    }

    @Then("the user select the city Marvel Of Georgia")
    public void the_user_select_the_city_marvel_of_georgia() {
        actions.setMarvel();
    	System.out.println("Marvel of Georgia is found");
    }
}