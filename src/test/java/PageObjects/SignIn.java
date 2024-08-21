package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends BasePage{

	public SignIn(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id=\"ap_email\"]")
	WebElement txtMb;
	
	@FindBy(xpath="//input[@class=\"a-button-input\"]")
	WebElement clkContinue;
	
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	WebElement txtPass;
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	WebElement clkSingIn;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement clkSubmitCode;
	
	public void Enter_MB(String num) {
		txtMb.sendKeys(num);
	}
	public void click_Continue() {
		clkContinue.click();
	}
	
	public void Enter_Pass(String p) {
		txtPass.sendKeys(p);
	}
	
	public void Click_signIn() {
		clkSingIn.click();
	}
	public void Click_SubmitCode() throws InterruptedException {
		Thread.sleep(15000);
		clkSubmitCode.click();
	}
}
