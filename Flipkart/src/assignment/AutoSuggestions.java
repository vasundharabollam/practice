package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='sbct']"));
	    System.out.println(suggestions.size());
	    for (WebElement we : suggestions) {
			System.out.println(we.getText());
		}
	}
}
