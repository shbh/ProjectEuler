package euler;
/**
 * Created by shashi on 1/28/14.
 */
public class SummationOfPrimes {

    public static void main (String[] args)
    {
        long sum = 0;
        for(long l =2;l<2000000;l++)
        {
            if(isPrime(l))
            {
                System.out.println(l);
                sum+=l;
            }
        }
        System.out.println(sum);
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
