package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Generic_Test {
	public WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	public Logger log = Logger.getLogger(Generic_Test.class);

	BrowserFactory bf = new BrowserFactory();
	FileManager fm = new FileManager();

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter(
				new File("./reports/" + new Date().toString().replace(":", "-") + ".html"));
		reports = new ExtentReports();

		reports.attachReporter(htmlReporter);

	}

	@Parameters({ "browser" })
	@BeforeMethod
	public void openAppn(@Optional("chrome") String browser) {
		log.info("open the browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = bf.getBrowser("chrome");

			driver.get(fm.getApplicationUrl());
		} else {
			driver = bf.getBrowser("firefox");

			driver.get(fm.getApplicationUrl());
		}
		driver.manage().timeouts().implicitlyWait(fm.getImplicitlyWait(), TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closeAppn(ITestResult res) throws IOException {
		
		String testName = res.getName();
		if (ITestResult.FAILURE == res.getStatus()) {

			test.fail("test failed", MediaEntityBuilder
					.createScreenCaptureFromPath(new ScreenShot().getPhoto(driver, testName)).build());
		}
		test.assignAuthor("ravish");
		test.assignCategory("Gui Automation");
		test.assignDevice("Laptop");
		reports.setSystemInfo("windows", "10");
		log.info("close the browser");
		bf.closeBrowser();
	}
	@AfterSuite
	public void tearDown() {

		reports.flush();

	}
}
