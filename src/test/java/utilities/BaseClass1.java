package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {

	public static WebDriver driver;

	public static WebDriver driverSetup() {
		if (driver == null) { // Ensuring a single instance of WebDriver
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static WebDriver driverTearDown() {
		 if (driver != null) {
	            driver.quit();
	            driver = null;  // Ensure that the driver is reset
	        }
		return driver;
	}

}
