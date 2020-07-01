package regressionscripts;

import generic.Generic_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.FlipKartWatches;
import pom.FlipkartWatchYellow;
import pom.OnlineShoppingFlipKartPage2;
import generic.GenericToDataProvider;

public class TestClassFlipKart extends Generic_Test {

	@Test(dataProvider="verify")
	public void login(String username,String pass) throws InterruptedException{
		OnlineShoppingFlipKartPage2 flipkartpage=new OnlineShoppingFlipKartPage2(driver);
		flipkartpage.setUserName( username);
		flipkartpage.setPassword(pass);
		flipkartpage.clickOnLogin();
		flipkartpage.mouseHoverOnMen();
		flipkartpage.clickOnCasio();
		FlipKartWatches watches=new FlipKartWatches(driver);
        watches.clickOnCasioYellow();
        System.out.println(driver.getTitle());
        FlipkartWatchYellow yellow_watch=new FlipkartWatchYellow(driver);
        yellow_watch.clickOnCart();
	}
	
	@DataProvider(name="verify")
	public Object[][] gettingdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Object[][] object = GenericToDataProvider.getData("Sheet1");
	return object;
	}
}
