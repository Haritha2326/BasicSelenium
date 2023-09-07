package pop_ups;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_RobotClass {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		String file = "C:\\Users\\havn\\Desktop\\BLUEV\\butterfly.pdf";
		
		StringSelection src = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(src, null);
		
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		
		Robot r = new Robot();
		
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
