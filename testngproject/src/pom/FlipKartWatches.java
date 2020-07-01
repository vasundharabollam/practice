package pom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FlipKartWatches extends GenericExpectedWait2{
	@FindBy(xpath="//div[@data-id='WATFGHM4NGVDMP3J']")
	private WebElement casioYellow;
	public FlipKartWatches(WebDriver driver){
		super(driver);
	}
	public void clickOnCasioYellow() throws InterruptedException{
		visibility( 20, casioYellow);
		Actions act=new Actions(driver);
		act.moveToElement(casioYellow).click().perform();
		//casioYellow.click();
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		for (String str : windows) {
			driver.switchTo().window(str);
		}
		
	}
}
