package euler;
/**
 * Created by shashi on 1/28/14.
 */
public class MultiplesOf3And5 {

    public static void main(String[] args)
    {
        int limit = 1000;
        int sum = 0;
        for(int counter=1;counter<limit;counter++)
        {
            if(counter%3==0 || counter% 5==0)
            {
                sum+=counter;
            }

        }
        System.out.print(sum);
    }
}
