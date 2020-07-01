package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Bangalore");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("kerala");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//i[.='Cal'])[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[.='11'])[1]")).click();
	    Thread.sleep(3000);
	    WebElement aduts = driver.findElement(By.xpath("//select[@id='Adults']"));
	    Select se=new Select(aduts);
	    se.selectByIndex(2);
	    Thread.sleep(3000);
	    WebElement childrens = driver.findElement(By.xpath("//select[@id='Childrens']"));
	    Select se1=new Select(childrens);
	    se1.selectByIndex(2);
	    Thread.sleep(3000);
	    WebElement infants = driver.findElement(By.xpath("//select[@id='Infants']"));
	    Select se12=new Select(infants);
	    se12.selectByIndex(1);
	    Thread.sleep(3000);
	    driver.close();
	
	
	}

}
