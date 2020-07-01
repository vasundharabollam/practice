package assignment;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import poi.framework.DDFWriteDataGeneric;

public class NikoShoename1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com");
		String name = "";
		Thread.sleep(3000);
		WebElement men = driver.findElement(By.xpath("//a[.='MEN']"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//a[.='SHOES'])[1]")).click();
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(5000);
		}
		Set<String> set = new TreeSet<String>();
		List<WebElement> list = driver.findElements(By
				.xpath("//div[@class='product-card__title']"));
		Thread.sleep(15000);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			WebElement we = list.get(i);
			Thread.sleep(5000);
			name = we.getText();
			System.out.println(name);
			set.add(name);
		}
		/*Iterator<String> itr = set.iterator();
		int index = 0;
		while (itr.hasNext()) {
			DDFWriteDataGeneric.writeData("Sheet1", index++, 0, itr.next());
		}*/
		int index=0;
for (String str : set) {
	DDFWriteDataGeneric.writeData("Sheet1", index++, 0, str);
}
		driver.close();
	}

}
