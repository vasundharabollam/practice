package regressionTestScripts;

import java.util.List;

import managers.PageObjectManager;

import org.testng.annotations.Test;

import pom.EnterTimeTrack;
import pom.Login_Page;
import generic.Excel;
import generic.Generic_Test;

public class VerifyActitimeVersion extends Generic_Test {

	@Test
	public void verifyVersion() {
		List<String> data = Excel.getData("regression", "ValidLoginLogout");
		String username = data.get(1);
		String password = data.get(2);
		
		PageObjectManager pom=new PageObjectManager(driver);
		Login_Page lp = pom.getLoginPage();
		//Login_Page lp = new Login_Page(driver);
		test = reports.createTest("verifyversion",
				"actitimeVersion shold be verified");
		test.info("test has started");
		lp.setUsername(username);
		test.pass("entered username");
		lp.setPassword(password);
		test.pass("entered password");
		lp.clickLogin();
		test.pass("clicked Login");
		EnterTimeTrack ep = pom.getEntertimetrack_page();
		//EnterTimeTrack ep = new EnterTimeTrack(driver);
		ep.clickHelp();
		test.pass("clicked help");
		ep.clickActitime();
		test.pass("clicked Actitime");
		test.pass("verified version");
		ep.clickClose();
		test.pass("clicked close");
		ep.clickLogout();
		test.pass("clicked logout");
		test.info("test has ended");
	}
}
