package Pack0;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Selenium8progdragdrop {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poonam Bharambe\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
WebElement washingtoncapital = driver.findElement(By.xpath("//div[@id='box3']"));
	    
	    WebElement unitedstate = driver.findElement(By.xpath("//div[@id='box103']"));
	    
	    WebElement madridecapital = driver.findElement(By.xpath("//div[@id='box7']"));
	    
	    WebElement spain= driver.findElement(By.xpath("//div[@id='box107']"));
	    
	    WebElement romecapital= driver.findElement(By.xpath("//div[@id='box6']"));
	    
	    WebElement italy= driver.findElement(By.xpath("//div[@id='box106']"));
	    
	    WebElement seoulcapital= driver.findElement(By.xpath("//div[@id='box5']"));
	    
	    WebElement southkorea= driver.findElement(By.xpath("//div[@id='box105']"));
	    
	    WebElement oslacapital= driver.findElement(By.xpath("//div[@id='box1']"));
	     
	    WebElement norway= driver.findElement(By.xpath("//div[@id='box101']"));
	    
	    WebElement stockholmcapital= driver.findElement(By.xpath("//div[@id='box2']"));
	    
	    WebElement sweden= driver.findElement(By.xpath("//div[@id='box102']"));
	    
	    WebElement copenhagencapital= driver.findElement(By.xpath("//div[@id='box4']"));
	    
	    WebElement denmark= driver.findElement(By.xpath("//div[@id='box104']"));
	    
	    Actions act= new Actions(driver);
	    act.dragAndDrop(copenhagencapital, denmark).perform();
	    act.dragAndDrop(stockholmcapital, sweden).perform();
	    act.dragAndDrop(oslacapital,norway ).perform();
	    act.dragAndDrop(seoulcapital,southkorea ).perform();
	    act.dragAndDrop(romecapital,italy ).perform();
	    act.dragAndDrop(madridecapital, spain).perform();
	    act.dragAndDrop(washingtoncapital , unitedstate).perform();
	    
	    WebElement capital = driver.findElement(By.xpath("//div[@id='capitals']"));
	    
	    act.dragAndDrop(copenhagencapital, capital).perform();
	    
	    act.dragAndDrop(stockholmcapital, capital).perform();
	    
	    act.dragAndDrop(oslacapital, capital).perform();

	    act.dragAndDrop(seoulcapital, capital).perform();
	    
	    act.dragAndDrop(romecapital, capital).perform();
	    
	    act.dragAndDrop(madridecapital, capital).perform();
	    
	    act.dragAndDrop(washingtoncapital, capital).perform();
	    
	    
		
		
		driver.close();
		
		
		
		

	}

}
