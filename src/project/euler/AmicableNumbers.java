package project.euler;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by shashi on 1/30/14.
 */
public class AmicableNumbers {

    public static void main(String[] args)
    {
        int limit =10000;
        int[] numbers = new int[limit*10];
        numbers[0]=0;
        int sum =0;

        Set<Integer> unique = new HashSet<Integer>();

        for(int i =1;i<limit;i++)
        {
            numbers[i]=finddivisor(i);
        }

        for(int i =1;i<limit;i++)
        {


            if(i==numbers[numbers[i]] && i!=numbers[i])
            {
                unique.add(i);
                unique.add(numbers[i]);

            }
        }

        for(Integer item: unique)
        {
            sum+=item;
        }

        System.out.println(sum);


    }

    private static int finddivisor(int number) {

        int sum =0;
        int boundry = number;
        for(int i=1;i<boundry;i++)
        {
            if(number%i==0)
            {
                int divisor = number/i;
                boundry = number/i;
                sum+=i;
                if(divisor!=number && i!=divisor)
                {
                    sum+=divisor;
                }

            }
        }
        return sum;


    }
}
