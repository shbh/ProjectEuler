package project.euler;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shashi on 1/30/14.
 */
public class LexicographicPermutations {

    public static void main(String[] args)
    {

        int digit = 10;
        int[] number = new int[digit];
        List<Integer>  list = new ArrayList<>();

        for(int i = 0; i<digit;i++)
        {
            list.add(i);
        }
        int position = 1000000;

        for(int i=9;i>=0;i--)
        {
            int  fact = factorial(i);
            int result = position/fact;
            if(position%fact==0)
                result= result-1;
            position = position - fact*result;

            result = list.get(result);

            list.remove(new Integer(result));
            number[digit-(i+1)]=result;
            System.out.println(position);
        }

        StringBuilder sb = new StringBuilder(number.length);
        for (int i : number) {
            sb.append(i);
        }

        System.out.println(sb.toString());
    }

    public static int factorial(int n)
    {
        int result = 1;
        for(int i =1;i<=n;i++)
        {
            result*=i;
        }
        return result;
    }
}
