import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
class Login {
	@Given("User already enter the application")
	def openApp() {
		Mobile.startExistingApplication(GlobalVariable.appId, FailureHandling.STOP_ON_FAILURE)
		Mobile.waitForElementPresent(findTestObject('basic/masukBtn'), 10)
		Mobile.tap(findTestObject('basic/masukBtn'), 2)
	}
	@When("User enter valid email")
	def typeEmail() {
		Mobile.clearText(findTestObject('basic/emailTxt'), 0)
		Mobile.setText(findTestObject('basic/emailTxt'), GlobalVariable.email, 2)
	}
	@And("User enter valid password")
	def typePassword() {
		Mobile.setText(findTestObject('basic/passwordTxt'), GlobalVariable.password, 2)
	}
	@And("User enter blank password")
	def blankPassword() {
		Mobile.setText(findTestObject('basic/passwordTxt'), '', 2)
	}
	@And("User enter wrong password")
	def wrongPassword() {
		Mobile.setText(findTestObject('basic/passwordTxt'), GlobalVariable.wrongPassword, 2)
	}
	@And("User click login button")
	def tapLogin() {
		Mobile.tap(findTestObject('basic/loginBtn'), 2)
	}
	@And("User tap Akun")
	def tapAkun() {
		Mobile.tap(findTestObject('basic/akunBtn'), 2)
	}
	@And("User tap Keluar")
	def tapKeluar() {
		Mobile.tap(findTestObject('basic/keluarBtn'), 2)
	}
	@And("User tap OK Keluar")
	def okKeluar() {
		Mobile.tap(findTestObject('basic/okKeluarBtn'), 2)
	}
	@When("User enter invalid email")
	def invalidEmail() {
		Mobile.clearText(findTestObject('basic/emailTxt'), 0)

		Mobile.setText(findTestObject('basic/emailTxt'), GlobalVariable.invalidEmail, 2)
	}
	@When("User enter blank email")
	def blankEmail() {
		Mobile.clearText(findTestObject('basic/emailTxt'), 0)

		Mobile.setText(findTestObject('basic/emailTxt'), '', 2)
	}
	@Then("User cannot login")
	def loginFailed() {
		if (Mobile.verifyElementNotExist(findTestObject('basic/kirimUangBtn'), 2)) {
			KeywordUtil.markPassed('success')
		} else {
			KeywordUtil.markFailedAndStop('error')
		}
	}
	@Then("User successfully login")
	def loginSuccess() {
		if (Mobile.waitForElementPresent(findTestObject('basic/kirimUangBtn'), 30)) {
			KeywordUtil.markPassed('success')
		} else {
			KeywordUtil.markFailedAndStop('error')
		}
	}
	@Then("User successfully logout")
	def logoutSuccess() {
		if (Mobile.waitForElementPresent(findTestObject('basic/masukBtn'), 5)) {
			KeywordUtil.markPassed('success')
		} else {
			KeywordUtil.markFailedAndStop('error')
		}
	}
	@And("User tap OK Idul Adha")
	def idulAdha() {
		Mobile.tap(findTestObject('basic/idulAdha'), 2)
	}
}