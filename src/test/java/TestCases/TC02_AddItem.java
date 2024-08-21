package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseAllClass;
import PageObjects.HomePage;

public class TC02_AddItem extends BaseAllClass{

	@Test
	public void AddItem() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.Enter_Product(p.getProperty("product"));
		h.Click_SearchBtn();
		h.Click_AddCart();
	}
}
