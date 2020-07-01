package pom;

import java.util.ArrayList;
import java.util.Set;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipKartCartPage extends Base_Page {
@FindBy(xpath="(//div[.='Remove'])[1]")
private WebElement remove;
public FlipKartCartPage(WebDriver driver){
	super(driver);
}
public void clickRemove(){
	clickable(10, remove);
	remove.click();
	Set<String> wind = driver.getWindowHandles();
	for (String str : wind) {
		driver.switchTo().window(str);
	}
	ArrayList<String> list = new ArrayList<String>(wind);
	driver.switchTo().window(list.get(0));
}
}
