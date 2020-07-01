package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyntraCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.myntra.com");
  	driver.findElement(By.xpath("//span[text()='Profile']")).click();
  	Thread.sleep(5000);
  	driver.findElement(By.xpath("//a[text()='log in']")).click();
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vasundhara.prakashreddy@gmail.com");
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Bhavi@vasu123");
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	Thread.sleep(3000);
///	driver.fin
	}

}
