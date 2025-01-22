package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ExtentReportManager;
import utils.TestContext;

public class PG_002_HomePage {
	WebDriver driver;

	public PG_002_HomePage(WebDriver driver) {
		TestContext.setDriver(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/app-root[1]/div[1]/app-layout[1]/main[1]/div[1]/app-side-bar[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]")
	public WebElement Article;

	@FindBy(xpath = "//span[contains(text(),'add_circle')]")
	public WebElement writeArticle;

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

	@FindBy(xpath = "//button[contains(text(),'Publish Post')]")
	public WebElement publish;

	@FindBy(xpath = "//span[contains(text(),'add_circle')]")
	public WebElement articeleswrite;

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

	public PG_002_HomePage Click_on_writeArticle() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
			writeArticle.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;
	}

	public PG_002_HomePage Enter_post_titel(String titel) {
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

	public PG_002_HomePage Click_on_browse() {
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

	public PG_002_HomePage Select_file() {

		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
			File.sendKeys("/home/nd/Downloads/VVimage.jpeg");
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return this;

	}

	public PG_002_HomePage Click_on_Post_type() {
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

	public PG_002_HomePage Add_post_description(String description1) {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(3000);
			post_description.sendKeys(description1);
			ExtentReportManager.reportStep(methodName + " " + description1, "pass");
			TestContext.getLogger().info(methodName + " " + description1);
		} catch (Exception e) {
			TestContext.getLogger().error(methodName + " " + description1);
			e.printStackTrace();
		}

		return this;

	}

	public PG_002_HomePage Select_catogery() {

		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
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

	public PG_002_HomePage Click_on_perview_button() {
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

	public PG_002_HomePage Click_on_publish_button() {

		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
			publish.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}

		return this;
	}

	public PG_003_ArticelsPage verify_articels() {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName().replace("_", " ");
		try {
			Thread.sleep(5000);
			articeleswrite.click();
			ExtentReportManager.reportStep(methodName, "pass");
			TestContext.getLogger().info(methodName);
		} catch (Exception e) {

			e.printStackTrace();
			TestContext.getLogger().error(methodName);
		}
		return new PG_003_ArticelsPage(TestContext.getDriver());
	}

}
