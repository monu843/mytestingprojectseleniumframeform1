import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dropdownlist extends Synctestmethod {

	public static void main(String[] args) {
		openbrowser("https://www.facebook.com/");
		WebElement createfb = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		
		
		
		
		clickevent(driver,createfb, 10);
		createfb.click();

	}

}
