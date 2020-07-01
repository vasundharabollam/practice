package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlineShopping_ShopClusPage {
@FindBy(xpath="//a[.='Sign In']")
private WebElement signin_link;
@FindBy(xpath="//span[@class='user_icn']")
private WebElement login_link;
@FindBy(xpath="//input[@id='main_user_login']")
private WebElement username;
@FindBy(xpath="(//input[@name='password'])[1]")
private WebElement pwd;
@FindBy(xpath="//a[.='Login']")
private WebElement login;

public OnlineShopping_ShopClusPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void signin(){
	signin_link.click();
	
}
public void login_link(WebDriver driver){
	GenericWait gen=new GenericWait();
	gen.verifyElementMousehover(driver, 5, login_link);
	login_link.click();
}
public void set_username(String user,WebDriver driver){
	GenericWait gen=new GenericWait();
	gen.verifyElementText(driver, 5, username);
	username.sendKeys(user);
}
public void set_password(WebDriver driver,String pass){
	GenericWait gen=new GenericWait();
	gen.verifyElementText(driver, 5, pwd);
	pwd.sendKeys(pass);
}
public void click_login(){
	login.click();
}

}
