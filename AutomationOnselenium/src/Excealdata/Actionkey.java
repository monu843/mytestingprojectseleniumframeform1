package Excealdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionkey {
	static WebDriver driver;
	
	public static void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	}
	
	public static void checkhome() 
	{
		String hometile = driver.getTitle();
		if(hometile.contains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) 
		{
			System.out.println("Home page visible");
		}
		else {
			System.out.println("home page is not visible");
		}
	}
	
		
	public static void enterid(String uid)
	{
	driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys(uid);	
	}
	
	public static void enterpass(String pswi) throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys(pswi);
	}
	
	public static void clicklogin() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	}
	public static void  clicklogout()
	{
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
	}
}
