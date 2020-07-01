package windowhandles;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	       WebDriver driver=new FirefoxDriver();
	       driver.get("https://www.naukri.com");
	      String parent = driver.getWindowHandle();
	     Set<String> childwindows = driver.getWindowHandles();
	     childwindows.remove(parent);
	     System.out.println(childwindows);
	     for(String add:childwindows){
	    	 driver.switchTo().window(add);
	    	 Thread.sleep(3000);
	    	if(driver.getTitle().equals("Croma")){
	    		driver.close();
	    	}
	     }
	    
	}

}
