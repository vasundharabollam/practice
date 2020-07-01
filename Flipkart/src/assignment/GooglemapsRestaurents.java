package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglemapsRestaurents {

	public static void main(String[] args) throws InterruptedException {
		//working
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.google.com/maps");
     //  Thread.sleep(2000);
      // driver.findElement(By.xpath("//input[@name='q']")).click();
       Thread.sleep(30000);
       driver.findElement(By.xpath("(//button[@class='section-categorical-shortcut-button ripple-container'])[1]")).click();
	   Thread.sleep(20000);
	  List<WebElement> restaurents = driver.findElements(By.xpath("//div[@class='section-result-content']"));
	  Thread.sleep(5000);

	for (WebElement we : restaurents) {
		//Thread.sleep(5000);
		System.out.println(we.getText());
		Thread.sleep(30000);
	}
	}

}
