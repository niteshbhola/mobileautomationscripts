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
for (int i=1; i<=3; i++) {
Mobile.startApplication("C:/Core/QB3.25.apk", false)
Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Common_LoginCaseOR/InitialLoginButton'), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//Mobile.setText(findTestObject('Object Repository/Common_LoginCaseOR/EnterUsername'), '8178331074', 10)
Mobile.setText(findTestObject('Object Repository/Common_LoginCaseOR/EnterUsername'),findTestData("TestData").getValue("USER", i), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
//Mobile.setText(findTestObject('Object Repository/Common_LoginCaseOR/EnterPassword') , '013606', 10)
Mobile.setText(findTestObject('Object Repository/Common_LoginCaseOR/EnterPassword'),findTestData("TestData").getValue("PASS", i), 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Common_LoginCaseOR/LoginPostUserPass') , 30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)
Mobile.closeApplication()
}