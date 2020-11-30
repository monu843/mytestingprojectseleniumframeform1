import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Flipkartlogin extends Synctestmethod{

	public static void main(String[] args) {
		openbrowser("https://www.flipkart.com/");
		WebElement userid=driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']"));
		WebElement userpass = driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		WebElement loginbutton = driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']"));
		WebElement loginwinclose = driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']"));
		WebElement women = driver.findElement(By.xpath("//*[text()='Women']"));
		WebElement dress= driver.findElement(By.xpath("//*[@href='/clothing-and-accessories/saree-and-accessories/saree/women-saree/pr?sid=clo,8on,zpd,9og&otracker=categorytree&otracker=nmenu_sub_Women_0_Sarees']"));
	
		
		entervalue(driver, userid, 10, "monukumar");
		entervalue(driver, userpass, 10, "8899294129@#");
		clickevent(driver, loginbutton, 5);
		clickevent(driver, loginwinclose, 5);
		mousemovement(driver, women, 10);
		mousemovement(driver, dress, 10);
		
		
		
		
		

	}

}
