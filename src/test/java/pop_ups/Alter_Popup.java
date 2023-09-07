package pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alter_Popup {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		WebElement button = driver.findElement(By.xpath("//button[text() =' Add to Cart']"));
		
		button.click();
		
		//shifting the control to the alter pop up
		
		Alert popup = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		System.out.println(popup.getText());
		
		popup.accept();
		
		//popup.dismiss();
	}

}
