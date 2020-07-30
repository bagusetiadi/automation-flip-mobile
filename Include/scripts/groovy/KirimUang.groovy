import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
public class KirimUang {
	@Given("User already login")
	def hadLogin() {
		Mobile.startExistingApplication(GlobalVariable.appId, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.waitForElementPresent(findTestObject('kirim-uang/kirimUangBtn'), 10)
	}
	@When("User tap Kirim Uang")
	def kirimUang() {
		Mobile.tap(findTestObject('kirim-uang/kirimUangBtn'), 2)
	}
	@And("User tap Bank Option")
	def bankOption() {
		Mobile.tap(findTestObject('kirim-uang/bankOption'), 2)
	}
	@And("User select Jenius Bank")
	def jeniusOption() {
		Mobile.tap(findTestObject('kirim-uang/jeniusBank'), 2)
	}
	@And("User type account number")
	def typeAccount() {
		Mobile.setText(findTestObject('kirim-uang/noRekTujuanTxt'), GlobalVariable.btpn, 2)
	}
	@And("User tap Cek Nama")
	def cekNama() {
		Mobile.tap(findTestObject('kirim-uang/cekNamaBtn'), 2)
		Mobile.waitForElementPresent(findTestObject('kirim-uang/namaChecked'), 10)
		Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
	}
	@And("User type Transfer Nominal")
	def transferNominal() {
		Mobile.setText(findTestObject('kirim-uang/NominalTxt'), '10000', 2)
	}
	@And("User type Berita")
	def typeBerita() {
		Mobile.clearText(findTestObject('kirim-uang/editBeritaTxt'), 2, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.setText(findTestObject('kirim-uang/beritaBlank'), 'Testing Flip', 2)
	}
	@And("User tap Ok, Data Sudah Benar")
	def dataBenar() {
		Mobile.scrollToText('DATA SUDAH BENAR', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('kirim-uang/submitBtn'), 2)
	}
	@And("User tap Transfer via BCA")
	def viaBca() {
		Mobile.waitForElementPresent(findTestObject('kirim-uang/transactionSuccess'), 10)
		Mobile.tap(findTestObject('kirim-uang/TransferViaBca'), 2)
	}
	@And("Transaction already added")
	def transactionAdded() {
		Mobile.waitForElementPresent(findTestObject('kirim-uang/oneTrascastion'), 10)
	}
	@And("User tap Tambah Tujuan Baru")
	def tujuanBaru() {
		Mobile.scrollToText('DATA SUDAH BENAR', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('kirim-uang/tambahTujuanBtn'), 2)
		Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)
	}
	@And("User tap Lanjut Ke Pengiriman")
	def lanjutPengiriman() {
		Mobile.scrollToText('LANJUT KE PENGIRIMAN', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('kirim-uang/lanjutPengirimanBtn'), 2)
	}
	@Then("User Successfully Create Transaction")
	def successTransfer() {
		if (Mobile.waitForElementPresent(findTestObject('kirim-uang/sudahTransferBtn'), 20)) {
			KeywordUtil.markPassed('Passed')
		} else {
			KeywordUtil.markFailedAndStop('error')
		}
	}
}
