package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Dropdown extends Method{
	
	public static void main(String[] args) throws InterruptedException {
		launchbrowser("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA _1dBPDZ']")).sendKeys("monukumar");
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ'][@type='password']")).sendKeys("8899294129");
		driver.findElement(By.xpath("//*[contains(text(),'Forgot?')]")).click();
		driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
		
		WebElement womandress = driver.findElement(By.xpath("//*[@class='_2FZd5H'][contains(text(),'Women')]"));
		Actions act= new Actions(driver);
		act.moveToElement(womandress).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Sarees'][@href='/clothing-and-accessories/saree-and-accessories/saree/women-saree/pr?sid=clo,8on,zpd,9og&otracker=categorytree&otracker=nmenu_sub_Women_0_Sarees']")).click();
		if (driver.getPageSource().contains("Sarees")) {
			System.out.println("click opration is done");
		}
		else {
			System.out.println("click operation is not done");
		}
		
		WebElement kidswear = driver.findElement(By.xpath("//*[text()='Baby & Kids']"));
		Actions kid=new Actions(driver);
		kid.moveToElement(kidswear).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Remote Control Toys']")).click();
	}
}
