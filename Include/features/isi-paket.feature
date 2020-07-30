Feature: Isi Pulsa Feature
As a user, I wan't to buy data package with BCA Bank Transfer

  Scenario: Create transaction buy data package with BCA Bank Transfer
    Given User already login 
    When User tap Isi Paket Data
    And User type phone number
    And User select paket data
    And User tap Transfer via BCA
    Then User Successfully buy credit
