package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	public void multi_select() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/ ");
		
		WebElement multi = driver.findElement(By.xpath("//*[@id=\"cars\"]"));
		
		Select option = new Select(multi);
		
		option.selectByIndex(3);
		
		Thread.sleep(6000);
		
		option.selectByValue("90");
		
		Thread.sleep(6000);
		
		option.selectByVisibleText("More Than INR 500 ( 55 )");
		
		Thread.sleep(6000);
		
		List<WebElement> list = option.getOptions();
		
		System.out.println(list.size());
		
		List<WebElement> list1 = option.getAllSelectedOptions();
		
		for(WebElement b : list1)
		{
			System.out.println(b.getText());
		}
		
		option.deselectByIndex(3);
		
		Thread.sleep(6000);
		
		option.deselectByVisibleText("Free ( 90 )");
		
		Thread.sleep(6000);
		
		option.deselectByValue("500");
		
		Thread.sleep(6000);
		
		option.selectByIndex(3);
		
		Thread.sleep(6000);
		
		option.selectByValue("90");
		
		Thread.sleep(6000);
		
		option.deselectAll();
		
		Thread.sleep(6000);
		
		driver.quit();
	
}
	
}
