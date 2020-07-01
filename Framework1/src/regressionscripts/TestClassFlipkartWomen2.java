package regressionscripts;

import java.io.IOException;

import generic.Base_Page;
import generic.ExcelSheet;
import generic.Generic_Test;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.OnlineShoppingFlipKartPage2;

public class TestClassFlipkartWomen2 extends Generic_Test{
@Test
public void login_flipkart() throws EncryptedDocumentException, InvalidFormatException, IOException{
	String username=ExcelSheet.getData("login", 1, 0);
	String password = ExcelSheet.getData("login", 1, 1);
	OnlineShoppingFlipKartPage2 flipkartpage=new OnlineShoppingFlipKartPage2(driver);
	flipkartpage.setUserName( username);
	flipkartpage.setPassword(password);
	flipkartpage.clickOnLogin();
	WebElement error = driver.findElement(By.xpath("(//span[.='Your username or password is incorrect'])[1]"));
	Base_Page bp=new Base_Page(driver);
	bp.visibility(10, error);
	Assert.fail();
	}

}
