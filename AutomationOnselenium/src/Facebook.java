
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(@placeholder,'Email address or phone number')]")).sendKeys("monukumarmrt");
		driver.findElement(By.xpath("//*[contains(@aria-label,'Password')][@class='inputtext _55r1 _6luy']")).sendKeys("8899294129@#");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
		
		
	}
}
