package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBetweenPages {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.navigate().back();
	driver.navigate().forward();
}
}
