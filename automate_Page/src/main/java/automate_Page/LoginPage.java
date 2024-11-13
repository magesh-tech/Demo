package automate_Page;

import org.openqa.selenium.WebDriver;
import org.utils_Page.Utils;

public class LoginPage {
	
	static WebDriver driver;
	
	public static String signUpBtn_xpath = "//a[text()='Sign up']";
	public static String nameInput_xpath = "//input[@id='name']";
	public static String emailInput_xpath = "//input[@id='email']";
	public static String passwordInput = "//input[@name='password']";
	public static String chBox = "//input[@id='agree']";
	public static String signUp_xpath = "//button[text()='SIGN UP']";
	public static String signOut_xpath = "//a[text()='Sign out']";
	public static String loginBtn = "//a[text()='Log in']";
	public static String login_EmailXpath = "(//input[@placeholder='Enter registered email'])[1]";
	public static String login_password_xpath = "//input[@placeholder='Enter password']";
	public static String login_Btn = "//button[text()='LOGIN']";
	
	
	static String name = "Ch1hennnai133";
	static String email = "e1mi1@646.com";
	static String password = "Chennai456";
	
	
	public static void signup() throws InterruptedException {
		Utils.clickElement(signUpBtn_xpath);
		Utils.sendKeys(nameInput_xpath, name);
		Utils.sendKeys(emailInput_xpath, email);
		Utils.sendKeys(passwordInput, password);
		Utils.clickElement(chBox);
		Utils.clickElement(signUp_xpath);
		Thread.sleep(2000);
		Utils.jsClickElement(signOut_xpath);
		Thread.sleep(7000);
	}
	
	
	public static void login() throws InterruptedException {
		Thread.sleep(2000);
		Utils.clickElement(loginBtn);
		Utils.sendKeys(login_EmailXpath, email);
		Utils.sendKeys(login_password_xpath, password);
		Utils.clickElement(login_Btn);
	}
	
	
	
	public void sign_Login(String data) throws InterruptedException {
		String text = Utils.getText(signUpBtn_xpath);
		if(data.equals(text)) {
			Utils.clickElement(signUpBtn_xpath);
			Utils.sendKeys(nameInput_xpath, name);
			Utils.sendKeys(emailInput_xpath, email);
			Utils.sendKeys(passwordInput, password);
			Utils.clickElement(chBox);
			Utils.clickElement(signUp_xpath);
			Thread.sleep(2000);
			Utils.jsClickElement(signOut_xpath);
			Thread.sleep(7000);
		}else{
			Thread.sleep(2000);
			Utils.clickElement(loginBtn);
			Utils.sendKeys(login_EmailXpath, email);
			Utils.sendKeys(login_password_xpath, password);
			Utils.clickElement(login_Btn);			
		}

	}
	
	
	
}
