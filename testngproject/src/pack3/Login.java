package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.ie.driver",
				"./softwares/MicrosoftWebDriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
	}

	@Parameters({ "browser" })
	@BeforeMethod
	public void openAppln(String browser) {
		if (browser.equals("edge")) {
			driver = new EdgeDriver();
			driver.get("https://www.flipkart.com");
		} else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get("https://www.flipkart.com");
		} else {
			driver = new FirefoxDriver();
			driver.get("https://www.flipkart.com");
		}
	}

	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"))
				.sendKeys("9036932590");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"))
				.sendKeys("Bhavi@1610");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void closeAppln() {
		driver.quit();
	}
}
