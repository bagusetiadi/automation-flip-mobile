Feature: Isi Pulsa Feature

  Scenario: Create transaction buy credit Telkomsel
    Given User already login 
    When User tap Beli Pulsa
    And User type phone number
    And User select Nominal Pulsa
    And User tap Transfer via BCA
    Then User Successfully buy credit
