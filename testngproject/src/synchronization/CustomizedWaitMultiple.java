package synchronization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.GenericToDataProvider;

public class CustomizedWaitMultiple {
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
		String in1="//input[@id='email']";
		WebElement we1=GenericVerifyXpath.verifyXpath(driver, in1);
		if(we1!=null){
		list.add("//input[@id='email']");}
		String in2="//input[@id='pass']";
		WebElement we2=GenericVerifyXpath.verifyXpath(driver, in2);
		if(we1!=null){
		list.add("//input[@id='pass']");}
		String in3="//input[@value='Log In']";
		WebElement we3=GenericVerifyXpath.verifyXpath(driver, in3);
		if(we1!=null){
		list.add("//input[@value='Log In']");}
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


