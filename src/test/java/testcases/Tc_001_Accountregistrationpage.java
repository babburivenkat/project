package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationpage;
import pageobjects.Homepage;
import testbase.Baseclass;

public class Tc_001_Accountregistrationpage extends Baseclass {
	@Test(groups= {"Regression","Master"})
	void test_accountregistration()
	{
		logger.debug("application logs......");
		logger.info("****Tc_001_Accountregistrationpage **** ");
		try
		{
		Homepage hp=new Homepage(driver);
		hp.clicksignup();
		logger.info("clicked on signup");
		AccountRegistrationpage ar=new AccountRegistrationpage(driver);
		ar.setfirstname(randomstring());
		ar.setsurname(randomstring());
		ar.setepost(randomstring());
		ar.setmobile(randomnumber());
		ar.setusername(randomstring());
		String password=randomstring();
		ar.setpassword(password);
		//ar.setconfirmpassword(password);
		logger.info("provider registration details");
		ar.clicksubmit();
		logger.info("clicked on submit");
		String msg=ar.checkmsgconfirm();
		Assert.assertEquals(msg, "Registration Successful");
	}
	catch(Exception e)
	{
		Assert.fail();
		
		
	}
		logger.info("finished");

	}
}
