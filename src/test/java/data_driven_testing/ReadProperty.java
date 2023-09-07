package data_driven_testing;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadProperty {
	
	

	public static void main(String[] args) throws Throwable {
		
		Properties prop = new Properties();
		
		//creating an object for the physical file
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		prop.load(fis);
		String appURL = prop.getProperty("url");
		String user = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		String browser = prop.getProperty("browser");
		
		WebDriver driver;
		
		if(browser.equals("edge"))
		{
		
		WebDriverManager.edgedriver().setup();
		
		driver = new EdgeDriver();
		
		} else
		{
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get(appURL);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(password);
		
		
		
		
	}

}
