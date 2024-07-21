#Author: Uday Kishore Raju

Feature: Login scenario to check login is successful

@SmokeTest
Scenario: Check login is successful

Given user is able to login
When user provide credential
And user provide credential "<email>" and "<password>"

Examples:
|email|password|
|admin@yourstore.com|admin|
