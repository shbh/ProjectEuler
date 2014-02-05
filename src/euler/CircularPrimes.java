package euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CircularPrimes {

	public static void main(String[] args) {

		int count = 1;
		List<String> list = new ArrayList<>();
		Set<String> unique = new HashSet<>();
		
		
		for (int i = 1; i < 1000000; i = i + 2) {
			if (i == 1)
				continue;
			
			if (unique.contains(Integer.toString(i)))
			{
				continue;
			}

			if (isPrime(i) && !isNumberContainEven("" + i)) {
				// System.out.println(i);
				Set<String> combinations = generate("" + i);

				boolean isPrimeCombination = false;

				for (Iterator<String> iterator = combinations.iterator(); iterator
						.hasNext();) {

					String string = (String) iterator.next();
					if (isPrime(Integer.valueOf(string))) {
						isPrimeCombination = true;
						continue;
					} else {
						isPrimeCombination = false;
						break;
					}
				}
				if (isPrimeCombination) {
					list.addAll(combinations);

					count = count + combinations.size();
				}
				
				unique.addAll(combinations);
			}

		}
		System.out.println(count);

	}

	private static Set<String> generate(String string) {
		// TODO Auto-generated method stub
		Set<String> sets = new HashSet<>();
		sets.add(string);
		String temp = string;
		for (int i = 0; i < string.length(); i++) {
			temp = temp.charAt(temp.length() - 1) + temp;
			//System.out.print(temp+",");
			temp = temp.substring(0, temp.length() - 1);
			
			if (sets.contains(temp)) {
				break;
			}
			else
			{
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

}
