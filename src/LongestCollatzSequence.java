import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by shashi on 1/29/14.
 */
public class LongestCollatzSequence {

    public static void main(String[] args)
    {
        int limit = 1000000;
        Set<Integer> ignorednumbers = new HashSet<Integer>();

        int result=0;
        int number=0;
        for(int i =limit-1; i > 0; i--)
        {

            int count=1;
            if(ignorednumbers.contains(i))
            {
                continue;
            }

            //System.out.println(i);
            count = doCollatz(new BigInteger(new Integer(i).toString()),ignorednumbers, count);
            if(count>result)
            {
                number = i;
                result = count;
            }


        }
        System.out.println(number+" :: "+ result);
    }

    private static int doCollatz(BigInteger i, Set<Integer> ignorednumbers, int count) {
        if(i.remainder(new BigInteger("2")).compareTo(new BigInteger("0"))==0 && i.compareTo(new BigInteger("1"))!=0)
        {
            BigInteger result = even(i);
            ignorednumbers.add(result.intValue());
            count++;

            return doCollatz(result,ignorednumbers,count);

        }
        else if(i.compareTo(new BigInteger("1"))!=0)
        {

            BigInteger result = odd(i);
            ignorednumbers.add(result.intValue());
            count++;

            return doCollatz(result,ignorednumbers,count);
        }
        return count;
    }

    public static BigInteger even(BigInteger number)
    {
        return number.divide(new BigInteger("2"));
    }

    public static BigInteger odd(BigInteger number)
    {
        return number.multiply(new BigInteger("3")).add(new BigInteger("1"));
    }
}
