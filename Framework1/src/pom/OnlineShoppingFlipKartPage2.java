package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShoppingFlipKartPage2 extends Base_Page{
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
	public OnlineShoppingFlipKartPage2(WebDriver driver){
		super(driver);
	}
	public void setUserName(String user){
		visibility(5, username);
		username.sendKeys(user);
	}
	public void setPassword(String pwd){
		visibility( 5, password);
		password.sendKeys(pwd);
	}
	public void clickOnLogin(){
		clickable( 5, login);;
		login.click();
	}
	public void mouseHoverOnMen(){
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		visibility(10, men);
		men.click();
	      
	}
	public void clickOnCasio(){
		clickable(10, casio);
		casio.click();
	}
	

}
