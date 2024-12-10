package testPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import projectSpecifications.BaseClass;
import utils.ExtentReportManager;
import utils.TestContext;

@Listeners(utils.CustomTestListener.class)
public class TC_003_ArticelsPage extends BaseClass {
	@BeforeClass
	public void testDetails() {
		// Set the sheet name for the test
		TestContext.setSheetName("Login");
	}

	@Test(dataProvider = "sendData")
	public void validateArticels(String testNameDetails, String authorName, String category, String mobilenumber,
			String post, String description) {
		ExtentReportManager.setTest(extent.createTest(testNameDetails)); // Create the test instance in Extent Reports
		ExtentReportManager.getTest().assignAuthor(authorName); // Assign the author for the test
		ExtentReportManager.getTest().assignCategory(category); // Assign the category for the test

		TestContext.getLoginPage().loginbuttonclick().Enter_the_mobilenumber(mobilenumber).Click_on_loginbutton()
				.Click_on_continuebutton().Select_user().Verfiy_HomePage().Click_on_Article().Click_on_writeArticle()
				.Enter_post_titel(post).Click_on_browse().Select_file().Click_on_Post_type()
				.Add_post_description(description).Select_catogery().Click_on_perview_button().Click_on_publish_button()
				.verify_articels().Enter_the_posttitel_new(post).click_on_the_browse().Select_file_image()
				.Click_on_Post_type_new().Add_post_description1(description).Select_catogery1()
				.Click_on_perview_button1().Click_on_SaveDraft().Click_on_legal().Click_on_Finance().Click_on_Health().Click_on_Engagement().Click_on_Other();
	}
}
