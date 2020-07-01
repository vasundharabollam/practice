package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
				"9036932590");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(
				"Bhavi@1610");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	Thread.sleep(5000);
	System.out.println(driver.getTitle());
	}

}
