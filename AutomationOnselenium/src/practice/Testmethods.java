package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testmethods {
	
	public static  WebDriver driver;
	public static  WebDriverWait wait;
	public static void browser(String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("url");
	}
	
	public static void entervalue(WebDriver driver,WebElement elementname,int timeouts,String value) {
		wait=new WebDriverWait(driver, timeouts);
		wait.until(ExpectedConditions.visibilityOf(elementname));
		elementname.sendKeys("value");
		
	}
	public static void clickevent(WebDriver driver,WebElement elementname,int timeouts,String value) {
		wait=new WebDriverWait(driver, timeouts);
		wait.until(ExpectedConditions.elementToBeClickable(elementname));
		elementname.click();
	}
}
