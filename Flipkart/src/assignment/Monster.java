package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Monster {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.monsterindia.com");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[.='Login']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
