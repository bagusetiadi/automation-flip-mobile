Feature: Kirim Uang For Two Account Feature
As a user, I want to send money for two bank account from BCA to BTPN Jenius

  Scenario: Create double transaction send money from BCA to BTPN Jenius
    Given User already login 
    When User tap Kirim Uang
    And User tap OK Idul Adha
    And User tap Bank Option
    And User select Jenius Bank
    And User type account number
    And User tap Cek Nama
    And User type Transfer Nominal
    And User type Berita
    And User tap Tambah Tujuan Baru	
    And Transaction already added
		And User tap Bank Option
    And User select Jenius Bank
    And User type account number
    And User tap Cek Nama
    And User type Transfer Nominal
    And User type Berita
    And User tap Lanjut Ke Pengiriman
    And User tap Transfer via BCA
    Then User Successfully Create Transaction
