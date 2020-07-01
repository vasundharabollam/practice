package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
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
		System.out.println(driver.getTitle());
		WebElement account = driver.findElement(By
				.xpath("(//div[.='Prakash'])[1]"));
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(account).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Logout']")).click();	
	driver.close();
	}
}
