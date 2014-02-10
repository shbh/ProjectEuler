package project.euler;

public class DigitCancelingFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int d = 10;
		int numerator= 1;
		int denominator = 1;
		for (n = 10; n < 100; n++) {
			for (d = 10; d < 100; d++) {
				if (n >= d) {
					continue;
				} else {
					int f = n % 10;
					int g = d / 10;
					int h = n / 10;
					int i = d % 10;

					if (f == g) {
						if (h * d == n * i) {
							int gcd = greatestCommonFactor(n, d);
							
							denominator =denominator  * (d/gcd);
							numerator = numerator *( n/gcd);
						}
					}
				}
			}
		}
		System.out.println(denominator/greatestCommonFactor(numerator, denominator));
	}
	
	public static int greatestCommonFactor(int num, int den)
	{
	    if(den == 0){
	        return num;
	    }
	    return greatestCommonFactor(den, num % den);
	}

}
