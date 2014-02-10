package project.euler;
/**
 * Created by shashi on 1/28/14.
 */
public class LargestPrimeFactor {

    public static void main(String[] args)
    {
        long largenumber = 600851475143l;
        //long largenumber = 100;
        long number = 2;

        long largeprimefactor = divideNumber(largenumber, number,0);
        System.out.print(largeprimefactor);

    }

    public static long divideNumber(long largenumber, long number, long largeprimefactor)
    {
        boolean isfactored = true;

        while(true)
        {

            if(largenumber%number!=0)
            {

                isfactored=false;
                number++;
                if(largenumber<=number)
                {
                    largeprimefactor = largenumber;
                    return largeprimefactor;
                }
            }
            else
            {

                isfactored=true;
                break;
            }
        }

        if(isfactored)
        {
            largenumber = largenumber/number;
            largeprimefactor = (number>largeprimefactor&& isPrime(number))?number:largeprimefactor;
            return divideNumber(largenumber, 2, largeprimefactor);
        }
        else
        {
            return largeprimefactor;
        }
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
