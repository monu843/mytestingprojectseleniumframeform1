package Amazon.In;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Apptest {

	static WebDriver driver;
	public static void initialization() {
		System.setProperty("webdriver.driver.chrome", "F:\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification");
		driver.get("url");
		driver.manage().window().maximize();
		driver.getTitle();
		
	}
	public void testfailed() throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src, new File("\"C:\\\\Users\\\\monu\\\\Desktop\\\\google.png\""));
	}
}
