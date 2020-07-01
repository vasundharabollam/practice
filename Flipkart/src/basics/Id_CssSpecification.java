package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id_CssSpecification {

	public static void main(String[] args) {
		//file:///C:/Users/Vasu/Desktop/index2.html
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("file:///C:/Users/Vasu/Desktop/index2.html");
driver.findElement(By.cssSelector("input.c2")).sendKeys("vasuma");

	}

}
