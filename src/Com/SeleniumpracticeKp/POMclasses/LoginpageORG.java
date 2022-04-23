package Com.SeleniumpracticeKp.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageORG 
{

	WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement login;
	
	public void clickusername()
	{
		Username.sendKeys("Admin");
	}
	
	public void clickpassword()
	{
		Password.sendKeys("admin123");
	}
	
	public void clicklogin()
	{
		login.click();
	}
	
	
	public LoginpageORG(WebDriver A)
	{
		driver=A;
		
		PageFactory.initElements(A, this);
		
	}
	
	
	
	
	
	
	
}
