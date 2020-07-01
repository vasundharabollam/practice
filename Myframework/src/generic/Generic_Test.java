package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test implements Auto_Const{
public WebDriver driver;
@BeforeMethod
public void launch_Appln(){
	driver=BrowserFactory.getBrowser("firefox");
	driver.get(new FileManager().getQAServer());
}
@AfterMethod
public void close_Appln(ITestResult res){
	if(ITestResult.FAILURE==res.getStatus()){
		String tc_name = res.getName();
		Screenshot.capture(driver, tc_name);
	}
	BrowserFactory.closeBrowser();
}
}
