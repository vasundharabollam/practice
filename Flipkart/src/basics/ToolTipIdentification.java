package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToolTipIdentification {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vasundhaprakashreddy@gmail.com");
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("vasuvasu");
	
	driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
	Thread.sleep(5000);
	WebElement ele = driver.findElement(By.xpath("//input[@name='composer_photo[]']"));
	Thread.sleep(5000);
	System.out.println(ele.getAttribute("title"));
	}

}
