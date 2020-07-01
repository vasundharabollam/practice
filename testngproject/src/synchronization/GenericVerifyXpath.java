package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericVerifyXpath {

	public static  WebElement  verifyXpath(WebDriver driver,String xpath){
		return driver.findElement(By.xpath(xpath));
	}
}
