package project.euler;

public class GoldbachsOtherConjecture {

	static int[] prime = new int[1000];
	static int index = 4;
	public static void main(String[] args) {
		long[] sqrt = new long[100];
		prime[0]=2;
		prime[1]=3;
		prime[2]=5;
		prime[3]=7;
		
		for (int i = 0; i < sqrt.length; i++) {
			sqrt[i]=i*i;
		}
		
		
		long i=7;
		while(true)
		{
			i=i+2;
			if(isComposite(i)&& isConjecture(i, sqrt))
			{
				System.out.println(i);
				break;
			}
		}
	}
	
	 //31 + 2×1^2
	public static boolean isConjecture(long n, long[] sqrt)
	{
		
		System.out.print(n);
		for (int i = 0; i < prime.length; i++) {
			int no = (int)n-prime[i];
			System.out.print("::"+no);
			if(no>0)
			{
				
				for (int j = 0; j < sqrt.length; j++) {
					int sno = (int)sqrt[j];
					if(2*sno>no)
					{
						break;
					}
					else if(2*sno==no)
					{
						
						System.out.println("//"+sno);
						return false;
					}
					
					
				}
				System.out.println("//");
			}
		}
		
		return true;
	}
	
	public static boolean isComposite(long number) {
		
		
		long condition = number / 2 + 1;
		for (int n = 2; n < condition; n++) {

			if (number % n == 0) {
				return true;
			}
			condition = number / n + 1;
		}
		prime[index++]=(int)number;
		return false;
	}
}
