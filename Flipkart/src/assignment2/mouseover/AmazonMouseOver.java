package assignment2.mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in");
		Thread.sleep(3000);

		WebElement signin = driver.findElement(By
				.xpath("//*[@id='nav-link-accountList']"));
        Actions act=new Actions(driver);
        act.moveToElement(signin).perform();
        Thread.sleep(3000);
        
	}

}
