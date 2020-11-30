package Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class Instagram {
	WebDriver driver;
	@BeforeMethod
	public void initbrowser() {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.instagram.com/");
		
	}
	@Test
	public void login() throws InterruptedException {
		String rexpected= "instagram";
		String title = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, rexpected);
		Assert.assertEquals(title, rexpected);
		Reporter.log("title is varified", true);
		sa.assertAll();
		Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@name='username']")).sendKeys("monukumarmrt@gmail.com");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("8384854876@#");
	driver.findElement(By.xpath("//*[@class='sqdOP  L3NKy   y3zKF     ']")).click();
	
	}
	
}
