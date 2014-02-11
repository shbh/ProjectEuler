package project.euler.problem;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/28/14.
 */
public class _005SmallestMultiple implements IProblem{

	
	int divisor=20;
    public Long solve()
    {

        long number=1;
       
        while(true)
        {
            int temp =0;
            for(int n =divisor;n >1;n-- )
            {

                temp=n;
                if(number%n==0)
                {

                    continue;
                }
                else
                {
                    number++;
                    break;
                }
            }
            if(temp==2)
            {
                break;
            }
        }
        return number;
    }
    
    public _005SmallestMultiple divisor(int divisor)
    {
    	this.divisor=divisor;
    	return this;
    }
}
