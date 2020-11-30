package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mousemovement {
WebDriver driver;

	@BeforeMethod
	public void initaap() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			String title=driver.getTitle();
			System.out.println(title);
		}
	@Test
	public void invalidlogin() {
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("monukumarmrt");
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("8899294129");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		if(driver.getPageSource().contains("Please enter valid Email ID/Mobile number"))
		
		{
			System.out.println("invalid id password try again");
		}
		else {
			System.out.println("valid login");
		}
	}
	@Test
	public void validlogin() {
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("monukumarmrt@gmail.com");
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("8899294129@#");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		if(driver.getPageSource().contains("Please enter valid Email ID/Mobile number")) {
			System.out.println("invalid id password try again");
		}
		else {
			System.out.println("invalid id password try again");
		}
	}
	}
