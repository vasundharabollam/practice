package assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleRestaurents2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@class='section-categorical-shortcut-button ripple-container']")).click();
		Thread.sleep(5000);
		List<WebElement> we = driver.findElements(By.xpath("//div[@class='section-result-header']"));
		Iterator<WebElement> hotle_rating = we.iterator();
		while(hotle_rating.hasNext()){
			System.out.println(hotle_rating.next().getText());
		}

	}

}
