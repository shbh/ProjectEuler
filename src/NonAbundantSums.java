import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shashi on 1/30/14.
 */
public class NonAbundantSums {

    public static void main(String[] args)
    {
        int limit = 28123;
        List<Integer> list = new ArrayList<>();
        int count =0;
        for(int i =1; i < limit;i++)
        {
            if(i<finddivisor(i))
            {
                list.add(i);
                count++;
            }

        }

        Map<Integer, String> map = new HashMap<>();
        for(int item:list)
        {
            for(int sub:list)
            {
                int sum = item + sub;
                if(sum>limit)
                {
                    break;
                }
                else
                {
                    if(!map.containsKey(sum))
                    {
                        map.put(sum, null);
                    }
                }
            }
        }
        int total = 0;
        for (int i=1; i<=28123; i++) {
            if (!map.containsKey(i)) {
                total += i;
            }
        }
        System.out.println(total);
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
