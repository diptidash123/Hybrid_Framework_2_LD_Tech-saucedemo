package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements Autoconstant {
	
	public WebDriver driver;
	@BeforeClass
	public void openingbrowser()
	{
		System.setProperty(chrome_key,chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to(Testingurl);
		System.out.println("@beforeclass Before class execution started");
	}
	
	
	@AfterClass
	public void closingbrowser()
	{
		System.out.println("closing the browser execution");
		driver.close();
	}

}
