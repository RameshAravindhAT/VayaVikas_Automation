package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ExtentReportManager;
import utils.TestContext;

public class PG_003_ArticelsPage {

	WebDriver driver;

	public PG_003_ArticelsPage(WebDriver driver) {
		TestContext.setDriver(driver);
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-writearticle[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")
	public WebElement post_titel;

	@FindBy(xpath = "//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-writearticle[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/button[1]")
	public WebElement Bowser;

	@FindBy(xpath = "//input[@type='file']")
	public WebElement File;

	@FindBy(xpath = "//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-writearticle[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/select[1]")
	public WebElement post_type;

	@FindBy(xpath = "//option[contains(text(),'Public Post')]")
	public WebElement type;

	@FindBy(xpath = "//div[@class='angular-editor-textarea' and @contenteditable='true']")
	public WebElement post_description;

	@FindBy(name = "categoryID")
	public WebElement category;

	@FindBy(xpath = "//option[contains(text(),'Finance')]")
	public WebElement selected_category;

	@FindBy(xpath = "//button[contains(text(),'Preview')]")
	public WebElement preview_button;

	@FindBy(xpath = "//button[contains(text(),'Save Draft')]")
	public WebElement Click_on_draft;

	@FindBy(xpath = "//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-home[1]/section[1]/div[2]/div[1]/div[1]/div[3]")
	public WebElement Click_legal;

	@FindBy(xpath = "//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-home[1]/section[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[1]")
	public WebElement Click_financial;

	@FindBy(xpath = "//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-home[1]/section[1]/div[2]/div[1]/div[1]/div[5]/a[1]/div[1]")
	public WebElement Click_Health;

	@FindBy(xpath = "//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-home[1]/section[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[1]")
	public WebElement Click_Engagement;

	@FindBy(xpath = "//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[2]/app-home[1]/section[1]/div[2]/div[1]/div[1]/div[7]/a[1]/div[1]")
	public WebElement Click_other;

	public PG_003_ArticelsPage Enter_the_posttitel_new(String titel) {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(3000);
			post_titel.sendKeys(titel);
			ExtentReportManager.reportStep(methodName + " " + titel, "pass");
			TestContext.getLogger().info(methodName + " " + titel);
		} catch (Exception e) {
			TestContext.getLogger().error(methodName + " " + titel);
			e.printStackTrace();
		}
		return this;

	}

	public PG_003_ArticelsPage click_on_the_browse() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
			Bowser.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;

	}

	public PG_003_ArticelsPage Select_file_image() {

		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
			File.sendKeys("/home/nd/Downloads/VVimage1.jpeg");
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;

	}

	public PG_003_ArticelsPage Click_on_Post_type_new() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
			post_type.click();
			Thread.sleep(5000);
			type.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}

		return this;

	}

	public PG_003_ArticelsPage Add_post_description1(String description2) {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(3000);
			post_description.sendKeys(description2);
			ExtentReportManager.reportStep(methodName + " " + description2, "pass");
			TestContext.getLogger().info(methodName + " " + description2);
		} catch (Exception e) {
			TestContext.getLogger().error(methodName + " " + description2);
			e.printStackTrace();
		}

		return this;

	}

	public PG_003_ArticelsPage Select_catogery1() {

		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", category);
			Thread.sleep(5000);
			js.executeScript("arguments[0].scrollIntoView(true);", selected_category);
			category.click();
			Thread.sleep(5000);
			selected_category.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}

		return this;

	}

	public PG_003_ArticelsPage Click_on_perview_button1() {

		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
			preview_button.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	public PG_003_ArticelsPage Click_on_SaveDraft() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
			Click_on_draft.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	public PG_003_ArticelsPage Click_on_legal() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(3000);
			Click_legal.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	public PG_003_ArticelsPage Click_on_Finance() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(3000);
			Click_financial.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	public PG_003_ArticelsPage Click_on_Health() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(3000);
			Click_Health.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	public PG_003_ArticelsPage Click_on_Engagement() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(3000);
			Click_Engagement.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	public PG_003_ArticelsPage Click_on_Other() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(3000);
			Click_other.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}
//		
//		public PG_004_EventPage Verify_Event() {
//			String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
//			try {
//				Thread.sleep(5000);
//				Verify_EventPage.click();
//				ExtentReportManager.reportStep(methodName, "pass");
//				TestContext.getLogger().info(methodName);
//			} catch (Exception e) {
//
//				e.printStackTrace();
//				TestContext.getLogger().error(methodName);
//			}
//			return new PG_004_EventPage();
//		}
//
}
