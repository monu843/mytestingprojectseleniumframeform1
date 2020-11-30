package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Gmail {
	WebDriver driver;
	
	@BeforeMethod
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
	}

	@Test
	public void gmaillogin() {
		
		String expectedtitle="gmail";
		String pagetitle = driver.getTitle();
		SoftAssert sc=new SoftAssert();
		sc.assertEquals(pagetitle, expectedtitle);
//		Assert.assertEquals(pagetitle, expectedtitle);
//		Reporter.log("page title not verified",true);
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("monukumarmrt@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("8899294129@#");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
		sc.assertAll();
	}
}
