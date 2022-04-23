package Com.SeleniumpracticeKp.Testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SeleniumpracticeKp.POMclasses.HomepageORG1;

public class PIMfunctionality extends BaseclassORG
{
@Test(invocationCount= 2,priority=1)
public void PIMfunction()  
{
	String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList";
	
	HomepageORG1 j= new HomepageORG1(driver);
	//j.dashbordclick();
	j.ClickPIM();
	j.clickempstatus();
	
	String actualURL= driver.getCurrentUrl();
	Assert.assertEquals(actualURL,expectedURL );
}
	@Test(priority=2)
	public void Adminfunction()
	{
		String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers";
		
		HomepageORG1 j= new HomepageORG1(driver);
		j.Adminclick();
		String actualURL= driver.getCurrentUrl();
		Assert.assertEquals(actualURL,expectedURL );
	}
	
	
	
}
