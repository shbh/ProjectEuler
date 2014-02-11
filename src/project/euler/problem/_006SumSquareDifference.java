package project.euler.problem;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/28/14.
 */
public class _006SumSquareDifference implements IProblem{

   private int limit = 0;	
   public Long solve()
    {
        long Sum =0;
        long Square = 0;

        for(int n=0;n<=limit;n++)
        {
            Sum+= n*n;
            Square+=n;
        }

       return Square*Square-Sum;

    }
   
   public _006SumSquareDifference limit(int limit)
   {
	   this.limit = limit;
	   return this;
   }
}
