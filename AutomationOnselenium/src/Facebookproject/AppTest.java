package Facebookproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {

	static WebDriver driver;
	public static void launchbrowser() {
		
		System.setProperty("webdriver.driver.chrome", "F:\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("---disable-notifications");
		driver=new ChromeDriver(option);
		driver.get("");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	public void testfaield() throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectoryToDirectory(src, new File("\"C:\\\\Users\\\\monu\\\\Desktop\\\\google.png\""));
	}
}
