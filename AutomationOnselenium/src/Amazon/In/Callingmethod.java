package Amazon.In;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Callingmethod {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static void launchbrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	public static void entervalue(WebDriver driver,WebElement elementname,int timeouts,String value) {
		wait=new WebDriverWait(driver, timeouts);
		wait.until(ExpectedConditions.visibilityOf(elementname));
		elementname.click();
				
	}
	public static void clickevent(WebDriver driver,WebElement elementname,int timeouts,String value) {
		wait=new WebDriverWait(driver, timeouts);
		wait.until(ExpectedConditions.elementToBeClickable(elementname));
		elementname.click();
	}
	public static void mousemov(WebDriver driver,WebElement elementname,int timeouts,String value) {
		wait=new WebDriverWait(driver, timeouts);
		wait.until(ExpectedConditions.elementToBeClickable(elementname));
		Actions act = new Actions(driver);
		act.moveToElement(elementname).perform();
	}
	public static void winhandle(WebDriver driver,WebElement elementname,int timeouts,String value) {
		
		String parentwin = driver.getWindowHandle();
		System.out.println(parentwin);
		Set<String> allwinid = driver.getWindowHandles();
		System.out.println(allwinid.size());
		Iterator<String> itr = allwinid.iterator();
		while(itr.hasNext()) {
			String childwin = itr.next();
			if(!parentwin.equals(childwin))
			{
				System.out.println(allwinid);
			}
			String childwintitle = driver.switchTo().window(childwin).getTitle();
			System.out.println(childwintitle);
			if(childwin.equalsIgnoreCase("value"));
			{
				driver.manage().window().maximize();
				driver.close();
			}
			
		}
		
	}
	public static void checkbox(WebDriver driver,WebElement elementname,int timeouts,String value) {
		
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
