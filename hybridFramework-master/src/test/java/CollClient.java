import java.util.HashSet;

class Country {
 private String name;
 Country(String name ){
  this.name = name;
 }
 public String toString() {
  return name;
 }
 /*@Override
 public boolean equals(Object o) {
     if (this == o) return true;
     if (!(o instanceof Country)) return false;

     Country student = (Country) o;

    
     return name.equals(student.name);
 }
 @Override
 public int hashCode() {
     int result = name.hashCode();
     return result;
 }*/
}
 
public class CollClient {
 
 
 public static void main(String[] str) {
  HashSet myMap = new HashSet();
  Country s1 = new Country("India");
  Country s3 = new Country("France");
  Country s4 = new Country("France");
  Country s5 = new Country("India");
  myMap.add(s1);
 // myMap.add(s2);
  myMap.add(s3);
  myMap.add(s4);
  myMap.add(s5);
  System.out.println(myMap);
 } 
}
 