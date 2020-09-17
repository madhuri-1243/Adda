package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.HomePage;









public class LoginLinkTest extends BaseTest

{
	//public WebDriver driver;
	
	
	@Test
	public void init() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://auditionsadda-v4.ncinc.io/");
		driver.manage().window().maximize();
		
		HomePage homePage=new HomePage(driver);
		homePage.ClickLink(); 
		
	}
	
}

