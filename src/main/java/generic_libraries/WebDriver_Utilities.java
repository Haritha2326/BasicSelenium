package generic_libraries;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utilities {
	
	//1. mouseovering
	
	public void mouseOvering(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//2. doubleclicking
	
	public void doubleClicking(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	//3. drag and drop
	
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement target)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}
	
	//4. right click
	
	public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	
	}
	
	// 5. implicit wait
	
	public void implicitWait(WebDriver driver, int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	//6. ExplicitWait for visibility of element
	
	public void explicitWait(WebDriver driver, int time, WebElement ele)
	
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	//7. ExplicitWait for element to be clickable
	
	public void explicitWaitClick(WebDriver driver, int time, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	//8. handling parent window
	
	public void parentWindow(WebDriver driver)
	{
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}
	
	//9. handling child window
	
	public void childWindow(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		for(String b : child)
		{
			driver.switchTo().window(b);
		}
	}
	
	//10. handling frames
	
	public void frames(WebDriver driver, String value)
	{
		driver.switchTo().frame(value);
	}
	
	//11. handling frames
	
	public void frames(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	//12. clicking on ok in alter pop-up
	
	public void alterPopUpOk(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	//13. clicking cancel in alter pop-up
	
	public void alterPopUpDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	//14. handling dropdowns
	
	public void dropDowns(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//15. thread statement
	
	public void sleep() throws Throwable
	{
		Thread.sleep(3000);
	}
}
