package regression;

import org.testng.annotations.Test;

import pom.AmazonHomePage;
import pom.FlipHomePage;
import generic.Generic_Test;

public class FlipAndAmazon extends Generic_Test{
@Test
public void searching(){
	test = reports.createTest("validLogin", "validate for " + "invalid"
			+ "username and password");
	String product="baby toys";
	test.info("test has started");
	FlipHomePage flip=new FlipHomePage(driver);
	flip.search(product);
	AmazonHomePage amazon=new AmazonHomePage(driver);
	amazon.search(product);
}
}
