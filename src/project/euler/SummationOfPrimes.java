package project.euler;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/28/14.
 */
public class SummationOfPrimes implements IProblem{

	private int limit = 2000000;
    public Long solve()
    {
        long sum = 2;//adding first prime number 2
        for(long l =3;l<limit;l=l+2)
        {
            if(Learning.isPrime(l))
            {
                System.out.println(l);
                sum+=l;
            }
        }
        return sum;
    }
    
    public SummationOfPrimes limit(int limit)
    {
    	this.limit = limit;
    	return this;
    }
  
}
