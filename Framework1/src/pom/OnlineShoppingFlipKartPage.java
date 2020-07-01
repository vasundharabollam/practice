package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShoppingFlipKartPage {
@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
private WebElement username;
@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
private WebElement password;
@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
private WebElement login;
@FindBy(xpath="//span[.='Men']")
private WebElement men;
@FindBy(xpath="//a[.='Casio']")
private WebElement casio;
@FindBy(xpath="(//div[@class='_3JlYXy'])[2]")
private WebElement casioYellow;


public OnlineShoppingFlipKartPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void setUserName(WebDriver driver,String user){
	new GenericExpectedWait().visibility(driver, 5, username);
	username.sendKeys(user);
}
public void setPassword(WebDriver driver,String pwd){
	new GenericExpectedWait().visibility(driver, 5, password);
	password.sendKeys(pwd);
}
public void clickOnLogin(WebDriver driver){
	new GenericExpectedWait().clickable(driver, 5, login);;
	login.click();
}
public void mouseHoverOnMen(WebDriver driver){
	new Actions(driver).moveToElement(men).perform();
	new GenericExpectedWait().mouseHover(driver,5, "//span[.='Men']");
      
}
public void clickOnCasio(WebDriver driver){
	new GenericExpectedWait().visibility(driver, 15, casio);
	casio.click();
}
public void clickOnCasioYellow(WebDriver driver){
	new GenericExpectedWait().visibility(driver, 10, casioYellow);
	casioYellow.click();
}
}
