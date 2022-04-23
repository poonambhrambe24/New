package Com.SeleniumpracticeKp.Testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SeleniumpracticeKp.POMclasses.Homepage;

public class Burgermenurtest  extends BaseClass
{
@Test(priority=1)

public void burgermenu() 
{
	
	String expectedURL="https://saucelabs.com/";
	
	Homepage h= new Homepage(driver);
	h.burgermenu();
	h.clickAbout();
	String actualURL= driver.getCurrentUrl();
	Assert.assertEquals(actualURL, expectedURL);
	System.out.println("Test case pass");
	
}
@Test(priority=2)
public void filter()
{
	String expectedURL="https://www.saucedemo.com/inventory.html";
	
	Homepage j= new Homepage(driver);
	j.clickfilter();
	String actualURL= driver.getCurrentUrl();
	Assert.assertEquals(actualURL,expectedURL );
	System.out.println("Test case pass");
}
	
	
}
