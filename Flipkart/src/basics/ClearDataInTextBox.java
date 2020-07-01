package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearDataInTextBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver",
			"./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	String vasu="vasu";
 WebElement email = driver.findElement(By.name("email"));
 email.sendKeys(vasu);
	for (int i = vasu.length()-1; i>=0; i--) {
		email.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
	}
}
	
}
