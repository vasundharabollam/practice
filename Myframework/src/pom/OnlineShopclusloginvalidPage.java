package pom;

import generic.Base_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OnlineShopclusloginvalidPage extends Base_Page{
	@FindBy(xpath="//a[.='Sign In']")
	private WebElement signin_mouseover;
	@FindBy(xpath="//span[@class='user_icn']")
	private WebElement user_login;
	@FindBy(xpath="//input[@id='main_user_login']")
	private WebElement username;
	@FindBy(xpath="(//input[@name='password'])[1]")
	private WebElement pwd;
	@FindBy(xpath="//a[.='Login']")
	private WebElement login;
	@FindBy(xpath="//a[@id='a_close_id']")
	private WebElement crose;
	public OnlineShopclusloginvalidPage(WebDriver driver) {
		super(driver);
	}
	public void signIn(WebDriver driver){
		visibility(5, signin_mouseover);
		Actions act=new Actions(driver);
		act.moveToElement(signin_mouseover).perform();
	}
	public void login(){
		visibility(10, user_login);
		user_login.click();
	}
	public void setUsename(String usernam){
		visibility(10, username);
		username.sendKeys(usernam);
	}
	public void setPassword(String password){
		visibility(5, pwd);
		pwd.sendKeys(password);
	}
	public void clickOnLogin(){
		visibility(5, login);
		login.click();
	}
	public void clickcross(){
		visibility(10, crose);
		crose.click();
	}
}
