package Pack0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isdisplay method program

public class Selenium3prog {

	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
//
//		WebDriver driver= new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.get("https://vctcpune.com/selenium/practice.html");
//		
//		WebElement show= driver.findElement(By.xpath("//input[@id='show-textbox']"));
//		show.click();
//
//		WebElement TextBox= driver.findElement(By.xpath("//input[@id='displayed-text']"));
//	boolean b=	TextBox.isDisplayed();
//		System.out.println(b);
//		
//		WebElement Hide= driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//		Hide.click();	
//	boolean b1=TextBox.isDisplayed();
//	System.out.println(b1);
//		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement show= driver.findElement(By.xpath("//input[@id='show-textbox']"));
		show.click();
		WebElement TextBox= driver.findElement(By.xpath("//input[@id='displayed-text']"));
		  boolean b=TextBox.isDisplayed();
		  System.out.println(b);
		  WebElement Hide= driver.findElement(By.xpath("//input[@id='hide-textbox']"));
			Hide.click();
			
			boolean b1= TextBox.isDisplayed();
			System.out.println(b1);
		
	}

}
