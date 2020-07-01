package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverMyntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.myntra.com");
Thread.sleep(3000);
WebElement discover = driver.findElement(By.xpath("//a[.='Discover']"));
Thread.sleep(3000);	
Actions action=new Actions(driver);
Thread.sleep(3000);
	action.moveToElement(discover).perform();
	Thread.sleep(3000);
	
	}

}
