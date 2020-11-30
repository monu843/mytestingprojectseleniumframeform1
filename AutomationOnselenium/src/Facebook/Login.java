package Facebook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

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
	@Test
	public void invalidlogin() {
		driver.findElement(By.xpath("//*[contains(@placeholder,'Email address or phone number')]")).sendKeys("monukumarmrt");
		driver.findElement(By.xpath("//*[contains(@aria-label,'Password')][@class='inputtext _55r1 _6luy']")).sendKeys("8899294129@");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		if(driver.getPageSource().contains("Forgotten password?")) {
			System.out.println("Password is incorrect");
		}
		else {
			System.out.println("login successfully");
		}
	}
	@Test
	public void validlogin() {
		driver.findElement(By.xpath("//*[contains(@placeholder,'Email address or phone number')]")).sendKeys("monukumarmrt");
		driver.findElement(By.xpath("//*[contains(@aria-label,'Password')][@class='inputtext _55r1 _6luy']")).sendKeys("8899294129@#");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
	
		
	}
	
	
}
