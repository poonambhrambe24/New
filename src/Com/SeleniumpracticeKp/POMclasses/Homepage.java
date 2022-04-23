package Com.SeleniumpracticeKp.POMclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage{
	
	WebDriver driver;
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement filter ;
	

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cart ;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement burgermenu;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	@FindBy(xpath="//a[@id='about_sidebar_link']")
	WebElement About ;
	
	@FindBy(xpath="//div//button[@class='btn btn_primary btn_small btn_inventory']")
	List<WebElement> Addtocart ;
	
	@FindBy(xpath="//div//button[@class='btn btn_secondary btn_small btn_inventory']")
	List<WebElement> Remove ;
	

	public void clickfilter()
	{
		
		filter.click();
	}
	
	public void clickcart() 
	{
		cart.click();
	}
	
	public void burgermenu() 
	{
		burgermenu.click();
	}
	public void clicklogout() 
	{
		logout.click();
	}
	public void clickAbout() 
	{
		About.click();
	}
	public void Addtocart()
	{
		for(WebElement F:Addtocart)//for each loop
		{
	        F.click();
		}
	}
	public void AddtocartClick(String a) {
		  for(WebElement addto:Addtocart) {
			 if(addto.getAttribute("id").equals(a)==true) {
				 addto.click();
			 }
		  }
		}
	
	public void Remove()
	{
		for(WebElement R:Remove)//for each loop
		{
	        R.click();
		}
	}
	public void RemoveClick(String a) {
		  for(WebElement R:Remove) {
			 if(R.getAttribute("id").equals(a)==true) {
				 R.click();
			 }
		  }
		}

	public Homepage(WebDriver p)
	 {
		driver=p ;
		
		PageFactory.initElements(p, this);
		 
		 
		 
	 }
		
		
}
