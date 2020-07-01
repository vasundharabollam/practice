package regressionTestScripts;


import java.util.List;

import generic.Excel;
import generic.Generic_Test;
import managers.PageObjectManager;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.EnterTimeTrack;
import pom.Login_Page;

public class ValidLoginLogout extends Generic_Test {

	@Test
	public void validloginlogout()
	{
		List<String> data = Excel.getData("regression", "ValidLoginLogout");
		String username = data.get(1);
		String password = data.get(2);
		String eTitle = data.get(3);
		test=reports.createTest("validLoginLogout",
				"validation for valid username and password");
		PageObjectManager pom = new PageObjectManager(driver);
		Login_Page lp = pom.getLoginPage();
		test.info("test has started");
		
		lp.setUsername(username);
		test.pass("entered valid username");
		lp.setPassword(password);
		test.pass("entered valid password");
		lp.clickLogin();
		test.pass("clicked on Login");
		EnterTimeTrack ep = pom.getEntertimetrack_page();
	
		ep.verifyTitle(5, "Enter");
		Assert.assertEquals(driver.getTitle(), eTitle);
		test.pass("verified homePage");
		ep.clickLogout();
		test.pass("clicked on logout");
		lp.verifyTitle(5, "Login");
		test.pass("verified LoginPage");
		test.info("test has ended");
		
	}
	
}
