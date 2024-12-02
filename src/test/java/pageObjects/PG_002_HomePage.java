package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ExtentReportManager;
import utils.TestContext;

public class PG_002_HomePage {
	 
	public PG_002_HomePage(WebDriver driver) {
		TestContext.setDriver(driver); 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[1]/app-side-bar[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]']")
	public WebElement Article;
	
	@FindBy(xpath="//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-home[1]/section[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement writeArticle;
	
	
	
	
	
	public PG_002_HomePage Click_on_Article() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
        try {
        	Thread.sleep(3000);
        	Article.click();
            ExtentReportManager.reportStep(methodName, "pass");
            TestContext.getLogger().info(methodName);
        } catch (Exception e) {
           
            e.printStackTrace();
            TestContext.getLogger().error(methodName);
        }
        return this;
	}
	
	public PG_002_HomePage Click_on_writeArticle (){
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
        try {
        	Thread.sleep(3000);
        	writeArticle.click();
            ExtentReportManager.reportStep(methodName, "pass");
            TestContext.getLogger().info(methodName);
        } catch (Exception e) {
           
            e.printStackTrace();
            TestContext.getLogger().error(methodName);
        }
		return this;
	}
}
