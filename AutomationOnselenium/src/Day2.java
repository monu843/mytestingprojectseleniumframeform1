import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");	
		driver.findElement(By.id("email")).sendKeys("monukumarmmrt");
		driver.findElement(By.id("pass")).sendKeys("8899294129@#");
		WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();
		
	}

}
