package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NowkriDropDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.naukri.com");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@class='orangeBtn bifurLightBox']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.='I am a Professional']")).click();
        Thread.sleep(3000);
       WebElement we = driver.findElement(By.xpath("//input[@class='srchTxt ng-pristine ng-valid clicked ng-touched']"));
       we.sendKeys(Keys.ENTER);
       Thread.sleep(3000);
	}

}
