package Com.SeleniumpracticeKp.Testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.SeleniumpracticeKp.POMclasses.Loginpage;

public class Loginpast 
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
	
	@Test
	public void Loginfuncationality() 
	{
		
		String expectedURL="https://www.saucedemo.com/inventory.html";
		
		String actualURL= driver.getCurrentUrl();
		Assert.assertEquals(actualURL,expectedURL );
		System.out.println("Test case is pase");
		
	}
	
	@AfterMethod
	public void tearDownMethod() 
	{
		driver.close();
	}
	
	

}
