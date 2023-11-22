Feature: To get information about ThomasCook 
Scenario: User wants to know about ThomasCook Website
Given USER IS ON THOMASCOOK WEBPAGE
When user clicks on about us
And the user gets the information about Thomascook
When the user clicks on policies
And the user gets the priacy policy information
When the user clicks on board of directors
Then the user get board directors information
