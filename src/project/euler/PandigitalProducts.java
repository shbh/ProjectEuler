package project.euler;

import java.util.Arrays;

public final class PandigitalProducts  {

	public static void main(String[] args) {
		
		// A candidate product has at most 4 digits. This is because if it has 5
		// digits,
		// then the two multiplicands must have at least 5 digits put together.
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if (hasPandigitalProduct(i))
				sum += i;
		}
		System.out.println(Integer.toString(sum));
	}

	private static boolean hasPandigitalProduct(int n) {
		// Find and examine all factors of n
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && isPandigital("" + n + i + n / i))
				return true;
		}
		return false;
	}

	private static boolean isPandigital(String s) {
		
		if (s.length() != 9)
			return false;
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp).equals("123456789");
	}

}