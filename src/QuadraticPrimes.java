/**
 * Created by shashi on 1/31/14.
 */
public class QuadraticPrimes {


    public static void main(String[] args)
    {
        int limit = 0;
        int[] n = new int[limit*2-1];

        for(int )
    }

    public static boolean isPrime(long number)
    {
        long condition = number/2+1;
        for(int n=2; n<condition;n++)
        {

            if(number%n==0)
            {
                return false;
            }
            condition=number/n+1;
        }
        return true;
    }
}
