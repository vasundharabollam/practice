package basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinimizeBrowser {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
         driver.get("https://www.google.com");
         Robot robot=new Robot();
         robot.keyPress(KeyEvent.VK_ALT);
         robot.keyPress(KeyEvent.VK_SPACE);
         robot.keyPress(KeyEvent.VK_N);
         robot.keyRelease(KeyEvent.VK_ALT);
         robot.keyRelease(KeyEvent.VK_SPACE);
         robot.keyRelease(KeyEvent.VK_N);
         

	}

}
