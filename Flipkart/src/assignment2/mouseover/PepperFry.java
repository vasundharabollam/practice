package assignment2.mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PepperFry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.pepperfry.com");
	     Thread.sleep(3000);
	    WebElement we = driver.findElement(By.xpath("(//a[.='Furniture'])[1]"));
	     Actions act=new Actions(driver);
	     act.moveToElement(we).perform();
	     Thread.sleep(3000);
	     driver.close();
	}

}
