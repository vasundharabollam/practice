package pom;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipKartSelectedSareePage extends GenericExpectedWait2{
@FindBy(xpath="//button[contains(.,' GO TO CART')]")
private WebElement addtocart;
	public FlipKartSelectedSareePage(WebDriver driver) {
		super(driver);
	}
	public void clickOnCart(){
		clickable(20, addtocart);
		//visibility(20, addtocart);
		addtocart.click();
		Set<String> wind = driver.getWindowHandles();
		for (String str : wind) {
			driver.switchTo().window(str);
		}
		ArrayList<String> list = new ArrayList<String>(wind);
		driver.switchTo().window(list.get(0));
	}

}
