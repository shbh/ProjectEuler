package com.project.euler.problem;

import com.project.euler.IProblem;

public class _064OddPeriodSquareRoots implements IProblem {

	
	public Object solve() {
		
	
		 int upperbound = 10000;
         int result = 0;

         for (int n = 2; n <= upperbound; n++) {
             int limit = (int) Math.sqrt(n);                                
             if (limit * limit == n) continue;
             
             int period = 0;
             int d = 1;
             int m = 0;
             int a = limit;

             do{                
                 m = d*a - m;                    
                 d = (n - m * m) / d;
                 a = (limit + m) / d;
                 period++;
             }while(a != 2*limit);
             
             if (period % 2 == 1) 
            	 {
            	 result++;
            	 }
         }
                    
	
	
		return null;
	}

}
