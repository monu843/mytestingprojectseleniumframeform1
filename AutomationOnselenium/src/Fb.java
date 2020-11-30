import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fb extends Synctestmethod{

	public static void main(String[] args) {
		 
		openbrowser("https://www.facebook.com/");
		WebElement createabutton = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

		List<WebElement> bodmonth = driver.findElements(By.xpath("//*[@name='birthday_month']"));
		
			
			
		
		
		clickevent(driver, createabutton, 10);
		createabutton.click();
		Iterator<WebElement> itr = bodmonth.iterator();
		while(itr.hasNext()) {
			WebElement monthlist = itr.next();
			String monthlisttext = monthlist.getText();
			System.out.println(monthlisttext);
		}
	}

}
