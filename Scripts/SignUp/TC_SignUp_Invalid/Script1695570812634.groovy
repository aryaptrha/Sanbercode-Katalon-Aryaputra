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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.waitForElementVisible(findTestObject('SignUp/Page_STORE/btn_SignUp'), 0)

WebUI.click(findTestObject('SignUp/Page_STORE/btn_SignUp'))

WebUI.delay(1)

WebUI.setText(findTestObject('SignUp/Page_STORE/input_Username'), '')

WebUI.setText(findTestObject('SignUp/Page_STORE/input_Password'), '')

WebUI.click(findTestObject('SignUp/Page_STORE/btn_SignUpDone'))

WebUI.waitForAlert(2)

WebDriver driver = DriverFactory.getWebDriver()

'Getting the text from the alert and storing it in Variable'
String AlertText = driver.switchTo().alert().getText()

'Verifying the Actual and Expected text from Alert'
WebUI.verifyEqual(AlertText, 'Please fill out Username and Password.')

WebUI.closeBrowser()

