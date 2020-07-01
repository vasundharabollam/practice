package windowhandles;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	       WebDriver driver=new FirefoxDriver();
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
			WebElement men = driver.findElement(By.xpath("//span[.='Men']"));
	       Thread.sleep(3000);
	       Actions act=new Actions(driver);
	       act.moveToElement(men).perform();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//a[.='T-Shirts']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[.='Striped Men Round Neck Dark Blue, White, Pink T-Shirt']")).sendKeys(Keys.ENTER);
	Thread.sleep(10000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600)");
	WebElement size = driver.findElement(By.xpath("(//a[@class='_1TJldG _2I_hq9 _2UBURg'])[2]"));
	js.executeScript("arguments[1].click()", size);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).sendKeys(Keys.ENTER);;
	Thread.sleep(5000);
	}

}
