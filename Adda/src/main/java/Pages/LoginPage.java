package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
		public WebDriver driver;
		
		@FindBy(how=How.ID, using="first_name") WebElement txtLogin;
		@FindBy(how=How.LINK_TEXT,using="Password") WebElement txtPwd;
		@FindBy(how=How.ID,using="rememberme") WebElement checkBox;
		@FindBy(how=How.NAME,using="wp-submit") WebElement login;
		
		// Defining all the user actions (Methods) that can be performed in the Facebook home page</span>
		 
		// This method is to set Email in the email text box
		
			
		
public LoginPage(WebDriver driver){
	
	//	PageFactory.initElements(driver,this);
	this.driver=driver;
	}
public void setEmail(String strEmail)
{
	txtLogin.sendKeys(strEmail);
}
	public void setPassword(String strPwd)
	{
		txtPwd.sendKeys(strPwd);
		checkBox.click();
		login.click();
	}
	public void clickButton()
	{
		login.click();
	}
	public void Select()
	{
		checkBox.click();
	}
	}