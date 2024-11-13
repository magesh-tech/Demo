package automate_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utils_Page.Utils;
import automate_Page.LoginPage;


public class LoginpageTest extends Utils {
	
	static WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() {
		Utils.setUp();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Utils.launchUrl("https://letcode.in/");
	}
	
	
	@Test
	public void navigate_To_loginpage() throws InterruptedException {
		
//		LoginPage.signup();
		LoginPage.login();
	}
	
	
	@AfterClass
	public void quit() {
		driver.quit();

	}

	
}
