package Pack0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//DropDown method
public class Selenium6prog {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

		WebElement selectbox= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		selectbox.click();
		
		Select s= new Select(selectbox);
		
		//s.selectByIndex(0);//method 1 of select class
		
		
	//s.selectByValue("option1");//values=option hot te ghyavh
//		
		s.selectByVisibleText("Option1");
//		
		
		
		System.out.println("DropDown is selected");
		driver.close();
	
	
//	WebElement selectbox= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//	selectbox.click();
//	
//	Select s= new Select(selectbox);
//	
//	//s.selectByIndex(1);
//	//System.out.println("one no.option select");
//	
//	Thread.sleep(2000);
//	
//	//s.selectByValue("option1");
//	//System.out.println("value is select");
////	
//	s.selectByVisibleText("option1");
//	System.out.println("dropdown is select");
//	
//	driver.close();
//	
	
	
	
	
	
	
	}

}
