package POM;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generics.ExcelLibrary;

public class Pom_class extends ExcelLibrary
{
	public WebDriver driver;
	
	//declaration
	@FindBy(xpath = "(//input[@class=\"input_error form_input\"])[1]")
	private WebElement username;
	
	@FindBy(xpath = "(//input[@class=\"input_error form_input\"])[2]")
	private WebElement password;
	
        @FindBy(xpath = "//input[@id=\"login-button\"]")
        private WebElement loginbutton;
   
        @FindBy(xpath = "//button[@class=\"error-button\"]")
        private WebElement cancelbutton;
   
   
   //Initialization
   public Pom_class(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
   }
   
   //utilization
   public void urlvalidation()
   {
	 String url=driver.getCurrentUrl();
	 String expurl="https://www.saucedemo.com/";
	 if (url.equals(expurl)) 
	  {
		System.out.println("url is correct");
	  }
	 else 
	 {
		System.out.println("url is incorrect");
	 } 
   }
   
	 public void titlevalidation()
	   {
		 String title=driver.getTitle();
		 String exptitle="Swag Labs";
		 if (title.equals(exptitle)) 
		 {
			System.out.println("title is correct");
		}
		 else {
			System.out.println("title is incorrect");
		}
	   }
	 public void loginscenario() throws InterruptedException, IOException
	   {
		   username.sendKeys(ExcelLibrary.Excelfilefecth(excelfilepath, excelsheet, 0, 1));
		   Thread.sleep(2000);
		   password.sendKeys(ExcelLibrary.Excelfilefecth(excelfilepath, excelsheet, 1, 1));
		   Thread.sleep(2000);
		   loginbutton.click();
		   TakesScreenshot ts=((TakesScreenshot)driver);
		   File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		   File destinationfile=new File("D:\\Eclipse Folder\\com.HybridFramework_casestudy_2\\screenshots\\iamge_1.png");
		   FileUtils.copyFile(sourcefile, destinationfile);
	   }
	 
	 public void cancelerrorbutton()
	 {
		 cancelbutton.click();
		 System.out.println("user cancelled the error message");
	 }

}
