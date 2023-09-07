package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider_Explanation {

	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] a = new Object[3][2];
		a[0][0]="hadjkjffj";
		a[0][1]="hvfvsiosg";
		
		a[1][0]="1123";
		a[1][1]="jdhfaihf";
		
		a[2][0]="hfai";
		a[2][1]="@$E@#R@";
		
		return a;
	}
	
	@Test(dataProvider="getData")
	
	public void data(String username)
	{
	
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();


	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys(username);
	
	driver.close();
}
	
	
}
