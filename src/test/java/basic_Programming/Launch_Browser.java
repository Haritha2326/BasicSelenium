package basic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {

	public static void main(String[] args) throws Throwable {
		
		Firefox();
		Chrome();
		
		
	}
	
	public static void Firefox() throws Throwable{
		// firefox driver
		WebDriverManager.firefoxdriver().setup();
		//opening chrome browser
		WebDriver driver = new FirefoxDriver();
		//maximize window
		driver.manage().window().maximize();
		//entering url
		driver.get("https://www.google.com/");
		//using getTitle method
		System.out.println(driver.getTitle());
		//using getCurrentURL
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		//closing the program
		driver.close();
	}
	
	public static void Chrome() throws Throwable {
		// chrome driver
		WebDriverManager.chromedriver().setup();
		//opening chrome browser
		WebDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//entering url
		driver.get("https://bluevqc2.bluesoftware.com/");
		//using getTitle method
		System.out.println(driver.getTitle());
		//using getCurrentURL
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		//closing the program
		driver.close();
		
	}

}

