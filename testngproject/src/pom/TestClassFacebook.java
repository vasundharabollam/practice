package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.GenericToDataProvider;

public class TestClassFacebook {

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
public void login(String username,String pwd){
	SignUpForFacebookPage fb=new SignUpForFacebookPage(driver);
	fb.setUsername(username);
	fb.setPassword(pwd);
	fb.clickLogin();
}
@AfterMethod
public void logout(){
	driver.close();
}
@DataProvider(name="verify")
public Object[][] gettingdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
	Object[][] object = GenericToDataProvider.getData("Sheet1");
return object;
}}
