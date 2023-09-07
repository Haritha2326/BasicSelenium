package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sync {

	public void chrome() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get("https://bluevqc2.bluesoftware.com/");
		
		WebElement button = driver.findElement(By.linkText("Forgot your password?"));
		
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		button.click();
		
		WebElement userid = driver.findElement(By.id("forgotPasswordUserid"));
		
		Point coordinates = userid.getLocation();
		
		System.out.println(coordinates.getX());
		System.out.println(coordinates.getY());
		
		userid.sendKeys("haritha remish");
		
		Thread.sleep(3000);
		
		userid.clear();
		
		
		
	}
	
}
