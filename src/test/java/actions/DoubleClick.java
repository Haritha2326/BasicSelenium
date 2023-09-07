package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	
	public void doubleclick() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("Pegasus");
		
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		
		a.doubleClick(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		
		
		
		
		
		
	}
}
