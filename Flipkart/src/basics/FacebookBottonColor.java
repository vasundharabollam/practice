package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookBottonColor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement we = driver.findElement(By.xpath("//button[.='Sign Up']"));
		Thread.sleep(3000);
		String color = we.getCssValue("background-color");
		System.out.println(color);
      if(color.equals("rgb(105, 167, 78)")){
    	  System.out.println("it is green");
    	  
      }
	}

}
