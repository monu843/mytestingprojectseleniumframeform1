package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class withoutpom {
	WebDriver driver;
	
	By user=By.xpath("//*[@class='_2zrpKA _1dBPDZ']");
	By pass=By.xpath("//*[@class='_2zrpKA _3v41xv _1dBPDZ']");
	By click=By.xpath("//*[@class='_2AkmmA _1LctnI _7UHT_c']");
	public withoutpom(WebDriver driver) {
		this.driver=driver;
		
	}
	public void fliplart(String userid,String passw) {
		driver.findElement(user).sendKeys(userid);
		driver.findElement(pass).sendKeys(passw);
		driver.findElement(click).click();
	}
	
	
}
	