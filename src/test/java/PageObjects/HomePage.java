package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement clkSignIn;
	
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]")
	WebElement txt_EnterProduct;
	
	@FindBy(xpath="//input[@id=\"nav-search-submit-button\"]")
	WebElement BtnSearch;
	
	@FindBy(xpath="//div[@class=\"sg-col-inner\"]//span[@class=\"a-price-whole\"]")
	List<WebElement> txt_GetPrice;
	
	@FindBy(xpath="//span[@class=\"a-button-inner\"]")
	List<WebElement> ClkaddToCart;
	public void click_signIn() {
		clkSignIn.click();
	}
	public void Enter_Product(String product) {
		txt_EnterProduct.sendKeys(product);
	}
	public void Click_SearchBtn() {
		 BtnSearch.click();
	}
   public void Click_AddCart() throws InterruptedException {
//	   for(WebElement allprice:txt_GetPrice) {
//		  String s=allprice.getText();
//		  String s1=s.replaceAll(",", "");
//		  System.out.println(s1);
//		 int p=Integer.valueOf(s1);
//		  if(p>10000) {
//			  ClkaddToCart.click();
//		  }
//		  //System.out.println(s);
//	   }
	  for(int i=0;i<txt_GetPrice.size();i++) {
		  String s=txt_GetPrice.get(i).getText();
		  String s1=s.replaceAll(",", "");
		  System.out.println(s1);
		  int p=Integer.valueOf(s1);
		  if(p>20000) {
			  Thread.sleep(2000);
			  ClkaddToCart.get(i).click();
		  }
	  }
   }
}
