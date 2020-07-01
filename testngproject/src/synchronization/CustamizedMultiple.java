package synchronization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.GenericToDataProvider;

public class CustamizedMultiple {
	public WebDriver driver;


	@BeforeMethod
	public void openAppln() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(dataProvider="verify")
	public void login(String username,String pwd) throws InterruptedException{
		List<String> list=new ArrayList<String>();
		list.add("//input[@id='email']");
		list.add("//input[@id='pass']");
		list.add("//input[@value='Log In']");
		int i=0;
		
			CustamizedWait.returnAddress(driver, 10, list.get(i)).sendKeys(username);
			i++;
			
			CustamizedWait.returnAddress(driver, 10, list.get(i)).sendKeys(pwd);
		i++;
		CustamizedWait.returnAddress(driver, 10, list.get(i)).click();
		
	
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
