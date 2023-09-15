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

WebUI.callTestCase(findTestCase('TC021 - KYC PBK'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Sebelumnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Sebelumnya'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (7)'), 0)

Mobile.scrollToText('Sebelumnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (8)'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (9)'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (10)'), 0)

Mobile.scrollToText('Lampiran')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Lampiran'), 0)

Mobile.scrollToText('Video Verifikasi')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - main (1)'), 0)

Mobile.closeApplication()

