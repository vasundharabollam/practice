package logical;

import java.util.HashSet;

public class RemoveDuplicatesUsingHashSet {
	 public static void main (String args[])
	    {
		 //only checking duplicates 
	        boolean result=false;
	        String inputstring="Alve i@wsom";
	        System.out.println(inputstring);
	        HashSet < Character> uniquecharset= new HashSet();
	        for(int i=0;i < inputstring.length();i++)
	        {
	            result=uniquecharset.add(inputstring.charAt(i));
	            if (result == false)
	            break;
	        }
	    System.out.println(result); }
}
