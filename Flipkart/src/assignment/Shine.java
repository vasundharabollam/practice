package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Shine {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.shine.com");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//div[@id='id_showform']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium webdriver");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='id_loc']")).sendKeys("bangalore");
Thread.sleep(3000);
WebElement dd = driver.findElement(By.xpath("//select[@name='minexp']"));
Thread.sleep(3000);
Select se=new Select(dd);
se.selectByIndex(4);
System.out.println(".........."+se.isMultiple()+"..........");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='id_search_form']")).click();
Thread.sleep(3000);
driver.close();
	}

}
