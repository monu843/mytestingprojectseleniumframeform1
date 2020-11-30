package Facebookproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Loginfunctionality {

	WebDriver driver;
	@BeforeMethod
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test(groups = {"Smoke testing,Functional testing"})
	public void invalidloginpasword() {
		driver.findElement(By.xpath("//*[contains(@placeholder,'Email address or phone number')]")).sendKeys("monukumarmrt");
		driver.findElement(By.xpath("//*[contains(@aria-label,'Password')][@class='inputtext _55r1 _6luy']")).sendKeys("8899294129@");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		if(driver.getPageSource().contains("Forgotten password?")) {
			System.out.println("Password is incorrect");
			
		
		}
		
		else {
			System.out.println("password is correct");
		}
	
	}
	@Test(groups = {"Smoke testing,Functional testing"})
	public void loginwithwithoutaccount() {
		driver.findElement(By.xpath("//*[contains(@placeholder,'Email address or phone number')]")).sendKeys("monukmar05010@gmail.com");
		driver.findElement(By.xpath("//*[contains(@aria-label,'Password')][@class='inputtext _55r1 _6luy']")).sendKeys("8899294129@");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
		if(driver.getPageSource().contains("The email address that you've entered doesn't match any account. ")) {
			
			System.out.println("sin up you dont hava a facebook account");
		}
		else {
			System.out.println("login successful");
		}
	}
	@Test(groups = {"Smoke testing,Functional testing"})
	public void clickforgetpass() {
		driver.findElement(By.xpath("//*[contains(@placeholder,'Email address or phone number')]")).sendKeys("monukumart@gmailcom");
		driver.findElement(By.xpath("//*[contains(@aria-label,'Password')][@class='inputtext _55r1 _6luy']")).sendKeys("8899294129@");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
		if(driver.getPageSource().contains("Forgotten password?")) {
			System.out.println("Password is incorrect");
			
		driver.findElement(By.xpath("//*[@href='https://www.facebook.com/recover/initiate/?ars=facebook_login']")).click();
		}
		
		else {
			System.out.println("password is correct");
		}
	}	
	@Test(groups = {"Smoke testing,Functional testing"})
	public void validlogin() {
		driver.findElement(By.xpath("//*[contains(@placeholder,'Email address or phone number')]")).sendKeys("monukumarmrt");
		driver.findElement(By.xpath("//*[contains(@aria-label,'Password')][@class='inputtext _55r1 _6luy']")).sendKeys("8899294129@#");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
	
		
	}
	
	
}