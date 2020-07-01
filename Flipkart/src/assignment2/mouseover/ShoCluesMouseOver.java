package assignment2.mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoCluesMouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.shopclues.com");
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By.xpath("//a[.='Sign In']"));
        Actions act=new Actions(driver);
        act.moveToElement(signin).perform();
        Thread.sleep(2000);
    	WebElement log = driver.findElement(By.xpath("//span[@class='user_icn']"));
      Thread.sleep(1000);
  	log.click();
	}

}
