package Pack0;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SElenium9progrmpopup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		WebElement clickbo= driver.findElement(By.xpath("//button[@id='alertButton']"));
//		clickbo.click();
//		
//		Alert alt= driver.switchTo().alert();
//        alt.accept();
		
		
//		WebElement clickbo1= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
//		clickbo1.click();
//		
//		Thread.sleep(4000);
//		 alt.accept();
	
//        WebElement clickbo2= driver.findElement(By.xpath("//button[@id='confirmButton']"));
//        
//		clickbo2.click();
//        alt.dismiss();
//        
//      WebElement clickbo3= driver.findElement(By.xpath("//button[@id='promtButton']"));
//		
//		clickbo3.click();
//		alt.sendKeys("poonam");
		
	
		
		//alt.accept();
		
		WebElement firstclick= driver.findElement(By.xpath("//button[@id='alertButton']"));
		
		firstclick.click();
		
		Alert alt= driver.switchTo().alert();
		 
		alt.accept();
		
		//WebElement secondclick= driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		//secondclick.click();
		//act.accept();
		WebElement Thirdclick= driver.findElement(By.xpath("//button[@id='confirmButton']"));
		Thirdclick.click();
		
		alt.dismiss();
		
		WebElement fourthclick= driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		fourthclick.click();
		//Thread.sleep(2000);
		
		alt.sendKeys("poonam");
		System.out.println("printing poo");
		alt.accept();
		
		//driver.close();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
