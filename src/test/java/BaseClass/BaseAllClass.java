package BaseClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseAllClass {
	public WebDriver driver;
	public Properties p;
	
 @BeforeClass	
 public void setup() throws IOException {
	
	 WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo="
			+ "&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=16016413196774053962&hvqmt=e&hvdev=c&hvdvcmdl=&"
			+ "hvlocint=&hvlocphy=9301536&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	
	FileReader f=new FileReader("C:\\Users\\Dell\\Desktop\\Work Place\\Amazon\\config.properties");
	p=new Properties();
	p.load(f);
	
}
 
// @AfterClass
// public void tearDown() throws InterruptedException {
//	 Thread.sleep(3000);
//	 driver.close();
// }
	public String RandomNum() {
		String randomNo=RandomStringUtils.randomNumeric(10);
		return randomNo;
	}
	
}
