package project.euler.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import project.euler.base.KeyConstant;

public class Functions implements KeyConstant {

	public static Set<String> generateCircular(final String string) {

		final Set<String> sets = new HashSet<>();
		sets.add(string);
		String temp = string;
		for (int i = 0; i < string.length(); i++) {
			temp = temp.charAt(temp.length() - 1) + temp;
			// System.out.print(temp+",");
			temp = temp.substring(0, temp.length() - 1);

			if (sets.contains(temp)) {
				break;
			} else {
				sets.add(temp);
			}
		}

		return sets;
	}

	public static boolean isNumberContainEven(final String string) {
		for (int i = 0; i < string.length(); i++) {
			int number = Integer.valueOf(string.charAt(i));
			if ((number & 1) == 0) {
				return true;
			}
		}
		return false;

	}

	public static boolean isPrime(long number) {
		if (number < 0) {
			number = -number;
		}

		if (number == 1 || number == 0) {
			return false;
		}

		long condition = number / 2 + 1;
		for (int n = 2; n < condition; n++) {

			if (number % n == 0) {
				return false;
			}
			condition = number / n + 1;
		}
		return true;
	}

	public static int sumofdivisor(int number) {

		int sum = 0;
		int boundry = number;
		for (int i = 1; i < boundry; i++) {
			if (number % i == 0) {
				int divisor = number / i;
				boundry = number / i;
				sum += i;
				if (divisor != number && i != divisor) {
					sum += divisor;
				}

			}
		}
		return sum;

	}

	public static int greatestCommonFactor(int numerator, int denominator) {
		if (denominator == 0) {
			return numerator;
		}
		return greatestCommonFactor(denominator, numerator % denominator);
	}

	public static int smallestFactor(int C) {

		for (int i = 2; i * i <= C; i++) {
			if (C % i == 0)
				return i;
		}
		return C;
	}

	public static Boolean isPalindrome(String letters) {

		return (letters.equals(reverse(letters)));
	}

	public static String reverse(String characters) {
		char[] oldString = characters.toCharArray();
		char[] newString = new char[oldString.length];

		int newindex = 0;
		for (int n = oldString.length - 1; n >= 0; n--) {
			newString[newindex] = oldString[n];
			newindex++;
		}
		return new String(newString);
	}

	public static boolean isDoubleBasePalindrome(Integer number) {
		String binary = Integer.toBinaryString(number);

		if (isPalindrome(number.toString()) && isPalindrome(binary))
			return true;

		return false;
	}

	public static boolean isComposite(long number) {

		long condition = number / 2 + 1;
		for (int n = 2; n < condition; n++) {

			if (number % n == 0) {
				return true;
			}
			condition = number / n + 1;
		}

		return false;
	}

	public static int countdivisor(long trianglenumber) {

		int count = 0;
		long boundry = trianglenumber;
		for (int i = 1; i < boundry; i++) {
			if (trianglenumber % i == 0) {
				boundry = trianglenumber / i;
				count++;
			}
		}
		return count;

	}

	public static boolean isPalindrome(int number) {
		String characters = new Integer(number).toString();
		String firstbit = null;
		String secondbit = null;
		int length = characters.length();
		if (length % 2 == 0) {
			firstbit = characters.substring(0, (length / 2));
			secondbit = characters.substring(length / 2);
		} else {
			firstbit = characters.substring(0, (length / 2));
			secondbit = characters.substring((length / 2) + 1);
		}

		secondbit = reverse(secondbit);
		if (firstbit.equals(secondbit)) {
			return true;

		}
		return false;
	}

	
	//2
	public static boolean isPandigital(String s) {

		if (s.length() != 9)
			return false;
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp).equals("123456789");
	}
	//1
	public static boolean isPandigital(String s, String number) {

		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp).equals(number);
	}


	//1
	// Find the last digit needed to make the number 0-9 pandigital and concat
	// it in front.
	// Will return the original number if more than one digits are needed.
	// Example:
	// 987643210 = 5987643210
	public static long makePandigital(long n) {
		boolean[] digits = new boolean[10];
		long origN = n;

		while (n > 0) {
			digits[(int) (n % 10)] = true;
			n /= 10;
		}

		long newN = 0;

		for (long i = 0; i < 10; i++) {
			if (!digits[(int) i]) {
				if (newN != 0)
					return origN;
				newN = (long) concat(i, origN);
			}
		}

		return newN == 0 ? origN : newN;
	}
	
	
	//1
	// Determine whether the number has distinct digits.
	// Example:
	// 123 = true
	// 102 = true
	// 101 = false
	public static boolean areDistinctDigits(long number) {
		boolean[] digits = new boolean[10];

		while (number > 0) {
			int rem = (int) (number % 10);
			if (digits[rem])
				return false;
			digits[rem] = true;
			number /= 10;
		}

		return true;
	}
	//2
	public static boolean isPentagonal(long number) {
		double penTest = (Math.sqrt(1 + 24 * number) + 1.0) / 6.0;
		return penTest == ((int) penTest);
	}
	//1
	public static String join(List<?> list, String delim) {
		int len = list.size();
		if (len == 0)
			return "";
		StringBuilder sb = new StringBuilder(list.get(0).toString());
		for (int i = 1; i < len; i++) {
			sb.append(delim);
			sb.append(list.get(i).toString());
		}
		return sb.toString();
	}
	
	public static long concat(long a, long b) {
		long c = b;
		while (c > 0) {
			a *= 10;
			c /= 10;
		}

		return (long) a + b;
	}

	
}
