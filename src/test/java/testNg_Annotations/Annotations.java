package testNg_Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations {
	
	WebDriver driver;
	@BeforeMethod
	public void opening()
	
	
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	
	
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	
	public void close()
	{
		driver.close();
	}
	
	@Test(priority=-1)
	public void fb() throws Throwable
	{
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	
	@Test
	
	public void amazon() throws Throwable
	{
		driver.get("https://bluesoftware.atlassian.net/browse/BLUEV-18967");
		Thread.sleep(3000);
	}
	
}
