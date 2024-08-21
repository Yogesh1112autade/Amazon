package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseAllClass;
import PageObjects.HomePage;
import PageObjects.SignIn;

public class TC01_SignIn extends BaseAllClass{

	@Test
	public void signIn() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.click_signIn();
		
		SignIn s=new SignIn(driver);
		Thread.sleep(3000);
		s.Enter_MB(p.getProperty("MbNo"));
		s.click_Continue();
		s.Enter_Pass(p.getProperty("Pass"));
		s.Click_signIn();
		s.Click_SubmitCode();
	}
	
	
	
	
}
