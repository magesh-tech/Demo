package org.utils_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automate_Page.BrowserSetup;

public class Utils {
	
	 static WebDriver driver;
	 
	
	public static void setUp() {
		try {
			driver = BrowserSetup.getDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void launchUrl(String url) {
		try {
			
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static  WebElement findElement(String xpath) {
		WebElement element= null;
		try {
			 element = driver.findElement(By.xpath(xpath));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;

	}
	
	public static void clickElement(String xpath) {
			try {
				WebElement element = findElement(xpath);
				element.click();
				} catch (Exception e) {
					e.printStackTrace();
            }
	}
		
		public static void sendKeys(String xpath, String data) {
			try {
				WebElement element = findElement(xpath);
                element.clear();
				Thread.sleep(2000);
				element.sendKeys(data);
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
	
		
		public static void jsClickElement(String xpath) {
			try {
				WebElement element = findElement(xpath);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click();",element);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	    
		
		public static String getText(String xpath) {
			String text = "";
			try {
				WebElement element = findElement(xpath);
				 text = element.getText();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return text;
		}
	

}
