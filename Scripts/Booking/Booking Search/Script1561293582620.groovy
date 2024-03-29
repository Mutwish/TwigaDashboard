import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/Link_Booking'))

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/Select_Booking'))

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/CloseBookingTab'))

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/DropdownHarvestDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/Select_HarvestDate'))

WebUI.delay(3)

WebUI.mouseOver(findTestObject('Booking search/DropdownHarvestDate'))

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/CloseHarvestfilters'))

WebUI.delay(2)

WebUI.click(findTestObject('Booking search/DropDown_Products'))

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/SelectProduct_Banana'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Booking search/closeproduct'))

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/DropDownArea'))

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/SelectArea'))

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/DropDownCollectionCenter'))

WebUI.delay(3)

WebUI.click(findTestObject('Booking search/SelectCollectionCenter'))

WebUI.delay(3)

not_run: WebUI.click(findTestObject('Booking search/CloseCollection'))

