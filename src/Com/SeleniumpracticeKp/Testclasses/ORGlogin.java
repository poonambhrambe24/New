package Com.SeleniumpracticeKp.Testclasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SeleniumpracticeKp.POMclasses.HomepageORG1;

public class ORGlogin extends BaseclassORG
{
	@Test
	public void Logingpage() 
	{
		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		
		HomepageORG1 g= new HomepageORG1(driver);
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		//g.dashbordclick();
		
	}
	
	
	
}
