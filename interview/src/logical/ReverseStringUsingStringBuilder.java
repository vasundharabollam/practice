package logical;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String str1="vasundharaReddy";
		StringBuilder  str2=new StringBuilder();
		str2.append(str1);
		System.out.println(str2);
		str2.reverse();
		System.out.println(str2);

	}

}
