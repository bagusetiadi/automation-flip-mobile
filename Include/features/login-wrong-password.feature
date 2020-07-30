Feature: Login Feature
As a user, I want to check the login function if I didn't enter wrong password

  Scenario: Login with wrong password
    Given User already enter the application
    When User enter valid email
    And User enter wrong password
    And User click login button
    Then User cannot login
