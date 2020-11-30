import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTwo {

	public static void main(String[] args) throws InterruptedException  {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://google.com");
//		String page=driver.getPageSource();
//		
//		if (page.contains("Gmail"))
//		{
//			System.out.println("Gmail is available on Google page source");
//		}
//		else
//		{
//			System.out.println("Gmail is not available on this page source");
//		}
//		Thread.sleep(2000);
		driver.navigate().to("https://gmail.com");

		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("monukumarmrt");
		WebElement next =driver.findElement(By.className("VfPpkd-RLmnJb"));
		next.click();
		//driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("8899294129@#");
		//next.click();
			driver.findElement(By.xpath("//input[@id='password']/div[1]/div/div[1]/input")).sendKeys("8899294129@#");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]"));
		next.click();
		
		
//		Point P = new Point(100,200);
//		Dimension d =new Dimension(200,500);
//		
//		driver.manage().window().setPosition(P);
//		driver.manage().window().setSize(d);
	}

}
