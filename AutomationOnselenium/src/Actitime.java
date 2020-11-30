import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-rqavkab/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd'][@class='textField']")).sendKeys("monu");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//driver.findElement(By.xpath("//*[@class='content users']//*[@src='/img/default/pixel.gif?hash=1692528820']")).click();
		//click on users 
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*/../../td[7]/a[@href='/reports/reports.do']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id ='topnav']/tbody/tr/td[5]/a/img")).click();
	}

}
