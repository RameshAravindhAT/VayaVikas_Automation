package testPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import projectSpecifications.BaseClass;
import utils.ExtentReportManager;
import utils.TestContext;



@Listeners(utils.CustomTestListener.class)  // Custom listeners for reporting or test actions

public class TC_0001_Login extends BaseClass{ 
	
	 @BeforeClass
	    public void testDetails() {
	        // Set the sheet name for the test
	        TestContext.setSheetName("Login");
	    }
	 
	 @Test(dataProvider = "sendData") 
	    public void validateLogin(String testNameDetails, String authorName, String category, 
	                              String mobilenumber) throws InterruptedException {
		 
		 ExtentReportManager.setTest(extent.createTest(testNameDetails)); // Create the test instance in Extent Reports
	        ExtentReportManager.getTest().assignAuthor(authorName); // Assign the author for the test
	        ExtentReportManager.getTest().assignCategory(category);  // Assign the category for the test
	 
	        TestContext.getLoginPage()
	        .loginbuttonclick()
	        .Enter_the_mobilenumber(mobilenumber)
	        .Click_on_loginbutton();
	       
	 }
}
