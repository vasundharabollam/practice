package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void capture(WebDriver driver,String tc_name) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		Date d = new Date();
		String date = d.toString().replace(':', '-');
		String path = "./defects/";
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path + date +tc_name+ ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			System.out.println("failed");

		}
	}
}
