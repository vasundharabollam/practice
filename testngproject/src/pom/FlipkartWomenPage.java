package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FlipkartWomenPage extends GenericExpectedWait2 {
	
@FindBy(xpath="//span[.='Women']")
private WebElement women;
@FindBy(xpath="(//a[.='Sarees'])[1]")
private WebElement sarees;
	public FlipkartWomenPage(WebDriver driver) {
		super(driver);
	}
public void clickOnWomen(WebDriver driver){
	Actions act=new Actions(driver);
	act.moveToElement(women);
	//visibility(20, women);
	//mouseHover(10, "//span[.='Women']");
	clickable(10, women);
	women.click();
}
public void clickOnSarees(){
	//visibility(20, sarees);
	clickable(20, sarees);
	sarees.click();
}

}
