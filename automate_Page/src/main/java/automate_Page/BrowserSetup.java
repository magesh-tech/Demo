package automate_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {

	
public static WebDriver driver;
	
	public static void createInstance(String browserName) {
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		default:
			break;
		}
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			createInstance("chrome");
			driver.manage().window().maximize();
		}
		return driver;
	}
	
}
