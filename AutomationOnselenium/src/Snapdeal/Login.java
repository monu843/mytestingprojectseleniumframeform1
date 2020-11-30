package Snapdeal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
	
		WebElement login = driver.findElement(By.xpath("//*[@class='accountUserName col-xs-12 reset-padding']"));
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Your Account')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='userName'][@name='username']")).sendKeys("monukumar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='checkUser']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		WebElement mobile = driver.findElement(By.xpath("//*[contains(text(),'Mobile & Tablets')]"));
		act.moveToElement(mobile).perform();
		driver.findElement(By.xpath("//span[@class='linkTest'][contains(text(),'Smartphones')]")).click();
	}	

}
