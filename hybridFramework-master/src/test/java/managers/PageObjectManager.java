package managers;

import org.openqa.selenium.WebDriver;
import pom.EnterTimeTrack;
import pom.Login_Page;

public class PageObjectManager {

	private WebDriver driver;
	private Login_Page login_page;
	private EnterTimeTrack entertimetrack_page;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	/*public Login_Page getLoginPage() {
		return (login_page == null) ? login_page = new Login_Page(driver)
				: login_page;
	}*/
	public Login_Page getLoginPage() {
		if(login_page == null) {
			login_page = new Login_Page(driver);
		}
		return login_page;
	}
	
	public EnterTimeTrack getEntertimetrack_page() {
		return (entertimetrack_page == null) ? entertimetrack_page = new EnterTimeTrack(
				driver) : entertimetrack_page;
	}

}
