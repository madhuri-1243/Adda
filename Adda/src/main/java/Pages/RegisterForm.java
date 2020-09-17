package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterForm {
	

		public WebDriver driver;
		@FindBy(how=How.LINK_TEXT, using="Register here")
		public WebElement registerLink;
		public RegisterForm(WebDriver driver)
		{
			 this.driver = driver; 
	         PageFactory.initElements(driver, this);
		}
		
}
