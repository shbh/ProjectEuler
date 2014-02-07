package euler;

import java.math.BigInteger;

public class SelfPowers {

	public static void main(String[] args) {
		
		
		BigInteger number = BigInteger.ZERO;
		
		for (int i = 1; i < 1000; i++) {
			
			number = number.add(BigInteger.valueOf(i).pow(i));
			//System.out.println(number);
		}
		System.out.println(number.mod(BigInteger.TEN.pow(10)));
	}
}
