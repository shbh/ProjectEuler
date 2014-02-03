package euler;
/**
 * Created by shashi on 1/29/14.
 */
public class HighlyDivisibleTriangularNumber {

    public static void main(String[] args)
    {
        long trianglenumber = 0;
        int lastnumber = 1;
        while(true)
        {
            trianglenumber = trianglenumber+lastnumber;
            lastnumber++;

            int count = finddivisor(trianglenumber);
            if(count>=250)
            {
                break;
            }
        }
        System.out.println(trianglenumber);

    }

    private static int finddivisor(long trianglenumber) {

        int count = 0;
        long boundry = trianglenumber;
        for(int i=1;i<boundry;i++)
        {
            if(trianglenumber%i==0)
            {
                boundry = trianglenumber/i;
                count++;
            }
        }
        return count;


    }
}
