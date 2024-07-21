
Feature: Added Customer
  I want to use this template for my feature file

@SmokeTest
  Scenario: Add a new customer
  	Given user is able to login
		When user provide credential
		And user provide credential "<email>" and "<password>"
    And Click on Custmer Menu
    And User can view add customer page
    Then user can enter customer info
    When clic on save button
    And verify confrmation message
    Then close browser

Examples:
|email|password|
|admin@yourstore.com|admin|