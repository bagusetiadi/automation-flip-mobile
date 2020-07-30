Feature: Isi Pulsa Feature

  Scenario: Create transaction buy credit Telkomsel
    Given User already login 
    When User tap Isi Paket Data
    And User type phone number
    And User select paket data
    And User tap Transfer via BCA
    Then User Successfully buy credit
