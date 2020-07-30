Feature: Isi Pulsa Feature
As a user, I want to buy credit Telkomsel with Bank BCA Transfer

  Scenario: Create transaction buy credit Telkomsel
    Given User already login 
    When User tap Beli Pulsa
    And User tap OK Idul Adha
    And User type phone number
    And User select Nominal Pulsa
    And User tap Transfer via BCA
    Then User Successfully buy credit
