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

WebUI.callTestCase(findTestCase('TC001 - Verify Successful Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.RelativeLayout (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Page_PBK/android.widget.EditText'), '081252070447', 0)

Mobile.setText(findTestObject('Object Repository/Page_PBK/android.widget.EditText (1)'), 'testing2', 0)

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Login'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (1)'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (2)'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (3)'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (4)'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (5)'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selanjutnya (6)'), 0)

Mobile.scrollToText('Selanjutnya')

Mobile.tap(findTestObject('Page_PBK/android.widget.Button - Selanjutnya (7)'), 0)

Mobile.scrollToText('Video Pernyataan')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Pilih Video'), 0)

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.TextView - Rekam Video'), 0)

Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Selesai'), 0)

Mobile.scrollToText('Simpan')

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - main'), 0)

Mobile.tap(findTestObject('Object Repository/Page_PBK/android.widget.Button - Simpan'), 0)

