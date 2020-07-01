package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import poi.framework.DDFWriteDataGeneric;

public class GetUrlAndExcel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(10000);
		   List<WebElement> we = driver.findElements(By.xpath("//a"));
	 System.out.println(we.size());
	  int a=0;
	 for (WebElement we1 : we) {
		 String url = we1.getAttribute("href");
		 DDFWriteDataGeneric.writeData("Sheet1", a, 0, url);
		 a++;
	}

	}

}
