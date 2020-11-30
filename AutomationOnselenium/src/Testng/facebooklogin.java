package Testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebooklogin extends Method {
	
	@BeforeMethod
	public void launchbrowser() {
		launchbrowser("https://www.facebook.com/");

	}
	@Test
	public void inlogin() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy'][@id='email']")).sendKeys("monukumarmrt@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy'][@id='pass']")).sendKeys("8899");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		if(driver.getPageSource().contains("Forgotten password?")) {
			System.out.println("invalid login or password");
		}
		else {
			System.out.println("login done");
		}
		
	}
	@Test
	public void validlog01() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy'][@id='email']")).sendKeys("monukumarmrt@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='inputtext _55r1 _6luy'][@id='pass']")).sendKeys("8899294129@#");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
			
	}
	
	}
//	@AfterMethod
//	public void Browserclose() {
//		driver.close();
//		System.out.println("browser close");
//	}

