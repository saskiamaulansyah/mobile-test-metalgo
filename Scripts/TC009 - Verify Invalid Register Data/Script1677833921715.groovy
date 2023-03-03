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

WebUI.callTestCase(findTestCase('TC003 - Onboarding Screen'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Page_Register/android.widget.Button - Daftar (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Page_Register/android.widget.EditText - Masukkan nama lengkap'), 'Saskia Maulansyah', 
    0)

Mobile.setText(findTestObject('Object Repository/Page_Register/android.widget.EditText - Masukkan username'), 'usertesting', 
    0)

Mobile.setText(findTestObject('Object Repository/Page_Register/android.widget.EditText - Masukkan email'), 'usertesting10sepuluh@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Page_Register/android.widget.EditText - Masukkan no. telepon'), '081259754482', 
    0)

Mobile.setText(findTestObject('Object Repository/Page_Register/android.widget.EditText - Masukkan password (2)'), 'testing1', 
    0)

Mobile.setText(findTestObject('Object Repository/Page_Register/android.widget.EditText - Masukkan konfirmasi password (2)'), 
    'testing1', 0)

Mobile.tap(findTestObject('Object Repository/Page_Register/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Page_Register/android.widget.TextView - Saya menyetujui Kebijakan Privasi yang berlaku'), 
    0)

Mobile.tap(findTestObject('Page_Register/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Page_Register/android.widget.Button - Lanjutkan'), 0)

Mobile.verifyElementVisible(findTestObject('Page_Register/android.widget.TextView - data pengguna sudah digunakan'), 0, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page_Register/android.widget.Button - OK'), 0)

