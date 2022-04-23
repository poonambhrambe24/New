package Pack0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2prog {

	public static void main(String[] args)
	{
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
//
//		WebDriver driver= new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://vctcpune.com/selenium/practice.html");
//		
//		
//		WebElement selectcountry= driver.findElement(By.xpath("//input[@id='autocomplete']"));
//		selectcountry.click();
//		selectcountry.sendKeys("poonam");
//	String  j=	selectcountry.getAttribute("id");
//	
//		System.out.println(j);
//		
//		String k=selectcountry.getTagName();
//		System.out.println(k);
//		
//		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
				username.click();
				username.sendKeys("Admin");
				
				String u= username.getAttribute("id");
				System.out.println(u);
				
				String k=username.getTagName();
				System.out.println(k);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
