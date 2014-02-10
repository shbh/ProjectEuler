package project.euler.util;

import java.util.HashSet;
import java.util.Set;

public class Learning {

	public static void solution(Object output) {
		System.out.println(output);
	}

	public static Set<String> generateCircular(String string) {

		Set<String> sets = new HashSet<>();
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

	public static boolean isNumberContainEven(String s) {
		for (int i = 0; i < s.length(); i++) {
			int number = Integer.valueOf(s.charAt(i));
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
        for(int i=1;i<boundry;i++)
        {
            if(trianglenumber%i==0)
            {
                boundry = trianglenumber/i;
                count++;
            }
        }
        return count;


    }
	
	 public static boolean isPalindrome(int number)
	    {
	        String characters = new Integer(number).toString();
	        String firstbit = null;
	        String secondbit = null;
	        int length = characters.length();
	        if(length%2==0)
	        {
	            firstbit = characters.substring(0,(length/2) );
	            secondbit = characters.substring(length/2);
	        }
	        else
	        {
	            firstbit = characters.substring(0,(length/2) );
	            secondbit = characters.substring((length/2)+1);
	        }


	        secondbit = reverse(secondbit);
	        if(firstbit.equals(secondbit))
	        {
	            return true;

	        }
	        return false;
	    }
}
