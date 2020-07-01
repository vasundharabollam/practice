package dataprovider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookRegistration {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test(dataProvider="verification")
	public void registerUser(String Fname,String lname,String pno,String pwd) throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(Fname);
	
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
	
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(pno);
	
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pwd);
	
	WebElement dd1 = driver.findElement(By.xpath("//select[@id='day']"));
	Select se1=new Select(dd1);
	se1.selectByIndex(5);
	WebElement dd2 = driver.findElement(By.xpath("//select[@id='month']"));
	Select se2=new Select(dd2);
	se2.selectByIndex(5);
	WebElement dd3 = driver.findElement(By.xpath("//select[@id='year']"));
	Select se3=new Select(dd3);
	se2.selectByIndex(5);
	
	driver.findElement(By.xpath("//*[@id='u_0_6']")).click();
	
	driver.findElement(By.xpath("(//button[.='Sign Up'])[1]")).click();
	
	}
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
