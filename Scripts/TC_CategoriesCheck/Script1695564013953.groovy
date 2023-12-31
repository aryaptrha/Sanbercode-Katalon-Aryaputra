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

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.waitForElementVisible(findTestObject('Homepage/ProductCategories/btn_Phones'), 0)

WebUI.click(findTestObject('Homepage/ProductCategories/btn_Phones'))

WebUI.verifyElementVisible(findTestObject('Homepage/ProductCategories/btn_NokiaLumia1520'))

WebUI.verifyElementVisible(findTestObject('Homepage/ProductCategories/btn_SamsungGalaxyS6'))

WebUI.waitForElementVisible(findTestObject('Homepage/ProductCategories/btn_Laptops'), 0)

WebUI.click(findTestObject('Homepage/ProductCategories/btn_Laptops'))

WebUI.verifyElementVisible(findTestObject('Homepage/ProductCategories/btn_MacBookAir'))

WebUI.verifyElementVisible(findTestObject('Homepage/ProductCategories/btn_SonyVaioI5'))

WebUI.waitForElementVisible(findTestObject('Homepage/ProductCategories/btn_Monitors'), 0)

WebUI.click(findTestObject('Homepage/ProductCategories/btn_Monitors'))

WebUI.verifyElementVisible(findTestObject('Homepage/ProductCategories/btn_AppleMonitor24'))

WebUI.verifyElementVisible(findTestObject('Homepage/ProductCategories/btn_ASUSFullHD'))

WebUI.closeBrowser()

