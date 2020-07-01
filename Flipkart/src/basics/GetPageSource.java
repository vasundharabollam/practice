package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/.softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String src = driver.getPageSource();
	System.out.println(src);
}
}
