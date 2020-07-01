package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FlipkartEdge {
@Test
public void flipkart(){
	System.setProperty("webdriver.ie.driver",
			"./softwares/MicrosoftWebDriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
}
}
