package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustamizedWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
     returnAddress(driver, 10, "//input[@name='firstname']").sendKeys("vasuma");;
	}

	public static WebElement returnAddress(WebDriver driver, int time, String xpath) {
		WebElement element =null;
		for (int i = 0; i < time; i++) {
			try {
				 element = driver.findElement(By.xpath(xpath));
				break;
			} catch (Exception e) {
            try{
            	Thread.sleep(1000);
            	
            }catch(InterruptedException ie){
            	System.out.println("canot find elemet");
            }
			}
			
		}return element;
	}
}
