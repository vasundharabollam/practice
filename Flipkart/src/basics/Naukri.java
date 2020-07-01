package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.naukri.com");
     driver.findElement(By.xpath("(//div[@class='mTxt'])[7]")).click();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hmamatha22@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("9980874002");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[.='Login']")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//div[.='My Naukri']")).click();
	driver.findElement(By.xpath("//input[@name='qp']")).sendKeys("automation");
	Thread.sleep(2000);
	List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='sugTouple']"));
	for (WebElement we : suggestions) {
		System.out.println(we.getText());
		Thread.sleep(2000);
	}
	
	}

}
