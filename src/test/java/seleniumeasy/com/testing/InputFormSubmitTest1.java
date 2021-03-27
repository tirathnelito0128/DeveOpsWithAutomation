package seleniumeasy.com.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.com.config.BrowserFactory;
import selenium.com.page.InputFormSubmitPage;

public class InputFormSubmitTest1 extends BrowserFactory{

	
	
	
	@Test
	public void testInputFormSubmit() {
		driver = BrowserFactory.getDriver(browser);
		driver.get(applicationUrl);
		InputFormSubmitPage inFormSubmitPage = new InputFormSubmitPage(driver);
		//Filling Contact US Form
		inFormSubmitPage.sendcontactUsForm();
		driver.close();
		
	}
	
	@AfterTest
	public void tearDown() {
	
	}
}
