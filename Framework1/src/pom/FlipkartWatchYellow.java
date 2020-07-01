package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartWatchYellow extends Base_Page {
@FindBy(xpath="//button[contains(.,'ADD TO CART')]")
private WebElement addtocart;
public FlipkartWatchYellow(WebDriver driver) {
	super(driver);
}
public void clickOnCart(){
	//mouseHover(10, "//button[contains(.,'ADD TO CART')]");
	visibility(20, addtocart);
	addtocart.click();
}
}
