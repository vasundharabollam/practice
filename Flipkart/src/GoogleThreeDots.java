import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleThreeDots {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	   WebDriver driver=new FirefoxDriver();
	   driver.get("https://www.google.com");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@class='gb_D gb_pc']")).click();
	    Thread.sleep(2000);
	    driver.switchTo().frame(1);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@class='MrEfLc']")).click();
	Thread.sleep(2000);
	}

}
