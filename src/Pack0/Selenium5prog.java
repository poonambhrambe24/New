package Pack0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isselect method

public class Selenium5prog {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
//		WebElement Button= driver.findElement(By.xpath("(//input[@name='radio'])[1]"));
//            Button.click();
//        boolean n=Button.isSelected();
//          System.out.println(n);  
	
	
	WebElement button= driver.findElement(By.xpath("(//input[@name='radio'])[2]"));
	
	button.click();
	boolean h=button.isSelected();
	
	System.out.println(h);
	
	
	}

}
