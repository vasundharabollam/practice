package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
@Test(priority=1,invocationCount=1)
public void register(){
	Assert.fail();
	System.out.println("register");
}
@Test(priority=-2,dependsOnMethods="register",invocationCount=5)
public void login(){
	System.out.println("login");
}
@Test(priority=3)
public void logout(){
	System.out.println("logout");
}
}
