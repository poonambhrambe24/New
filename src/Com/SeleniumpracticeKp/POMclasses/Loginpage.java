package Com.SeleniumpracticeKp.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{

	
	WebDriver driver;
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;

	@FindBy(xpath="//input[@id='password']")
	WebElement password;
		
	@FindBy(xpath="//input[@id='login-button']")
	WebElement login;

	 public void sendusername() 
	 {
		username.sendKeys("standard_user");
		 
	 }
		
	 public void sendpassword()	
	 {
		password.sendKeys("secret_sauce"); 
	 }
		
	 public void clicklogin() 
	 {
		 login.click();
	 }
		
	 public Loginpage(WebDriver D)
	 {
		driver=D ;
		
		PageFactory.initElements(D, this);
		 
		 
		 
	 }
		
		
	
	
	
	
	
	
	
	
	
}
