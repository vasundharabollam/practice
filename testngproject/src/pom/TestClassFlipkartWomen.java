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

public class TestClassFlipkartWomen {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}
	@Test(dataProvider="verify")
	public void login(String username,String pass) throws InterruptedException{
		OnlineShoppingFlipKartPage2 flipkartpage=new OnlineShoppingFlipKartPage2(driver);
		flipkartpage.setUserName( username);
		flipkartpage.setPassword(pass);
		flipkartpage.clickOnLogin();
		FlipkartWomenPage flipkart=new FlipkartWomenPage(driver);
		flipkart.clickOnWomen(driver);
		flipkart.clickOnSarees();
		FlipkartWomenSareesPage sarees=new FlipkartWomenSareesPage(driver);
		sarees.clickOnSaree1();
		System.out.println(driver.getTitle());
		FlipKartSelectedSareePage select_saree=new FlipKartSelectedSareePage(driver);
	    select_saree.clickOnCart();
	    sarees.clickOnSaree2();
	   
	  driver.switchTo().defaultContent();
	}@AfterMethod
	public void logout(){
		//driver.close();
	}
	@DataProvider(name="verify")
	public Object[][] gettingdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Object[][] object = GenericToDataProvider.getData("Sheet1");
	return object;
	}
}
