package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Method {
	
//	@Test
//	public void validlogin() {
//		// login with invalid username and password 
//		launchbrowser("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("monukumarmrt@gmail.com");
//		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("monu8899");
//		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
////		
////		entervalue(driver, username, 10, "monukumarmrt@gmail.com");
////		entervalue(driver, userpass, 10, "monu8899");
////		clickevent(driver, loginbutton, 10);
////		
//	}
//	@Test
//	public void Invalidlogin() {
//		launchbrowser("https://www.flipkart.com/");
//		WebElement username = driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']"));
//		WebElement userpass = driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']"));
//		WebElement loginbutton = driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']"));
//		
//		entervalue(driver, username, 10, "monukumarmrt@gmail.com");
//		entervalue(driver, userpass, 10, "monu8899");
//		clickevent(driver, loginbutton, 10);
//		
//	}

	
	@Test
	public void newaccount() {
		launchbrowser("https://www.flipkart.com/");
		WebElement creatacc = driver.findElement(By.xpath("//*[@class='oZoRPi']"));
		WebElement entermobno = driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']"));
		WebElement continuebuton = driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']"));
		
		clickevent(driver, creatacc, 10);
		entervalue(driver, entermobno, 10, "8384854876");
		clickevent(driver, continuebuton, 10);
		
	}
}

