package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TripAdvisor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	       WebDriver driver=new FirefoxDriver();
		driver.get("https://www.tripadvisor.in/UserReviewEdit-g641714-d1156207-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='ReviewTitle']")).sendKeys("feeling good to visit");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id='ReviewText']")).sendKeys("good location");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Family']")).click();
		Thread.sleep(3000);
		WebElement dd = driver.findElement(By.xpath("//select[@id='trip_date_month_year']"));
		Select se=new Select(dd);
		se.selectByVisibleText("October 2019");
		driver.findElement(By.xpath("//input[@id='noFraud']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='SUBMIT']"));
		Thread.sleep(3000);
		driver.close();

	}

}
