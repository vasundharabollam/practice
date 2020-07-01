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

import pom.SignUpForFacebookPage;
import generic.GenericToDataProvider;

public class TestClassFacebook extends Generic_Test {

	
@Test(dataProvider="verify")
public void login(String username,String pwd){
	SignUpForFacebookPage fb=new SignUpForFacebookPage(driver);
	fb.setUsername(username);
	fb.setPassword(pwd);
	fb.clickLogin();
}

@DataProvider(name="verify")
public Object[][] gettingdata() throws EncryptedDocumentException, InvalidFormatException, IOException{
	Object[][] object = GenericToDataProvider.getData("Sheet1");
return object;
}}
