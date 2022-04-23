package Com.SeleniumpracticeKp.Testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.SeleniumpracticeKp.POMclasses.Loginpage;

public class BaseClass 
{
WebDriver driver;
	@BeforeMethod
	public void SetupMethod() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
	
		Loginpage p= new Loginpage(driver) ;
		
		p.sendusername();
		p.sendpassword();
		p.clicklogin();
	}
	
@AfterMethod

public void tearDownMethod() 
{
	driver.quit();
}
	
	
	
	
	
	
	
	
	
}
