package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class flipkart extends Method {
	
	@BeforeMethod(groups= {"smoke testing"})
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
	
  @Test(groups= {"smoke testing"})
  public void invalidlogin() {
	  WebElement userid = driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']"));
	  WebElement pass= driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	  WebElement login = driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']"));
	
	  if(driver.getPageSource().contains("Please enter valid Email ID/Mobile number")) {
		  System.out.println("login succesfuly");
	  }
	  else {
		  System.out.println("login unsuccessful");
	  }
	  
	  entervalue(driver, userid, 10, "monukumarmrt@gmail.com");
	  entervalue(driver, pass, 10, "8899294129");
	  clickevent(driver, login, 10);
	  
  }
  @Test(groups= {"smoke testing","sanity testing"})
  public void validlogin() {
	  WebElement userid = driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']"));
	  WebElement pass= driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']"));
	  WebElement login = driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']"));
	  
	  entervalue(driver, userid, 10, "monukumarmrt@gmail.com");
	  entervalue(driver, pass, 10, "8899294129");
	  clickevent(driver, login, 10);
  }
  @Test
  public void otpopration() throws InterruptedException {
	driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("monu");
	driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("8899");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
	
	
	}
  @Test(groups = {"regrresion testing"})
  public void loginwindowclose() {
	 WebElement winclose = driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']"));
	 
	 clickevent(driver, winclose, 20);
	  
  }
  }
