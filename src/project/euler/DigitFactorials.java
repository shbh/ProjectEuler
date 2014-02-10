package project.euler;


public class DigitFactorials {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {0,1,2,3,4,5,6,7,8,9};
		int fact[] = new int[digits.length];
		int totalSum=0;	
		fact[0]=1;
		fact[1]=1;
		
		for(int i=2;i<digits.length;i++)
		{
			fact[i]=i*fact[i-1];
			System.out.println(i + "::"+fact[i]);
		}
		//9!*7=2540160
		for(int i =3;i<2540160;i++)
		{
			int sum =0 ;
			int number = i;
			while(number>0)
			{
				sum+= fact[number%10];
				number /=10;
			}
			if(sum==i)
			{
				totalSum+=i;
			}
			
		}
		System.out.println(totalSum);
		
	}

}
