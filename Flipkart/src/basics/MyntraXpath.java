package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.myntra.com");
	Thread.sleep(5000);
	WebElement profile = driver.findElement(By.xpath("//span[text()='Profile']"));
	Thread.sleep(5000);
	Actions act=new Actions(driver);
	act.moveToElement(profile).perform();
	driver.findElement(By.xpath("//a[text()='log in']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vasundhara.prakashreddy@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bhavi@vasu123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	Thread.sleep(3000);
	WebElement profile2 = driver.findElement(By.xpath("//span[@class='myntraweb-header-sprite desktop-iconUser sprites-headerUser']"));
	act.moveToElement(profile2).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[.=' Logout ']")).click();
	
	}

}
