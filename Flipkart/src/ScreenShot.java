import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShot {
	public static void capture(WebDriver driver){
		Date d=new Date();
		String d1= d.toString();
		String date = d1.replace(":", "-");
		String path="F://screenshot/";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+date+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			System.out.println("failed to take screenshot");
		}
		
		
	}

}
