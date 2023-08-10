package generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.text.Element;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends BaseTest
{
	public void drop_down(WebElement element,String text)
	{
	Select s=new Select(element);
	s.selectByVisibleText(text);
	}
	
	public void dropdown_1(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
		
		public void dropdown_2(WebElement element,String value)
		{
			Select s=new Select(element);
			s.selectByValue(value);

		}
		
		public void alerthandle()
		{
		Alert alt=driver.switchTo().alert();
		alt.accept();
		}
		
		public void robotclass()
		{
			Robot rb = null;
			try {
				rb = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_TAB);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_TAB);
		}
	
}
