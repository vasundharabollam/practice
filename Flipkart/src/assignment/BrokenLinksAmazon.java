package assignment;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinksAmazon {
    static void verifyUrl(String url){
    	try {
    		URL link=new URL(url);
    		//HttpsURLConnection httpCon
    		HttpsURLConnection httpCon = (HttpsURLConnection) link.openConnection();
			httpCon.connect();
			if(httpCon.getResponseCode()==200){
				System.out.println(url+"----"+httpCon.getResponseMessage());
			}
			else if(httpCon.getResponseCode()==400){
				System.out.println(url+"----"+httpCon.getResponseMessage());
			}
			else if(httpCon.getResponseCode()==404){
				System.out.println(url+"----"+httpCon.getResponseMessage());
			}
			else {
				System.out.println(url+"----"+httpCon.getResponseMessage());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	for (WebElement we : links) {
		String url = we.getAttribute("href");
		verifyUrl(url);
	}
	
	
	}

}
