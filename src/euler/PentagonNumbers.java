package euler;

import java.util.ArrayList;
import java.util.List;

public class PentagonNumbers {

	static int k = 0;
	static int j = 0;
	static List<Integer> numbers = new ArrayList<>();

	public static void main(String[] args) {

		
		
		generate();
		while(k==0)
		{
			if(!checkPentagonalNumber())
			{
				
				System.out.println(numbers.size());
			}
		}
		
		System.out.println(k-j);

	}

	public static int getPentagonalNumber(int n) {
		return (n * ((3 * n) - 1)) / 2;
	}

	public static void generate() {
		int x = 1;
		for (int i = x; i <2500; i++) {
			numbers.add(getPentagonalNumber(i));
		}
	}

	public static boolean checkPentagonalNumber()
	{
		for(int i = 1;i<numbers.size();i++)
		{
			for(int l = 1;l<numbers.size();l++)
			{
				int f = numbers.get(i);
				int g = numbers.get(l);
				if(numbers.contains(f-g) && numbers.contains(f+g))
				{
					k=f;j=g;
					return true;
				}
			}
		}
		return false;
	}
}
