package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='Username']")
	WebElement txtuser;
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtpwd;
	@FindBy(xpath="//input[@name='login']")
	WebElement btnlogin;
	
	public void setusername(String username)
	{
		txtuser.sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		txtpwd.sendKeys(password);
	}
	public void clicklogin()
	{
		btnlogin.click();
	}
	

}
