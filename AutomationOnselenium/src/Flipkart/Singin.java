package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Singin extends Method{

	public static void main(String[] args) throws InterruptedException {

		launchbrowser("https://www.flipkart.com/");
		WebElement entername = driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']"));
		WebElement enterpass=driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']"));
		WebElement loginbutton = driver.findElement(By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']"));
		WebElement newaccount = driver.findElement(By.xpath("//*[@class='oZoRPi']"));
		WebElement loginwinclose = driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']"));
		WebElement Womendress = driver.findElement(By.xpath("//*[text()='Women']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(Womendress).perform();
		Thread.sleep(2000);
		WebElement sarees = driver.findElement(By.xpath("//*[text()='Sarees'][@href='/clothing-and-accessories/saree-and-accessories/saree/women-saree/pr?sid=clo,8on,zpd,9og&otracker=categorytree&otracker=nmenu_sub_Women_0_Sarees']"));
		Thread.sleep(5000);
		
		
		
		
		entervalue(driver, entername, 10, "monu kumar");
		entervalue(driver, enterpass, 10, "8899294129");
		clickevent(driver, loginbutton, 10);
		clickevent(driver, newaccount, 10);
		clickevent(driver, loginwinclose, 10);
		mousemov(driver, Womendress, 20);
		clickevent(driver, sarees, 30);
	
	}

}
