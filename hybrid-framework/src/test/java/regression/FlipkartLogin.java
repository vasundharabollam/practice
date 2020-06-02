package regression;
import generic.Excel;
import generic.Generic_Test;
import java.util.List;
import org.testng.annotations.Test;

import pom.Flipkart_logiPage;

public class FlipkartLogin extends Generic_Test {
	@Test
	public void validLogin() {
	List<String> data = Excel.getData("regression", "validLogin");
	System.out.println("size   ............"+data.size());
//		String username = data.get(0);
//		String password = data.get(1);

		test = reports.createTest("validLogin", "validate for " + "invalid"
				+ "username and password");
		test.info("test has started");
		Flipkart_logiPage flp=new Flipkart_logiPage(driver);
		flp.setUserName("9036932590");
		flp.setPassword("Bhavi@1610");
		flp.clickOnLogin();
		}
}
