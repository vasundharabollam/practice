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

import pom.FlipKartCartPage;
import pom.FlipKartSelectedSareePage;
import pom.FlipkartWomenPage;
import pom.FlipkartWomenSareesPage;
import pom.OnlineShoppingFlipKartPage2;
import generic.GenericToDataProvider;

public class TestClassFlipkartWomen extends Generic_Test{
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
	    FlipKartCartPage cart=new FlipKartCartPage(driver);
	    cart.clickRemove();
	   sarees.clickOnSaree2();
	    cart.clickRemove();
	  //  sarees.clickOnSaree3();
	  //  cart.clickRemove();
	   
	 // driver.switchTo().defaultContent();
	}
	@DataProvider(name="verify")
	public Object[][] gettingdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
		Object[][] object = GenericToDataProvider.getData("Sheet1");
	return object;
	}
}
