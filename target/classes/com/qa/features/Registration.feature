#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Registration of user
  I want to use this template for my feature file

  @tag1
  Scenario: Verify user registration with valid data
    Given User open chrome browser and navigate to application
    When Click on Create account link
    Then Enter title
    Then Enter First name
    Then Enter Last name
    Then Enter Email id
    Then Enter Password
    Then Enter Confirm Password
    Then Check Terms and condition
    Then Submit the registration
    Then Verify registration successfull
    Then Close the browser
    


