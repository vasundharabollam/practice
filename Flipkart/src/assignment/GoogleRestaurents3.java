package assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleRestaurents3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justdial.com/Bangalore");
		Thread.sleep(30000);
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='hotkeys-text']"));
		Iterator<WebElement> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getText());
		}
		}
	}


