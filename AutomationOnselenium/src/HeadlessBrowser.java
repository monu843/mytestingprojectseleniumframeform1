import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver=new ChromeDriver(option);
				
		driver.navigate().to("https:\\flipkart.com");
		
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("monukumarmrt@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("8899294129@#");
		WebElement login = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		login.click();
		System.out.println("log in completed");
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		String HOMEtitle = driver.getTitle();
		if(HOMEtitle.contentEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		{
			System.out.println("page title verify :  flipkart  ");
		}
		else {
			System.out.println("page title is not verify");
		}
		driver.close();
		System.out.println("browser closed");
	}

}
