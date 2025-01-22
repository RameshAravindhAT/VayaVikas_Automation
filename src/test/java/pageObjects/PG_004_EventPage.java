package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.TestContext;

public class PG_004_EventPage {
	WebDriver driver;
	
	public PG_004_EventPage (){
		TestContext.setDriver(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	
}

