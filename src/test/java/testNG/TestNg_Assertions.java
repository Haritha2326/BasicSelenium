package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Assertions {

	@Test
	
	public void assertion() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	
	
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		
		//Hard assert
		
		//Assert.assertEquals(title, "Amazon");
		
		//soft assert
		
		SoftAssert s = new SoftAssert();
		
		s.assertEquals(title,"Amazon");
		
		System.out.println(title);
	}
	
	@Test
	
	public void simple()
	{
		System.out.println("hello");
	}
}
