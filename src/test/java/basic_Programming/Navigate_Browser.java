package basic_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Browser {

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
		Thread.sleep(6000);
		//navigate to a site from basic browser
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(6000);
		//navigate to back page
		driver.navigate().back();
		Thread.sleep(6000);
		//navigate to forward page
		driver.navigate().forward();
		Thread.sleep(6000);
		//refresh the page
		driver.navigate().refresh();
		Thread.sleep(6000);
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
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		//navigate to a site from basic browser
		driver.navigate().to("https://bluevqc2.bluesoftware.com/");
		Thread.sleep(6000);
		//navigate to back page
		driver.navigate().back();
		Thread.sleep(6000);
		//navigate to forward page
		driver.navigate().forward();
		Thread.sleep(6000);
		//refresh the page
		driver.navigate().refresh();
		Thread.sleep(6000);
		//closing the program
		driver.close();
		
	}

}
