import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
public class Refund {
	@When("User tap Refund")
	def refundBtn() {
		Mobile.tap(findTestObject('refund/refundBtn'), 2)
	}
	@And("User tap Pilih Bukti Transfer")
	def tapProve() {
		Mobile.tap(findTestObject('refund/uploadBuktiBtn'), 2)
	}
	@And("User Choose Gunakan Kamera")
	def cameraBtn() {
		Mobile.tap(findTestObject('refund/cameraChoosed'), 2)
	}
	@And("User Take Photo")
	def takePhoto() {
		Mobile.waitForElementPresent(findTestObject('refund/takePhoto'), 5)
		Mobile.tap(findTestObject('refund/takePhoto'), 2)
		Mobile.tap(findTestObject('refund/donePhoto'), 2)
	}
	@And("User Tap Alasan Refund")
	def alasanRefund() {
		Mobile.scrollToText('BUAT PERMINTAAN REFUND', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('refund/alasanRefund'), 2)
		Mobile.tap(findTestObject('refund/alasanChoosed'), 2)
	}
	@And("User Type Nominal Refund")
	def refundNominal() {
		Mobile.setText(findTestObject('refund/nominalRefundTxt'), '10000', 2)
	}
	@And("User tap Buat Permintaan Refund")
	def submitRefund() {
		Mobile.scrollToText('BUAT PERMINTAAN REFUND', FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tap(findTestObject('refund/submitRefundBtn'), 2)
	}
	@And("User type bank account number")
	def typeBankAccount() {
		Mobile.clearText(findTestObject('refund/accountExist'), 2)
		Mobile.setText(findTestObject('kirim-uang/noRekTujuanTxt'), GlobalVariable.btpn, 2)
	}
	@Then("Refund Transaction Successfully Created")
	def refundCreated() {
		if (Mobile.waitForElementPresent(findTestObject('refund/refundSuccess'), 100)) {
			KeywordUtil.markPassed('Passed')
		} else {
			KeywordUtil.markFailedAndStop('error')
		}
	}
}
