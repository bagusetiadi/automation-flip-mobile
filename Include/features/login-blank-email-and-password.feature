Feature: Login Feature

  Scenario: Login with blank email and password
    Given User already enter the application
    When User enter blank email
    And User enter blank password
    And User click login button
    Then User cannot login
