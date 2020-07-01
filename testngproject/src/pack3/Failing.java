package pack3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failing {
@Test
public void login1(){
	System.out.println("success");
}
@Test
public void login2(){
	System.out.println("success");
}
@Test
public void login3(){
	System.out.println("success");
}
@Test
public void login4(){
	Assert.fail();
}
}
