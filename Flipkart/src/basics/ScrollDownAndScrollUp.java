package basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownAndScrollUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		for (int i = 0; i < 3; i++) {
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(3000);
		}
		for (int i = 0; i < 3; i++) {
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(3000);
		}
		driver.close();
		

	}

}
