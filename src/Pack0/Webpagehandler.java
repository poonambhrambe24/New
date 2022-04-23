package Pack0;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpagehandler {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\ChromeDriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//	WebElement seleniumpracticepage= driver.findElement(By.xpath("(//a[contains(text(),'Start Selenium Practice')])[1]"));
//	seleniumpracticepage.click();
//	    Set<String> d =driver.getWindowHandles();
//	    List<String> g= new ArrayList(d);
//	   
//	    driver.switchTo().window(g.get(1));
//	    
//	WebElement practice= driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
//	
//	practice.click();
//	
//	
	
	
	WebElement seleniumpage= driver.findElement(By.xpath("(//a[contains (text(),'Start Selenium Practice')])[1]"));
	seleniumpage.click();
	Set<String> h=driver.getWindowHandles();
	List<String> f= new ArrayList(h);
	
	
	driver.switchTo().window(f.get(1));
	
	WebElement practice= driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
	
	practice.click();
	
	
	}

}
