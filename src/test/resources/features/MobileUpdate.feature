Feature: Editing a mobile number

  Scenario: User edits their  mobile number
    Given USER IS on Thomascook Website
    When the user click on my account
    And the user click an View  My account
    And the user click a edit button
    And the user changes a mobile number
    And user click a save button
    Then changes successfull message is displayed
