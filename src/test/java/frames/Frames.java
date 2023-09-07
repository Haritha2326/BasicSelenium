package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		frames();

	}
	public static void frames() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
		
		Thread.sleep(6000);
		
		driver.switchTo().frame("packageListFrame");
		
		WebElement packages = driver.findElement(By.linkText("org.openqa.selenium"));
		
		packages.click();
		
		Thread.sleep(6000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		
		Thread.sleep(6000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		
		WebElement help = driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[1]/ul/li[8]/a"));
		
		help.click();
		
		Thread.sleep(6000);
		
		driver.switchTo().defaultContent();
		
		driver.quit();
		
	}
}
