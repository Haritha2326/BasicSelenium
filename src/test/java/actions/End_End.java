package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import generic_libraries.WebDriver_Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class End_End {

	public static void main(String[] args) throws Throwable {
		
		WebDriver_Utilities utilities = new WebDriver_Utilities();
		WebDriverManager.edgedriver().setup();
		//opening edge browser
		
		WebDriver driver = new EdgeDriver();
		//maximizing the browser
		driver.manage().window().maximize();
		//implicit statement
		utilities.implicitWait(driver, 10);
		driver.get("https://skillrary.com/");
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		utilities.sleep();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		utilities.childWindow(driver);
		WebElement course= driver.findElement(By.id("course"));
		utilities.mouseOvering(driver, course);
		utilities.sleep();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		WebElement plus = driver.findElement(By.id("add"));
		utilities.doubleClicking(driver,plus);
		utilities.sleep();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		utilities.sleep();
		utilities.alterPopUpOk(driver);

	}

}
