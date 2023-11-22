Feature: user is in cruise page in thomascook page
	Scenario: user used to search cruise
		Given user is in the ThomasCOOK page
		When user clicks the cruise button
		And user selects the value from dropdown 
		And user clicks on the search button
		And user gets search results for the search
		Then user clicks on modify button
		And user clicks on modify search to change date and departure city
		Then user recieve the modified search
		