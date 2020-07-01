package pom;

import generic.Base_Page;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipkartWomenSareesPage extends Base_Page{
@FindBy(xpath="(//div[@class='_3ZJShS _31bMyl'])[1]")
private WebElement selected_saree1;
@FindBy(xpath="(//div[@class='_3ZJShS _31bMyl'])[2]")
private WebElement selected_saree2;
@FindBy(xpath="(//div[@class='_3ZJShS _31bMyl'])[3]")
private WebElement selected_saree3;
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
public void clickOnSaree3() throws InterruptedException{
	visibility(20, selected_saree1);
	selected_saree1.click();
	Thread.sleep(10000);
	Set<String> windows = driver.getWindowHandles();
	for (String we : windows) {
		driver.switchTo().window(we);
	}
}
}
