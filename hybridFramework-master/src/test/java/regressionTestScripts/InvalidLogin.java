package regressionTestScripts;

import java.util.List;

import generic.Excel;
import generic.Generic_Test;
import managers.PageObjectManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.Login_Page;

public class InvalidLogin extends Generic_Test {

	@Test
	public void invalidLogin() {
		List<String> data = Excel.getData("regression", "InvalidLogin");
		String username = data.get(1);

		String password = data.get(2);

		String eTitle = data.get(3);

		test = reports.createTest("invalidLogin", "validate for " + "invalid"
				+ "username and password");
		test.info("test has started");
		PageObjectManager pom=new PageObjectManager(driver);
		Login_Page lp = pom.getLoginPage();
		//Login_Page lp = new Login_Page(driver);
		lp.setUsername(username);
		test.pass("entered the username");
		lp.setPassword(password);
		test.pass("entered the password");
		lp.clickLogin();
		test.pass("clicked on login button");
		lp.verifyErrmsg();
		test.pass("error mssg is verified");
		lp.verifyTitle(5, "abcd");
		Assert.assertEquals(driver.getTitle(), eTitle);
		test.pass("title is verified");
		test.info("test has ended");
		

	}

}
