package tetNg_Parallel;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_Sequential {

	@Test
	
	public void fb() throws Throwable
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		prop.load(fis);
		
		String url = prop.getProperty("url");
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
