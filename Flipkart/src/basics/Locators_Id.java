package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Id {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Users/Vasu/Desktop/design.html");
	WebElement element = driver.findElement(By.id("i1"));
	element.sendKeys("vasu");
	Thread.sleep(3000);
}
}
