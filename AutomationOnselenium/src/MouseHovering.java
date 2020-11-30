import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("monukumar");
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ'][@type='password']")).sendKeys("8899294129");
		driver.findElement(By.xpath("//*[contains(text(),'Forgot?')]")).click();
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		WebElement Womendress = driver.findElement(By.xpath("//*[text()='Women']"));
		Actions act=new Actions(driver);
		act.moveToElement(Womendress).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Sarees'][@href='/clothing-and-accessories/saree-and-accessories/saree/women-saree/pr?sid=clo,8on,zpd,9og&otracker=categorytree&otracker=nmenu_sub_Women_0_Sarees']")).click();
		Thread.sleep(5000);
			
		WebElement login = driver.findElement(By.xpath("//*[@class='_3Ep39l'][@href='/account/login?ret=/']"));
		Actions log=new Actions(driver);
		log.moveToElement(login).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='_1Q5BxB'][text()='My Profile']")).click();
		//driver.findElement(By.xpath("//*[@class='_1Q5BxB'][text()='Flipkart Plus Zone']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		
		WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
		Actions mens=new Actions(driver);
		mens.moveToElement(men).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@href='/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts']")).click();
		Thread.sleep(5000);
		WebElement women = driver.findElement(By.xpath("//*[text()='Women']"));
		Actions avo=new Actions(driver);
		avo.moveToElement(women).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Skin Care']")).click();
	}

}
