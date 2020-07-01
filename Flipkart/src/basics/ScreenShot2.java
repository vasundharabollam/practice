package basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot2 {
public static void capture(WebDriver driver){
	TakesScreenshot ts=(TakesScreenshot) driver;
	String path="F://screenshot/";
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(path+System.currentTimeMillis()+".png");
	try {
		FileHandler.copy(src, dest);
	} catch (IOException e) {
		System.out.println("failed");
		
	}
}
}
