package com.company.pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.framework.base.BasePage
import com.kms.katalon.core.testobject.ObjectRepository as OR
import internal.GlobalVariable
import com.framework.core.LogKeywords as Log


public class LoginPage extends BasePage {
	private TestObject txtUsername = OR.findTestObject('Login/txt_username')
	private TestObject txtPassword = OR.findTestObject('Login/txt_password')
	private TestObject btnLogin = OR.findTestObject('Login/btn_login')

	def performLogin(String user, String pass) {
		Log.info("Starting login test")
		type(txtUsername, user)
		type(txtPassword, pass)
		click(btnLogin)
	}
}

