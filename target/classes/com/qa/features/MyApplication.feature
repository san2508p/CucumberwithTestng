
Feature: Economic Application 
  

  @tag1
  Scenario: Validate the application login successfully
    Given User opens Chrome browser
    When User enter username and password and login
    Then user clicks on Login button
    Then validate user login successfully 
    Then close the browser

   


   @tag1
  Scenario: Validate the invalid user not logged in
    Given User opens Chrome browser
    When User enter invalid username and password and login
    Then user clicks on Login button
    Then validate user not able to logged 
    Then close the browser

 
