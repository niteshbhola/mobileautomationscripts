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
Mobile.startApplication("C:/Core/queueBusterAPPRelease_3.21.apk", false)
Mobile.delay(2)
//Mobile.setText(findTestObject, null, 0)
//Mobile.tap(findTestObject('Object Repository/TC33OR/android.widget.TextView - Login (1)'), 1)

Mobile.tap(findTestObject('Object Repository/TC33OR/android.widget.TextView - Login001'), 0)

//Mobile.setText(findTestObject('Application/Graphics/android.widget.TextView - Xfermodes'),'Your text here', GlobalVariable.G_Timeout)
Mobile.delay(3)
Mobile.setText(findTestObject('Object Repository/TC33OR/android.widget.EditText - Enter Username (1)'), '8178331074', 0)
//Mobile.setText(findTestObject('Object Repository/TC33OR/android.widget.EditText - Enter Username') , "234567", 3)
Mobile.delay(2)
Mobile.setText(findTestObject('Object Repository/TC33OR/android.widget.EditText - Enter Password') , '013606', 0)
Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/TC33OR/UserPassLogin') , 0)

Mobile.delay(2)

Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/TC33OR/SearchStore'), "NStore1", 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/TC33OR/RadioNStore1'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/TC33OR/android.widget.TextView - Continue'), 0)

Mobile.delay(3)

//Mobile.tap(findTestObject('Object Repository/TC33OR/android.widget.Billing') , 0)
Mobile.delay(2)
//Mobile.tap(findTestObject('Object Repository/TC33OR/android.widget.Iogout'), 0)
Mobile.tap(findTestObject('Object Repository/TC33OR/Setup'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/TC33OR/Business Profile'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/TC33OR/Master Logout'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/TC33OR/YesMasterLogout'), 0)

Mobile.delay(2)

Mobile.closeApplication()


