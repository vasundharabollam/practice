package pom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartWomenSareesPage extends GenericExpectedWait2{
@FindBy(xpath="//div[@data-id='SARF5NZKFN9JVGZH']")
private WebElement selected_saree1;
@FindBy(xpath="//div[@data-id='SARF5NZKFN9JVGZH']")
private WebElement selected_saree2;
	public FlipkartWomenSareesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void clickOnSaree1() throws InterruptedException{
	visibility(20, selected_saree1);
	selected_saree1.click();
	Thread.sleep(10000);
	Set<String> windows = driver.getWindowHandles();
	for (String we : windows) {
		driver.switchTo().window(we);
	}
}
public void clickOnSaree2() throws InterruptedException{
	visibility(20, selected_saree2);
	selected_saree2.click();
	Thread.sleep(10000);
	Set<String> windows = driver.getWindowHandles();
	for (String we : windows) {
		driver.switchTo().window(we);
	}
}
}
