package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDeSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("file://C:/Users/Vasu/Desktop/checkbox.html");
       List<WebElement> eles = driver.findElements(By.xpath("//input"));
	for (int i = 0; i < eles.size(); i++) {
		WebElement we = eles.get(i);	
		we.click();
		Thread.sleep(1000);
	}
	Thread.sleep(5000);
	for (int i = eles.size()-1; i >=0 ; i--) {
		if(i%2==0){
		eles.get(i).click();
		Thread.sleep(2000);
		}	
	}
	}

}
