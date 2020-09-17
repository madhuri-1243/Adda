package TestScript;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.RegisterPage;
import Pages.HomePage;
import Pages.LoginPage;


//import LoginLinkTest;
public class RegisterTest extends LoginLinkTest
{
	public WebDriver driver;


@Test
public void clickRegister() throws Exception
{	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://auditionsadda-v4.ncinc.io/");
	driver.manage().window().maximize();
	
	HomePage homePage=new HomePage(driver);
	homePage.ClickLink(); 
	
	driver.manage().window().maximize();
Thread.sleep(3000);
RegisterPage registerPage=new RegisterPage(driver);
registerPage.ClickRegisterLink();

}
}