package selenium.automation.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void validateJavaTPoint() {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/se/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/maven-tutorials");
		WebElement mavenSearchInput= driver.findElement(By.xpath("//input[@placeholder='Search']"));
		mavenSearchInput.sendKeys("AutomationTesting");
		//driver.quit();
	}
	
	
	
	
	
	

}
