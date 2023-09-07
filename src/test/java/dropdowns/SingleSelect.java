package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelect {

	public void single_select() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		
		Select option = new Select(dropDown);
		
		option.selectByIndex(3);
		
		Thread.sleep(6000);
		
		option.selectByValue("search-alias=jewelry");
		
		Thread.sleep(6000);
		
		option.selectByVisibleText("Music");
		
		Thread.sleep(6000);
		
		List<WebElement> list = option.getOptions();
		
		System.out.println(list.size());
		
		for(WebElement b : list)
		{
			System.out.println(b.getText());
		}
		
		driver.quit();
		
	}
		
}
