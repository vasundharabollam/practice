package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsRecruitmentPage {
//declaration
	@FindBy(xpath="(//div[@class='mTxt'])[7]")
	private WebElement login;
	@FindBy(xpath="//input[@name='email']")
	private WebElement username;
	@FindBy(xpath="//input[@name='PASSWORD']")
	private WebElement password;
	@FindBy(xpath="//button[.='Login']")
	private WebElement submit;
	//initilization
	public JobsRecruitmentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void loginLink(){
		login.click();
	}
	public void setUsername(String user){
		username.sendKeys(user);
	}
	public void setPassword(String pwd){
		password.sendKeys(pwd);
	}
	public void clickSubmit(){
		submit.click();
	}
}
