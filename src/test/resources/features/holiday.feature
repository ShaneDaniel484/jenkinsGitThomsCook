Feature: User Selects a Holiday category


  Scenario: User selects a Europe Tour packages
  
    Given I want to select a Holiday category
    When the user  select a Europe Tour package
    And the user select a departure city as chennai
    And the  user select a month of travel as feb
		And the user select a duration of travel less than 7 nights
		And the user select a package type without a flight
		And the user select theme with a family
		Then the user select the city Marvel Of Georgia