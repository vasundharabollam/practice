package doubts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToSpeceficWindow {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		WebElement link = driver.findElement(By.xpath("//a[.='Amazon Pay']"));
		Actions act=new Actions(driver);
		for (int i = 0; i < 5; i++) {
			act.contextClick(link).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			//driver.switchTo().window("");
		}
		Thread.sleep(5000);
		Set<String> windows = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windows);
		System.out.println(list);
		driver.switchTo().window(list.get(2));
	}
}
