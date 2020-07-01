package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingUrlOfLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
         driver.get("file://C:/Users/Vasu/Desktop/example.html");
       WebElement ele = driver.findElement(By.xpath("//a"));
       
      String url = ele.getAttribute("href");
      System.out.println(url);
        
	}

}
