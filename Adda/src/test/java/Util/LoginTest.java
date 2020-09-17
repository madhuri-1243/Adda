package Util;

//package TestngData;
//package Util;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	public WebDriver driver;

	@BeforeTest
	
	public void Initialize() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madhu\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		
		driver.manage().window().maximize();
		
		
	}
	
@DataProvider(name="getLogin")
public Object[][] getLoginData() throws InvalidFormatException, IOException
{
Object data[][]=TestUtil.getTestData("Login");	
return data;
}



@Test(dataProvider="getLogin")

public void loginTest(String username,String password) throws InterruptedException
{
	
	
	driver.findElement(By.name("Email")).sendKeys(username);
	driver.findElement(By.name("Email")).clear();
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("password")).clear();
	
	
}

}
