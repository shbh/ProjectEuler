package euler.learning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Truncate {
	public static void main(String[] args) {

		generate(Integer.toString(379));
		cut1(Integer.toString(379));
		System.out.println(isNumberEndWith37("373"));
		char[] temp = new Integer(1003).toString().toCharArray();
		Arrays.sort(temp);

		System.out.println((Math.abs(123) / Math.pow(10, 3 - 1)) % 10);
		System.out.println(Integer.toString(12).substring(1, 2));
	}

	private static void cut1(String string) {

		System.out.println(string.substring(0, 1));
		System.out.println(string.substring(string.length() - 1));
	}

	private static boolean isNumberEndWith37(String string) {

		// String
		String l = string.substring(0, 1);
		String r = string.substring(string.length() - 1);
		if ((l.equals("3") || l.equals("7"))
				&& (r.equals("3") || r.equals("7"))) {
			return true;
		}
		return false;
	}

	private static Set<String> generate(String string) {

		Set<String> sets = new HashSet<>();
		sets.add(string);
		String ltemp = string;
		String rtemp = string;
		for (int i = 0; i < string.length() - 1; i++) {
			ltemp = ltemp.substring(0, ltemp.length() - 1);
			rtemp = rtemp.substring(1);

			sets.add(rtemp);
			sets.add(ltemp);
		}

		return sets;
	}
}
