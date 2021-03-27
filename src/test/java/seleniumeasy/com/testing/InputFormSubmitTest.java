package seleniumeasy.com.testing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import selenium.com.config.BrowserFactory;

public class InputFormSubmitTest extends BrowserFactory{
	
	
	
	@Test
	public void testInputFormSubmit() {
		driver = BrowserFactory.getDriver(browser);
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		WebElement inputFormLink=driver.findElement(By.xpath("//*[@class=\"tree-indicator glyphicon glyphicon-chevron-right\"]/../a[contains(text(),'Input Forms')]"));
		inputFormLink.click();
		WebElement inputFormSubmitLink=driver.findElement(By.xpath("//*[contains(text(),'All Examples')]/..//*[contains(text(),'Input Form Submit')]"));
		inputFormSubmitLink.click();
		WebElement firstNameInput=driver.findElement(By.xpath("//*[@name='first_name']"));
		firstNameInput.sendKeys("Tirath");
		WebElement lastName=driver.findElement(By.xpath("//*[@name='last_name']"));
		lastName.sendKeys("Singh");
		WebElement email=driver.findElement(By.xpath("//*[@name='email']"));
		email.sendKeys("tirath@gmail.com");
		WebElement phone=driver.findElement(By.xpath("//*[@name='phone']"));
		phone.sendKeys("9205500128");
		WebElement address=driver.findElement(By.xpath("//*[@name='address']"));
		address.sendKeys("Ghaziabad");
		WebElement city=driver.findElement(By.xpath("//*[@name='city']"));
		city.sendKeys("Noida");
		WebElement state=driver.findElement(By.xpath("//*[@name='state']"));
		Select select = new Select(state);
		select.selectByVisibleText("Alabama");
		
		
		WebElement zip=driver.findElement(By.xpath("//*[@name='zip']"));
		zip.sendKeys("35004");
		WebElement website=driver.findElement(By.xpath("//*[@name='website']"));
		website.sendKeys("www.google.com");
		WebElement hosting=driver.findElement(By.xpath("//*[@name='hosting' and @value =\"yes\"]"));
		hosting.click();
		WebElement comment=driver.findElement(By.xpath("//*[@name='comment']"));
		comment.sendKeys("No Comment");
		
	//	WebElement sendBtn=driver.findElement(By.xpath("//*[contains(text(),'Send')]"));
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		WebElement sendBtn = wait.until(new Function<WebDriver, WebElement>(){
		
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.xpath("//*[contains(text(),'Send')]"));
			}
		});
		sendBtn.click();
		
		
		
	
	}
	
	@AfterTest
	public void tearDown() {
		if(driver!= null) {
		driver.close();
		}
	}
	
	
	
	
}
