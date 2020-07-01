package logical;

public class SwapWithoutUsingThirdVariable {
	 public static void main(String args[])
	   {
	      int x=10;
	      int y=18;
	      System.out.println("Enter x and y");
	      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	      x = x + y;
	      y = x - y;
	      x = x - y;
	      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
	   }
}
