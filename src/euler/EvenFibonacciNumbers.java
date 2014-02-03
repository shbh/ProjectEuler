package euler;
/**
 * Created by shashi on 1/28/14.
 */
public class EvenFibonacciNumbers {

    public static void main(String[] args)
    {
        int firstnumber = 1;
        int secondnumber = 2;
        int limit = 4000000;
        int nextnumber=0;
        int sum = secondnumber;
        while(nextnumber<limit)
        {

            nextnumber=firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = nextnumber;

            if(nextnumber%2==0)
            {
                sum+=nextnumber;
            }
        }

        System.out.print(sum);
    }
}
