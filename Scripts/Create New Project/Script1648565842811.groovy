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

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://fsmqa118-rnd.corporate.ifs.com/FSM6QA/WebClient/auth/login?auth=fsm')

WebUI.setText(findTestObject('Object Repository/Page_FSM 6 Regular QA/input_Person ID_user-person-id'), 'KJL')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_FSM 6 Regular QA/input_Password_user-password'), 'SgtDwIec1bEU16hm19OpKg==')

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/button_Log In'))

WebUI.click(findTestObject('Page_FSM 6 Regular QA/use'))

WebUI.setText(findTestObject('Object Repository/Page_FSM 6 Regular QA/input_Logout_form-control ng-untouched ng-p_7f8833'), 
    'project')

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/div_Projects'))

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/button_New'))

WebUI.setText(findTestObject('Object Repository/Page_FSM 6 Regular QA/input_Place ID_form-control form-control-sm_4784de'), 
    'metrix')

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/svg_Due Date_btn-icon'))

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/span_30'))

WebUI.setText(findTestObject('Object Repository/Page_FSM 6 Regular QA/textarea_Description_text-area'), 'Katalon test')

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/button_Delete'))

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/button_KLKevin Lobraco'))

WebUI.click(findTestObject('Object Repository/Page_FSM 6 Regular QA/a_Logout'))

WebUI.closeBrowser()

