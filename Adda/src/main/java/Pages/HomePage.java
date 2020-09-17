package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	public WebDriver driver;
	@FindBy(how=How.LINK_TEXT, using="Login")
	public WebElement loginLink;
	public HomePage(WebDriver driver)
	{
		 this.driver = driver; 
         PageFactory.initElements(driver, this);
	}
	
	public void ClickLink()
	{
		loginLink.click();
	}

	
	
}
