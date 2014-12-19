package com.project.euler.problem;

import com.project.euler.IProblem;

public class _066DiophantineEquation implements IProblem {

	
	public Long solve() {
		Integer limitOfD = 53;
		long result = 0;
		long maxX= 0;
		for (int D = 53; D <= limitOfD; D++) {
			//Equation : x2-Dy2=1 where y is less than D.
			// 1 + Dy2 = x2
			
			int b = 1;
			int k = 0;
			int a = findNearestSquare(D);
			int m = 0;
			if(a>-1)
			{
				findPell(a,b,D,k,m);
			}
			
			
		}
		
		return result;
	}
	
	private void findPell(int a, int b, int D, int k, int m) {
		// TODO Auto-generated method stub
		k = a*a-D*b*b;
		if(k!=0)
		{
			
			int fk =Math.abs(k); 
					
			m = findNearestDifference(a, fk, D);
			int newa = (a*m+D*b)/fk;
			int newb= (a+b*m)/fk;
			int newk=(m*m-D)/k;
			a= newa;
			b= newb;
			k= newk;
		}
		if(k==-1)
		{
			findBhaskar(a, b, D, k, m);
		}
		else if(k==1)
		{
			
		}
		else
		{
			findPell(a, b, D, k, m);
		}
	}

	private void findBhaskar(int a, int b, int d, int k, int m) {
		// TODO Auto-generated method stub
		
	}

	private int findNearestDifference(int a, int k, int D) {
		// TODO Auto-generated method stub
		
		int diff = 0;
		int m = 0;
		int lastm=0;
		
		while(true)
		{
			 
			int n = (a+m)/k;
			int cn = n*k - m;
			if(a==cn)
			{
				int temp = Math.abs(m*m-D);
				if(diff ==0)
				{
					diff = temp;
					lastm = m; 
					
				}else if(temp<diff)
				{
					diff = temp;
					lastm = m;
					
				}else
				{
					return lastm;
				}
				
			}
			
			m =m +1;
		}
		
		
	}

	private int findNearestSquare(int number) {
		// TODO Auto-generated method stub
		int sqrt = (int) Math.sqrt(number);
		if(sqrt*sqrt==number)
		{
			return -1;
		}
		else
		{
			int lowestsquare = sqrt*sqrt;
			int greatestsquare = (sqrt+1)*(sqrt+1);
			int diff = number - lowestsquare;
			if((greatestsquare-number)<diff)
			{
				return sqrt+1;
			}
			else
			{
				return sqrt;
			}
			
		}
		
		
	}

	

}
