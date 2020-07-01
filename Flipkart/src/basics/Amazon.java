package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in");
		Thread.sleep(3000);

		WebElement signin = driver.findElement(By
				.xpath("//*[@id='nav-link-accountList']"));
        Actions act=new Actions(driver);
        act.moveToElement(signin).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[.='Sign in'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9036932590");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Bhavi@1610");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	driver.findElement(By.xpath("//span[@class='a-label a-radio-label']")).click();
	}
}
