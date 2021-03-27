package seleniumeasy.com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoQAElementHandelTest {
	WebDriver driver;
	
	@BeforeSuite
	public void setupDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/se/chromedriver.exe");
	}
	
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testElement() throws Exception{
		
		driver.get("https://demoqa.com/");
		Thread.sleep(4000);
		WebElement elementBtn = driver.findElement(By.xpath("//div[contains(@class,'card-body')]//h5[contains(text(),'Elements')]"));
		JavascriptExecutor executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", elementBtn);
		//elementBtn.click();
		
	}

}
