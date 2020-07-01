package regressionscripts;

import generic.Generic_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.OnlineShopping_ShopClusPage;
import generic.GenericToDataProvider;

public class TestClassShopClus extends Generic_Test {
	
	@Test(dataProvider = "verify")
	public void login(String use, String pwd) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		OnlineShopping_ShopClusPage online = new OnlineShopping_ShopClusPage(
				driver);
		online.signin();
		online.click_login();
		online.set_username(use, driver);
		online.set_password(driver, pwd);
		online.click_login();
	}
	@DataProvider(name = "verify")
	public Object[][] gettingdata() throws EncryptedDocumentException,
			InvalidFormatException, IOException {
		Object[][] object = GenericToDataProvider.getData("Sheet1");
		return object;
	}
}
