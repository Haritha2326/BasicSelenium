package pop_ups;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Notification_popup {

	public static void main(String[] args) {
		
		HashMap<String, Integer> contentStrings = new HashMap<String, Integer>();
		HashMap<String, Object> profiles = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		
		contentStrings.put("Notification", 2);
		profiles.put("managed_default_content_settings",contentStrings);
		prefs.put("profile", profiles);
		
		//Handling notification in firefox browser
		EdgeOptions options = new EdgeOptions();
		
		options.setCapability("preferences", prefs);
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.quikr.com/");
		
		

	}

}
