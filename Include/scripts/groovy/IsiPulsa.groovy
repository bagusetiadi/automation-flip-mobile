import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import cucumber.api.java.en.And
import cucumber.api.java.en.Then
public class IsiPulsa {
	@And("User tap Beli Pulsa")
	def buyCredit() {
		Mobile.tap(findTestObject('isi-pulsa/beliPulsa'), 2)
	}
	@And("User tap Isi Paket Data")
	def isiPaket() {
		Mobile.tap(findTestObject('paket-data/paketDataBtn'), 2)
	}
	@And("User select paket data")
	def selectPaket() {
		def now = new Date().format('HH:mm', TimeZone.getTimeZone('GMT+7'))
		Mobile.scrollToText('BULK OMG')
		Mobile.tap(findTestObject('paket-data/selectPaket'), 2)
		if (now >= '20:00') {
			Mobile.tap(findTestObject('basic/okKeluarBtn'), 2)
		} else {
		}
	}
	@And("User type phone number")
	def phoneNum() {
		Mobile.waitForElementPresent(findTestObject('isi-pulsa/currentNoHp'), 10)
		Mobile.clearText(findTestObject('isi-pulsa/currentNoHp'), 2)
		Mobile.setText(findTestObject('isi-pulsa/noHp'), '085216146105', 2)
	}
	@And("User select Nominal Pulsa")
	def nominalPulsa() {
		def now = new Date().format('HH:mm', TimeZone.getTimeZone('GMT+7'))
		Mobile.scrollToText('Pulsa Telkomsel 15.000')
		Mobile.tap(findTestObject('isi-pulsa/nominalPulsa'), 2)
		if (now >= '20:00') {
			Mobile.tap(findTestObject('basic/okKeluarBtn'), 2)
		} else {
		}
	}
	@And("User tap back to homescreen")
	def backHomescreen() {
		Mobile.tap(findTestObject('/basic/xBtn'), 2)
	}
	@Then("User Successfully buy credit")
	def successBuyCredit() {
		if (Mobile.waitForElementPresent(findTestObject('isi-pulsa/verivyTransferFlip'), 4)
			) {
			KeywordUtil.markPassed('Passed')
		} else if (Mobile.waitForElementPresent(findTestObject('isi-pulsa/BCA'), 10)) {
			KeywordUtil.markPassed('Passed')
		} else {
			KeywordUtil.markFailedAndStop('error')
		}
	}
}
