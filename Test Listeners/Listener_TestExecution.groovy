

import com.kms.katalon.core.annotation.*
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.text.SimpleDateFormat

class Listener_TestExecution {

    // Folder to save screenshots
    static String screenshotFolder = "Screenshots"

    /**
     * Runs before every Test Case
     */
    @BeforeTestCase
    def beforeTestCase(TestCaseContext context) {
        KeywordUtil.logInfo("===== STARTING TEST CASE: ${context.getTestCaseId()} =====")
        // Optionally, you can add setup code here
        // e.g., initializing test data or environment
    }

    /**
     * Runs after every Test Case
     */
    @AfterTestCase
    def afterTestCase(TestCaseContext context) {
        String testCaseId = context.getTestCaseId()
        String status = context.getTestCaseStatus()
        KeywordUtil.logInfo("===== FINISHED TEST CASE: ${testCaseId} - STATUS: ${status} =====")

        // Take screenshot if test case failed
        if (status == "FAILED") {
            takeScreenshot(testCaseId)
        }
    }

    /**
     * Runs before every Test Suite
     */
    @BeforeTestSuite
    def beforeTestSuite(TestSuiteContext context) {
        KeywordUtil.logInfo("===== STARTING TEST SUITE: ${context.getTestSuiteId()} =====")
        // Setup global test data or environment variables here
    }

    /**
     * Runs after every Test Suite
     */
    @AfterTestSuite
    def afterTestSuite(TestSuiteContext context) {
        KeywordUtil.logInfo("===== FINISHED TEST SUITE: ${context.getTestSuiteId()} =====")
        // Cleanup resources, send reports, or update dashboards here
    }

    /**
     * Utility method to take screenshot with timestamp
     */
    private void takeScreenshot(String testCaseId) {
        try {
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
            String fileName = "${screenshotFolder}/${testCaseId}_${timestamp}.png"
            WebUI.takeScreenshot(fileName)
            KeywordUtil.logInfo("Screenshot saved: ${fileName}")
        } catch (Exception e) {
            KeywordUtil.logInfo("Failed to take screenshot: " + e.getMessage())
        }
    }
}
