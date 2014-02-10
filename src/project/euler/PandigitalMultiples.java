package project.euler;

import java.util.Arrays;

public class PandigitalMultiples {

	public Integer solve() {
		System.out.println(getValue());
		
	}
	
	public static int getValue() {
		for (int i = 9876; i > 9183; i--) {

			int val = i * 100002;
			if (isPandigital(Integer.toString(val)))
				return val;
		}

		return -1;
	}
	

	private static boolean isPandigital(String s) {
		
		if (s.length() != 9)
			return false;
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp).equals("123456789");
	}
}
