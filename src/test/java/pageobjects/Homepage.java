package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage
{

public Homepage(WebDriver driver)
{
	super(driver);
}

@FindBy(xpath="//a[normalize-space()='Sign Up']")
WebElement lnksignup;

@FindBy(xpath="//a[normalize-space()='Login']")
WebElement lnklogin;

public void clicksignup()
{
	lnksignup.click();
}

public void clicklogin()
{
	lnklogin.click();
}

}
