import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cinfig {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
//		driver.get("https://www.facebook.com");
//		Thread.sleep(5000);
		driver.navigate().to("https://www.google.com");
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		String pagettile=driver.getTitle();
//		String pageurl=driver.getCurrentUrl();
//		String windowid=driver.getWindowHandle();
//		System.out.println(pagettile);
//		System.out.println(pageurl);
//		System.out.println(windowid);
//		String page=driver.getPageSource();
//		//System.out.println(page);
	//	if (page.contains("Gmail")) {
			System.out.println("Gmail is avalable in pagesource");
//		}
//		else {
//			System.out.println("Gmail.is not available in page source");
//		}
		// we can customized a browser window by using Point and Dimension
		
		Point p = new Point (200,100);
		Dimension d = new Dimension(720,350);
		
		driver.manage().window().setPosition(p);
		driver.manage().window().setSize(d);
	}
	
	
}
