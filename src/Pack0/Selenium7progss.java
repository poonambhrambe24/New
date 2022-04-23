package Pack0;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//TakeScrenShort

public class Selenium7progss {



	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

//			TakesScreenshot ss=(TakesScreenshot)driver;
//	File n =ss.getScreenshotAs(OutputType.FILE);
//	
//	File n1=new File("C:\\Users\\Poonam Bharambe\\OneDrive\\Pictures\\Screenshots\\name.jpg");
//	FileHandler.copy(n, n1);
//	System.out.println("take Screnshort");
	
		TakesScreenshot sc=(TakesScreenshot)driver;
		File n= sc.getScreenshotAs(OutputType.FILE);
		File m= new File("C:\\Users\\Poonam Bharambe\\OneDrive\\Pictures\\Screenshots\\name.jpg");
		FileHandler.copy(n, m);
		
		System.out.println("Takess");
	}

}
