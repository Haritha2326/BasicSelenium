package verification;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification {

	public void Chrome() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.name("q"));
		
		if(search.isDisplayed())
		{
			search.sendKeys("Ghee Rice");
		}
		
		else
		{
			System.out.println("No Text area avaialble");
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div[4]")).click();
		
		WebElement google_search = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		
		if(google_search.isEnabled())
		{
			google_search.submit();
		}
		else
		{
			System.out.println("Non Clickable");
		}
	}
}
