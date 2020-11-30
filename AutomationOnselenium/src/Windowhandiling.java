import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandiling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		String Parentwindow = driver.getWindowHandle();
		System.out.println(Parentwindow);
		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid.size());
		
		Iterator<String> itr = allwindowid.iterator();
		while(itr.hasNext()){
			String childwindows = itr.next();
			if(!Parentwindow.equals(childwindows))
			{
				System.out.println(allwindowid);
				
			}
			String childwindowstitle = driver.switchTo().window(childwindows).getTitle();
			System.out.println(childwindowstitle);
			if (childwindows.equalsIgnoreCase("HSBC"));
			{
				driver.manage().window().maximize();
				driver.close();
			}
			
			
	}
		
	}

}
