Feature: Login Feature
As a user, I want to check the login to my Flip Account

  Scenario: Login with valid credentials
    Given User already enter the application
    When User enter valid email
    And User enter valid password
    And User click login button
    Then User successfully login
