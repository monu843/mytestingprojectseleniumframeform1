import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:\\gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("monukumarmrt");
		WebElement next= driver.findElement(By.xpath("//*[@id='identifierNext']/div[1]/button/div[2]"));
		next.click();
		//driver.findElement(By.xpath("//*[@class='PrDSKc']/button")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Enter your password')]")).sendKeys("8899294129@#");
//		driver.findElement(By.xpath("//*[@id='recoveryIdentifierId']")).sendKeys("monukumarmrt");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id='queryPhoneNext']/div/button/div[2]")).click();

	}

}
