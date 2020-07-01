package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import poi.framework.DDFWriteDataGeneric;

public class NikeShoename {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.nike.com");
		Thread.sleep(3000);
		WebElement men = driver.findElement(By.xpath("//a[.='MEN']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//a[.='SHOES'])[1]")).click();
		Thread.sleep(10000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		for(int i=0;i<5;i++){
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(10000);
		}
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='product-card__title']"));
		Thread.sleep(9000);
		for(int i=0;i<list.size();i++){
			WebElement we = list.get(i);
			Thread.sleep(3000);
			String name = we.getText();
			DDFWriteDataGeneric.writeData("Sheet1", i, 0, name);
		}
		driver.close();
		

	}

}
