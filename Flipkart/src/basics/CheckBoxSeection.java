package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxSeection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("file://C:/Users/Vasu/Desktop/checkbox.html");
        Thread.sleep(5000);
	   List<WebElement> eles = driver.findElements(By.xpath("//input"));
	   for(WebElement we:eles){
		   we.click();
	   }
	}

}
