package pop_ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Popup {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://skillrary.com/");
		
		Thread.sleep(3000);
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		//since set is a collection, for each loop is used.
		
		for(String b:child)
		{
			driver.switchTo().window(b);
		}

		driver.findElement(By.xpath("//input[@id='mytext']")).sendKeys("Haritha");
		
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
