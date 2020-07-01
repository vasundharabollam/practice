package regressionscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pom.OnlineShopclusloginvalidPage;
import generic.ExcelSheet;
import generic.Generic_Test;

public class ValidShopclusLogin extends Generic_Test{
@Test
public void validshopcluslogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
	String username=ExcelSheet.getData("Sheet1", 1, 0);
	String password = ExcelSheet.getData("Sheet1", 1, 1);OnlineShopclusloginvalidPage shopclus=new OnlineShopclusloginvalidPage(driver);
	shopclus.signIn(driver);
	shopclus.login();
	shopclus.setUsename(username);
	shopclus.setPassword(password);
	shopclus.clickOnLogin();
	shopclus.clickcross();
	driver.findElement(By.xpath("//a[.='Hi vasundha']"));
	System.out.println(driver.getTitle());
}
}
