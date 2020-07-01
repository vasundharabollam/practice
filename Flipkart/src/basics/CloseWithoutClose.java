package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseWithoutClose {
//mandatory to use key relase here
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.google.com");
      Thread.sleep(2000);
      Robot robot=new Robot();
      robot.keyPress(KeyEvent.VK_ALT);
      robot.keyPress(KeyEvent.VK_F4);
      robot.keyRelease(KeyEvent.VK_ALT);
      robot.keyRelease(KeyEvent.VK_F4);
      
	}

}
