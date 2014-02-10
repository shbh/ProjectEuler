package project.euler;
/**
 * Created by shashi on 1/28/14.
 */
public class SumSquareDifference {

    public static void main(String[] args)
    {
        long Sum =0;
        long Square = 0;

        for(int n=0;n<=100;n++)
        {
            Sum+= n*n;
            Square+=n;
        }

        System.out.println(Square*Square-Sum);

    }
}
