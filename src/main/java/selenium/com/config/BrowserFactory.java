package selenium.com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	public static  WebDriver driver;
	static Properties prop;
	public static String browser;
	public static  String applicationUrl;
	
	static {
		try {
			FileInputStream fin = new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/resources/config.properties"));
			 prop = new Properties();
			prop.load(fin);
			browser = prop.getProperty("browserName");
			applicationUrl=prop.getProperty("applicationUrl");
			}catch (Exception e) {
				// TODO: handle exception
			}
	}
	
	public static WebDriver getDriver(String browser) {
		
		
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/se/chromedriver.exe");
		driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:/Selenium/se/firefoxdriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	
	

}
