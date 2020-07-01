package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OnlineShoppingShopclusPage2 {
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
	@FindBy(xpath="//a[.='Hi vasundha']")
	private WebElement usermouseover;
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signout;
}
