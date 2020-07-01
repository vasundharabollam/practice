package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LengthOfFour {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.get("https://accounts.google.com");
     String name="vasu";
     boolean flag=true;
     for (int i = 0; i < name.length(); i++) {
    	 if(Character.isDigit(name.charAt(i)))
    	 {
    		 flag=false;
    	 }
		
	}
     if(flag=true){
     driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(name);;
     }
	}

}
