package Pack0;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium9progMouseA {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
         driver.get("https://www.saucedemo.com/");
     	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		WebElement jacketElement = 	driver.findElement(By.xpath("//a[@id='item_5_img_link']"));
		Actions aa= new Actions(driver);
		
		aa.moveToElement(jacketElement).click().perform();
		
		//System.out.println("Jacket is selected");
		
		//aa.contextClick(jacketElement);
		//System.out.println("right click");
		
		//aa.doubleClick(jacketElement).perform();
		
		//aa.click(jacketElement).perform();
		
		}

}
