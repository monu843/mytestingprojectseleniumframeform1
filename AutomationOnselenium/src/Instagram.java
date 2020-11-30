import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:\\instagram.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='_2hvTZ pexuQ zyHYP'][@name='username']")).sendKeys("monukumarmrt@gmail.com");
		//driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(1) > div > label > input")).sendKeys("monukumar");
		driver.findElement(By.xpath("//*[@class='_2hvTZ pexuQ zyHYP'][@name='password']")).sendKeys("8899294129@#");
		driver.findElement(By.xpath("//*[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		
	}

}
