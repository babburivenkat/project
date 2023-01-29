package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Accountpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import testbase.Baseclass;
import utilities.DataProviders;

public class Tc_003_loginDDT extends Baseclass {
	private static final String True = null;

	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class)
	public void test_loginDDT(String username, String password, String exp)
	{
		Homepage hp=new Homepage(driver);
		hp.clicklogin();
		Loginpage lp=new Loginpage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicklogin();
		Accountpage ap=new Accountpage(driver);
		boolean status=ap.ismypageexists();
		Assert.assertEquals(status, true);
		
		if(exp.equals("Valid"))
		{
			if(status==true)
			{
				ap.clicklogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertFalse(true);
			}
		}
		
		if(exp.equals("Invalid"))
		{
			if(status==true)
			{
				ap.clicklogout();
				Assert.assertTrue(false);
			}
			
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		
	}
	

}
