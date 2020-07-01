package logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		List<String> contents = new ArrayList<String>();
	     
        // initializing List in Java
        contents.add("Example");
        contents.add("Tutorial");
        contents.add("Program");
     
     
        // Currently This List is not read only, you can add or remove elements from List
        contents.add("Tips"); //should not be allowed if List is read only.
     
        System.err.println("normal List in Java : " + contents);
     
        //creating readonly List from contents
        contents = Collections.unmodifiableList(contents);
     
        //java.lang.UnsupportedOperationException -- no modification in read only list
     
       //not allowed as it is read-only List in Java
       
System.out.println(contents);
contents.add("vasuma");
	}

}
