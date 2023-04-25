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
Mobile.delay(5)
	
Mobile.tap(findTestObject('Object Repository/LogincaseOR/testOR/android.widget.TextView - Login') , 5)

'Start the Application'
Mobile.startApplication(RunConfiguration.getProjectDir() + '/APIDemos.apk', true)


Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.TextView - OS'), 0)

'Tap on text "SMS Messaging"'
Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.TextView - SMS Messaging'), 0)

'Enter a phone number in Recipient text box'
Mobile.setText(findTestObject('Object Repository/APIDemo/android.widget.EditText'), '+84345678910', 0)

'Enter a message in Body Message text box'
Mobile.setText(findTestObject('Object Repository/APIDemo/android.widget.EditText (1)'), 'Hello world! This is Katalon Mobile Recorder', 0)

'Send the message'
Mobile.tap(findTestObject('Object Repository/APIDemo/android.widget.Button - Send'), 0)


















/*
Mobile.tap(findTestObject('Object Repository/LogincaseOR/InitialLogin'), 5)
Mobile.delay(2)
Mobile.setText(findTestObject('Object Repository/LogincaseOR/android.widget.EditTextUSER'), ('nitesh'), 7)
Mobile.delay(7)

Mobile.setText(findTestObject('Object Repository/LogincaseOR/android.widget.PassInput'), '666666', 10)
Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/LogincaseOR/android.widget.TextView - Continue'), 3)
Mobile.delay(13)
//Mobile.closeApplication()
Mobile.tap(findTestObject('Object Repository/LogincaseOR/android.widget.TStoreRadio'), 10)
Mobile.delay(3)
Mobile.closeApplication()

*/





