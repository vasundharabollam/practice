package basics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollByAndTakeScreenShot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6000)");
		Thread.sleep(3000);
		TakeScreen.capture(driver);
	}

}
class TakeScreen{
	public static void capture(WebDriver driver){
		//Date date=new Date();
		TakesScreenshot ts=(TakesScreenshot) driver;
		String path="F://screenshot/";
		File src=ts.getScreenshotAs(OutputType.FILE);
		File file=new File(path+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(src, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("we canot take scrren shot");
		}
	}
	
}
