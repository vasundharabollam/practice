package logical;

import java.util.HashMap;

public class FirstNonRepetiveCharecterInString {

	public static void main(String[] args) {
		String s1 = new String("VASUHJKKIYTRVASU");
		System.out.println(firstrepitiveletter(s1));
	}

	public static Character firstrepitiveletter(String s) {
		Character c;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (map.containsKey(s.charAt(i))) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (int j = 0; j < s.length(); j++) {
			c = s.charAt(j);
			if (map.get(c) == 1) {
				return c;
			}
		}
		return null;
	}
}