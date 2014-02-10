package project.euler;
/**
 * Created by shashi on 1/28/14.
 */
public class SmallestMultiple {

    public static void main(String [] args)
    {

        long number=1;
        int divisor=20;
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
        System.out.println(number);
    }
}
