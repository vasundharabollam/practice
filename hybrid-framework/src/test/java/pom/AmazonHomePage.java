package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class AmazonHomePage extends Base_Page{

	public AmazonHomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@name='field-keywords']")
	private WebElement search;
	public void search(String item) {
		verifyElement(10, search);
		search.sendKeys(item);
	}
}
