
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synctestmethod {
	
	public static  WebDriver driver;
	public static  Action act;
	public static WebDriverWait wait;
	public static void openbrowser(String url)
	{
		
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
				
	}
	
	public static void entervalue(WebDriver driver,WebElement elementname,int timeouts,String value) {
		wait=new WebDriverWait(driver, timeouts);
		wait.until(ExpectedConditions.visibilityOf(elementname));
		elementname.sendKeys(value);
		
	}
	public static void clickevent(WebDriver driver, WebElement elementname,int timeouts) {
		wait=new WebDriverWait(driver, timeouts);
		
		wait.until(ExpectedConditions.elementToBeClickable(elementname));
		elementname.click();
		
	}
	
	public static void mousemovement(WebDriver driver,WebElement elementname,int timeouts) {
		
		Actions act=new Actions(driver);
		act.moveToElement(elementname).perform();
		
	}
	
	public static void checkstatus(WebDriver driver,WebElement elementname,int timeouts) {
		wait=new WebDriverWait(driver, timeouts);
		boolean checkboxstatus = wait.until(ExpectedConditions.elementToBeSelected(elementname)).booleanValue();
		System.out.println(checkboxstatus);
		if(checkboxstatus!=true){
			elementname.click();
			
		}
		else
		{
			System.out.println("check box already checked");
		}
	}

}
