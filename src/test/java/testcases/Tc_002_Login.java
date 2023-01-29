package testcases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Accountpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import testbase.Baseclass;

public class Tc_002_Login extends Baseclass  {
	@Test(groups= {"Sanity","Master"})
	void test_logintest()
	{
		try
		{
			logger.info("***Tc_002 logintest started ***");
		Homepage hp=new Homepage(driver);
		hp.clicklogin();
		logger.info("***clicked on login***");
		Loginpage lp=new Loginpage(driver);
		lp.setusername(rb.getString("username"));
		lp.setpassword(rb.getString("password"));
		lp.clicklogin();
		logger.info("***entered login detais ***");
		Accountpage ap=new Accountpage(driver);
		boolean status=ap.ismypageexists();
		
		Assert.assertEquals(status, true);
		logger.info("***login successfully ***");
		}
		catch(Exception e)
		{
			Assert.fail();
			logger.info("***login failed ***");
		}
		
		logger.info("***login test finished ***");
	}

}
