package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Vasu/Desktop/hold.html");
	Thread.sleep(3000);
	WebElement click = driver.findElement(By.id("demo"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.clickAndHold(click).perform();
	Thread.sleep(3000);
	act.release(click).perform();
driver.close();
	}

}
