package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaytmIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.paytm.com");
     Thread.sleep(10000);
    WebElement we = driver.findElement(By.xpath("(//div[.='Log In/Sign Up'])[1]"));
	Thread.sleep(5000);
    we.click();
	driver.switchTo().frame(0);
	Thread.sleep(5000);
	WebElement link = driver.findElement(By.xpath("//span[.='Login/Signup with mobile number and password']"));
	Thread.sleep(5000);
	link.click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='input_0']")).sendKeys("vasuma");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("vasu");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(.,'Login Securely')]")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='X']")).click();
	
	
	
	}

}
