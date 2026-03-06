package com.framework.core

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class WaitKeywords {

    static int DEFAULT_TIMEOUT = 20

    static void forVisible(TestObject object, int timeout = DEFAULT_TIMEOUT) {
        WebUI.waitForElementVisible(object, timeout)
    }

    static void forClickable(TestObject object, int timeout = DEFAULT_TIMEOUT) {
        WebUI.waitForElementClickable(object, timeout)
    }

    static void forPresent(TestObject object, int timeout = DEFAULT_TIMEOUT) {
        WebUI.waitForElementPresent(object, timeout)
    }

    static void untilGone(TestObject object, int timeout = DEFAULT_TIMEOUT) {
        WebUI.waitForElementNotVisible(object, timeout)
    }

    static void forPageLoad(int timeout = 30) {
        WebUI.waitForPageLoad(timeout)
    }

    static void forAngular(int timeout = DEFAULT_TIMEOUT) {
        WebUI.waitForJQueryLoad(timeout)
    }

    static void delay(int seconds) {
        WebUI.delay(seconds)
    }
}