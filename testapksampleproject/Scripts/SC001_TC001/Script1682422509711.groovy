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

Mobile.callTestCase(findTestCase('Test Cases/Common_LoginCase'), null, FailureHandling.STOP_ON_FAILURE)
Mobile.delay(30)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/TextViewCust2'), 30)
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/TextViewAll Customers') , 10)
Mobile.delay(3)
Mobile.setText(findTestObject('Object Repository/SC001_TC001_OR/TextView - SearchName'), "J", 10)
Mobile.delay(3)
//Mobile.setText(findTestObject('Object Repository/SC001_TC001_OR/TextView - SearchName'),findTestData("TestData").getValue("CUSTOMERNAME", 1), 10)

Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/TextView-8178331074'), 10)
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/TextView - Add Balance'), 10)
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/TextView - Cash'), 10)
Mobile.delay(3)
//Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/Amount-EditText-30000'), 10)
Mobile.setText(findTestObject('Object Repository/SC001_TC001_OR/Amount-EditText-30000'),"300", 10)
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/android.widget.TextView - Receive'), 10)
Mobile.delay(4)




