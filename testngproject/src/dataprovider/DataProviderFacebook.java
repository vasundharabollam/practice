package dataprovider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFacebook {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
	}
	@Test(dataProvider="verify")
	public void login(String username,String pwd) throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	Thread.sleep(10000);
		String title=driver.getTitle();
	Assert.assertEquals(title, "(18) Facebook");
	}
	@AfterMethod
	public void logout(){
		driver.close();
	}
	@DataProvider(name="verify")
	public Object[][] gettingdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Object[][] object = GenericToDataProvider.getData("Sheet1");
	return object;
	}
}
