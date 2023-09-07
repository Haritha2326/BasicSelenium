package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {

	public void dragDrop()
	{
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement option = driver.findElement(By.linkText("Drag and Drop"));
		
		option.click();
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
		
		WebElement target = driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
		
		a.dragAndDrop(source,target).perform();
		
	}
}
