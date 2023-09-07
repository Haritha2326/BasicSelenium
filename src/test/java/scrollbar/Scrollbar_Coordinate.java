package scrollbar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollbar_Coordinate {

	public static void main(String[] args) throws Throwable {
		
WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
	
		WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));
		
		Point coOrdinate= career.getLocation();
		
		int x = coOrdinate.getX();
		
		int y = coOrdinate.getY();
		
		//downcasting statement
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		
		//career.click();
		
		js.executeScript("arguments[0].click();",career);

	}

}
