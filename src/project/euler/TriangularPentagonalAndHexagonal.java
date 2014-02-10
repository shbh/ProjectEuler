package project.euler;

public class TriangularPentagonalAndHexagonal {

	public static void main(String[] args) {

		int i = 143;
		long result =0;
		while(true)
		{
			i++;
			result = i * (2 * i - 1);
			if (isPentagonal(result)) {
		        break;
		    }
		}
		System.out.println(result);
	}

	private static boolean isPentagonal(long number) {
		double penTest = (Math.sqrt(1 + 24 * number) + 1.0) / 6.0;
		return penTest == ((int) penTest);
	}
}
