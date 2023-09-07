package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BLUE_Creds {

	public void Mozilla() throws Throwable
	{
		//creating a connection between selenium and browser
		WebDriverManager.firefoxdriver().setup();
		//launch browser
		WebDriver driver = new FirefoxDriver();
		//maximise the browser
		driver.manage().window().maximize();
		//Go to BLUE page
		driver.get("https://bluevqc2.bluesoftware.com/");
		Thread.sleep(6000);
		//Login to BLUE
		WebElement login = driver.findElement(By.id("um_UserName"));
		login.sendKeys("HAVN");
		Thread.sleep(1000);
		
		WebElement pw = driver.findElement(By.cssSelector("input[name='um_Password']"));
		pw.sendKeys("Hakuna_Matata1126");
		Thread.sleep(1000);
		
		WebElement login_button = driver.findElement(By.linkText("Log In"));
		login_button.click();
		
		Thread.sleep(6000);
		
		//fetch all links in a page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
		
		
	}
	
}
