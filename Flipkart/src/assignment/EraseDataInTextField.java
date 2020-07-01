package assignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EraseDataInTextField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location='https://www.flipkart.com'");
        Thread.sleep(3000);
		driver.close();
	}

}
