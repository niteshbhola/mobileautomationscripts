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

Mobile.startApplication("C:/Users/HP/Desktop/queueBusterAPPRelease_3.53.apk", true)
Mobile.delay(10)
//Mobile.startExistingApplication("C:/Users/HP/Desktop/queueBusterAPPRelease_3.53.apk")
Mobile.delay(4)
Mobile.tap(findTestObject('Object Repository/Common_LoginCaseOR/InitialLoginButton'), 10)

Mobile.delay(3)
Mobile.setText(findTestObject('Object Repository/Common_LoginCaseOR/EnterUsername'), '8178331074', 10)

Mobile.delay(3)
Mobile.setText(findTestObject('Object Repository/Common_LoginCaseOR/EnterPassword') , '013606', 10)
Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Common_LoginCaseOR/LoginPostUserPass') , 30)

Mobile.delay(6)

//Mobile.setText(findTestObject('Object Repository/Common_LoginCaseOR/SearchStoreByName'),"NStore1", 30)

Mobile.setText(findTestObject('Object Repository/Common_LoginCaseOR/StoreSearchByNameUpdated'),"NStore1", 0)

Mobile.delay(3)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Common_LoginCaseOR/RadioNStore1'), 60)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Common_LoginCaseOR/Continue'), 60)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Common_LoginCaseOR/Setup'), 30)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/android.widget.TextView - Sync'), 40)

Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/android.widget.TextView - Master Data'), 60)
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/BackButton_Sync'), 30)
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/Setupbutton'), 30)
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/android.widget.TextView - Billing1'), 30)
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/All Items'), 30)
Mobile.delay(5)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/TestPro007'), 30)
Mobile.delay(4)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/1Item'), 30)
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/Pay1'), 30)
Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/Cash'), 30)
Mobile.delay(3)


Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/Accept630.00'), 30)
Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/SC001_TC001_OR/Confirm Payment'), 30)
Mobile.delay(3)

















