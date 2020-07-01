package pack3;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunFailedTestCase {

	public static void main(String[] args) {
		TestNG runner=new TestNG();
		List<String> l1=new ArrayList<String>();
		l1.add("./test-output/testng-failed.xml");
		runner.setTestSuites(l1);
		runner.run();
	}

}
