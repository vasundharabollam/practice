package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpForFacebookPage {
	//declaration
@FindBy(xpath="//input[@id='email']")
private WebElement email;
@FindBy(xpath="//input[@id='pass']")
private WebElement password;
@FindBy(xpath="//input[@value='Log In']")
private WebElement login;
//initialization
public SignUpForFacebookPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void setUsername(String username){
	email.sendKeys(username);
}
public void setPassword(String pwd){
	password.sendKeys(pwd);
}
public void clickLogin(){
	login.click();
}
}
