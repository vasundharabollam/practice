package dataprovider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFlipkart {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
	}
	@Test(dataProvider="verification")
	public void login(String username,String pwd) throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"))
				.sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"))
				.sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(5000);
		String atitle=driver.getTitle();
		Assert.assertEquals(atitle, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		System.out.println("passsss");}
@AfterMethod
public void logout(){
	driver.close();
}
@DataProvider(name="verification")
public Object[][] gettingdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
	Object[][] object = GenericToDataProvider.getData("Sheet1");
	return object;
}
}
