package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PepperFry {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.pepperfry.com");
		WebDriverWait wait=new WebDriverWait(driver, 15);
		//WebElement signin = driver.findElement(By.xpath("//a[.='Login']"));
		//wait.until(ExpectedConditions.visibilityOf(signin));
	//	signin.click();
		WebElement login_link = driver.findElement(By.xpath("(//a[@data-modal='loginModal'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(login_link));
		login_link.click();
		WebElement username = driver.findElement(By.xpath("(//input[@name='user[new]'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("vasundhara.prakashreddy@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Bhavi@1610");
		WebElement login = driver.findElement(By.xpath("//input[@name='usernameLogin']"));
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
	    WebElement myaccount = driver.findElement(By.xpath("(//a[@class='hover-link'])[2]"));
	  Actions act=new Actions(driver);
	  act.moveToElement(myaccount);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class='hover-link'])[2]")));
	  WebElement logout = driver.findElement(By.xpath("(//a[.='Logout'])[2]"));
	  wait.until(ExpectedConditions.visibilityOf(logout));
	  logout.click();
	}

}
