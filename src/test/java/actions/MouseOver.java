package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver 
{
	
	public void edge() throws Throwable

	{
	WebDriverManager.edgedriver().setup();
	
	WebDriver driver = new EdgeDriver();
	
	driver.get("https://bluehelp.bluesoftware.com/administration/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//WebElement search = driver.findElement(By.linkText("Asset Library"));
	
	//Thread.sleep(4000);
	
	Actions a = new Actions(driver);
	
	a.moveToElement(driver.findElement(By.linkText("Asset Library"))).perform();
	
	WebElement example = driver.findElement(By.linkText("Asset Expiry"));
	
	Thread.sleep(3000);
	
	example.click();
	
	
	
	}
	
	

}
