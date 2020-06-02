package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flipkart_logiPage extends Base_Page{
	
	public Flipkart_logiPage(WebDriver driver) {
		super(driver);	
	}
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement username;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement password;
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement login;
	public void setUserName(String user){
		verifyElement(15, username);
		username.sendKeys(user);
	}
	public void setPassword(String pwd){
	verifyElement(15, password);
		password.sendKeys(pwd);
	}
	public void clickOnLogin(){
		verifyElement(15, login);
		login.click();
	}
}
