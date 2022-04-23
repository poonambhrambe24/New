package Pack0;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupDown {

	public static void main(String[] args) throws InterruptedException
	{
	
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
//
//		WebDriver driver= new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://vctcpune.com/selenium/practice.html");
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1500)");//scroll down
//		
//		Thread.sleep(3000);
//		
//		js.executeScript("window.scrollBy(0,-1200)");//scroll up
//		
//		driver.close();
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,1000)");
	
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(0,-1000)");
	
	driver.close();
	
	
	
	
	
	
	}

}
