Feature: Login Feature

  Scenario: Login with wrong password
    Given User already enter the application
    When User enter valid email
    And User enter wrong password
    And User click login button
    Then User cannot login
