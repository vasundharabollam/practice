package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class GenericExpectedWait2 {
	public WebDriver driver;
	public GenericExpectedWait2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickable(int time,WebElement ele){
		WebDriverWait wait=new WebDriverWait(driver, time);
		try{
		wait.until(ExpectedConditions.elementToBeClickable(ele));}
		catch(Exception e){
			System.out.println("canot able to click");
		}
	}
	public void visibility(int time,WebElement ele){
		WebDriverWait wait=new WebDriverWait(driver, time);
		try{
		wait.until(ExpectedConditions.visibilityOf(ele));}
		catch(Exception e){
			System.out.println("canot able to send");
		}
		
	}public void verifyElement(int time,String str){
		WebDriverWait wait=new WebDriverWait(driver, time);
		try{
		wait.until(ExpectedConditions.titleContains(str));}
		catch(Exception e){
			System.out.println("canot able to click");
		}
	}
	public void mouseHover(int time,String xpath){
		WebDriverWait wait=new WebDriverWait(driver, time);
		try{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));}
		catch(Exception e){
			System.out.println("canot able to mouseover");
		}
	}
	

}
