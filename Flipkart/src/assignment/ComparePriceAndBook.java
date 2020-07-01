package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComparePriceAndBook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
    driver.get("https:www.flipkart.com");
   Thread.sleep(3000);
   driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
   Thread.sleep(3000);
   WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
   search.sendKeys("i phone 11 pro");
   Thread.sleep(3000);
   search.sendKeys(Keys.ENTER);
Thread.sleep(3000);
WebElement price = driver.findElement(By.xpath("//div[.='₹99,900']"));
Thread.sleep(6000);
String flipkart_cost = price.getText();
String flipkart2 = flipkart_cost.substring(1);
String str1 = flipkart2.replaceAll(",","");
double flipkart = Double.parseDouble(str1);
System.out.println(flipkart2+"flipkart");
Thread.sleep(10000);
driver.get("https://www.amazon.in");
Thread.sleep(10000);
WebElement search2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
search2.sendKeys("iphone 11 pro");
Thread.sleep(5000);
search2.sendKeys(Keys.ENTER);
Thread.sleep(3000);
WebElement price2 = driver.findElement(By.xpath("//span[.='93,900']"));
Thread.sleep(10000);
String amazon_cost = price2.getText();
String str2 = amazon_cost.replaceAll(",","");
double amazon = Double.parseDouble(str2);
System.out.println(amazon+"amazon");
if(amazon>flipkart)System.out.println("buy in flipkart");
else System.out.println("buy in amazon");
Thread.sleep(5000);
driver.close();
}
}
