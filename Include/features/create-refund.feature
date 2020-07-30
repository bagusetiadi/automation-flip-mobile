Feature: Create Refund
As a user, I wan't to ask for refund because I transfer more than nominal transaction

  Scenario: Create refund because transfer more than nominal transaction
    Given User already login 
    When User tap Refund
    And User tap Pilih Bukti Transfer
    And User Choose Gunakan Kamera
    And User Take Photo
    And User Tap Alasan Refund
    And User Type Nominal Refund
    And User tap Bank Option
    And User select Jenius Bank
    And User type bank account number
    And User tap Cek Nama
    And User tap Buat Permintaan Refund
    Then Refund Transaction Successfully Created
