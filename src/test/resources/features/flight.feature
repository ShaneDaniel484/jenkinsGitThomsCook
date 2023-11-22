Feature: Customer user to search flight in Thomascook page

Scenario: cusomer wants to book the flight

Given customer is on thomascook page.
When The user clicks on the Flights
When user clicks on the Oneway trip
When user gives the from location
When user gives the to location
When user clicks the date
When user selects the date from calendar
Then user clicks on the Search flight button 