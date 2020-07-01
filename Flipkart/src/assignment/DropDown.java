package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement we = driver.findElement(By.xpath("//select[@id='month']"));
		Select select=new Select(we);
		List<WebElement> we1 = select.getOptions();
		for (WebElement web : we1) {
			System.out.println(web.getText());
		}
	}

}
