package com.framework.base
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.framework.core.EnvKeywords




class BaseTest {
	def setup() {
		EnvKeywords env = new EnvKeywords()

		switch (env.getBrowser().toLowerCase()) {
			case "chrome":
				WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)
				break

			case "firefox":
				WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.setViewPortSize(1920, 1080)
				break

			case "edge":
				WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)
				break

			case "headless":
				System.setProperty("isHeadless", "true")
				WebUI.openBrowser('')
				break

			default:
				WebUI.openBrowser('')
		}

		WebUI.maximizeWindow()
		WebUI.navigateToUrl(env.getBaseURL())
	}

	def tearDown() {
		WebUI.closeBrowser()
	}
}