package polymarphism;

public class Demo2 extends Demo {
	public void method1() {
		System.out.println("sub class");
	}
public static void main(String[] args) {
	Demo demo=new Demo2();
	demo.method1();
}
}
