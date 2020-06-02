package generic;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	public  WebDriver getBrowser(String browserName) {
		WebDriver driver = null;
		switch (browserName) {
		case "chrome":
			driver = drivers.get("chrome");
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver",
						"./driver/chromedriver.exe");
				driver = new ChromeDriver();
				drivers.put("chrome", driver);
			}

			break;

		case "firefox":
			driver = drivers.get("firefox");
			if (driver == null) {
				System.setProperty("webdriver.gecko.driver",
						"./driver/geckodriver.exe");
				driver = new FirefoxDriver();
				drivers.put("firefox", driver);
			}

			break;

		default:
			break;
		}
		return driver;

	}
	
	public void closeBrowser()
	{
		for(String key:drivers.keySet())
		{
			drivers.get(key).quit();
		}
	}

}
