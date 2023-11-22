Feature: Searching desired tour package
Scenario: User searches for their desired tour package
Given User Is On Thomascook website
When user gives place name
|place|
|Australia|
And selects budget
And selects month of travel
And Clicks search button
And user sorts the search
Then the desired tour package is displayed