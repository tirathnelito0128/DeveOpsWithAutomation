package selenium.com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InputFormSubmitPage {
	
	public InputFormSubmitPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
@FindBy(how=How.XPATH,using="//*[@class='tree-indicator glyphicon glyphicon-chevron-right']/../a[contains(text(),'Input Forms')]")
public WebElement inputFormLink;

@FindBy(how=How.XPATH,using="//*[contains(text(),'All Examples')]/..//*[contains(text(),'Input Form Submit')]")
public WebElement inputFormSubmitLink;

@FindBy(how=How.XPATH,using="//*[@name='first_name']")
public WebElement firstName;

@FindBy(how=How.XPATH,using="//*[@name='last_name']")
public WebElement lastElement;

@FindBy(how=How.XPATH,using="//*[@name='email']")
public WebElement email;

@FindBy(how=How.XPATH,using="//*[@name='phone']")
public WebElement phoneNo;

@FindBy(how=How.XPATH,using="//*[@name='city']")
public WebElement city;

@FindBy(how=How.XPATH,using="//*[@name='state']")
public WebElement state;

@FindBy(how=How.XPATH,using="//*[@name='zip']")
public WebElement zipCode;

@FindBy(how=How.XPATH,using="//*[@name='website']")
public WebElement webSiteName;

@FindBy(how=How.XPATH,using="//*[@name='hosting' and @value ='yes']")
public WebElement hostingVal;

@FindBy(how=How.XPATH,using="//*[@name='comment']")
public WebElement comment;

public void sendcontactUsForm() {
	inputFormLink.click();
	inputFormSubmitLink.click();
	firstName.sendKeys("Tirath");
	lastElement.sendKeys("Singh");
}

}