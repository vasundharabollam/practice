package basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_MultipleBrowsers {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		String key1="webdriver.gecko.driver";
		String value1="./softwares/geckodriver.exe";
		System.setProperty(key, value);
		System.setProperty(key1, value1);
		ChromeDriver driver= new ChromeDriver();
		FirefoxDriver driver1= new FirefoxDriver();
	}
}
