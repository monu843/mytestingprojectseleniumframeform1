import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/monu/Downloads/sampleApp2.html");
		driver.findElement(By.id("user")).sendKeys("monukumar");
		driver.findElement(By.id("pass")).sendKeys("monu");
		//driver.findElement(By.className("Mycheckbox")).click();
		driver.findElement(By.cssSelector("input[type*='checkbox']")).click();
		driver.findElement(By.cssSelector("input[id='male']")).click();
		driver.findElement(By.cssSelector("input[value='Login']")).click();
		
	}

}
