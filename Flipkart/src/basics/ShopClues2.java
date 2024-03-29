package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClues2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.shopclues.com");
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By.xpath("//a[.='Sign In']"));
        Actions act=new Actions(driver);
        act.moveToElement(signin).perform();
        Thread.sleep(2000);
    	WebElement log = driver.findElement(By.xpath("//span[@class='user_icn']"));
      Thread.sleep(1000);
  	log.click();
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("//input[@id='main_user_login']")).sendKeys("vasundhara.prakashreddy@gmail.com");
  	driver.findElement(By.xpath("(//input[@name='password'])[1]")).sendKeys("Bhavi@1610");
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//a[.='Login']")).click();
  	Thread.sleep(2000);
  	driver.findElement(By.xpath("//a[@id='a_close_id']")).click();
  	Thread.sleep(5000);
  	WebElement account = driver.findElement(By.xpath("//a[.='Hi vasundha']"));
  	act.moveToElement(account).perform();
  	Thread.sleep(3000);
  	driver.findElement(By.xpath("//a[.='Sign Out']")).click();
  	driver.close();
  	
	}

}
