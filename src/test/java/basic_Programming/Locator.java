package basic_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Chrome();

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
		//enter username
		driver.findElement(By.id("um_UserName")).sendKeys("HAVN");
		//enter password
		driver.findElement(By.id("um_Password")).sendKeys("Hakuna_Matata1126");
		//login to blue page
		driver.findElement(By.id("LoginButton")).click();
		Thread.sleep(20000);
		//Create a Task Search
		driver.findElement(By.xpath("//*[@id=\"searchFilter-xStatus-dropit-id\"]/a/img")).click();
		//Select Pending and In Progress
		driver.findElement(By.id("PENDING")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("COMPLETED")).click();
		Thread.sleep(3000);
		///click outside
		driver.findElement(By.xpath("//*[@id=\"domDetect_wvBlueTasks_10\"]/div[3]/div/div[2]/section/div[2]")).click();
		Thread.sleep(2000);
		//remove my tasks from Owner
		driver.findElement(By.id("searchFilter-xOwner-dropit-id"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"searchFilter-xOwner-dropit-id\"]/a/span/span/span")).click();
		Thread.sleep(2000);
		//click Apply
		driver.findElement(By.id("search-apply-btn-id")).click();
		//closing the program
		//driver.close();
		
	}
}
