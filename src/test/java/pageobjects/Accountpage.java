package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountpage extends BasePage {
	WebDriver driver;
	public Accountpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='Dashboard']")
	WebElement msgheading;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement lnklogout;
	public void clicklogout()
	{
		lnklogout.click();
	}
	
	public boolean ismypageexists()
	{
		try {
			return(msgheading.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
		
	}
	

}
