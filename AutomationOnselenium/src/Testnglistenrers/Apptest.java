package Testnglistenrers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Apptest {
	public static WebDriver driver;
	
	public static void initbrowser() {
		System.setProperty("webdriver.chrome.driver", "F://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
		
	public void testfaild() throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyDirectory(src, new File("C:\\Users\\monu\\Desktop\\google.png"));
		FileUtils.copyFileToDirectory(src, new File("C:\\Users\\monu\\Desktop\\google.png"));
	}
}
