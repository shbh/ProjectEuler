package euler;
/**
 * Created by shashi on 1/28/14.
 */
public class TenThousandFirstPrime {


    public static void main(String[] args)
    {
        int boundry = 0;
        long number = 1;
        while(true)
        {
            number = number + 1;
            if(isPrime(number))
            {
                boundry=boundry+1;
            }

            if(boundry==10001)
            {
                break;
            }

        }
        System.out.println(number);

    }

    public static boolean isPrime(long number)
    {

        for(int n=2; n<number/2+1;n++)
        {
            if(number%n==0)
            {
                return false;
            }
        }
        return true;
    }
}
