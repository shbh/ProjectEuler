package project.euler.problem;

import project.euler.base.IProblem;

public class _051NextPrimeDigitReplacements implements IProblem {

	public Integer solve() {
		/*
		 * int[] primes = new int[1000000]; for (int i = 10; i < 1000000; i++) {
		 * if (primes[i]) { String strPrime = Integer.toString(i); char[] chars
		 * = strPrime.toCharArray(); Character[] characters = new
		 * Character[chars.length]; for (int l = 0; l < chars.length; l++) {
		 * characters[l] = chars[l];
		 * 
		 * } Set<Character> uniqueChars = new HashSet<Character>(
		 * Arrays.asList(characters)); for (Character c : uniqueChars) { if
		 * (strPrime.replace(c.toString(), "").length() != strPrime .length() -
		 * 3) continue;
		 * 
		 * List listPrimes = new ArrayList(); for (Integer j = 0; j < 10; j++) {
		 * Integer newNum = Integer.parseInt(strPrime.replace( c.toString(),
		 * j.toString())); if (primes[newNum] && newNum.toString().length() ==
		 * strPrime .length()) listPrimes.add(newNum); } if
		 * (listPrimes.Distinct().Count() == 8) return listPrimes.Min(); } } }
		 */
		return 0;
	}

	public int getNo() {

		return 51;
	}
}
