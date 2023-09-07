package frames;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) throws Throwable {
		
		frame();

	}
	
	public static void frame() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement sign_in = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(sign_in).perform();
		
		Thread.sleep(3000);
		
		WebElement reg = driver.findElement(By.xpath("//span[text()='Register']"));
		
		reg.click();
		
		driver.switchTo().frame("loginIframe");
		
		WebElement user = driver.findElement(By.xpath("//input[@id = 'userName']"));
		
		user.sendKeys("aslanhari26@gmail.com");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\"close-pop\"]/i")).click();
		
		driver.switchTo().defaultContent();
		
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		
		search.sendKeys("Deal");
		
		Thread.sleep(6000);
		
		driver.quit();
		
	}

}
