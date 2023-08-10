package Test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.Pom_class;
import generics.BaseTest;

public class Test_class extends BaseTest{

    @Test
    public void assertion() throws InterruptedException, IOException
    {    
     Pom_class p=PageFactory.initElements(driver, Pom_class.class);
     p.urlvalidation();
     p.titlevalidation();
     p.loginscenario();     
     String actualtext="Epic sadface: Username and password do not match any user in this service";
     String expectedtext=driver.findElement(By.xpath("//h3[@data-test=\"error\"]")).getText();
     Assert.assertEquals(actualtext,expectedtext);
     Reporter.log(expectedtext);//printing statement
     //System.out.println(expectedtext); 
     p.cancelerrorbutton();
	}

}