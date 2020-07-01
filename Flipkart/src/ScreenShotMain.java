import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import basics.ScreenShot2;


public class ScreenShotMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
       ScreenShot2.capture(driver);
       driver.get("https://www.flipkart.com");
       Thread.sleep(2000);
       ScreenShot2.capture(driver);
       
       
	}

}
