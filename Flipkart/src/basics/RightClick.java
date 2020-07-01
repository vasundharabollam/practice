package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.selenium.dev");
	Thread.sleep(3000);
	WebElement download = driver.findElement(By.xpath("//a[.='Downloads']"));
	Thread.sleep(3000);
	Actions action=new Actions(driver);
	action.contextClick(download).perform();
	Thread.sleep(3000);
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_L);
	robot.keyRelease(KeyEvent.VK_L);
	
	
	
	}

}
