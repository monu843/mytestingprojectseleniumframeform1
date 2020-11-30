package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertesting {

	WebDriver driver;
	// we can execute parallel test with different browsers is called cross browser testing
	// using testng we can apply @parameter annotations to parameter the different browser
	// in XML suit file
	
	@Parameters({"browser","testurl"})
	public void intibrowser(String browsername,String url) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("chrome driver launched");
		}
		else if (browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "F://geckodriver.exe");
			driver=new FirefoxDriver();
			System.out.println("firefox driver launched");
			
		}
		driver.manage().window().maximize();
		driver.get(url);
	}
	@Parameters({"searchitem"})
	@Test
	public void search(String value) {
		driver.findElement(By.name("q")).sendKeys(value);
		driver.findElement(By.name("btnk")).click();
	}
	@Test
	public void googletitle() {
		
		Assert.assertEquals(driver.getTitle(), "Gooogle");
	}
	@AfterMethod
	public void appclose() {
		driver.close();
		System.out.println("browser closed");
	}
}
