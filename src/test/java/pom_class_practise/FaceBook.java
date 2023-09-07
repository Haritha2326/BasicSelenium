package pom_class_practise;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Fb_LoginPage;

public class FaceBook {

	public static void main(String[] args) throws Throwable {
		
		Properties prop = new Properties();
		
		//creating an object for the physical file
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		prop.load(fis);
		String url = prop.getProperty("url");
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		Fb_LoginPage fb = new Fb_LoginPage(driver);
		
		fb.emailText("aslanhari26");
		fb.passwordText("aslan");
		fb.loginBtn();
		

	}

}
