package poi.framework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DDFWriteDataMain {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"))
				.sendKeys("9036932590");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"))
				.sendKeys("Bhavi@1610");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(5000);
String title = driver.getTitle();
	if(title.contains("Online Shopping")){
		System.out.println("homepge displayed");
		DDFWriteDataGeneric.writeData("Sheet1", 0, 2, "pass");
	}
	else{
		DDFWriteDataGeneric.writeData("Sheet1", 0, 2, "fail");
	}
driver.close();

	}

}
