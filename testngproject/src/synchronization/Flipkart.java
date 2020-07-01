package synchronization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.GenericToDataProvider;

public class Flipkart {
	public WebDriver driver;
@BeforeMethod
public void openappln(){
	System.setProperty("webdriver.gecko.driver",
			"./softwares/geckodriver.exe");
	 driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com");
}
@Test()
public void login(){
	WebDriverWait wait=new WebDriverWait(driver, 5);
	WebElement user = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
	wait.until(ExpectedConditions.visibilityOf(user));
	user.sendKeys("9036932590");
WebElement pass = driver.findElement(
	By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
wait.until(ExpectedConditions.visibilityOf(pass));
	user.sendKeys("Bhavi@1610");
WebElement login = driver.findElement(
	By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
wait.until(ExpectedConditions.visibilityOf(login));
login.click();
WebElement account = driver.findElement(By
	.xpath("(//div[.='Prakash'])[1]"));
wait.until(ExpectedConditions.visibilityOf(account));
Actions act = new Actions(driver);
act.moveToElement(account).perform();
WebElement logout = driver.findElement(By.xpath("//div[.='Logout']"));
wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[.='Logout']")));
logout.click();	
}
@AfterMethod
public void logout(){
	driver.close();
}
//@DataProvider(name="flipkartdata")
//public Object[][] gettingdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
//	Object[][] object = GenericToDataProvider.getData("Sheet1");
//return object;
//}
}
