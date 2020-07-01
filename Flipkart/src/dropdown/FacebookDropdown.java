package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement p = driver.findElement(By.xpath("//select[@id='month']"));
       Select sel=new Select(p);
       List<String> l1=new ArrayList<String>();
       List<WebElement> options = sel.getOptions();
		for (WebElement we : options) {
			l1.add(we.getText());
		}
		Collections.sort(l1);
		for (String str : l1) {
			System.out.println(str);
		}
		
	}
	
}
