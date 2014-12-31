package com.project.euler.problem;

import org.apache.log4j.Logger;



public class _206ConcealedSquare  {

	static Logger logger = Logger.getLogger(_206ConcealedSquare.class);

	public static final String input = "1_2_3_4_5_6_7_8_9_0";

	public Long solve() {

		String input9 = input.replace("_", "9");
		String input0 = input.replace("_", "0");

		long result = 0l;

		long maxrange = (long) Math.sqrt(new Double(input9));
		long minrange = (long) Math.sqrt(new Double(input0));

		for (long i = minrange; i < maxrange; i = i + 10) {

			long answer = i * i;
			boolean solutionFound = replaceAndTestAgainstInput(answer);
			if (solutionFound) {
				result = i;
				break;
			}

		}

		return result;

	}

//	private boolean replaceAndTestAgainstInput(long answer) {
//		// TODO Auto-generated method stub
//		String text = "" + answer;
//
//		char[] texts = text.toCharArray();
//
//		for (int i = 1; i < texts.length; i = i + 2) {
//			texts[i] = '_';
//		}
//
//		if (String.valueOf(texts).equals(input)) {
//
//			return true;
//		}
//		return false;
//	}

	public static boolean replaceAndTestAgainstInput(long n){
		return (n % 10 == 0) && (n / 100 % 10 == 9) && (n / 10000 % 10 == 8)&& (n / 1000000 % 10 == 7)
		&& (n / 100000000 % 10 == 6) && (n / 10000000000L % 10 == 5)
		&& (n / 1000000000000L % 10 == 4) && (n / 100000000000000L % 10 == 3)
		&& (n / 10000000000000000L % 10 == 2) && (n / 1000000000000000000L % 10 == 1);
		}
}
