package Com.SeleniumpracticeKp.POMclasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomepageORG1 
{
WebDriver driver;

@FindBy(xpath="//a[@id='menu_dashboard_index']")
WebElement DashBoard;
	
@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")	
	WebElement Admin;

@FindBy(xpath="//a[@id='menu_pim_viewPimModule']")
WebElement PIM;

@FindBy(xpath="//select[@id='empsearch_employee_status']")

WebElement Emplystatus;

public void dashbordclick() 
{
	//DashBoard.click();
	Alert alt=driver.switchTo().alert();
	
	alt.accept();
	alt.dismiss();
	
}

public void Adminclick() 
{
	Admin.click();
}

public void ClickPIM() 
{
	PIM.click();
}

public void clickempstatus() 
{
	Emplystatus.click();
	
	
	Select s= new Select(Emplystatus);
	
	s.selectByVisibleText("Freelance");	
}

public HomepageORG1(WebDriver h)
{
 
   driver=h;
   PageFactory.initElements(h, this);

}
}