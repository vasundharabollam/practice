package poi.framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By
				.xpath("//*[@id='nav-link-accountList']"));
        Actions act=new Actions(driver);
        act.moveToElement(signin).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[.='Sign in'])[2]")).click();
        Thread.sleep(5000);
        String username=ExcelSheet.getData("Sheet1", 1, 0);
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(username);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	Thread.sleep(3000);
	String password=ExcelSheet.getData("Sheet1", 1, 1);
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(password);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//span[@class='a-label a-radio-label']")).click();
Thread.sleep(5000);
driver.close();
	}

}
