package logical;

public class PAlindrome {
	public static void main (String[] args) {
        String  reverse = "";
        
        int length;
        System.out.println("Enter the number or String");
        String original="vasu";
        length = original.length();
        for (int i =length -1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" +reverse);
         
        if(original.equals(reverse)) 
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
         
    }

}
