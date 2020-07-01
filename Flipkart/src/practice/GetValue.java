package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetValue {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		String username=GetDataFromExcel1Generic.Getdata("Sheet1", 0, 0);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"))
		.sendKeys(username);
Thread.sleep(2000);
String password=GetDataFromExcel1Generic.Getdata("Sheet1", 0, 1);
driver.findElement(
		By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"))
		.sendKeys(password);
Thread.sleep(2000);
driver.findElement(
		By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
Thread.sleep(5000);


	}

}
