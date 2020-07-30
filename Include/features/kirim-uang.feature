Feature: Kirim Uang Feature
As a user, I want to send money from BCA to BTPN Jenius

  Scenario: Create transaction send money from BCA to BTPN Jenius
    Given User already login 
    When User tap Kirim Uang
    And User tap Bank Option
    And User select Jenius Bank
    And User type account number
    And User tap Cek Nama
    And User type Transfer Nominal
    And User type Berita
    And User tap Ok, Data Sudah Benar
    And User tap Transfer via BCA
    Then User Successfully Create Transaction
