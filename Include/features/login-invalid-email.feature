Feature: Login Feature

  Scenario: Login with invalid email
    Given User already enter the application
    When User enter invalid email
    And User enter valid password
    And User click login button
    Then User cannot login
