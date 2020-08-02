Feature: Login Feature
As a user, I want to check the login function if I enter the wrong email

  Scenario: Login with invalid email
    Given User already enter the application
    When User enter invalid email
    And User enter valid password
    And User click login button
    Then User cannot login
    And User press back
