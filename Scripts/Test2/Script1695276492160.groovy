import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('google.com')

WebUI.navigateToUrl('https://app.ease-healthcare.com/login/?redirect_to=https://app.ease-healthcare.com')

WebUI.click(getObject('//*[@id="user_login_email"]'))

WebUI.setText(getObject('//*[@id="user_login_email"]'), 'giang.le@rayyone.com')

WebUI.click(getObject('//*[@id="wp-submit"]'))

WebUI.delay(5)

//def email = WebUI.getText(getObject('//*[@id="user_login"]'))
//
//WebUI.verifyEqual(email, 'giang.le@rayyone.com')

WebUI.setText(getObject('//*[@id="user_pass"]'), 'rayyone168giangle1')

WebUI.click(getObject('//*[@id="wp-submit"]'))

WebUI.verifyTextPresent("ERROR: Incorrect email address or password.", false)
WebUI.closeBrowser()
def getObject(String obj) {
    TestObject oB1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, obj)
    return oB1
}
