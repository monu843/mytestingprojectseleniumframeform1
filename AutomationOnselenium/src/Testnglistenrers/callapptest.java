package Testnglistenrers;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testlistenrs.class)
public class callapptest extends Apptest   {

	@BeforeMethod
	public void callapp() {
		Apptest.initbrowser();
	}
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
//	@Test
//	public void search() {
//		driver.findElement(By.name("q")).sendKeys("akshay kumar");
//		driver.findElement(By.xpath("//*[@data-ved='0ahUKEwisg9Wk8r3sAhWg9nMBHT62DIQQ4dUDCAc']")).click();
//		
//	}
	@Test
	public void testfaild() {
		String title=driver.getTitle();
		Assert.assertEquals(title, "googgle");
	}
}
