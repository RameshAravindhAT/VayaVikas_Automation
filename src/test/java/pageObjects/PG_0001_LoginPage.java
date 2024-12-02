package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 import utils.ExtentReportManager;
import utils.TestContext;

public class PG_0001_LoginPage {
	 WebDriver driver;
	public PG_0001_LoginPage(WebDriver driver) {
		TestContext.setDriver(driver); // Use TestContext to set the driver
		PageFactory.initElements(driver, this); // Initialize page elements
		 this.driver = driver;
	}

	@FindBy(xpath = "//app-header/nav[@id='header']/div[2]/ul[1]/li[4]/a[1]")
	public WebElement loginbuttonclick;

	@FindBy(xpath = "//input[@placeholder='+91 XXXXXXXXXX']")
	public WebElement mobilenumber;

	@FindBy(xpath = "//button[contains(text(),'Send OTP to Login')]")
	public WebElement otploginbutton;
	
//	@FindBy(xpath = "//div[@id='toast-container']")
//    public WebElement toastMessage;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	public WebElement continouebutton;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-registration[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h4[1]/span[1]")
	public WebElement Selectuser;
	
	@FindBy(xpath="//app-header/nav[@id='header']/div[2]/ul[1]/li[1]/a[1]")
	public WebElement Homepage;
	

	

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
			Thread.sleep(3000);
			mobilenumber.sendKeys(mobile);
			ExtentReportManager.reportStep(methodName + " " + mobile, "pass");
			TestContext.getLogger().info(methodName + " " + mobile);
		} catch (Exception e) {
			TestContext.getLogger().error(methodName + " " + mobile);
			e.printStackTrace();
		}
		return this;
	}

	public PG_0001_LoginPage Click_on_loginbutton() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			
			otploginbutton.click();
			Thread.sleep(5000);
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {
			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	public  PG_0001_LoginPage Click_on_continuebutton() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(15000);
			continouebutton.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {
			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		
		return this;
	}
	
	
	public  PG_0001_LoginPage Select_user() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(15000);
			Selectuser.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {
			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
		
		
	}
		public PG_002_HomePage Verfiy_HomePage() {
			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
	        try {
	        	Thread.sleep(3000);
	        	Homepage.click();
	            ExtentReportManager.reportStep(methodName, "pass");
	            TestContext.getLogger().info(methodName);
	        } catch (Exception e) {
	           
	            e.printStackTrace();
	            TestContext.getLogger().error(methodName);
	        }
	        return new PG_002_HomePage(TestContext.getDriver());
		
	}
	


}
