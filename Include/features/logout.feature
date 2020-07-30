Feature: Logout Feature
As a user, I wan't to logout from my Flip Account

  Scenario: Logout from flip account
    Given User already login 
    When User tap Akun
    And User tap Keluar
    And User tap OK Keluar
    Then User successfully logout
