package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleClassNaukri {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.naukri.com");
	     JobsRecruitmentPage jrp=new JobsRecruitmentPage(driver);
	jrp.loginLink();
	jrp.setUsername("hmamatha22@gmail.com");
	jrp.setPassword("9980874002");
	jrp.clickSubmit();
	}

}
