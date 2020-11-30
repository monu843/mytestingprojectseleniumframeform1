package Amazon.In;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SinIn {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	//	driver.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']/a/span")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
		driver.findElement(By.xpath("//*[@class='nav-input'][@value='Go']")).click();
		driver.findElement(By.xpath("//*[@id='icp-nav-flyout']")).click();
		
	}

}
