package Pack0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isenable method

public class Selenium4prog {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
//		WebElement Textbox= driver.findElement(By.xpath("//input[@id='autocomplete']"));
//		boolean b=Textbox.isEnabled();
//		System.out.println(b);
//		
//		Textbox.click();
//		
//		boolean b1=Textbox.isEnabled();

		
		WebElement TextBox= driver.findElement(By.xpath("//input[@id='autocomplete']"));

		boolean y=TextBox.isEnabled();
		System.out.println(y);
		
		TextBox.click();
		
		boolean y1= TextBox.isEnabled();
		
	}

}
