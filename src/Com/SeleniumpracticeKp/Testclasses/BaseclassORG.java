package Com.SeleniumpracticeKp.Testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.SeleniumpracticeKp.POMclasses.LoginpageORG;

public class BaseclassORG
{
WebDriver driver;
@BeforeMethod
public void SetupMethod()
{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

	 driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	LoginpageORG h=  new LoginpageORG(driver);
	h.clickusername();
	h.clickpassword();
	h.clicklogin();
	
}

	@AfterMethod
	public void tearDownMethod()
	{
		driver.quit();
	}
	
	
	
	
}
