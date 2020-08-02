Feature: Login Feature
As a user, I want to check the login function if I didn't enter both email and password

  Scenario: Login with blank email and password
    Given User already enter the application
    When User enter blank email
    And User enter blank password
    And User click login button
    Then User cannot login
    And User press back
