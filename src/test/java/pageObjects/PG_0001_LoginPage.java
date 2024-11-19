package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ExtentReportManager;
import utils.TestContext;

public class PG_0001_LoginPage {

	public PG_0001_LoginPage(WebDriver driver) {
		TestContext.setDriver(driver); // Use TestContext to set the driver
		PageFactory.initElements(driver, this); // Initialize page elements
	}

	@FindBy(xpath = "//app-header/nav[@id='header']/div[2]/ul[1]/li[4]/a[1]")
	public WebElement loginbuttonclick;

	@FindBy(name = "mobile")
	public WebElement mobilenumber;
	
	
	@FindBy(xpath = "//button[contains(text(),'Send OTP to Login')]")
	public WebElement otploginbutton;
	
	


	public PG_0001_LoginPage loginbuttonclick() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			loginbuttonclick.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {
			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	public PG_0001_LoginPage Enter_the_mobilenumber(String mobile) {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			mobilenumber.sendKeys(mobile);
			ExtentReportManager.reportStep(methodName + " " + mobile, "pass");
			TestContext.getLogger().info(methodName + " " + mobile);
		} catch (Exception e) {
			TestContext.getLogger().error(methodName + " " + mobile);
			e.printStackTrace();
		}
		return this;
	}
	public  PG_0001_LoginPage Click_on_loginbutton() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			otploginbutton.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {
			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	
}
