Feature: Login Feature
As a user, I want to check the login function if I didn't enter my email

  Scenario: Login with blank email
    Given User already enter the application
    When User enter blank email
    And User enter valid password
    And User click login button
    Then User cannot login
