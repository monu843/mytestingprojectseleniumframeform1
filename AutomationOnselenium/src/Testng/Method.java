package Testng;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Method {
		public static WebDriver driver;
		public static WebDriverWait wait;
		public static void launchbrowser(String url) {
			
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(url);
			String pagetitle = driver.getTitle();
			System.out.println(pagetitle);
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
		}
		
		public static void clickevent(WebDriver driver, WebElement elementname,int timouts) {
			
			wait=new WebDriverWait(driver, timouts);
			wait.until(ExpectedConditions.elementToBeClickable(elementname));
			elementname.click();
			
		}
		public static void entervalue(WebDriver driver,WebElement elementname,int timeouts,String value) {
			
			wait=new WebDriverWait(driver, timeouts);
			wait.until(ExpectedConditions.visibilityOf(elementname));
			elementname.click();
					
		}
		public static void mousemov(WebDriver driver,WebElement elementname,int timeouts) {
			wait=new WebDriverWait(driver, timeouts);
			wait.until(ExpectedConditions.elementToBeClickable(elementname));
			Actions act=new Actions(driver);
			act.moveToElement(elementname).perform();
			
			
		}
		
		

	}


