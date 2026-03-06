import com.framework.base.BaseTest
import com.company.pages.LoginPage
import com.company.pages.HomePage
import com.kms.katalon.core.testdata.TestDataFactory as DataFactory

// Load the Data File
def data = DataFactory.findTestData("LoginTestData")

// Read first row values
String username = data.getValue("username", 1)
String password = data.getValue("password", 1)

// Setup
BaseTest bt = new BaseTest()
bt.setup()

// Pages
LoginPage login = new LoginPage()
HomePage home = new HomePage()

login.performLogin(username, password)

home.verifyHome()

bt.tearDown()
