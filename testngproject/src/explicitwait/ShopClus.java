package explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopClus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.shopclues.com");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		WebElement signin = driver.findElement(By.xpath("//a[.='Sign In']"));
		wait.until(ExpectedConditions.visibilityOf(signin));
		Actions act = new Actions(driver);
		act.moveToElement(signin).perform();
		WebElement log = driver.findElement(By
				.xpath("//span[@class='user_icn']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//span[@class='user_icn']")));
		log.click();
		WebElement mail = driver.findElement(By
				.xpath("//input[@id='main_user_login']"));
		wait.until(ExpectedConditions.visibilityOf(mail));
		mail.sendKeys("vasundhara.prakashreddy@gmail.com");
		WebElement pwd = driver.findElement(By
				.xpath("(//input[@name='password'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(pwd));
		pwd.sendKeys("Bhavi@1610");
		WebElement login = driver.findElement(By.xpath("//a[.='Login']"));
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();
		WebElement skip = driver.findElement(By.xpath("//a[@id='a_close_id']"));
		wait.until(ExpectedConditions.visibilityOf(skip));
		skip.click();
		WebElement account = driver.findElement(By
				.xpath("//a[.='Hi vasundha']"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.xpath("//a[.='Hi vasundha']")));
		act.moveToElement(account).perform();
		WebElement signout = driver.findElement(By.xpath("//a[.='Sign Out']"));
		wait.until(ExpectedConditions.visibilityOf(signout));
		signout.click();
		Thread.sleep(5000);
		driver.close();

	}

}
