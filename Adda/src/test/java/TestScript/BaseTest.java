package TestScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver=null;
	
	@BeforeTest
	
	public void Initialize() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://auditionsadda-v4.ncinc.io/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		}
	
}
