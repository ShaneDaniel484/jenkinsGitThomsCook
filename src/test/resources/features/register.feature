Feature: Register an user in thomascook application
 
  @register
  Scenario Outline: Register user and get successful messege
    Given user is on thomascook homepage
    When user clicks on loginbutton
    And clicks on register
    And user enter the details using sheetname  "<sheetname>" and rownumber <rownumber>
    And user clicks register button
    Then user is navigated to homepage with user logged in
 
    Examples:
      | sheetname | rownumber |
      | sheet1    |         0 |