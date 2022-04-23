package Pack0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1prog {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	WebElement homepage= driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
	homepage.click();
	
	driver.navigate().back();
	
	driver.navigate().forward();
	
	driver.navigate().refresh();
	
	//driver.close();
	
	String expectedURL=driver.getCurrentUrl();
	
	
	String Title= driver.getTitle();
	System.out.println("title is here");
	
	
	
	
	
	
	
	
	
	}

}
