package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericExpectedWait {
public void clickable(WebDriver driver,int time,WebElement ele){
	WebDriverWait wait=new WebDriverWait(driver, time);
	try{
	wait.until(ExpectedConditions.elementToBeClickable(ele));}
	catch(Exception e){
		System.out.println("canot able to click");
	}
}
public void visibility(WebDriver driver,int time,WebElement ele){
	WebDriverWait wait=new WebDriverWait(driver, time);
	try{
	wait.until(ExpectedConditions.visibilityOf(ele));}
	catch(Exception e){
		System.out.println("canot able to send");
	}
	
}public void verifyElement(WebDriver driver,int time,String str){
	WebDriverWait wait=new WebDriverWait(driver, time);
	try{
	wait.until(ExpectedConditions.titleContains(str));}
	catch(Exception e){
		System.out.println("canot able to click");
	}
}
public void mouseHover(WebDriver driver,int time,String xpath){
	WebDriverWait wait=new WebDriverWait(driver, time);
	try{
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));}
	catch(Exception e){
		System.out.println("canot able to mouseover");
	}
}
}
